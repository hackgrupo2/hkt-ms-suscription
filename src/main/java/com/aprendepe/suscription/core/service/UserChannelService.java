package com.aprendepe.suscription.core.service;

import com.aprendepe.suscription.core.entity.Channel;
import com.aprendepe.suscription.core.entity.User;
import com.aprendepe.suscription.core.entity.UserChannel;
import com.aprendepe.suscription.core.entity.UserChannelId;
import com.aprendepe.suscription.core.repository.ChannelRepository;
import com.aprendepe.suscription.core.repository.UserChannelRepository;
import com.aprendepe.suscription.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserChannelService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ChannelRepository channelRepository;
    @Autowired
    private UserChannelRepository userChannelRepository;


    public UserChannel getSuscriptions(UserChannelId userChannelId) {
        return userChannelRepository.findById(userChannelId).orElse(null);
    }


    public void createUserClient(UserChannel userChannel) {

        var user = userRepository.findById(userChannel.getChannel().getChannelId()).get();
        var channel = channelRepository.findById(userChannel.getUser().getUserId()).get();

        if (channel == null) {
            var ch = new Channel();

            ch.setUserId(user.getUserId());
            ch.setName(user.getName() + " " + user.getLastName());
            channelRepository.save(ch);
            channel = channelRepository.findByUserId(userChannel.getUser().getUserId());
        }

        UserChannelId uc = new UserChannelId(channel.getUserId(),channel.getChannelId());

        userChannelRepository.save(new UserChannel(uc, user, channel, userChannel.getSuscriptionType()));
    }



    public List<UserChannel> getSuscriptions(Integer userId) {

        var user = userRepository.findById(userId).get();

        return userChannelRepository.findUserChannelByUser(user);
    }
}
