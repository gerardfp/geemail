package org.example;

import org.apache.commons.mail.EmailException;

public class Main {
    public static void main(String[] args) throws EmailException {
        Geemail geemail = new Geemail("xxxxxxx","??????");
        geemail.send("zzzz@mmmmm", "Hola tio", "Que tal estas");
    }
}