package com.gagae.youtube.framework.adapters.input.rest;

import com.gagae.common.response.BaseResponse;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoManagementAdapter {

    private final VideoManagementUseCase videoManagementUseCase;

    @Transactional
    @GetMapping(path = "/youtube/{videoId}")
    public Mono<String> retrieveVideo(
            @PathVariable("videoId") VideoId videoId) {

        //videoManagementUseCase.retrieveVideo(videoId);


//        return BaseResponse.ok()
        return  videoManagementUseCase.retrieveVideoToYoutube(videoId);
    }
}
