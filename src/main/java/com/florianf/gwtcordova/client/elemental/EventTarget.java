package com.florianf.gwtcordova.client.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface EventTarget {
    void addEventListener(String type, EventListener listener);
}
