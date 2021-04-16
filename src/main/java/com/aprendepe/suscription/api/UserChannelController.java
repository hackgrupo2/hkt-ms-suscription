package com.aprendepe.suscription.api;

import com.aprendepe.suscription.core.service.UserChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/suscription")
public class UserChannelController extends BaseController {

    @Autowired
    UserChannelService userChannelService;

    @GetMapping("/{userId}")
    public ResponseEntity getSuscriptions(@PathVariable Integer userId) {
        return buildSuccessResponse(userChannelService.getSuscriptions(userId));
    }
}
