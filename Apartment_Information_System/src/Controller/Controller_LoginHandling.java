package Controller;

import Model.*;
import View.*;
import java.util.Properties;
import java.net.PasswordAuthentication;
import java.net.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Controller_LoginHandling {
    Model_LoginSys checker = new Model_LoginSys();
    public Controller_LoggerInfo verifyLogin(String choice, String contact, String pass){
        Controller_LoggerInfo values = checker.verifyInfo(choice, contact, pass);
        values.evaluate();
        return values;
    }
    
    public boolean resetPass(String email, String choice, String pass){
        return checker.chngPass(email, choice, pass);
    }
    public boolean resetPass(String email){
        String refString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int index
                    = (int) (refString.length()
                    * Math.random());

            sb.append(refString.charAt(index));
        }
        System.out.println(sb.toString());
        String useremail = checker.resetPass(email, sb.toString());
        System.out.println(useremail);
        if(useremail.equals("-1")){
            return false;
        }
        else {

           final String fromEmail = "apartmentinfosystem@gmail.com";//user.getFromEmail(); //requires valid gmail id
            final String password = "ISD_AIS_A1_G1";//user.getPassword(); // correct password for gmail id
            final String toEmail = useremail; // can be any email id 

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
            props.put("mail.smtp.port", "587"); //TLS Port
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
            //enable authentication
            try {
                Authenticator auth = new Authenticator() {
                    //override the getPasswordAuthentication method
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, password.toCharArray());
                    }
                };
                Session session = Session.getDefaultInstance(props, null);
                MimeMessage msg = new MimeMessage(session);
                //set message headers
                msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
                msg.addHeader("format", "flowed");
                msg.addHeader("Content-Transfer-Encoding", "8bit");

                msg.setFrom(new InternetAddress(fromEmail, "Apartment Information System"));

                msg.setReplyTo(InternetAddress.parse(fromEmail, false));

                msg.setSubject("Reset Password", "UTF-8");

                msg.setText("Your new password is "+sb.toString(), "UTF-8");

               // msg.setSentDate(new Date());

                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
                System.out.println("Message is ready");
                Transport trans = session.getTransport("smtp");
                trans.connect("smtp.gmail.com", fromEmail, password);
                trans.sendMessage(msg, msg.getAllRecipients());

                System.out.println("EMail Sent Successfully!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
       }

        return true;
    }
}
