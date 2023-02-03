package com.gagae.youtube.framework.adapters.output.youtube.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class YoutubeVideoMono {

    @JsonProperty
    private List<Items> items;

    public static class Items{

        @JsonProperty
        private String id;

        @JsonProperty
        private Snippet snippet;

        @JsonProperty
        private Statistics statistics;
    }
}
