package io.github.ropererlk.threads.runnable;

import java.util.ArrayList;
import java.util.List;

public class SendEmail {
    public static void main(String[] args) {

        List<String> emailList = new ArrayList<String>();
        emailList.add("hello@abc.com");
        emailList.add("roperera@abc.com");
        emailList.add("roperera@abc.com");

       for (String email: emailList){
           new Thread(new EmailService(email)).start();

       }

    }
}
