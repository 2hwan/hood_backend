package com.gagae.youtube.framework.adapters.output.youtube.mono;

import lombok.Data;

import java.util.List;

@Data
public class YoutubeVideoModel {

    private List<Items> items;

    public static class Items{
        private String id;
        private Snippet snippet;
        private Statistics statistics;
    }
}
