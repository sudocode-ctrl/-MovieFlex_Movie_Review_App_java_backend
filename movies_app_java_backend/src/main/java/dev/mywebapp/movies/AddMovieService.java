package dev.mywebapp.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddMovieService {
    @Autowired
    private MovieRepository movieRepository;




    public  Movie createMovie(String id, String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrops){
        Movie movie=  movieRepository.insert(new Movie(imdbId + title, imdbId, title, releaseDate, trailerLink, poster, genres, backdrops));

    return movie;
    }
}
