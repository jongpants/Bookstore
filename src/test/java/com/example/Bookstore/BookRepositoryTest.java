package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;
import com.example.Bookstore.domain.User;
import com.example.Bookstore.domain.UserRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository brepository;
    @Autowired
    private CategoryRepository crepository;
    @Autowired
    private UserRepository urepository;

    @Test
    public void findAuthorWithTitle() {
        List<Book> books = brepository.findByTitle("Animal Farm");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getAuthor()).isEqualTo("George Orwell");
    }
    
    @Test
    public void findCategoryidWithName() {
        List<Category> categories = crepository.findByName("Horror");
        
        assertThat(categories.get(0).getCategoryid()).isEqualTo(2);
    }
    
    @Test
    public void findEmailWithUsername() {
        User user = urepository.findByUsername("admin");  
        
        assertThat(user.getEmail()).isEqualTo("admin@adminmail.com");
    }
    
    @Test
    public void createNewBook() {
    	Book book = new Book("Jong", "Book of Coding", "123321-123", 1999, crepository.findByName("Horror").get(0));
    	brepository.save(book);
    	assertThat(book.getId()).isNotNull();
    }
    
    
    /*This one does not work
    @Test
    public void deleteNewBook() {
    	brepository.deleteById(5);
    	
    	List<Book> books = brepository.findByTitle("Animal Farm");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getAuthor()).isEqualTo("George Orwe");
    }
    */
}