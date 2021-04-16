package com.aprendepe.suscription.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class UserChannelId implements Serializable {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "channel_id")
    private Integer channelId;
}
