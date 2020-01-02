public class CreateArr {

    int[] array = new int[1000];

    public CreateArr(){
        for (int i = this.array.length - 1; i >= 0 ; i--)
        {
            this.array[i] = i;
        }
    }
}
