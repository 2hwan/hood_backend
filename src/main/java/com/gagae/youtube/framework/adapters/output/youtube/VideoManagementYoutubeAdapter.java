package com.gagae.youtube.framework.adapters.output.youtube;


import com.gagae.common.PersistenceAdapter;
import com.gagae.youtube.application.ports.output.VideoManagementOutputPort;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.context.annotation.ApplicationScope;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@ApplicationScope
public class VideoManagementYoutubeAdapter implements VideoManagementOutputPort {

    @Override
    public Video retrieveVideo(VideoId id) {
        return null;
    }
}
