package com.shao.springmvc.service;

import com.shao.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);

}
