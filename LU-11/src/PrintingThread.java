public class PrintingThread extends Thread {
    CreateArr ob;

    public PrintingThread(CreateArr arrConstr) {
        this.ob = arrConstr;
    }

    @Override
    public void run() {
        synchronized (ob) {
            print();
        }
    }

    private void print() {
        int i;
        for (i = 0; i < ob.array.length; i++)
        {
            System.out.print(ob.array[i] + " ");
        }
    }
}
