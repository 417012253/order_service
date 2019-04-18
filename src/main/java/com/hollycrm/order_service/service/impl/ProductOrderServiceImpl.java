package com.hollycrm.order_service.service.impl;

import com.hollycrm.order_service.domain.Product;
import com.hollycrm.order_service.domain.ProductOrder;
import com.hollycrm.order_service.service.ProductClient;
import com.hollycrm.order_service.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {

/*    @Autowired
    private RestTemplate restTemplate;*/
    /*@Autowired
    private LoadBalancerClient loadBalancer;*/
    @Autowired
    private ProductClient productClient;

    @Override
    public ProductOrder save(int userId, int productId) {
        /*ServiceInstance instance = loadBalancer.choose("product-service");
        URI uri = URI.create(String.format("http://%s:%s/api/v1/product/findById?id="+productId, instance.getHost(), instance.getPort()));
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(uri.toString(),Product.class);*/
        Product product = productClient.findById(productId);
        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setProductName(product.getName());
        productOrder.setTradeNo(UUID.randomUUID().toString());
        return productOrder;
    }
}
