package com.gagae.youtube.framework.adapters.output.mysql.mappers;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.mysql.data.VideoData;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {

    public static Video videoDataToDomain(VideoData videoData){
        Video video = VideoFactory.getVideo(
                VideoId.withId(videoData.getVideoId()),
                Platform.valueOf(videoData.getPlatform()));

        return video;
    }

    public static VideoData videoDomainToData(Video video){
        VideoData videoData = VideoData.builder().
                videoId(video.getId().toString()).
                platform(video.getPlatform().toString())
                .build();

        return videoData;
    }
}
