package com.baeldung.architecture.hexagonal.infrastructure.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.architecture.hexagonal.core.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNameEquals(String name);
}