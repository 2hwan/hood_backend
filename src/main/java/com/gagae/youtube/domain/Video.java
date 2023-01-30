package com.gagae.youtube.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Video {
    @Getter
    private final VideoId id;

    @Getter
    private final VideoStatistics statistics;

    @Value
    public static class VideoId {
        private Long value;
    }
}
