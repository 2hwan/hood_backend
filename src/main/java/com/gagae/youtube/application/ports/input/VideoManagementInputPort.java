package com.gagae.youtube.application.ports.input;

import com.gagae.common.UseCase;
import com.gagae.youtube.application.ports.output.VideoManagementMySQLOutputPort;
import com.gagae.youtube.application.ports.output.VideoManagementYoutubeOutputPort;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;
import reactor.core.publisher.Mono;

@UseCase
@RequiredArgsConstructor
public class VideoManagementInputPort implements VideoManagementUseCase {

    private final VideoManagementMySQLOutputPort videoManagementMySQLOutputPort;

    private final VideoManagementYoutubeOutputPort videoManagementYoutubeOutputPort;

    @Override
    public Video createVideo(VideoId videoId, Platform platform) {
        return VideoFactory.getVideo(null, platform);
    }

    @Override
    public Video retrieveVideo(VideoId id) {
        return videoManagementMySQLOutputPort.retrieveVideo(id);
    }

    @Override
    public Mono<String> retrieveVideoToYoutube(String id) {
        return videoManagementYoutubeOutputPort.retrieveVideoToYoutube(id);
    }
}
