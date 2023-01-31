package com.gagae.youtube.domain.vo;

import lombok.*;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class VideoSnippet {
    @Getter
    private String publishedAt;

    @Getter
    private String channelId;

    @Getter
    private String title;

    @Getter
    private String description;

    @Getter
    private String channelTitle;

//    public VideoSnippet(
//            @NonNull String publishedAt,
//            @NonNull String channelId,
//            @NonNull String title,
//            @NonNull String description,
//            @NonNull String channelTitle) {
//        this.publishedAt = publishedAt;
//        this.channelId = channelId;
//        this.title = title;
//        this.description = description;
//        this.channelTitle = channelTitle;
//    }
}
