package com.hollycrm.order_service.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class ProductOrder implements Serializable {
    private int id;
    private String tradeNo;
    private int userId;
    private String productName;
    private int price;
    private Date createTime;

}
