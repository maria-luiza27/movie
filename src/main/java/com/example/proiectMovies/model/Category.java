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
@Table(name = "category")
    public class Category {
        @JsonIgnore
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @JsonIgnore
        @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "category")
        private Set<Movies> movies = new HashSet<>();
        @Column(name = "category_name", nullable = false)
        @NotNull(message = "Category name is required")
        @Size(min = 2, max = 20, message = "Category name should be between 2 and 20 characters!")
        private String categoryName;

    }
