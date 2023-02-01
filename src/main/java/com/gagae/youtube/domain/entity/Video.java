package com.gagae.youtube.domain.entity;

import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Video {
    protected VideoId id;
    protected Platform platform;
}
