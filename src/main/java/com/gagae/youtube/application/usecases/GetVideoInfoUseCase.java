package com.gagae.youtube.application.usecases;

import com.gagae.common.BaseResponse;
import com.gagae.youtube.application.ports.input.GetVideoInfoCommand;

public interface GetVideoInfoUseCase {

    public BaseResponse getVideoInfo(GetVideoInfoCommand command);
}
