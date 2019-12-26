package com.hyecheon.datajpa.repository;

import com.hyecheon.datajpa.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

    @Test
    void save() {
        final Item item = new Item();
        itemRepository.save(item);
    }
}