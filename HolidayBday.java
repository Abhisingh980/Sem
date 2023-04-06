import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
class HolidayBday {
    public static void main(String[] args) {
        List<LocalDate> holidays = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter the number of dates : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the date in dd-mm-yyyy format : ");
            String date = sc.next();
            holidays.add(LocalDate.parse(date, formatter));
        }
        System.out.println("Entered dates are:");
        String givendate = sc.next();
        LocalDate day = LocalDate.parse(givendate, formatter);
        holidays.add(day);
        Collections.sort(holidays);
        System.out.println("Sorted dates are:");
        for (LocalDate date : holidays) {
            System.out.println(formatter.format(date));
        }
    }
}
