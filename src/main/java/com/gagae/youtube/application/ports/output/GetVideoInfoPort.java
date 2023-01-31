package com.gagae.youtube.application.ports.output;

import com.gagae.youtube.domain.vo.Video;
import com.gagae.youtube.domain.vo.Video.VideoId;

public interface GetVideoInfoPort {

    Video retrieveVideoInfoToYoutube(VideoId videoId);
}
