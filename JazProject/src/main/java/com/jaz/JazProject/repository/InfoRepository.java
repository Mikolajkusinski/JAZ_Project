package com.jaz.JazProject.repository;

import com.jaz.JazProject.entities.InfoAboutClient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InfoRepository extends CrudRepository<InfoAboutClient,Long> {
    public InfoAboutClient findById(long id);
    public List<InfoAboutClient> findAll();
}
