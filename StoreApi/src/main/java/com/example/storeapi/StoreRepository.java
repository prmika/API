package com.example.storeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
@Override
    ArrayList<Store> findAll();
    ArrayList<Store> findByName(String name);
    ArrayList<Store> deleteByName(String name);

}
