package com.gagae.common.relay;

import com.gagae.common.response.BaseResponse;

import java.util.Map;

public interface RelayService {
    BaseResponse get(String targetUrl, Map<String, Object> params, Class<?> clazz);

    BaseResponse get(String targetUrl, String jsonParam, Class<?> clazz);

    BaseResponse post(String targetUrl, String jsonParam, Class<?> clazz);

    BaseResponse post(String targetUrl, String jsonParam, Class<?> clazz, Map<String, String> headerParam);

    BaseResponse put(String targetUrl, String jsonParam, Class<?> clazz);

    BaseResponse delete(String targetUrl, String jsonParam, Class<?> clazz);
}
