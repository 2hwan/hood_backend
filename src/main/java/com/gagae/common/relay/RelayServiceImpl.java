package com.gagae.common.relay;

import com.gagae.common.response.BaseResponse;

import java.util.Map;

public class RelayServiceImpl extends AbstractRelayService implements RelayService{

    @Override
    public BaseResponse get(String targetUrl, Map<String, Object> params, Class<?> clazz) {
        return null;
    }

    @Override
    public BaseResponse get(String targetUrl, String jsonParam, Class<?> clazz) {
        return null;
    }

    @Override
    public BaseResponse post(String targetUrl, String jsonParam, Class<?> clazz) {
        return null;
    }

    @Override
    public BaseResponse post(String targetUrl, String jsonParam, Class<?> clazz, Map<String, String> headerParam) {
        return null;
    }

    @Override
    public BaseResponse put(String targetUrl, String jsonParam, Class<?> clazz) {
        return null;
    }

    @Override
    public BaseResponse delete(String targetUrl, String jsonParam, Class<?> clazz) {
        return null;
    }
}
