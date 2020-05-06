package com.baeldung.architecture.hexagonal.infrastructure.rest;

import org.springframework.web.bind.annotation.*;

import com.baeldung.architecture.hexagonal.infrastructure.dto.PasswordDto;

@RequestMapping("password")
public interface PasswordEndpoint {

    @PutMapping
    void update(@RequestBody PasswordDto password);

    @GetMapping("reset/{userId}")
    void reset(@PathVariable Long userId);

}
