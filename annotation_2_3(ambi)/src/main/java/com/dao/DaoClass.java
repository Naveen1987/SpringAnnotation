package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.model.Figure;


@Repository
public class DaoClass {
	Figure fig;
	@Autowired
	public void setFig(@Qualifier("Tri") Figure fig){this.fig=fig;	}
	public Figure show(){		return fig;	}
}
