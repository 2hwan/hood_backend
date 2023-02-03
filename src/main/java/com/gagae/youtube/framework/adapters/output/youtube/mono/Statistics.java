package com.gagae.youtube.framework.adapters.output.youtube.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Statistics {

    @JsonProperty
    private Integer viewCount;

    @JsonProperty
    private Integer likeCount;

    @JsonProperty
    private Integer favoriteCount;

    @JsonProperty
    private Integer commentCount;
}
