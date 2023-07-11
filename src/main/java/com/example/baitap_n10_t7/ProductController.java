package com.example.baitap_n10_t7;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Inject
    private ProductService productService;
    @GetMapping("/product")
    public ResponseEntity<?> findAll(){
        List<Product> productList = productService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
    @PostMapping("/product")
    public ResponseEntity<?> save(@RequestBody Product product){
        productService.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
