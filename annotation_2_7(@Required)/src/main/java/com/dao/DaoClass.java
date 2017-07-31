package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.Point;


@Repository
public class DaoClass {
	@Autowired
	Point point;
	public Point show(){
		return point;
	}

}
