package com.gagae.youtube.application.ports.input;

import com.gagae.youtube.application.ports.output.VideoManagementMySQLOutputPort;
import com.gagae.youtube.application.ports.output.VideoManagementYoutubeOutputPort;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;
import reactor.core.publisher.Mono;

@ApplicationScope
public class VideoManagementInputPort implements VideoManagementUseCase {

    @Autowired
    VideoManagementMySQLOutputPort videoManagementMySQLOutputPort;

    @Autowired
    VideoManagementYoutubeOutputPort videoManagementYoutubeOutputPort;

    @Override
    public Video createVideo(VideoId videoId, Platform platform) {
        return VideoFactory.getVideo(null, platform);
    }

    @Override
    public Video retrieveVideo(VideoId id) {
        return videoManagementMySQLOutputPort.retrieveVideo(id);
    }

    @Override
    public Mono<String> retrieveVideoToYoutube(VideoId id) {
        return videoManagementYoutubeOutputPort.retrieveVideoToYoutube(id);
    }
}
