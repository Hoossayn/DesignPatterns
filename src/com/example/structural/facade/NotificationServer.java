package com.example.structural.facade;

public class NotificationServer {
    //connect() -> connection
    //Authenticate(appId, key) -> AuthToken
    //send(authToken, message, target)
    //conn.disconnect()

    public Connection connect(String IpAddress){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target){
        System.out.println("Sending a Notification");
    }
}
