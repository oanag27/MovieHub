package com.exampleoana.movies.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data   //takes care of all the getters, setters, toString methods
@AllArgsConstructor  //create a constructor that takes care of all the private fields
@NoArgsConstructor  //no params
public class Movie {
    @Id //let the framework know that the id should be treated as a unique identifier inside db
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference   //db will store only the ids of the review->manual reference reviews
    private List<Review> reviewIds;
}
