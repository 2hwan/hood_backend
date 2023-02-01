package com.gagae.youtube.domain.entity;

import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class YoutubeVideo extends Video {

    @Builder
    public YoutubeVideo(VideoId id, Platform platform) {
        super(id, platform);
    }
}
