package com.gagae.youtube.application.ports.output;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;
import reactor.core.publisher.Mono;

public interface VideoManagementMySQLOutputPort {

    Video retrieveVideo(VideoId id);

}
