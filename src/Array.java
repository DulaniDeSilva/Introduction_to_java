public class Array {

    int arr[] = {3, 5,5,6,3};
    int total = 0;

    public void display(){
        for(int i=0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }

    public int calculate(){
        for(int i =0; i<5; i++){
            total = total + arr[i];
        }
        return total;
    }


}
