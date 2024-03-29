package com.abhi.iniapp.service;

import com.abhi.iniapp.dto.OrderDto;
import java.util.List;


public interface OrderService {

    OrderDto saveOrder(OrderDto orderDto);

    OrderDto getOrder(int id);

    List<OrderDto> getOrdersByUserId(int id);

    List<OrderDto> getOrdersByVendorId(int id);
}
