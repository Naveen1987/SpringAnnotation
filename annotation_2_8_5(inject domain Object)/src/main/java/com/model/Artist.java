package com.model;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Configurable(autowire=Autowire.BY_TYPE)
@Component
public class Artist {

    @Autowired
    private ArtistDAO artistDao;

    public void setArtistDao(ArtistDAO artistDao) {
        this.artistDao = artistDao;
    }

    public void save() {
        artistDao.save(this);
    }

}