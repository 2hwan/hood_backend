package com.gagae.youtube.framework.adapters.output.youtube.mappers;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.mysql.data.VideoData;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import org.springframework.stereotype.Component;

@Component
public class VideoMonoMapper {

//    public static Video videoMonoToDomain(YoutubeVideoMono youtubeVideoMono){
//        Video video = VideoFactory.getVideo(
//                VideoId.withId(videoData.getVideoId()),
//                Platform.valueOf(videoData.getPlatform()));
//
//        return video;
//    }
}
