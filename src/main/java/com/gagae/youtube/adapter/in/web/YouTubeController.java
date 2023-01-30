package com.gagae.youtube.adapter.in.web;

import com.gagae.common.WebAdapter;
import com.gagae.youtube.application.port.in.GetVideoInfoCommand;
import com.gagae.youtube.domain.Video;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class YouTubeController {

    //private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping(path = "/youtube/views/{videoId}")
    void getVideoInfo(
            @PathVariable("videoId") Long uploaderId {
            //@PathVariable("videoId") Long videoId {

        GetVideoInfoCommand command = new GetVideoInfoCommand(
                new Video(sourceAccountId),
//                new AccountId(targetAccountId),
//                Money.of(amount));
//
//        sendMoneyUseCase.sendMoney(command);
    }
}
