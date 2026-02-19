package com.example.ShoppingMall.repository;

import com.example.ShoppingMall.dto.ItemSearchDto;
import com.example.ShoppingMall.dto.MainItemDto;
import com.example.ShoppingMall.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
