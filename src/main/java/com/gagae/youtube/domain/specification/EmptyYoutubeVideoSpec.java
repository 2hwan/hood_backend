package com.gagae.youtube.domain.specification;

import com.gagae.youtube.domain.entity.YoutubeVideo;
import com.gagae.youtube.domain.exception.GenericSpecificationException;
import com.gagae.youtube.domain.specification.shared.AbstractSpecification;

public class EmptyYoutubeVideoSpec extends AbstractSpecification<YoutubeVideo> {

    @Override
    public boolean isSatisfiedBy(YoutubeVideo youtubeVideo) {
        return youtubeVideo.getVideos()==null||
                youtubeVideo.getVideos().isEmpty();
    }

    @Override
    public void check(YoutubeVideo youtubeVideo) {
        if(!isSatisfiedBy(youtubeVideo))
            throw new GenericSpecificationException("EmptyYoutubeVideoSpec 명세 Exception");
    }
}
