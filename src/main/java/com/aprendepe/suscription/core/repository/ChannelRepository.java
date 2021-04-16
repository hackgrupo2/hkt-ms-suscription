package com.aprendepe.suscription.core.repository;

import com.aprendepe.suscription.core.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {
    Channel findByUserId(Integer userId);
}
