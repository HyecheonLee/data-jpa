package com.hyecheon.datajpa.repository;

import com.hyecheon.datajpa.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
