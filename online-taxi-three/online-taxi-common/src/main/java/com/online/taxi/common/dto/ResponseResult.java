package com.online.taxi.common.dto;

import java.io.Serializable;

import com.online.taxi.common.constant.CommonStatusEnum;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 閫氱敤杩斿洖鍊煎鐞嗙被
 *
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class ResponseResult<T> implements Serializable {

	private static final long serialVersionUID = -2073390651767969040L;
	
	private int code;
    private String message;
    private T data;
    
	/**
     * 杩斿洖鎴愬姛鏁版嵁锛坰tatus锛�1锛�
     *
     * @param data 鏁版嵁鍐呭
     * @param <T>  鏁版嵁绫诲瀷
     * @return ResponseResult瀹炰緥
     */
    public static <T> ResponseResult success(T data) {

         return  new ResponseResult().setCode(CommonStatusEnum.SUCCESS.getCode())
				 					  .setMessage(CommonStatusEnum.SUCCESS.getValue())
				  					  .setData(data);
    }

    /**
     * 杩斿洖閿欒鏁版嵁锛坰tatus锛�500锛�
     *
     * @param data 閿欒鍐呭
     * @param <T>  鏁版嵁绫诲瀷
     * @return ResponseResult瀹炰緥
     */
    public static <T> ResponseResult fail(T data) {
        return new ResponseResult().setCode(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getCode()).setMessage(CommonStatusEnum.INTERNAL_SERVER_EXCEPTION.getValue()).setData(data);
    }

    /**
     * 鑷畾涔夎繑鍥為敊璇暟鎹�
     *
     * @param code    閿欒浠ｇ爜
     * @param message 閿欒娑堟伅
     * @return ResponseResult瀹炰緥
     */
    public static ResponseResult fail(int code, String message) {
        return new ResponseResult().setCode(code).setMessage(message);
    }

    /**
     * @param code    閿欒浠ｇ爜
     * @param message 閿欒娑堟伅
     * @param data    閿欒鍐呭
     * @return ResponseResult瀹炰緥
     */
    public static ResponseResult fail(int code, String message, String data) {
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }

}