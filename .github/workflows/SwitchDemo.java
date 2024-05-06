public class SwitchDemo {
        public static void main(String[] args) {
            int num = 9;
            String month;
    
            switch (num) {
                case 1:
                    month = "january";
                    break;
                case 2:
                    month = "feb";     
                    break;
                case 3:
                    month = "march";                
                    break;
                case 4:
                    month = "april";
                    break;
                case 5:
                    month = "may";
                    break;
                case 6:
                    month = "june";
                    break;
                default:
                    month = "invalid";
                    break;
            }
            System.out.println(month);
        }
    }
