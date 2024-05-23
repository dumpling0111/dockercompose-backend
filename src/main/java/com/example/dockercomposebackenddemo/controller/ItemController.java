package com.example.dockercomposebackenddemo.controller;

import com.example.dockercomposebackenddemo.entity.Item;
import com.example.dockercomposebackenddemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {
    @Autowired
    private ItemService itemService;

    // 获取所有item的API端点
    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItemsNative();
    }
}
