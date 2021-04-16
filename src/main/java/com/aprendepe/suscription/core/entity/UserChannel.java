package com.aprendepe.suscription.core.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
@Table(name = "user_channel", schema = "equipo2")
public class UserChannel {
    @EmbeddedId
    private UserChannelId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("channelId")
    @JoinColumn(name = "channel_id")
    private Channel channel;

    @Column(name = "suscription_type")
    private Integer suscriptionType;
}
