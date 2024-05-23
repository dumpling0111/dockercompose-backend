package com.example.dockercomposebackenddemo.repository;

import com.example.dockercomposebackenddemo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    // 原生SQL查询方法
    @Query(value = "SELECT * FROM items", nativeQuery = true)
    List<Item> findAllNative();
}
