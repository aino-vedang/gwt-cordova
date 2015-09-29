package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.elemental.Function;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;
import com.florianf.gwtcordova.client.plugin.statusbar.StatusBar;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;

/**
 * Created by florian on 09.08.15.
 */
public abstract class Cordova {

    private static boolean deviceReady;

    public static native Device getDevice()/*-{
        return $wnd.device;
    }-*/;

    public static native Connection getConnection()/*-{
        return $wnd.navigator.connection;
    }-*/;

    public static native Notification getNotification()/*-{
        return $wnd.navigator.notification;
    }-*/;

    public static native StatusBar getStatusBar()/*-{
        return $wnd.StatusBar;
    }-*/;

    // gwtphonegap
    public static native boolean isDeviceAvailable() /*-{
        return typeof(device) != 'undefined';
    }-*/;

    /**
     * gwt-api-generator
     * Returns the JsInterop instance of Document
     */
    public static com.florianf.gwtcordova.client.elemental.Document getDocument() {
        return ( com.florianf.gwtcordova.client.elemental.Document) Document.get();
    }

    public static void init(DeviceReadyEvent.Listener listener) {

        com.florianf.gwtcordova.client.elemental.Document document = (com.florianf.gwtcordova.client.elemental.Document) Document.get();
        document.addEventListener("deviceready", event -> {
            deviceReady = true;
            listener.handleEvent((DeviceReadyEvent) event);
            return null;
        }, true);
    }

    public static boolean isDeviceReady() {
        return deviceReady;
    }
}
