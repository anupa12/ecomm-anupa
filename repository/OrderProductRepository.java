package com.anupa.ecommerce.repository;

import com.anupa.ecommerce.model.OrderProduct;
import com.anupa.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
