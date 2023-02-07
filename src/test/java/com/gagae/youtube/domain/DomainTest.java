package com.gagae.youtube.domain;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.domain.service.VideoService;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class DomainTest {

    @Test
    private YoutubeVideo createVideo(Platform platform, VideoId videoId){
        return YoutubeVideo.builder()
                .platform(platform)
                .id(videoId)
                .build();
    }

    @Test
    public void filterVideoById(){
        Map<VideoId, Video> videoHashMap = new HashMap<>();
        Video video1 = createVideo(Platform.Youtube, "gHy-005FOTE");
        videoHashMap.put(video1.getId(), video1);

        VideoId expectedId = video1.getId();
        VideoId actualId = VideoService.findById(videoHashMap, expectedId).getId();
        assertThat(actualId).isEqualTo(expectedId);
    }

    @Test
    public void filterVideoByPlatform(){
        Video video1 = createVideo(Platform.Youtube, "gHy-005FOTE");

        Platform expectedPlatform = video1.getPlatform();
        Platform actualPlatform = VideoService.filterAndRetrieveVideo(video1,
                Video.getVideoPlatformPredicate(Platform.Youtube)).get(0).getPlatform();
        assertThat(actualPlatform).isEqualTo(expectedPlatform);
    }
}
