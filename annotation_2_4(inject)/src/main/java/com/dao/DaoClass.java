package com.dao;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.model.Point;
import com.newbean.Figure;
import com.newbean.Rect;

@Repository
public class DaoClass {
	/*@Resource
	Point point;
	public Point show(){
		return point;
	}
	*/
//	@Inject	@Qualifier(value="rect")
//	@Resource(name="rect")
	//@Autowired
	//@Resource
	@Inject
	//@Qualifier(value="tri")
	//Figure rect;
	Rect figure;
	public Rect showFig(){		return figure;	}}
