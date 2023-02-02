package com.gagae.youtube.framework.adapters.output.mysql;

import com.gagae.youtube.application.ports.output.VideoManagementMySQLOutputPort;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.mysql.data.VideoData;
import com.gagae.youtube.framework.adapters.output.mysql.mappers.VideoMapper;
import com.gagae.youtube.framework.adapters.output.mysql.repository.VideoManagementRepository;
import lombok.RequiredArgsConstructor;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@RequiredArgsConstructor
public class VideoManagementMySQLAdapter implements VideoManagementMySQLOutputPort {

    private final VideoManagementRepository videoManagementRepository;

    @Override
    public Video retrieveVideo(VideoId id) {

        VideoData videoData = videoManagementRepository.findByVideoId(id.getVideoId());
        return VideoMapper.videoDataToDomain(videoData);
    }
}
