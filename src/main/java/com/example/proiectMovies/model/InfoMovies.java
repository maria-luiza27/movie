package com.example.proiectMovies.model;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "InfoMovies")
public class InfoMovies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   @OneToOne
    private Movies movies;

}
