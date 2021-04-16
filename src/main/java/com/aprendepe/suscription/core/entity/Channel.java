package com.aprendepe.suscription.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Channel", schema = "equipo2")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer channelId;
    private Integer userId;
    private String name;

    @OneToMany(mappedBy = "user")
    private Set<UserChannel> userChannel = new HashSet<>();
}
