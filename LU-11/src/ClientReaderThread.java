import java.io.IOException;

public class ClientReaderThread extends Thread {
    private ClientReader clientReader;

    public ClientReaderThread(ClientReader clientReader){
        this.clientReader = clientReader;
    }

    @Override
    public void run() {
        try {
            clientReader.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
