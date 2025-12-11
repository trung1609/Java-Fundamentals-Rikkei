package Session5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String input = "Lien he qua email trung@gmail.com hoac 23010361@school.edu.vn de duoc tu van";
        System.out.println("Cac email tim duoc: ");
        Matcher matcher = Pattern.compile("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b").matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String phone = "0123456789 va 0123456 va 0868920271";
        System.out.println("Cac phone tim duoc: ");
        Matcher checkPhone = Pattern.compile("\\b[0-9]{10}\\b").matcher(phone);
        while (checkPhone.find()) {
            System.out.println(checkPhone.group());
        }
    }
}
