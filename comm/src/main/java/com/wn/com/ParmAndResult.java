package com.wn.com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParmAndResult<T> {

    private Integer code;

    private String message;

    private T t;


    //调用成功
    public static ParmAndResult succeed(){
        ParmAndResult<Object> objectParmAndResult = new ParmAndResult<>();
        objectParmAndResult.setCode(0);
        objectParmAndResult.setMessage(null);

        return objectParmAndResult;

    }

    public ParmAndResult setT(T t){
        this.t = t;
        return this;
    }

    //调用失败
    public static ParmAndResult err(){
        ParmAndResult<Object> objectParmAndResult = new ParmAndResult<>();
        objectParmAndResult.setCode(5000);
        objectParmAndResult.setMessage("操作失败！");

        return objectParmAndResult;

    }
}
