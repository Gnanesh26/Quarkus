package Entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection="books")
public class Book extends PanacheMongoEntity {
    public String title;
    public String author;
    public int pages;
    public String genres;
    public int rating;
}
