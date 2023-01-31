package com.gagae.youtube.domain;

import lombok.*;

import java.util.Optional;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Video {
    @Getter
    private final VideoId id;

    @Getter
    private final VideoStatistics statistics;

    @Getter
    private final VideoSnippet snippet;

//    public Optional<Long> getId(){
//        return Optional.ofNullable(this.id);
//    }

    @Value
    public static class VideoId {
        private Long value;
    }
}
