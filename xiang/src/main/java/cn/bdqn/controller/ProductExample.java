package cn.bdqn.controller;

import cn.bdqn.pojo.Product;
import cn.bdqn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductExample {
    @Autowired
    ProductService productService;
    @RequestMapping("/list")
    public String getlist(Model model){
        List<Product> list=productService.getList();
         List<Product> list1=productService.getlist01();
          model.addAttribute("list",list);
          model.addAttribute("li",list1);
        return "index";
    }
    @RequestMapping("/seleKey/{pid}")
    public String seleKey(@PathVariable("pid") Integer pid, Model model){
        Product product=productService.seleKey(pid);
        model.addAttribute("product",product);
        return "product_info";
    }

  @RequestMapping("/product")
    public String product(){

        return "product_list";
  }


}
