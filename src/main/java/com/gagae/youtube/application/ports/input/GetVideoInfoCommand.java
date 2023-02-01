package com.gagae.youtube.application.ports.input;

import com.gagae.common.SelfValidating;
import com.gagae.youtube.domain.vo.VideoId.VideoId;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public class GetVideoInfoCommand extends SelfValidating<GetVideoInfoCommand> {

    @NotNull
    private final VideoId videoId;

    //생성자, video id
    public GetVideoInfoCommand(VideoId videoId) {
        this.videoId = videoId;
        this.validateSelf();
    }
}
