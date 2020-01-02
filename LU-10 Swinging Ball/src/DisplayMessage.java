/**
 * Created by student on 27.11.2019 г..
 */
public class DisplayMessage implements Runnable {
    private    String message;
    public DisplayMessage(String message){
        this.message = message;
    }
    public void run(){
        while(true){
            System.out.println(message);
        }
    }
}
