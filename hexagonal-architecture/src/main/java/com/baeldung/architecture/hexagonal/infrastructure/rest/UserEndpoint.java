package com.baeldung.architecture.hexagonal.infrastructure.rest;

import org.springframework.web.bind.annotation.*;

import com.baeldung.architecture.hexagonal.core.domain.User;

@RequestMapping("user")
public interface UserEndpoint {

    @PostMapping
    public void create(@RequestBody User request);

    @GetMapping("/{id}")
    public User view(@PathVariable Long id);

}
