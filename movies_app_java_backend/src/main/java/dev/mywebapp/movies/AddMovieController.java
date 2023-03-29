package dev.mywebapp.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/addmovie")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AddMovieController {
    @Autowired
    private AddMovieService addMovieService;
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Map<String, String> inputs){
        List<String> inputgenres = List.of(new String[]{inputs.get("genres")});
        List<String> inputbackdrop = List.of(new String[]{inputs.get("backdrops")});
        return new ResponseEntity<Movie>(addMovieService.createMovie(inputs.get("imdbId") + inputs.get("title"), inputs.get("imdbId"), inputs.get("title"),inputs.get("releaseDate"),inputs.get("trailerLink"),inputs.get("poster"),inputgenres,inputbackdrop), HttpStatus.CREATED);
    }
        }
