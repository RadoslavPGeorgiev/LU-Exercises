import java.io.*;

public class ClientReader {
    private FileReader reader;

    public ClientReader(FileReader fileReader) throws IOException {
        reader = fileReader;
    }

    public synchronized void readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
    }

    public void closeStream()
    {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
