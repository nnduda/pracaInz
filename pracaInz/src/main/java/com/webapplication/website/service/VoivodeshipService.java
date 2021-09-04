package com.webapplication.website.service;

import com.webapplication.website.model.Voivodeship;
import com.webapplication.website.repository.VoivodeshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoivodeshipService {
    @Autowired
    private VoivodeshipRepository voivodeshipRepository;

    public List<Voivodeship> getAllVoivodeship() {return voivodeshipRepository.findAll(); }


/*    public List<Voivodeship> sortTogetherSum(String fieldName){
        Sort sort = Sort.by(Sort.Direction.DESC, "togetherSum");
        Sort sort1 = Sort.by("fieldName").ascending();
        return voivodeshipRepository.findAll(sort1);
    }*/

    public List<Voivodeship> sortTogetherSum(String sortField, String sortDirection){
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortField).ascending():
                Sort.by(sortField).descending();
        return this.voivodeshipRepository.findAll(sort);
    }



}
