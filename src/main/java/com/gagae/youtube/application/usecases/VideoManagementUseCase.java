package com.gagae.youtube.application.usecases;

import com.gagae.common.response.BaseResponse;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Mono;

public interface VideoManagementUseCase {
    // C R U D

    Video createVideo(
            VideoId videoId,
            Platform platform
    );

    Video retrieveVideo(VideoId id);

    Mono<ResponseEntity<YoutubeVideoMono>> retrieveVideoToYoutube(String id);
}
