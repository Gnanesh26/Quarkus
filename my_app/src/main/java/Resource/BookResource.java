package Resource;

import Entity.Book;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.openapi.annotations.Operation;

import java.util.List;

@Path("/books")
public class BookResource {

    @GET
    @Operation(summary = "Get a list of books")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        return Book.listAll();
    }
}