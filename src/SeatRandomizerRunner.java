import java.util.Arrays;
import java.util.ArrayList;

public class SeatRandomizerRunner {
    private static final String[] originalSeatChart = {"Mohsin Choudhary", "Ivan Lazerka", "Gary Ye", "Andy Mejia", "Jelani Creary",
            "Tianyu Zhao", "Tenzin Dukdak", "Sikder Sakhawat", "Zachary Raykh", "Justin Chong", "Tyler Tang", "Ray Kong", "NOBODY",
            "Kazi Tishan", "Jain Xu", "Sahadat Amzad", "NOBODY", "Mennua Davis", "Aleksei Helik", "Wensen Li", "Wilson Lei", "Yunqiang Huang",
            "Kevin Ou Yang", "Charles Walford", "NOBODY", "Kenny Chen", "Eric Eng", "Jia Xiang Huang", "Han Sun", "Luis Sarmiento", "Liquan Lei",
            "Sifat Anan", "Abdullah Abdullaev", "Matthew Farley"};
    private static final ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Mohsin Choudhary", "Ivan Lazerka", "Gary Ye", "Andy Mejia", "Jelani Creary", "Tianyu Zhao", "Tenzin Dukdak",
            "Sikder Sakhawat", "Zachary Raykh", "Justin Chong", "Tyler Tang", "Ray Kong", "Kazi Tishan", "Jain Xu", "Sahadat Amzad", "Mennua Davis",
            "Aleksei Helik", "Wensen Li", "Wilson Lei", "Yunqiang Huang", "Kevin Ou Yang", "Charles Walford", "Kenny Chen", "Eric Eng",
            "Jia Xiang Huang", "Han Sun", "Luis Sarmiento", "Liquan Lei", "Sifat Anan", "Abdullah Abdullaev", "Matthew Farley"));

    public static void main(String[] args) {

    }

    private static String[][] randomizeSeats() {
        String[] newSeats = new String[originalSeatChart.length];
        boolean isValidChart = false;
        while (!isValidChart) {
            ArrayList<String> nameListCopy = nameList;
            int newSeat = 0;
            while (nameListCopy.size != 0) {
                int index = (int) (Math.random() * nameListCopy.size);
                if ((index != 25) && (newSeat != Arrays.asList(originalSeatChart).indexOf(nameListCopy[index]))) {
                    newSeats[newSeat] = nameListCopy[index];
                    nameListCopy = nameListCopy(0, index) + nameListCopy(index+1, )
                }
            }
        }
    }

    private static void displayArray(String[][] arr) {
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
