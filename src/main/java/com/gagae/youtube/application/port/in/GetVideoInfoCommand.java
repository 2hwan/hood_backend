package com.gagae.youtube.application.port.in;

import com.gagae.common.SelfValidating;
import com.gagae.youtube.domain.Video;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@EqualsAndHashCode(callSuper = false)
public class GetVideoInfoCommand extends SelfValidating<GetVideoInfoCommand> {

    @NotNull
    private final Video video;

    public GetVideoInfoCommand(Video video) {
        this.video = video;
        this.validateSelf();
    }
}
