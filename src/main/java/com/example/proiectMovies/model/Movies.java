package com.example.proiectMovies.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "movies")
public class Movies {
    // Automatic primary key
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   // @OneToOne(cascade = CascadeType.ALL, mappedBy = "movies")
   // private InfoMovies infoMovies;
   @OneToOne(cascade = CascadeType.ALL, mappedBy = "movies")
   private InfoMovies infoMovies;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movies")
    private List<Review> reviews = new ArrayList<>();
      @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
      @JoinTable(name = "category_mappings", joinColumns = {@JoinColumn(name = "movie_id", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id")})
      private Set<Category> category = new HashSet<>();
    @NotNull(message = "Title is required!")
    @Size(max = 50, min = 2, message = "Title should be between 2 and 50 characters!")
    @Column(name = "title", nullable = false)
     private String title;
    @NotNull(message = "Dscription is required!")
    @Size(max = 50, min = 2, message = "Description should be between 2 and 200 characters!")
    @Column(name = "description", nullable = false)
    private String description;


}