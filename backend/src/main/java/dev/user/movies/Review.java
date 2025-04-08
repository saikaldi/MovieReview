package dev.user.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    // Default constructor
    public Review() {}

    // Constructor with parameters
    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    // Getter and Setter for id
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    // Getter and Setter for body
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    // Getter and Setter for created
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    // Getter and Setter for updated
    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
