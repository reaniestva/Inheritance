package Latihan_2;

public class EmailNotif implements Interface {
    
    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim email ke "+receiver+" dengan isi: ");
        System.out.println(content);
    }
    public void call(){
        System.out.println("Kring Kring");
    } 
}
