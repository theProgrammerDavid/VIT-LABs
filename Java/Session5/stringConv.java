import java.util.*;

public class stringConv {
    public static String convertStringToHex(String str) {

        StringBuffer hex = new StringBuffer();
        for (char temp : str.toCharArray()) {

            int decimal = (int) temp;
            hex.append(Integer.toHexString(decimal));
        }

        return hex.toString();

    }

    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(String.format("%8s", Integer.toBinaryString(aChar)) 
                    .replaceAll(" ", "0") 
            );
        }
        return result.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String x = sc.nextLine();
        System.out.println(convertStringToBinary(x));
        String y = convertStringToHex(x);
        System.out.println(y); 
        System.out.println(convertStringToBinary(y));

        sc.close();
    }
}
