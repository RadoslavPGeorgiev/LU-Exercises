import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientWriter {
   private FileWriter writer;

    public ClientWriter(FileWriter fileWriter) throws IOException {
        writer = fileWriter;
    }

    public synchronized void writeToFile(String s) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
    }

    public void closeStream()
    {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
