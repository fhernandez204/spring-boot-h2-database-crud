package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.SpaceCraft;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceCraftRepository extends JpaRepository<SpaceCraft, Long> {
  List<SpaceCraft> findByPublished(boolean published);

  List<SpaceCraft> findByTitleContainingIgnoreCase(String title);

  /*@Query("SELECT title, description, published FROM space_craft")
  List<SpaceCraft> findByTitle(@Param("title") String title);*/

}
