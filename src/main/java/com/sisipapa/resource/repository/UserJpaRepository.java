package com.sisipapa.resource.repository;

import com.sisipapa.resource.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
