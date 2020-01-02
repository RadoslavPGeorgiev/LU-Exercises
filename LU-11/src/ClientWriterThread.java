import java.io.IOException;

public class ClientWriterThread extends Thread {

    private ClientWriter clientWriter;
    private String text;

    public ClientWriterThread(ClientWriter clientWriter, String text){
        this.text = text;
        this.clientWriter = clientWriter;
    }

    @Override
    public void run() {
        try {
            clientWriter.writeToFile(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
