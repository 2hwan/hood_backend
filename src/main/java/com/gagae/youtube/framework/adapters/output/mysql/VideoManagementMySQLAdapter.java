package com.gagae.youtube.framework.adapters.output.mysql;

import com.gagae.youtube.application.ports.output.VideoManagementOutputPort;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.mysql.data.VideoData;
import com.gagae.youtube.framework.adapters.output.mysql.repository.VideoManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.ApplicationScope;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@RequiredArgsConstructor
public class VideoManagementMySQLAdapter implements VideoManagementOutputPort {

    private final VideoManagementRepository videoManagementRepository;

    @Override
    public Video retrieveVideo(VideoId id) {

        VideoData videoData = videoManagementRepository.findByVideoId(id.getVideoId());

        //TODO 여기서부터 해야함
    }
}
