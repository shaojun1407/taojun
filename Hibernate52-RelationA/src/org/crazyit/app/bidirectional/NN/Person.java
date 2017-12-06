package org.crazyit.app.bidirectional.NN;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
@Table(name="person_inf")
@Getter@Setter
public class Person
{
	// ��ʶ����
	@Id @Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int age;
	// �����Personʵ�����й�����Addressʵ��
	@ManyToMany(targetEntity=Address.class,mappedBy="persons")	//����һ��ʵ��ԵĹ�������
	/*@ManyToMany(targetEntity=Address.class)	
	// ӳ�����ӱ�ָ�����ӱ�ı���Ϊperson_address
	@JoinTable(name="person_address",
		// ӳ�����ӱ�����Ϊperson_id������У�
		// ���в��յ�ǰʵ���Ӧ���person_id������
		joinColumns=@JoinColumn(name="person_id", referencedColumnName="person_id"),
		// ӳ�����ӱ�����Ϊaddress_id������У�
		// ���в�����ǰʵ��Ĺ���ʵ���Ӧ���address_id������
		inverseJoinColumns=@JoinColumn(name="address_id", referencedColumnName="address_id")
	)*/
	private Set<Address> addresses= new HashSet<>();

	
}