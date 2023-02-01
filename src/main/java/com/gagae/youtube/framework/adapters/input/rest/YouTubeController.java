package com.gagae.youtube.framework.adapters.input.rest;

import com.gagae.common.BaseResponse;
import com.gagae.common.WebAdapter;
import com.gagae.youtube.application.ports.input.GetVideoInfoCommand;
import com.gagae.youtube.application.usecases.GetVideoInfoUseCase;
import com.gagae.youtube.domain.vo.VideoId.VideoId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class YouTubeController {

    private final GetVideoInfoUseCase getVideoInfoUseCase;

    @PostMapping(path = "/youtube/views/{videoId}")
    BaseResponse getVideoInfo(
            @PathVariable("videoId") Long videoId) {
            //@PathVariable("videoId") Long videoId {

        // command 로 domain 객체 생성
        GetVideoInfoCommand command = new GetVideoInfoCommand(
                new VideoId(videoId));
//                new AccountId(targetAccountId),
//                Money.of(amount));
//
        BaseResponse baseResponse = getVideoInfoUseCase.getVideoInfo(command);
//        sendMoneyUseCase.sendMoney(command);
        return baseResponse;
    }
}
