package com.gagae.youtube.application.port.out;

import com.gagae.youtube.domain.Video;
import com.gagae.youtube.domain.Video.VideoId;

public interface GetVideoInfoPort {

    Video retrieveVideoInfoToYoutube(VideoId videoId);
}
