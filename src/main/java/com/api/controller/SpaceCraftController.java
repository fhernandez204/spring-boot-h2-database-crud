package com.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.api.configuration.ErrorCode;
import com.api.controller.exception.NonTargetRestException;
import com.api.controller.exception.RestGenericException;
import com.api.model.Message;
import com.api.model.SpaceCraft;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.repository.SpaceCraftRepository;
import org.springframework.web.client.ResourceAccessException;

import com.google.gson.Gson;

@Log4j2
@RestController
@RequestMapping("/api")
public class SpaceCraftController {
  private static final Logger logger = LoggerFactory.getLogger(SpaceCraftController.class);

  @Autowired
  SpaceCraftRepository spaceCraftRepository;

  @Cacheable("spaceCraft")
  @GetMapping("/naves")
  public ResponseEntity<List<SpaceCraft>> getAllSpaceCraft(@RequestParam(required = false) String title) {
    try {
      List<SpaceCraft> naveEspacials = new ArrayList<SpaceCraft>();
      List<SpaceCraft> naveEspacialsConTainsTitle = new ArrayList<SpaceCraft>();
      spaceCraftRepository.findAll().forEach(naveEspacials::add);

      if (title != null){
        for(SpaceCraft spaceCraft:naveEspacials){
          if(spaceCraft.getTitle().toLowerCase().contains(title.toLowerCase())){
            naveEspacialsConTainsTitle.add(spaceCraft);
          }
        }
        return new ResponseEntity<>(naveEspacialsConTainsTitle, HttpStatus.OK);
      }

      if (naveEspacials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(naveEspacials, HttpStatus.OK);
    } catch (Exception e) {
      throw new RestGenericException(ErrorCode.INTERNAL_ERROR);
      //return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/naves/{id}")
  public ResponseEntity<SpaceCraft> getSpaceCraftById(@PathVariable("id") long id) {
    try {
      //if(id>0) {
        Optional<SpaceCraft> spaceCraftData = spaceCraftRepository.findById(id);
        if (spaceCraftData.isPresent()) {
          return new ResponseEntity<>(spaceCraftData.get(), HttpStatus.OK);
        } else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
      /*} else {
        throw new RestGenericException(ErrorCode.BAD_ID);
      }*/
    } catch (ResourceAccessException ex) {
      throw new RestGenericException(ErrorCode.INTERNAL_ERROR);
    }
  }

  @PostMapping("/naves")
  public ResponseEntity<SpaceCraft> createSpaceCraft(@RequestBody SpaceCraft naveEspacial) {
    try {
      SpaceCraft _naveEspacial = spaceCraftRepository.save(new SpaceCraft(naveEspacial.getTitle(), naveEspacial.getDescription(), naveEspacial.isPublished()));
      return new ResponseEntity<>(_naveEspacial, HttpStatus.CREATED);
    } catch (Exception e) {
      throw new RestGenericException(ErrorCode.INTERNAL_ERROR);
      //return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @PutMapping("/naves/{id}")
  public ResponseEntity<SpaceCraft> updateSpaceCraft(@PathVariable("id") long id, @RequestBody SpaceCraft naveEspacial) {
    Optional<SpaceCraft> naveData = spaceCraftRepository.findById(id);
    if (naveData.isPresent()) {
      SpaceCraft _naveEspacial = naveData.get();
      _naveEspacial.setTitle(naveEspacial.getTitle());
      _naveEspacial.setDescription(naveEspacial.getDescription());
      _naveEspacial.setPublished(naveEspacial.isPublished());
      return new ResponseEntity<>(spaceCraftRepository.save(_naveEspacial), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/naves/{id}")
  public ResponseEntity<HttpStatus> deleteSpaceCraft(@PathVariable("id") long id) {
    try {
      spaceCraftRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/naves")
  public ResponseEntity<HttpStatus> deleteAllSpaceCrafts() {
    try {
      spaceCraftRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/naves/published")
  public ResponseEntity<List<SpaceCraft>> findByPublished() {
    try {
      List<SpaceCraft> naveEspacials = spaceCraftRepository.findByPublished(true);

      if (naveEspacials.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(naveEspacials, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}
