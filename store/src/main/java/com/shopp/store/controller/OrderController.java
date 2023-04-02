package com.shopp.store.controller;

import com.shopp.store.dto.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping(path = "/place-order")
    public ResponseEntity<OrderDTO> placeOrder(@RequestBody OrderDTO orderRequest){
        return null;
    }

}
