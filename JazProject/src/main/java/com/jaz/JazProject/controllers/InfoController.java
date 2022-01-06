package com.jaz.JazProject.controllers;

import com.jaz.JazProject.Services.InfoService;
import com.jaz.JazProject.algorythm.CountingAlgorythm;
import com.jaz.JazProject.entities.IdHolder;
import com.jaz.JazProject.entities.InfoAboutClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class InfoController {

    InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService){this.infoService = infoService;}

    @GetMapping("/test")
    public String displayAllInfo(Model model){
        List<InfoAboutClient> allInfo = infoService.getAllInfoFromRepo();

        model.addAttribute("allInfo",allInfo);
        model.addAttribute("idHolder",new IdHolder());
        return "index";
    }

    @PostMapping("/test")
    public String deleteInfo(@ModelAttribute IdHolder idHolder){
        infoService.deleteInfo(String.valueOf(idHolder.getId()));
        return "redirect:/test";
    }

    @GetMapping("/check_your_fees")
    public String displayMainForm(Model model){
        model.addAttribute("infoAboutClient", new InfoAboutClient());
        return "mainForm";
    }

    @PostMapping("/check_your_fees")
    public String submitMainForm(@ModelAttribute InfoAboutClient infoAboutClient, Model model){
        infoAboutClient.setFinalPrice(CountingAlgorythm.countFees(infoAboutClient));

        model.addAttribute("finalP",CountingAlgorythm.countFees(infoAboutClient));
        model.addAttribute("tekst",new String(" zl to szacowana naleznosc do zaplaty"));

        infoService.insertInfoInToRepo(infoAboutClient);

        return "mainForm";
    }

}
