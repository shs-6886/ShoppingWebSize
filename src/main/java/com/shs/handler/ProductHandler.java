package com.shs.handler;



import com.shs.po.Product;
import com.shs.service.ProductService;
import com.shs.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author shs
 * @create 2019-11-21-16:08
 */
@RequestMapping("/product")
@Controller
public class ProductHandler {
    @Autowired
    private ProductService ps;
    @Autowired
    private StatusService ss;

    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("productList", ps.selectAll());
        return "index";
    }

    @RequestMapping("/selectOne")
    public String selectOne(int product_id, Model model) {
        model.addAttribute("pro", ps.selectOne(product_id));
        model.addAttribute("statusList", ss.selectAll());
        return "update";
    }


    @RequestMapping("/update")
    public String update(Product product){
        ps.update(product);
        return "redirect:/product/selectAll";
    }


}
