package com.gagae.youtube.application.service;

import com.gagae.common.BaseResponse;
import com.gagae.common.UseCase;
import com.gagae.youtube.application.port.in.GetVideoInfoCommand;
import com.gagae.youtube.application.port.in.GetVideoInfoUseCase;
import com.gagae.youtube.application.port.out.GetVideoInfoPort;
import com.gagae.youtube.domain.Video;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class GetVideoInfoService implements GetVideoInfoUseCase {

    private final GetVideoInfoPort getVideoInfoPort;

    @Override
    public BaseResponse getVideoInfo(GetVideoInfoCommand command){
        //TODO
        // 서비스로직
        Video videoInfo = getVideoInfoPort.retrieveVideoInfoToYoutube(command.getVideoId());

    }
}
