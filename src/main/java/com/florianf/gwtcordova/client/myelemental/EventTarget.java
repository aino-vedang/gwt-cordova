package com.florianf.gwtcordova.client.myelemental;

import com.florianf.gwtcordova.client.myelemental.EventListener;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class EventTarget {
    public static native void addEventListener(String type, EventListener listener);
}
