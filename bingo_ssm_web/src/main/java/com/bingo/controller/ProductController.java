package com.bingo.controller;

import com.bingo.domain.Orders;
import com.bingo.domain.Product;
import com.bingo.service.IProductService;
import com.bingo.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by bingo on 2019/6/15
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping("/save.do")
    public String save(Product product)throws Exception{
        iProductService.save(product);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List <Product> all = iProductService.findAll();
        for (Product product:all){
            System.out.println(product.toString());
        }
        modelAndView.addObject("productList",all);
        modelAndView.setViewName("product-list");
        return modelAndView;
    }


}
