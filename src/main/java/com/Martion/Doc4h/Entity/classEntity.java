package com.Martion.Doc4h.Entity;

import com.Martion.Doc4h.Util.UUIDUtil;

import java.util.List;

/**
 * 类实体，封装一个controller的所有接口数据
 */
public class classEntity {
    public classEntity(){
        this.id = UUIDUtil.getUUID("","");
    }
    /**
     * id.<1>用来区分定位controller。
     * <2>用来作为索引实现json快速查询数据。
     */
    private String id;

    /**
     * controller中包含的所有接口方法
     */
    private List<methodEntity> methods;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return this.id;
    }

    public List<methodEntity> getMethods() {
        return methods;
    }

    public void setMethods(List<methodEntity> methods) {
        this.methods = methods;
    }
}
