package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.SpaceCraft;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceCraftRepository extends JpaRepository<SpaceCraft, Long> {

  List<SpaceCraft> findByTitleContainingIgnoreCase(String title);


}
