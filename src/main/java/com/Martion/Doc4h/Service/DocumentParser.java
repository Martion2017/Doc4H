package com.Martion.Doc4h.Service;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.RootDoc;

/**
 * 文档解析器
 *
 */
public class DocumentParser {

    public static boolean start(RootDoc root) {

        ClassDoc[] classDocs = root.classes();

        return true;
    }

}
