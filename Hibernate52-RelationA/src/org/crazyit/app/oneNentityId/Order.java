package org.crazyit.app.oneNentityId;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_inf")
@Getter
@Setter
public class Order {
	// �����ʶ����
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Date orderDate;
	// �����ĵĶ�����
	@OneToMany(targetEntity = OrderItem.class, mappedBy = "order")
	private Set<OrderItem> items = new HashSet<>();

	// �޲����Ĺ�����
	public Order() {
	}

	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Order(Date orderDate) {
		this.orderDate = orderDate;
	}

}