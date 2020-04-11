package ru.idrisov.springStudy.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.idrisov.springStudy.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
