package com.example.MyBookShopApp.repository;

import com.example.MyBookShopApp.data.author.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    Author findBySlug(String slug);

}
