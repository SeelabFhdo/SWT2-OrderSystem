package de.fhdo.swt.order.service;

import de.fhdo.swt.order.entity.Order;

public interface OrderService {
  public Order createOrder (Order order);
  public Order updateOrder(Order order);
  public Order readOrder(String id);
  public void deleteOrder(Order order);
}
