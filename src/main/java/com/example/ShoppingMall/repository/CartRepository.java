package com.example.ShoppingMall.repository;

import com.example.ShoppingMall.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
        Cart findByMemberId(Long memberId);
}
