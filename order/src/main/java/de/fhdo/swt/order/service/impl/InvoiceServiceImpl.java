package de.fhdo.swt.order.service.impl;

import com.netflix.discovery.converters.Auto;
import de.fhdo.swt.order.client.ItemFeignClient;
import de.fhdo.swt.order.client.LocationFeignClient;
import de.fhdo.swt.order.entity.Invoice;
import de.fhdo.swt.order.entity.Order;
import de.fhdo.swt.order.entity.shared.Item;
import de.fhdo.swt.order.entity.shared.Location;
import de.fhdo.swt.order.service.InvoiceService;
import de.fhdo.swt.order.service.OrderService;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
  private ItemFeignClient itemFeignClient;
  private OrderService orderService;
  private LocationFeignClient locationFeignClient;

  @Autowired
  public void setLocationFeignClient(LocationFeignClient locationFeignClient) {
    this.locationFeignClient = locationFeignClient;
  }

  @Autowired
  public void setItemFeignClient(ItemFeignClient itemFeignClient) {
    this.itemFeignClient = itemFeignClient;
  }

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @Override
  public Invoice createInvoice(String orderId,  String locationId) {
    Order order = orderService.readOrder(orderId);
    Location location = locationFeignClient.readLocation(locationId);
    Invoice invoice = new Invoice();

    invoice.setInvoiceId(location.getId() + order.getId());
    invoice.setInvoiceReceiver(location.getBuyer());
    invoice.setLocation(location);
    invoice.setTotalAmong(0);
    List<String> itemNameList = new LinkedList<>();

    for (String itemId : order.getItemIdList()){
      Item item = itemFeignClient.readItem(itemId);
      itemNameList.add(item.getName());
      invoice.setTotalAmong(invoice.getTotalAmong() + item.getPrice());
    }

    invoice.setItemList(itemNameList);

    return invoice;
  }
}
