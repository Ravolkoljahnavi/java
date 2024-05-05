public class Strings {

    public static void main(String[] args) {
        String str = "test"; //in this string is going to reuse same object multiple times
        System.out.println("String is:" +str);

        String str1 = new String("test");//in this string is going to create new object every time it is called
        System.out.println("Another String" +str1);


        int arr[];
        arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;
        //arr[2] = 2;

        System.out.println(arr);//it prints the memory location of the array where it is stored
        System.out.println(arr[1]);
        
    }
}
