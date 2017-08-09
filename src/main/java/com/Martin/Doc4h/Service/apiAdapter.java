package com.Martin.Doc4h.Service;

import com.sun.javadoc.MethodDoc;

import java.lang.reflect.Method;

public interface apiAdapter {

    public Class<?>[] methodDoc2method(MethodDoc methodDoc) throws ClassNotFoundException;
}
