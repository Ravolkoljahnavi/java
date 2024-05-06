public class ternaryoperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int result;
        //this statement is used as a if else statement where '?' is used as if 
        //and the condition is written before the '?'and else statement is written after the '?'
        //a : b acts as else statement if a is less than b then and the condition is true then it displays 'a' or else 'b'
        //and ternery operater is used for only one statements not multiple statements.
        result = a < b ? a : b;

        System.out.println(result);
    }

}
