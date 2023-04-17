package com.shopp.store.service;

import com.shopp.store.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public ProductDTO addProduct(ProductDTO productRequest);
    public List<ProductDTO> getProducts();
    public ProductDTO getProductById(long id);
    public ProductDTO updateProduct(long productId,ProductDTO productRequest);
    public String deleteProduct(long productId);
}
