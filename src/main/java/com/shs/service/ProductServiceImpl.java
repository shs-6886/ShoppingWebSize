package com.shs.service;

import com.shs.dao.ProductDao;
import com.shs.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shs
 * @create 2019-11-21-17:05
 */
@Service
public class ProductServiceImpl {
    @Resource
    private ProductDao pd;

    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int product_id) {
        return pd.selectOne(product_id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int product_id) {
        return pd.delete(product_id);
    }



}
