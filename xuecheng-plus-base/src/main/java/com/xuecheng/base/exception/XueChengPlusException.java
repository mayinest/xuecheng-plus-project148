package com.xuecheng.base.exception;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description TODO
 * @date 2023/2/28 13:58
 */

public class XueChengPlusException extends RuntimeException {

    private static final long serialVersionUID = 5565760508056698922L;

    private String errMessage;

    public XueChengPlusException() {
        super();
    }

    public XueChengPlusException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static void cast(CommonError commonError){
        throw new XueChengPlusException(commonError.getErrMessage());
    }

    public static void cast(String errMessage){
        throw new XueChengPlusException(errMessage);
    }

}
