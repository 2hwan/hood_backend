package com.gagae.youtube.framework.adapters.input.rest;

import com.gagae.common.BaseResponse;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.vo.VideoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/video")
public class VideoManagementAdapter {

    @Autowired
    VideoManagementUseCase videoManagementUseCase;

    @Transactional
    @PostMapping(path = "/youtube/{videoId}")
    public BaseResponse retrieveVideo(
            @PathVariable("videoId") VideoId videoId) {

        videoManagementUseCase.retrieveVideo(videoId);
        return BaseResponse.ok();
    }
}
