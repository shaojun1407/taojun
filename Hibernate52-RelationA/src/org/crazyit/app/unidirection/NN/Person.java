package org.crazyit.app.unidirection.NN;

import java.util.*;

import javax.persistence.*;

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
@Table(name = "person_inf")
@Getter@Setter
public class Person {
	// ��ʶ����
	@Id
	@Column(name = "person_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	// �����Personʵ�����й�����Addressʵ��
	@ManyToMany(targetEntity = Address.class)
	// ӳ�����ӱ�Ϊperson_address
	@JoinTable(name = "person_address",
			// �������ӱ�����Ϊperson_id������У�������в��յ�ǰʵ���Ӧ���������
			joinColumns = @JoinColumn(name = "person_id"
			// �������ӱ�����Ϊaddress_id������У�
			// ������в��յ�ǰʵ��Ĺ���ʵ���Ӧ��������У�û��ָ��unique=true
					, referencedColumnName = "person_id"), inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "address_id"))
	private Set<Address> addresses = new HashSet<>();
}