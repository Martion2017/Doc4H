package com.Martion.Doc4h.Service;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;
import com.sun.javadoc.Tag;

import java.lang.reflect.Method;

/**
 * 文档解析器
 *
 */
public class DocumentParser {

    public static boolean start(RootDoc root) {

        ClassDoc[] classDocs = root.classes();
        for(ClassDoc classdoc:classDocs){
            String a = classdoc.commentText();//获取类注解（没有标签的部分）
            Tag[] s = classdoc.tags();//获取类注解（有标签的部分）

            MethodDoc[] methodDocs = classdoc.methods(false);
            for(MethodDoc methodDoc:methodDocs){
               Tag[] c =  methodDoc.tags();//获取方法中的注解（有标签的部分）
                String b = methodDoc.commentText();//获取方法中注解（没有标签的部分）
                System.out.print(b);
            }
            Class<?> controllerClass = null;
        }
        return true;
    }

}
