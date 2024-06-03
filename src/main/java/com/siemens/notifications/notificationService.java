package com.siemens.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("notify")

public class notificationService
{

    @Autowired
    private SmsGateway smsGateway;    //field dependency injection
    private MailGateway mailGateway;

    public notificationService(MailGateway mailGateway) //constructor dependency
    {
        this.mailGateway=mailGateway;
    }

    private WhatsappGateway whatsappGateway;

    public void setWhatsappGateway(WhatsappGateway whatsappGateway)

    {
        this.whatsappGateway=whatsappGateway;
    }

    public void sendSms(String msg)

    {
        smsGateway.sendSMS(msg);
    }

    public void sendmail(String mail)

    {
        mailGateway.sendMail(mail);
    }
}

