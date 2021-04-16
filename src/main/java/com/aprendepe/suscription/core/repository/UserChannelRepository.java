package com.aprendepe.suscription.core.repository;

import com.aprendepe.suscription.core.entity.User;
import com.aprendepe.suscription.core.entity.UserChannel;
import com.aprendepe.suscription.core.entity.UserChannelId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserChannelRepository extends JpaRepository<UserChannel, UserChannelId> {
    List<UserChannel> findUserChannelByUser(User user);
}
