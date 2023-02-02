package com.gagae.youtube.framework.adapters.output.youtube;


import com.gagae.youtube.application.ports.output.VideoManagementMySQLOutputPort;
import com.gagae.youtube.application.ports.output.VideoManagementYoutubeOutputPort;
import com.gagae.youtube.domain.entity.Video;
import com.gagae.youtube.domain.vo.VideoId;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@RequiredArgsConstructor
public class VideoManagementYoutubeAdapter implements VideoManagementYoutubeOutputPort {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<String> retrieveVideoToYoutube(VideoId id) {
        // https://www.googleapis.com/youtube/v3/videos?id=6pog30mW9Kk&key=AIzaSyD9SCXzMB_Bk2gXwLkuP75T0r-EqxaY2-k&fields=items(id,snippet(publishedAt,channelId,title,description,channelTitle),statistics)&part=snippet,statistics,status
       return webClient.mutate()
                .baseUrl("https://www.googleapis.com")
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("youtube/v3/videos")
                        .queryParam("id", id.getVideoId())
                        .queryParam("key", "AIzaSyD9SCXzMB_Bk2gXwLkuP75T0r-EqxaY2-k")
                        .queryParam("fields","items(id,snippet(publishedAt,channelId,title,description,channelTitle),statistics)")
                        .queryParam("parts", "snippet,statisti" +
                                "cs,status")
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}
