package com.hollycrm.order_service.service;

import com.hollycrm.order_service.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("product-service")
public interface ProductClient {
    /**
     *
     * @return
     */
    @RequestMapping("list")
    public Object list();

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("api/v1/product/findById")
    public Product findById(@RequestParam("id") int id);
}
