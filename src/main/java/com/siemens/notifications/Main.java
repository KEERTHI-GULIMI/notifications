package com.siemens.notifications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext("com.siemens.notifications");
        notificationService NotificationService =(notificationService) context.getBean("notify");
        NotificationService.sendSms("otp is one time password");
        System.out.println(NotificationService);

    }
}
