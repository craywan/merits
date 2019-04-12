package com.juzi.wage.util;

import com.juzi.wage.model.dto.ResponseDto;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.util
 * @ClassName: ResultUtil
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/11 15:52
 * @Version: 1.0
 */
public class ResultUtil {
    public static  <T> ResponseDto setResponse(String status,int code,T msg){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCode(code);
        responseDto.setStatus(status);
        responseDto.setMsg(msg);
        return responseDto;
    }
    public static  <T> ResponseDto sucess(T msg){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setMsg(msg);
        responseDto.setStatus("OK");
        responseDto.setCode(200);
        return responseDto;
    }
    public static <T> ResponseDto fail(int code,T msg){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCode(code);
        responseDto.setMsg(msg);
        responseDto.setStatus("fail");
        return responseDto;
    }

}
