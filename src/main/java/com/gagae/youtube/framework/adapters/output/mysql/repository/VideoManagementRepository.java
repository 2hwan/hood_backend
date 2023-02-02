package com.gagae.youtube.framework.adapters.output.mysql.repository;

import com.gagae.youtube.framework.adapters.output.mysql.data.VideoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VideoManagementRepository extends JpaRepository<VideoData, Long> {

    @Query("select a from VideoData a " +
            "where a.videoId = :videoId ")
    VideoData findByVideoId(
            @Param("videoId") String videoId);
}
