public class operators{
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);
        int orginal_result = result;

        result = result - 1;
        System.out.println(orginal_result + "- 1 =" + result);
        orginal_result = result;

        result = result * 2;
        System.out.println(orginal_result + "* 2 =" + result);
        orginal_result = result;

        result = result / 2;
        System.out.println(orginal_result + "/ 2 =" + result);
        orginal_result = result;

        result = result + 8;
        System.out.println(orginal_result + "+ 8 =" + result);
        orginal_result = result;

        result = result % 7;
        System.out.println(orginal_result + "% 7 =" + result);
        orginal_result = result;
    }
}
