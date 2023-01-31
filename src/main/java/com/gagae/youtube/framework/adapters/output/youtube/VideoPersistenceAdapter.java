package com.gagae.youtube.framework.adapters.output.youtube;


import com.gagae.common.PersistenceAdapter;
import com.gagae.youtube.application.ports.output.GetVideoInfoPort;
import com.gagae.youtube.domain.vo.Video.VideoId;
import com.gagae.youtube.domain.vo.Video;
import lombok.RequiredArgsConstructor;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@RequiredArgsConstructor
@PersistenceAdapter
public class VideoPersistenceAdapter implements GetVideoInfoPort {

    @Override
    public Video retrieveVideoInfoToYoutube(VideoId videoId){
        //Youtube 연동
        //DB update
        //return new Video(1,null, null);
    }
}