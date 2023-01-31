package com.gagae.youtube.domain.vo;

import lombok.*;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class VideoStatistics {
    @Getter
    private final Long viewCount;

    @Getter
    private final Long likeCount;

    @Getter
    private final Long dislikeCount;

    @Getter
    private final Long favoriteCount;

    @Getter
    private final Long commentCount;

//    public VideoStatistics(
//            @NonNull Long viewCount,
//            @NonNull Long likeCount,
//            @NonNull Long dislikeCount,
//            @NonNull Long favoriteCount,
//            @NonNull Long commentCount) {
//        this.viewCount = viewCount;
//        this.likeCount = likeCount;
//        this.dislikeCount = dislikeCount;
//        this.favoriteCount = favoriteCount;
//        this.commentCount = commentCount;
//    }
}
