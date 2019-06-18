package de.fhdo.swt.order.controller;

import de.fhdo.swt.order.entity.Order;
import de.fhdo.swt.order.service.OrderService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/v1/orderinterface", produces = "application/json")
public class OrderController {
  private OrderService orderService;

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @PutMapping(value = "/")
  public Order createOrder(@RequestBody Order order){
    return orderService.createOrder(order);
  }

  @PostMapping(value = "/")
  public Order updateOrder(@RequestBody Order order){
    return orderService.updateOrder(order);
  }

  @GetMapping(value = "/order/id/{id}")
  public Order readOrder(@PathVariable String id) {
    return orderService.readOrder(id);
  }

}
