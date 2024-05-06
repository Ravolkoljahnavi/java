public class ifelse {
    public static void main(String[] args) {
        int score = 59;
        char grades;
        if (score >= 90){
            grades = 'A';
        }
        //else{
        //    grades = 'B';
        //}
        else if(score >= 80){ //else if ladder
            grades = 'B';
        }
        else if(score >= 70){
            grades = 'C';
        }
        else if(score >= 60){
            grades = 'D';
        }
        else{
            grades = 'F';
        }

        System.out.println("grades:" + grades);

    }

}
