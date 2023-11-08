package Latihan_2;

public class Main {
    public static void main(String[] args) {
        String email = "lalala@gmail.com";
        String telpon = "+628123456789";
        String ID = "SR22W7E";
        String psan = "apa y";
        
        EmailNotif mail = new EmailNotif();
        SMS_Notif pesan = new SMS_Notif();
        PushNotif ps = new PushNotif();
        
        mail.sendMessage(email, psan);
        pesan.sendMessage(telpon, psan);
        ps.sendMessage(ID, psan);
    }
}
