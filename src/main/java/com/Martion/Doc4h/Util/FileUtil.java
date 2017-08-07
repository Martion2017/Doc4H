package com.Martion.Doc4h.Util;

import com.Martion.Doc4h.Entity.baseContents;

import java.util.List;

public class FileUtil {

    public static List<String> getFilesByPackageName() throws Exception {

        String packageName = PropertiesContent.getProperties("packageName");
        if(packageName==null||"".equals(packageName)){
            throw new Exception("包名为空！");
        }
        packageName = packageName.replace(".","/");
        String packagePath = PropertiesContent.getProperties("basePackage");
        if(packagePath==null||"".equals(packagePath)){
            throw new Exception("文件夹名为空！");
        }

        String path = baseContents.BASEPATH+"/"+packagePath+"/"+packageName;
        path = path.replaceAll("//"",""");
        System.out.println(path);
        System.out.print("a"+"b"+"v");
        return null;

    }
}
