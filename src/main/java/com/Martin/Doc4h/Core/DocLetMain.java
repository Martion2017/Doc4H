package com.Martin.Doc4h.Core;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;
import com.sun.javadoc.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.Annotation;

/**
 * 文档解析器
 */
public class DocLetMain {

    public static boolean start(RootDoc root) throws ClassNotFoundException {

        ClassDoc[] classDocs = root.classes();
        for (ClassDoc classdoc : classDocs) {
            Annotation[] v = classdoc.getClass().getAnnotations();
            String a = classdoc.commentText();//获取类注解（没有标签的部分）
            Tag[] s = classdoc.tags();//获取类注解（有标签的部分）
            String aaa = classdoc.qualifiedTypeName();
            Class<?> bbb = Class.forName(aaa);
            RequestMapping cccc = bbb.getAnnotation(RequestMapping.class);
            System.out.println(cccc.value()[0]);//类请求地址

            MethodDoc[] methodDocs = classdoc.methods(false);
            for (MethodDoc methodDoc : methodDocs) {
                //bbb.getMethod(methodDoc.name(),methodDoc.r
                RequestMapping ss = methodDoc.getClass().getAnnotation(RequestMapping.class);
                Tag[] c = methodDoc.tags();//获取方法中的注解（有标签的部分）
                String b = methodDoc.commentText();//获取方法中注解（没有标签的部分）
                System.out.print(b);
                System.out.println();


            }
            Class<?> controllerClass = null;
        }
        return true;
    }

}
