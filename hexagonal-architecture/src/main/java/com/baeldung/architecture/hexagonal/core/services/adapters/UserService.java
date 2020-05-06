package com.baeldung.architecture.hexagonal.core.services.adapters;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.baeldung.architecture.hexagonal.core.domain.User;
import com.baeldung.architecture.hexagonal.core.services.ports.UserServicePort;
import com.baeldung.architecture.hexagonal.infrastructure.db.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService implements UserServicePort {
    final UserRepository userRepository;

    @Override
    public void save(User user) {
        if (usernameExists(user.getName()))
            throw new EntityExistsException("Username already exists!");
        userRepository.save(user);
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
    }

    private boolean usernameExists(String username) {
        return userRepository.findByNameEquals(username)
            .isPresent();
    }
}
