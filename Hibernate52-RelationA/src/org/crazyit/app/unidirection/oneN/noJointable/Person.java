package org.crazyit.app.unidirection.oneN.noJointable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	// �����Personʵ�����й�����Addressʵ�壬û��ָ��cascade����
	@OneToMany(targetEntity=Address.class)
	// ӳ������У��˴�ӳ�������н�����ӵ�����ʵ���Ӧ�����ݱ���
	@JoinColumn(name="person_id" , referencedColumnName="person_id")
	private Set<Address> addresses
		= new HashSet<>();

}