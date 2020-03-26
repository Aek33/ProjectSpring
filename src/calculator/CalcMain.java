package calculator;
import java.util.*;
//1+2*4+3/7+2-4*6
public class CalcMain {
    public static void  main(String[] args){

        Scanner Scan = new Scanner(System.in);

        String UserInput = Scan.nextLine().replace(" ", "").replace(",",".");

        Scan.close();

        char[] CharArr = UserInput.toCharArray();

        List<String> ExpBlocks = new ArrayList<>();

        for (int i = 0; i < CharArr.length; i++) {

            if (Character.isDigit(CharArr[i]) || (CharArr[i] == '.' && Character.isDigit(CharArr[i+1]))){

                StringBuilder sb = new StringBuilder();

                for ( int j = i; j < CharArr.length; j++){

                    if (!Character.isDigit(CharArr[j])){

                        if (CharArr[j] == '.' && Character.isDigit(CharArr[j+1])) {
                            sb.append(CharArr[j]);
                            i = j;
                        }

                        else {
                            break;
                        }
                    }

                    else {
                        sb.append(CharArr[j]);
                        i = j;
                    }
                }
                ExpBlocks.add(sb.toString());
            }
            if (CharArr[i] == '+' || CharArr[i] == '-' || CharArr[i] == '/' || CharArr[i] == '*') {
                ExpBlocks.add(Character.toString(CharArr[i]));
            }
        }
        System.out.println(ExpBlocks);
        for (int i = 0; i < ExpBlocks.size(); i ++){
            if (ExpBlocks.get(i).equals("*") || ExpBlocks.get(i).equals("/")){
                double Result;
                double Num1 = Double.parseDouble(ExpBlocks.get(i - 1));
                double Num2 = Double.parseDouble(ExpBlocks.get(i + 1));
                if (ExpBlocks.get(i).equals("/") && ExpBlocks.get(i + 1).equals("0")){
                    System.out.println("На ноль делить нельзя!");
                    break;
                }

                if (ExpBlocks.get(i).equals("/")){
                    Result = Num1 / Num2;
                }

                else {
                    Result = Num1 * Num2;
                }
                ExpBlocks.set((i - 1), Double.toString(Result));
                ExpBlocks.removeAll(ExpBlocks.subList(i,i + 2));
                i = 0;

            }
        }
        System.out.println(ExpBlocks);

        for (int i = 0; i < ExpBlocks.size(); i ++){
            if (ExpBlocks.get(i).equals("+") || ExpBlocks.get(i).equals("-")){
                double Result;
                double Num1 = Double.parseDouble(ExpBlocks.get(i - 1));
                double Num2 = Double.parseDouble(ExpBlocks.get(i + 1));

                if (ExpBlocks.get(i).equals("+")){
                    Result = Num1 + Num2;
                }

                else {
                    Result = Num1 - Num2;
                }
                ExpBlocks.set((i - 1), Double.toString(Result));
                ExpBlocks.removeAll(ExpBlocks.subList(i,i + 2));
                i = 0;
            }
        }
        System.out.println(ExpBlocks);

    }
}
