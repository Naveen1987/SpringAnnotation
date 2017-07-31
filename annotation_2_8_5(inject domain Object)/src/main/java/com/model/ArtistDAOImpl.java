package com.model;

import org.springframework.stereotype.Component;

@Component
public class ArtistDAOImpl implements ArtistDAO {

	  public void save(Artist artist) {
	        System.out.println("saving");
	    }

}