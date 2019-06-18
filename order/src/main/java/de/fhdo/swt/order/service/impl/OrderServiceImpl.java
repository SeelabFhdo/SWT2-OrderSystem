package de.fhdo.swt.order.service.impl;

import de.fhdo.swt.order.entity.Order;
import de.fhdo.swt.order.repository.OrderRepository;
import de.fhdo.swt.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  private OrderRepository orderRepository;

  @Autowired
  public void setOrderRepository(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public Order createOrder(Order order) {
    return orderRepository.save(order);
  }

  @Override
  public Order updateOrder(Order order) {
    return orderRepository.save(order);
  }

  @Override
  public Order readOrder(String id) {
    return orderRepository.findById(id).orElseGet(null);
  }

  @Override
  public void deleteOrder(Order order) {
    orderRepository.delete(order);
  }
}
