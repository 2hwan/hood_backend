package com.gagae.youtube.domain.service;

import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VideoService {

    public static List<Video> filterAndRetrieveVideo(List<Video> videos, Predicate<Video> videoPredicate){
        return videos
                .stream()
                .filter(videoPredicate)
                .collect(Collectors.<Video>toList());
    }

    public static Video findById(Map<VideoId, Video> videos, VideoId id){
        return videos.get(id);
    }
}
