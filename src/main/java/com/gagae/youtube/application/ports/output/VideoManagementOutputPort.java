package com.gagae.youtube.application.ports.output;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;

public interface VideoManagementOutputPort {

    Video retrieveVideo(VideoId id);
}
