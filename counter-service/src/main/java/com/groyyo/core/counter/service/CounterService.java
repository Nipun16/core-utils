package com.groyyo.core.counter.service;

import com.groyyo.core.counter.exceptions.CounterServiceException;
import org.springframework.stereotype.Service;

@Service
public interface CounterService {

	Long increaseCount(CategoryKey counterKey) throws CounterServiceException;
	Long increaseCountByValue(CategoryKey counterKey, Long count) throws CounterServiceException;

}
