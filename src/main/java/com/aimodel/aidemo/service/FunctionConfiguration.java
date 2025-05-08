package com.aimodel.aidemo.service;

import com.aimodel.aidemo.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@AllArgsConstructor
public class FunctionConfiguration {

    private final ProductService productService;
    public record ProductName(String name){}
    public record ProductDetails(int id, String name, double price, int quantity){}

    public Function<ProductName, ProductDetails> getProductDetails(){
        return  productName -> {
            Product product = productService.findProductByName(productName.name());
            if(product != null){
                return new ProductDetails(product.getId(), product.getName(), product.getPrice(), product.getQuantity());
            } else {
                return new ProductDetails(0, "Not Found", 0, 0);
            }
        };
    }
}
