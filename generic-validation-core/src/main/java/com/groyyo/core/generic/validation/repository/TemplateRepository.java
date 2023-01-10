package com.groyyo.core.generic.validation.repository;

import com.groyyo.core.generic.validation.entity.Templates;
import com.groyyo.core.mongobase.repository.AbstractMongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TemplateRepository extends AbstractMongoRepository<Templates, String> {

    @Query("{'templateOwner': ?0}")
    Optional<Templates> findByTemplateOwner(final String templateOwner);

}