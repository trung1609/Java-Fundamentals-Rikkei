import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello World");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.replace(1, 2, "Java");
        System.out.println(sb2);
    }
}