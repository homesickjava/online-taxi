package com.online.taxi.listen.response;

import lombok.Data;

/**
 * @author yueyi2019
 */
@Data
public class PreGrabResponse {

    private int orderId;

    private String startAddress;

    private String endAddress;


}
