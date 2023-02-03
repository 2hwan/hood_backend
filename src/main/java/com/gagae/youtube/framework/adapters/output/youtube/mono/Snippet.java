package com.gagae.youtube.framework.adapters.output.youtube.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Snippet {

    @JsonProperty
    private String publishedAt;

    @JsonProperty
    private String channelId;

    @JsonProperty
    private String title;

    @JsonProperty
    private String description;

    @JsonProperty
    private String channelTitle;
}
