package com.baeldung.architecture.hexagonal.infrastructure.rest;

import org.springframework.web.bind.annotation.RestController;

import com.baeldung.architecture.hexagonal.core.services.ports.PasswordServicePort;
import com.baeldung.architecture.hexagonal.infrastructure.dto.PasswordDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PasswordEndpointController implements PasswordEndpoint {
    final PasswordServicePort passwordServicePort;

    @Override
    public void update(PasswordDto password) {
        passwordServicePort.update(password);
    }

    @Override
    public void reset(Long userId) {
        passwordServicePort.reset(userId);
    }
}
