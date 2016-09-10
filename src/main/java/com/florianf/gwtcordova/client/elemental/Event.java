package com.florianf.gwtcordova.client.elemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Event {

    @JsProperty
    Detail getDetail();
    
    @JsProperty
    EventTarget getTarget();

    @JsType
    public interface Detail {
    }
}
