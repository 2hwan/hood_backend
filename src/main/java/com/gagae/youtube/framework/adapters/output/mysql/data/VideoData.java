package com.gagae.youtube.framework.adapters.output.mysql.data;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="VideoData")
@Table(name = "videos")
public class VideoData implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="video_id", length = 11)
    private String videoId;
}
