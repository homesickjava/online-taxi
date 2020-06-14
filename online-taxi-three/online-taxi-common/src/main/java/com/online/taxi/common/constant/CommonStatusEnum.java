package com.online.taxi.common.constant;

import lombok.Getter;

/**
 * @author yueyi2019
 */
public enum CommonStatusEnum {
	
	/**鐭俊楠岃瘉鐮佹湇鍔�	10001-10099*/
	VERIFY_CODE_ERROR(10001,"鐭俊楠岃瘉鐮侀獙璇佸け璐�"),

    /**
     * 涓�鍒嗛挓鍐呯浉鍚岄獙璇佺爜閿欒杈�3娆★紝璇�1鍒嗛挓鍚庣櫥褰�
     */
    VERIFICATION_ONE_MIN_ERROR(10002,"鎮ㄥ悓涓�涓敊璇獙璇佺爜鐐瑰嚮鐧诲綍鐨勬鏁拌繃澶�,璇� 1鍒嗛挓鍚庡啀閲嶈瘯"),
    /**
     * 涓�灏忔椂鍐呴獙璇佺爜閿欒杈�3娆★紝璇�10鍒嗛挓鍚庣櫥褰�
     */
    VERIFICATION_TEN_MIN_ERROR(10003,"鎮ㄧ櫥褰曞け璐ョ殑娆℃暟杩囧,璇� 10鍒嗛挓鍚庡啀閲嶈瘯"),
    /**
     * 涓�灏忔椂鍐呴獙璇佺爜閿欒杈�5娆★紝璇�24灏忔椂鍚庣櫥褰�
     */
    VERIFICATION_ONE_HOUR_ERROR(10004,"鎮ㄤ粖澶╃櫥褰曞け璐ョ殑娆℃暟杩囧,璇� 24灏忔椂鍚庡啀閲嶈瘯"),
	
	
	/**api-passenger 涔樺api  10101-10199*/
	PHONENUMBER_EMPTY(10101,"鎵嬫満鍙蜂负绌�"),
	PHONENUMBER_ERROR(10102,"鎵嬫満鍙锋牸寮忎笉姝ｇ‘"),
	
	
	/**
     * 	鎿嶄綔鎴愬姛
     */
    SUCCESS(1, "success"),
    
    /**
     * 	鎿嶄綔寮傚父
     */
    INTERNAL_SERVER_EXCEPTION(0, "exception"),
	
    /**
     * 	鎿嶄綔澶辫触
     */
    FAIL(0, "fail");
	
	@Getter
	private final int code;
	
	@Getter
    private final String value;
    
    private CommonStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

	public int getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

    
}
