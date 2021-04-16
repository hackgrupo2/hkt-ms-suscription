package com.aprendepe.suscription.core.repository;

import com.aprendepe.suscription.core.entity.Channel;
import com.aprendepe.suscription.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
