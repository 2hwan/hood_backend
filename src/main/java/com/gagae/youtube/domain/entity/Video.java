package com.gagae.youtube.domain.entity;

import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Predicate;

@Getter
@AllArgsConstructor
public abstract class Video {
    protected VideoId id;
    protected Platform platform;

    //AllArgsConstructor 로 생성자 자동생성
    public static Predicate<Video> getVideoPlatformPredicate(Platform platform){
        return s -> s.getPlatform().equals(platform);
    }
}
