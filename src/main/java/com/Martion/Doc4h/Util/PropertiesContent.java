package com.Martion.Doc4h.Util;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;


public class PropertiesContent {


    private static Properties propertie = new Properties();


    /**
     * 初始化配置文件
     * @param path(如：doc4h.properties)
     * @throws Exception
     */
    public static void getProtertiesByPath(String path) throws Exception {
        try {
            propertie = PropertiesLoaderUtils.loadAllProperties(path);
        } catch (FileNotFoundException ex) {
            throw new Exception(path+".properties文件不存在！");

        } catch (IOException ex) {
            throw new Exception(path+".properties文件读取错误！");

        }catch(NullPointerException ex){
            throw new Exception(path+".properties文件名为空！");

        }

    }

    /**
     * 根据key值获取配置文件中的属性
     * @param key
     * @return value
     * @throws Exception
     */
    public static String getProperties(String key) throws Exception {
        if(propertie.isEmpty()){
            throw new Exception("请先初始化配置！");
        }
        if(propertie.containsKey(key)){
            return propertie.getProperty(key).replaceAll("\"", "");
        }else{
            return null;
        }

    }
}
