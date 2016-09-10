package com.florianf.gwtcordova.client.elemental;

import static jsinterop.annotations.JsPackage.GLOBAL;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public interface Element extends Node {

    @JsProperty
    String getInnerHTML();
    @JsProperty
    void setInnerHTML(String s);

    @JsProperty
    String getTextContent();
    @JsProperty
    void setTextContent(String s);

    @JsProperty
    DOMTokenList getClassList();

    @JsProperty
    CSSStyleDeclaration getStyle();

    void setAttribute(String name, Object value);
    String getAttribute(String name);
    boolean hasAttribute(String name);
    void removeAttribute(String name);

    <T extends Element> T querySelector(String selector);
    NodeList querySelectorAll(String selector);
}
