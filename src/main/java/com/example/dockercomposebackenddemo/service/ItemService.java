package com.example.dockercomposebackenddemo.service;

import com.example.dockercomposebackenddemo.entity.Item;
import com.example.dockercomposebackenddemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    // 调用原生查询方法
    public List<Item> getAllItemsNative() {
        return itemRepository.findAllNative();
    }
}
