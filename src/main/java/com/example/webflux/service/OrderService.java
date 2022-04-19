package com.example.webflux.service;

import com.example.webflux.domain.Order;
import com.example.webflux.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public Flux<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Mono<Order> createOrder(Order order) {
        return orderRepository.save(order);
    }
//    public Flux<Order> getOrdersByUserId(Long userId) {
//
//    }
}
