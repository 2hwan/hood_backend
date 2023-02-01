package com.gagae.youtube.application.ports.output;

import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.domain.vo.VideoId.VideoId;

public interface GetVideoInfoPort {

    VideoId retrieveVideoInfoToYoutube(VideoId videoId);
}
