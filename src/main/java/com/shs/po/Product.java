package com.shs.po;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shs
 * @create 2019-11-21-14:49
 */
@Data
public class Product {
private int product_id;
private String product_name;
private int product_sum;
private int product_price;
}
