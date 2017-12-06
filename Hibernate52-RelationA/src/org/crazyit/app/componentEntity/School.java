package org.crazyit.app.componentEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Entity
@Table(name = "school_inf")
@Getter
@Setter
public class School {
	// 定义标识属性
	@Id
	@Column(name = "school_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	// 定义该学校的name成员变量
	private String name;

	// 无参数的构造器
	public School() {
	}

	// 初始化全部成员变量的构造器
	public School(String name) {
		this.name = name;
	}

}