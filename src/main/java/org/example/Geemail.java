package org.example;


import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Geemail {
    String username;
    String password;

    // https://support.google.com/accounts/answer/185833?visit_id=638108449057358824-2213358070&p=InvalidSecondFactor&rd=1

    public Geemail(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void send(String to, String subject, String msg) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setFrom(username + "@gmail");
        email.setSubject(subject);
        email.setMsg(msg);
        email.addTo(to);
        email.send();
    }
}
