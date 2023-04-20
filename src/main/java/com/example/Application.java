package com.example;

import com.example.Gui.BookingGui;
import com.example.Servers.BookingServer;
import com.example.Servers.PaymentServer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static final Logger log = Logger.getLogger(Application.class.getName());


    private void startServers(){
        //setup both servers
        BookingServer bookingServer = new BookingServer();
        PaymentServer paymentServer = new PaymentServer();
        try {
            paymentServer.start();
            bookingServer.start();
        }catch (Exception e){
            log.log(Level.SEVERE,"Error Encountered",e);
        }
        try {
            bookingServer.blockUntilShutdown();
            paymentServer.blockUntilShutdown();
        }catch (Exception e){
            log.log(Level.SEVERE,"Error Encountered",e);
        }
    }
    public static void main(String[] args) {
        log.info("Hotel reservation system started..");
        //set up gui
        BookingGui gui=new BookingGui();
        Application app=new Application();
        app.startServers();
        try {
            gui.showUi(args);
        }catch (Exception e){
            log.log(Level.SEVERE,"Error Encountered",e);
        }
    }
}
