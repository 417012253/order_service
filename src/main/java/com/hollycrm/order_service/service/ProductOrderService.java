package com.hollycrm.order_service.service;

import com.hollycrm.order_service.domain.ProductOrder;

public interface ProductOrderService {
    public ProductOrder save(int userId, int productId);
}
