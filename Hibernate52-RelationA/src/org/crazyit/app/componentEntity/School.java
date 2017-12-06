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
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
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
	// �����ʶ����
	@Id
	@Column(name = "school_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	// �����ѧУ��name��Ա����
	private String name;

	// �޲����Ĺ�����
	public School() {
	}

	// ��ʼ��ȫ����Ա�����Ĺ�����
	public School(String name) {
		this.name = name;
	}

}