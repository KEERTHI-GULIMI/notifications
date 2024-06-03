package com.siemens.notifications;

import org.springframework.stereotype.Component;

@Component
public class SmsGateway
{
    public void sendSMS(String msg)
    {
        System.out.println("hii");
        System.out.println(msg);
    }
}
