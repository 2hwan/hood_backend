package com.gagae.youtube.framework.adapters.input.rest;

import com.gagae.common.Adapter;
import com.gagae.common.response.BaseResponse;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;

@Adapter
@RestController
@RequestMapping("/video")
@RequiredArgsConstructor
public class VideoManagementAdapter {

    private final VideoManagementUseCase videoManagementUseCase;

    @Transactional
    @GetMapping(path = "/youtube/{videoId}")
//    public ResponseEntity<YoutubeVideoMono> retrieveVideo(
    public Mono<ResponseEntity<YoutubeVideoMono>> retrieveVideo(
            @PathVariable("videoId") String videoId) {

        //videoManagementUseCase.retrieveVideo(videoId);

//        return BaseResponse.ok()
        return videoManagementUseCase.retrieveVideoToYoutube(videoId);

    }
}
