package cn.bdqn.service;

import cn.bdqn.dao.ProductMapper;
import cn.bdqn.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    public List<Product> getList(){
        List<Product> list=productMapper.selectByExample(null);
        return list;
    }
    public List<Product> getlist01(){
          List<Product> list=productMapper.selectByPrimaryKey(null);
          return list;
    }

    public Product seleKey(Integer pid) {
        Product product=productMapper.selectPid(pid);
        return product;
    }
}
