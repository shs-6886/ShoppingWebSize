package com.shs.dao;

import com.shs.po.Product;


import java.util.List;

/**
 * @author shs
 * @create 2019-11-21-16:03
 */
public interface ProductDao {
    /**
     * 查询全部
     *
     * @return
     */
    List<Product> selectAll();

    /**
     * 根据id查询
     *
     * @param product_id
     * @return
     */
    Product selectOne(int product_id);

    /**
     * 增加
     *
     * @param product
     * @return
     */
    int insert(Product product);

    /**
     * 修改
     *
     * @param product
     * @return
     */
    int update(Product product);

    /**
     * 删除
     *
     * @param product_id
     * @return
     */
    int delete(int product_id);
}
