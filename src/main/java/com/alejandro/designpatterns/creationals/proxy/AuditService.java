package com.alejandro.designpatterns.creationals.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AuditService {

    public void auditServiceUsed(String user, String service){
        SimpleDateFormat formater= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println(user + " used service: " + service + ", at: " +formater.format(new Date()));
    }
}
