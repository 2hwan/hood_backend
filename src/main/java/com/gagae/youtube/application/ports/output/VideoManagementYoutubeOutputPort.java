package com.gagae.youtube.application.ports.output;

import com.gagae.youtube.framework.adapters.output.youtube.mono.YoutubeVideoMono;
import reactor.core.publisher.Mono;

public interface VideoManagementYoutubeOutputPort {

    Mono<YoutubeVideoMono> retrieveVideoToYoutube(String id);
}
