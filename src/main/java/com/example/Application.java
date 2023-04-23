package com.example;

import com.example.Gui.HotelBookingGUI;
import com.example.Servers.BookingServer;
import com.example.Servers.PaymentServer;
import com.example.Servers.ReportServer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static final Logger log = Logger.getLogger(Application.class.getName());


    private void startServers(){
        //setup both servers
        BookingServer bookingServer = new BookingServer();
        PaymentServer paymentServer = new PaymentServer();
        ReportServer reportServer = new ReportServer();
        try {
            paymentServer.start();
            bookingServer.start();
            reportServer.start();
        }catch (Exception e){
            log.log(Level.SEVERE,"Error Encountered Starting the servers: ",e);
        }
        try {
            bookingServer.blockUntilShutdown();
            paymentServer.blockUntilShutdown();
            reportServer.blockUntilShutdown();
        }catch (Exception e){
            log.log(Level.SEVERE,"Error blocking shutdown: ",e);
        }
    }
    //this is the file that runs the application - Graphic User Interface
    public static void main(String[] args) {
        log.info("Hotel reservation system started...");
        HotelBookingGUI gui=new HotelBookingGUI();
        Application app=new Application();
        app.startServers();
        try {
            gui.showUi();
        }catch (Exception e){
            log.log(Level.SEVERE,"Error Encountered",e);
        }
    }
}
