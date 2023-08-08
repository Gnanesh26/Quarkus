package Resource;

import Entity.Book;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@Path("/books")
//@ApplicationScoped // or other appropriate scope

public class BookResource {
//    @Inject
//    BookRepository bookRepository;
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Book> getBooks() {
    // Use Panache to retrieve and return list of books
    return Book.listAll();
}
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Book> getAllBooks() {
//        return bookRepository.listAll();
//    }
//
//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Book getBookById(@PathParam("id") String id) {
//        return bookRepository.findById(new ObjectId(id));
//    }
//
//    @POST
//    @Transactional
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void addBook(Book book) {
//        bookRepository.persist(book);
//    }
//
//    @PUT
//    @Path("/{id}")
//    @Transactional
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void updateBook(@PathParam("id") String id, Book book) {
//        Book entity = bookRepository.findById(new ObjectId(id));
//        if (entity != null) {
//            entity.title = book.title;
//            entity.author = book.author;
//            entity.pages = book.pages;
//            entity.genres = book.genres;
//            entity.rating = book.rating;
//        }
//    }
//
//    @DELETE
//    @Path("/{id}")
//    @Transactional
//    public void deleteBook(@PathParam("id") String id) {
//        bookRepository.deleteById(new ObjectId(id));
//    }
}
