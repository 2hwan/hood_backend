package com.gagae.youtube.application.port.in;

import com.gagae.common.BaseResponse;

public interface GetVideoInfoUseCase {

    public BaseResponse getVideoInfo(GetVideoInfoCommand command);
}
