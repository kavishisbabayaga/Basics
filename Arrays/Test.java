public class Test{
    public static void main(String[] args){
        int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month_names = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
        for(int i = 0; i < month_names.length; i++){
            System.out.println(month_names[i] + " : " + month_days[i] + " days");
        }

    }
}