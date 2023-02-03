import java.util.Scanner;

public class RightStaircase {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Total row(s): ");
        String stringRow = myObj.nextLine();

        //try catch to check if the input is integer value or not
        try {
            int row = Integer.parseInt(stringRow);
            if (row <= 100) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < row; ++j) {
                        if (row - i > j + 1) {
                            System.out.print(" ");
                        } else {
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Rows can't be more than 100");
            }
        }catch(NumberFormatException e){
            System.out.println("Input is not an integer value");
        }
    }
}
