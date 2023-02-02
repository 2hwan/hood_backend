package com.gagae.youtube.domain.entity.factory;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;

public class VideoFactory {

    public static Video getVideo(VideoId id,
                                 Platform platform){
        switch (platform){
            case Youtube:
                return YoutubeVideo.builder().
                        id(id==null ? VideoId.withoutId():id).
                        platform(platform).
                        build();
//            case Naver: 네이버 미구현
//                return null;
            default:
                return null;
        }
    }
}
