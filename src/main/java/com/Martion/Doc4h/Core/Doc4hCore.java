package com.Martion.Doc4h.Core;

import com.Martion.Doc4h.Service.DocumentParser;
import com.Martion.Doc4h.Util.FileUtil;
import com.Martion.Doc4h.Util.PropertiesContent;

import java.util.List;
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

        try {
            /**
             * 1.扫描指定配置包下所有java文件
             */
           List<String> filesPath =  FileUtil.getFilesByPackageName();
            /**
             * 2.取出文件中的所有controller
             */
            List<String> controllerFiles = FileUtil.controllerFilter(filesPath);
            /**
             * 3.doclet执行把所有的文档注释放到DocCoreHandler参数里，调用start方法
             */
            filesPath.add(0, "-doclet");
            filesPath.add(1, DocumentParser.class.getName());

            String[] docArgs = filesPath.toArray(new String[filesPath.size()]);

            com.sun.tools.javadoc.Main.execute(docArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String args[]){
        new Doc4hCore().setSourcePath("doc4h.properties").buildDoc();
    }


}
