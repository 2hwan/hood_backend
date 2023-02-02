package com.gagae.youtube.domain.entity;

import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
public class YoutubeVideo extends Video {

    @Setter
    private Map<VideoId, Video> videos;

    @Builder
    public YoutubeVideo(VideoId id, Platform platform) {
        super(id, platform);
        this.videos = videos == null ? new HashMap<VideoId, Video>() : videos;
    }
}
