package com.groyyo.core.sqlPostgresJpa.specification.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.groyyo.core.sqlPostgresJpa.entity.AbstractJpaEntity;
import com.groyyo.core.sqlPostgresJpa.specification.GroyyoSpecification;

public class GroyyoSpecificationBuilder<T extends AbstractJpaEntity> {

	private final List<SearchCriteria> params;

		private final List<Specification<T>> externalSpecifications;

	public GroyyoSpecificationBuilder() {
		params = new ArrayList<>();
		externalSpecifications = new ArrayList<>();
	}

	public GroyyoSpecificationBuilder<T> with(String key, CriteriaOperation operation, Object value) {

		params.add(new SearchCriteria(key, operation, value));
		return this;
	}

	public void addExternalSpecification(Specification<T> specification) {
		externalSpecifications.add(specification);
	}

	public Specification<T> build() {

		if (params.isEmpty() && externalSpecifications.isEmpty() ) {
			return null;
		}

		List<Specification<T>> specs = addParamsToSpecification();

		specs.addAll(externalSpecifications);
		
		return generateFinalSpecificationFromList(specs);
	}

	private Specification<T> generateFinalSpecificationFromList(List<Specification<T>> specs) {

		Specification<T> result = specs.get(0);

		for (int i = 1; i < specs.size(); i++) {
			result = Specification.where(result).and(specs.get(i));
		}

		return result;
	}

	private List<Specification<T>> addParamsToSpecification() {

		List<Specification<T>> specs = new ArrayList<>();

		for (SearchCriteria param : params) {
			specs.add(new GroyyoSpecification<T>(param));
		}

		return specs;
	}
}