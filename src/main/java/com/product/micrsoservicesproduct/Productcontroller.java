package com.product.micrsoservicesproduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class Productcontroller {

    @Autowired
    private Productrepository productrepository;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        return productrepository.save(product);
    }

    @GetMapping("/all")
    public List<Product> getProduct(){
        return productrepository.findAll();
    }

    @DeleteMapping({"/all"})
    public String deleteAllCarts(){
        productrepository.deleteAll();
        return "Product Deleted";
    }

    @DeleteMapping({"/id"})
    public String deleteById(@PathVariable Long id){
        productrepository.deleteById(id);
        return "Product Deleted";
    }


}

