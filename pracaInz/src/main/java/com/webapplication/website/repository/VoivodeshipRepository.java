package com.webapplication.website.repository;

import com.webapplication.website.model.Voivodeship;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoivodeshipRepository extends MongoRepository <Voivodeship, Long>{

    List<Voivodeship> findAll();
}
