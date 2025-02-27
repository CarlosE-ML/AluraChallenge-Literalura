package com.literalura.repository;
import com.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILibroRepository extends JpaRepository<Libro, Long> {
    Libro findByTitulo (String titulo);

    List<Libro> findByIdiomaContaining(String idiomas);

    @Query("SELECT l FROM Libro l LEFT JOIN FETCH l.idioma")
    List<Libro> findAllWithIdiomas();
}