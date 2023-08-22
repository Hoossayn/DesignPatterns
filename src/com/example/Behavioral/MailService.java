package com.example.Behavioral;

public class MailService {
    public void sendEmail(){
        connect(2);
        authenticate();
        //Send email
        disconnect();
    }

    private void connect(int timeout ){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
