package com.gagae.youtube.application.ports.input;

import com.gagae.youtube.application.ports.output.VideoManagementOutputPort;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.inject.Inject;

@ApplicationScope
public class VideoManagementInputPort implements VideoManagementUseCase {

    @Inject
    VideoManagementOutputPort videoManagementOutputPort;

    @Override
    public Video createVideo(VideoId videoId, Platform platform) {
        return VideoFactory.getVideo(null, platform);
    }

    @Override
    public Video retrieveVideo(VideoId id) {
        return videoManagementOutputPort.retrieveVideo(id);
    }
}
