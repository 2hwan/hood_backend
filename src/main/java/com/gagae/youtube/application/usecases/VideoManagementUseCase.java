package com.gagae.youtube.application.usecases;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import reactor.core.publisher.Mono;

public interface VideoManagementUseCase {
    // C R U D

    Video createVideo(
            VideoId videoId,
            Platform platform
    );

    Video retrieveVideo(VideoId id);

    Mono<String> retrieveVideoToYoutube(String id);
}
