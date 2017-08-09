package com.Martin.Doc4h.Service.impl;

import com.Martin.Doc4h.Entity.baseContents;
import com.Martin.Doc4h.Service.apiAdapter;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.Parameter;

import java.lang.reflect.Method;

public class apiAdapterImpl implements apiAdapter {
    @Override
    public Class<?>[] methodDoc2method(MethodDoc methodDoc) throws ClassNotFoundException {
        Parameter[] pers = methodDoc.parameters();
        Class<?>[] types = new Class[pers.length];
        int flag = 0;
        for(Parameter par:pers){
            String type = par.type().qualifiedTypeName();
            if(type!=null){
                if(baseContents.JAVA_STRING.equals(type))
                    types[flag] = Class.forName(type);
            }
            flag++;
        }
        return types;
    }
}
