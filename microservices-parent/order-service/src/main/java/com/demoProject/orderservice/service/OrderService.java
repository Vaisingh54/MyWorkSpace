package com.demoProject.orderservice.service;


import com.demoProject.orderservice.repository.dto.OrderLineItemsDto;
import com.demoProject.orderservice.repository.dto.OrderRequest;
import com.demoProject.orderservice.model.Order;
import com.demoProject.orderservice.model.OrderLineItems;
import com.demoProject.orderservice.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;

    public void placeOrder(OrderRequest orderRequest)
    {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList().stream()
                .map(this::mapToDTO).toList();
        order.setOrderLineItems(orderLineItems);
        orderRepo.save(order);

    }

    private OrderLineItems mapToDTO(OrderLineItemsDto orderLineItemsDto) {

        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
      }
}
