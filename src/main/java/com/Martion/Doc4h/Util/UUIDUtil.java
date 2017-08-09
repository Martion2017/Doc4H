package com.Martion.Doc4h.Util;

import java.util.UUID;

/**
 * id生成策略
 */
public class UUIDUtil {
    public static String getUUID(String begin,String end){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return begin+uuid+end;

    }
}
