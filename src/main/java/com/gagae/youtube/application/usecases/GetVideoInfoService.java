package com.gagae.youtube.application.usecases;

import com.gagae.common.BaseResponse;
import com.gagae.common.UseCase;
import com.gagae.youtube.application.ports.input.GetVideoInfoCommand;
import com.gagae.youtube.application.ports.output.GetVideoInfoPort;
import com.gagae.youtube.domain.vo.VideoId;
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

        // 이동해야함함
       VideoId videoInfo = getVideoInfoPort.retrieveVideoInfoToYoutube(command.getVideoId());

    }
}
