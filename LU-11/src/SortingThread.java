import java.util.Arrays;

public class SortingThread extends Thread {
    CreateArr ob;

    public SortingThread(CreateArr ob) {
        this.ob = ob;
    }
    @Override
    public void run() {
    synchronized (ob){
        sortArr();
    }
    }

    private void sortArr(){
        Arrays.sort(ob.array);
    }
}
