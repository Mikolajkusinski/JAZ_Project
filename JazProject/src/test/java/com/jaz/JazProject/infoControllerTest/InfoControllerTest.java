package com.jaz.JazProject.infoControllerTest;

import com.jaz.JazProject.Services.InfoService;
import com.jaz.JazProject.controllers.InfoController;
import com.jaz.JazProject.entities.InfoAboutClient;
import com.jaz.JazProject.enumes.TypeOfBuldingEnum;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;

import static org.mockito.Mockito.when;

@SpringBootTest
public class InfoControllerTest  {

    @Autowired
    private InfoService infoService;

    @Test
    public void postInfoShouldPost() throws Exception{
        InfoAboutClient infoAboutClient = new InfoAboutClient("Maciej","Tomkow","Gdansk klonowa 1",12.00,134.00,3, TypeOfBuldingEnum.FLAT,true);
        infoService.insertInfoInToRepo(infoAboutClient);
        infoService.getAllInfoFromRepo();
    }

}
