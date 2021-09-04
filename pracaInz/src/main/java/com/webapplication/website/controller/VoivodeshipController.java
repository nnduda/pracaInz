package com.webapplication.website.controller;

import com.webapplication.website.model.Voivodeship;
import com.webapplication.website.service.VoivodeshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VoivodeshipController {
    @Autowired
    VoivodeshipService voivodeshopService;


    @GetMapping(value = "/dataOne")
    public List<Voivodeship> getAllVoivodeship(Model model) {
        List<Voivodeship> voivodeshipList = voivodeshopService.getAllVoivodeship();
        model.addAttribute("voivodeship", voivodeshipList);
        return voivodeshipList;
    }

/*    @RequestMapping(value = "/dataOne", method = RequestMethod.GET)
    public String getSortedBytogetherSum(Model model,
                                         @RequestParam("sortField") String sortField,
                                         @RequestParam("sortDir") String sortDir) {
        System.out.println(sortField);
        List<Voivodeship> voivodeshipList = voivodeshopService.sortTogetherSum(sortField, sortDir);
        model.addAttribute("voivodeship", voivodeshipList);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSort", sortDir.equals("asc") ? "desc" : "asc");
        return "dataOne";
    }*/
    @GetMapping(value = "/dataOne/")
    public String getSortedBytogetherSum(Model model,
                                         @RequestParam("sortField") String sortField,
                                         @RequestParam("sortDir") String sortDir) {
      //  System.out.println(sortField);
        List<Voivodeship> voivodeshipList = voivodeshopService.sortTogetherSum(sortField, sortDir);
        model.addAttribute("voivodeship", voivodeshipList);
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSort", sortDir.equals("asc") ? "desc" : "asc");
        return "dataOne";
    }

}
