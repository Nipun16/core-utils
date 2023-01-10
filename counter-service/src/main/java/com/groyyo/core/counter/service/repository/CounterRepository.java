package com.groyyo.core.counter.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groyyo.core.counter.entity.CounterKeyEntity;

@Repository
public interface CounterRepository extends JpaRepository<CounterKeyEntity, Long>{

	CounterKeyEntity findByKey(String key);
}
