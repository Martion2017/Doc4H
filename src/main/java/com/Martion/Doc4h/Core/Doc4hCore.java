package com.Martion.Doc4h.Core;

import com.Martion.Doc4h.Util.PropertiesContent;

import java.util.logging.Logger;

/**
 * 核心日志生产类，主函数
 */
public class Doc4hCore {


    /**
     * <1>初始化配置文件
     * @param Path
     * @return
     */
    public Doc4hCore setSourcePath(String Path){
        if(Path!=null&&!"".equals(Path)){
            try {
                PropertiesContent.getProtertiesByPath(Path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{

        }

        return this;
    }

    public void buildDoc(){
        

    }
    public static void main(String args[]){
        new Doc4hCore().setSourcePath("doc4h.properties");
    }


}
