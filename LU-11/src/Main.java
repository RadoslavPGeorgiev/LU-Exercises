import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        String file = "File.txt";
        FileWriter fileWriter = new FileWriter(file, true);
        FileReader fileReader = new FileReader(file);
        ClientWriter clientWriter = new ClientWriter(fileWriter);
        ClientReader clientReader = new ClientReader(fileReader);

        ClientWriterThread cWT1 = new ClientWriterThread(clientWriter, "One");
        ClientWriterThread cWT2 = new ClientWriterThread(clientWriter, "Two");
        ClientWriterThread cWT3 = new ClientWriterThread(clientWriter, "Three");
        ClientWriterThread cWT4 = new ClientWriterThread(clientWriter, "Four");

        ClientReaderThread cRT1 = new ClientReaderThread(clientReader);
        ClientReaderThread cRT2 = new ClientReaderThread(clientReader);
        ClientReaderThread cRT3 = new ClientReaderThread(clientReader);
        ClientReaderThread cRT4 = new ClientReaderThread(clientReader);

        Thread th1 = new Thread(cWT1);
        Thread th2 = new Thread(cWT2);
        Thread th3 = new Thread(cWT3);
        Thread th4 = new Thread(cWT4);

        Thread th5 = new Thread(cRT1);
        Thread th6 = new Thread(cRT2);
        Thread th7 = new Thread(cRT3);
        Thread th8 = new Thread(cRT4);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        Thread.sleep(300);

        th5.start();
        th6.start();
        th7.start();
        th8.start();
        Thread.sleep(300);

        clientWriter.closeStream();
        clientReader.closeStream();
    }
}
