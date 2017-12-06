package org.crazyit.app.oneNcompositeId;

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
@Getter
@Setter
public class Person implements java.io.Serializable {
	/**
	 * ԭ����û�д��ֶΣ�
	 */
	private static final long serialVersionUID = 1L;
	// ����first��Ա��������Ϊ��ʶ���Եĳ�Ա
	@Id
	private String first;
	// ����last��Ա��������Ϊ��ʶ���Եĳ�Ա
	@Id
	private String last;
	private int age;
	// ��¼��Personʵ�����������Addressʵ��
	@OneToMany(targetEntity = Address.class, mappedBy = "person", cascade = CascadeType.ALL)
	private Set<Address> addresses = new HashSet<>();

	// ��дequals()����������first��last�����ж�
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Person.class) {
			Person target = (Person) obj;
			return target.getFirst().equals(this.first) && target.getLast().equals(this.last);
		}
		return false;
	}

	// ��дhashCode()����������first��last����hashCodeֵ
	public int hashCode() {
		return getFirst().hashCode() * 31 + getLast().hashCode();
	}
}