/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.freedomotic.events;


import it.freedomotic.api.EventTemplate;

/**
 * An object receives a click on its representation on the GUI.
 * Different types of click are supported (single_click, double_click, right_click)
 * @author Enrico
 */
public class ProtocolRead extends EventTemplate {
    String protocol;

    public ProtocolRead(Object source, String protocol, String address) {
        this.setSender(source);
        this.protocol=protocol;
        addProperty("protocol", protocol);
        addProperty("address", address);
        generateEventPayload();
    }

    @Override
    protected void generateEventPayload() {
       //do nothing
    }

    @Override
    public String getDefaultDestination() {
        return "app.event.sensor.protocol.read."+ protocol.trim().toLowerCase();
    }
}
