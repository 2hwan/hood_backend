package com.gagae.youtube.application.ports.input;

import com.gagae.common.UseCase;
import com.gagae.common.response.BaseResponse;
import com.gagae.youtube.application.ports.output.VideoManagementMySQLOutputPort;
import com.gagae.youtube.application.ports.output.VideoManagementYoutubeOutputPort;
import com.gagae.youtube.application.usecases.VideoManagementUseCase;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.domain.entity.factory.VideoFactory;
import com.gagae.youtube.domain.vo.Platform;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class VideoManagementInputPort implements VideoManagementUseCase {

    private final VideoManagementMySQLOutputPort videoManagementMySQLOutputPort;

    private final VideoManagementYoutubeOutputPort videoManagementYoutubeOutputPort;

    @Override
    public Video createVideo(VideoId videoId, Platform platform) {
        return VideoFactory.getVideo(null, platform);
    }

    @Override
    public Video retrieveVideo(VideoId id) {
        return videoManagementMySQLOutputPort.retrieveVideo(id);
    }

    @Override
    public Mono<ResponseEntity<YoutubeVideoMono>> retrieveVideoToYoutube(String id) {

        Mono<YoutubeVideoMono> youtubeVideoMono = videoManagementYoutubeOutputPort.retrieveVideoToYoutube(id);

//        return ResponseEntity.ok().body(youtubeVideoMono.block());
        // block 을 사용해서 reactive 프로그래밍의 장점을 없앨 이유가 있을까
        //
        // 비효율적인 중간 상태(intermediate states) 회피
        // 데이터 스트림 구축에 중점
        // 데이터 스트림을 병합, 필터링, 변환하는 기능 제공
        // Reactor가 언제 동작할 것인지 결정하는 것이 아니라, 각 스텝에서 무엇을 할 것인지에 초점
        return youtubeVideoMono
                .map(resp -> ResponseEntity.ok().body(resp));
    }
}
