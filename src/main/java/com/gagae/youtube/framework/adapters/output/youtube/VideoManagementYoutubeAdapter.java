package com.gagae.youtube.framework.adapters.output.youtube;


import com.gagae.common.Adapter;
import com.gagae.youtube.application.ports.output.VideoManagementYoutubeOutputPort;
import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import lombok.RequiredArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// DB 나 유튜브 외부로 나가는 것의 정의 영속성 어댑터
@Adapter
@RequiredArgsConstructor
public class VideoManagementYoutubeAdapter implements VideoManagementYoutubeOutputPort {

    private final WebClient webClient;

    @Override
    public Mono<YoutubeVideoMono> retrieveVideoToYoutube(String id) {
        // https://www.googleapis.com/youtube/v3/videos?id=6pog30mW9Kk&key=[Goolge API Key]&fields=items(id,snippet(publishedAt,channelId,title,description,channelTitle),statistics)&part=snippet,statistics,status
        Mono<YoutubeVideoMono> ms = webClient.mutate()
                .baseUrl("https://www.googleapis.com")
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("youtube/v3/videos")
                        .queryParam("id", id)
                        .queryParam("key", "AIzaSyD9SCXzMB_Bk2gXwLkuP75T0r-EqxaY2-k")
                        .queryParam("fields","items(id,snippet(publishedAt,channelId,title,description,channelTitle),statistics)")
                        .queryParam("part", "snippet,statistics,status")
                        .build())
                .retrieve()
                .bodyToMono(YoutubeVideoMono.class);


        // TODO Mono To Domain 매핑작업 필요
//        YoutubeVideoMono useBlock = ms.block();
//        String id = useBlock.getItems();

        return ms;
    }
}
