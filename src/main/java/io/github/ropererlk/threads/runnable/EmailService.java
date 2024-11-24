package io.github.ropererlk.threads.runnable;

public class EmailService implements Runnable {

    private String email;

    public EmailService(String email){
        this.email=email;
    }

    @Override
    public void run() {

        try {
            //Implement Email Sending
            System.out.println("Sending Email: "+ email);

            Thread.sleep(5000);

            //Implement Email Sending
            System.out.println("Email Send to : "+ email);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
