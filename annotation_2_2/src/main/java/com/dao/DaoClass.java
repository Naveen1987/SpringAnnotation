package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Point;

@Repository
public class DaoClass {

//on fields
	@Autowired
	Point point1;

//On setter
	/*Point point;
	@Autowired(required=false)
	public void setPoint(Point point){
		this.point=point;
	}*/

//On constructor (it work without perfectly without autowried because Point bean already loaded 
// due to @Component so it automatically inject when DaoClass bean will create but in case of fields and setter
//	use it manually)
	/*Point point;
	@Autowired(required=false)
	public DaoClass(Point point){
		this.point=point;
	}*/
	
	
	public Point show1(){
		System.out.println("I am show1 Method");
		return point1;
	}
	

}
