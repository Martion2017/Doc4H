package com.Martin.Doc4h.Util;

import com.Martin.Doc4h.Entity.baseContents;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
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

        System.out.println(path);

        return getFiles(path);

    }

    /**
     * 递归查找java文件
     * @param path
     * @return
     */
    public static List<String> getFiles(String path){
        List<String> javaFileNames = new ArrayList<String>();
        File rootFile = new File(path);
        if (rootFile.isFile()) {
            if (rootFile.getName().lastIndexOf(".java") > 0) {
                javaFileNames.add(rootFile.getAbsolutePath());
            }
        } else {
            File[] files = rootFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    javaFileNames.addAll(getFiles(file.getPath()));
                }
            }
        }

        return javaFileNames;
    }

    public static List<String> controllerFilter(List<String> filesPath) throws Exception {
        String packagePath = PropertiesContent.getProperties("basePackage");
        //String packageName = PropertiesContent.getProperties("packageName");
        //packageName = packageName.replace(".","/");
        List<String> controllerFiles = new ArrayList<>();
        String packagp = "";
        for(String s:filesPath){
            packagp = s.substring(baseContents.BASEPATH.length()+packagePath.length()+2,s.length()-5).replace("/",".");

            Class<?> fileClass = Class.forName(packagp);
            Annotation[] a = fileClass.getAnnotations();
            Controller controller = fileClass.getAnnotation(Controller.class);
            RestController restController = fileClass.getAnnotation(RestController.class);
            if (controller != null || restController != null) {
                controllerFiles.add(s);
            }

        }
        return controllerFiles;


    }
}
