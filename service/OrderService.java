package com.anupa.ecommerce.service;

import com.anupa.ecommerce.model.Order;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Validated
public interface OrderService {

    @NotNull
    Optional<Order> getAllOrders(Long id);

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
