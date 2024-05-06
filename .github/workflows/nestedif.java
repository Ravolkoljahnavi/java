public class nestedif {
    public static void main(String[] args) {
        int i = 50;

        if (i == 50){
            System.out.println("i is equals to 50");
            if (i > 30){
                System.out.println("i is grater than 30");
                if (i > 80){
                    System.out.println("i is less than 80");
                }
            }
        }
    }

}
