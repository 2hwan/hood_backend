package com.gagae.youtube.domain.vo;

import lombok.*;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class VideoId {

    private String videoId;
//    private VideoStatistics statistics;
//    private VideoSnippet snippet;

    private VideoId(String videoId){
        this.videoId = videoId;
    }

    public static VideoId withId(String videoId){
        return new VideoId(videoId);
    }

//    public Video(String id, VideoStatistics statistics, VideoSnippet snippet){
//        this.id = id;
//        this.statistics = statistics;
//        this.snippet = snippet;
//    }

//    public Optional<String> getId(){
//        return Optional.ofNullable(this.id);
//    }

//    @Value
//    public static class VideoId {
//        private Long value;
//    }
}
