package com.juzi.wage.model.dto;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.model.dto
 * @ClassName: ResponseDto
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/11 15:47
 * @Version: 1.0
 */
public class ResponseDto<T> {

    private int code;
    private String status;
    private T msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", msg=" + msg +
                '}';
    }
}
