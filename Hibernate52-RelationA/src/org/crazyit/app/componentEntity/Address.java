package org.crazyit.app.componentEntity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Parent;

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
@Embeddable
@Getter
@Setter
public class Address {
	// �����ַ��ϸ��Ϣ�ĳ�Ա����
	@Column(name = "address_detail")
	private String addressDetail;
	// ���������������ڵİ���ʵ��
	@Parent
	private Person person;
	// ���屣������ʵ���Set����
	@OneToMany(targetEntity = School.class)
	// ӳ������У��˴�����Hibernate��Schoolʵ���Ӧ�ı������������
	// ������е�����Ϊaddress_id������person_inf���peron_id������
	@JoinColumn(name = "address_id", referencedColumnName = "person_id")	//�˴�����ǰ����һ������������ֵ��һ���ˣ�
	private Set<School> schools = new HashSet<>();

	public Address() {
	}

	public Address(String addressDetail) {
		this.addressDetail = addressDetail;
	}

}