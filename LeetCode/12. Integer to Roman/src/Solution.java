/**
 * Created by Mohamed Essam on 6/1/2019.
 */
public class Solution {
    public String intToRoman(int num) {
        StringBuilder builder =new StringBuilder();
        while (num != 0) {
            if (num >= 1000) {
                for (int i = 0; i < num/1000; i++) {
                    builder.append('M');
                }
                num = num % 1000;
            }
            if (num >= 500) {
                if (num < 900) {
                    for (int i = 0; i < num/500; i++)
                        builder.append('D');
                    num = num%500;
                } else {
                    builder.append('C');
                    builder.append('M');
                    num = num %100;
                }
            }
            if (num >= 100){
                if (num < 400) {
                    for (int i = 0; i < num/100; i++)
                        builder.append('C');
                    num = num % 100;
                }
                else {
                    builder.append('C');
                    builder.append('D');
                    num = num % 100;
                }
            }
            if (num >= 50){
                if (num < 90) {
                    for (int i = 0; i < num/50; i++)
                        builder.append('L');
                    num = num % 50;
                }
                else{
                    builder.append('X');
                    builder.append('C');
                    num = num % 10;
                }

            }
            if (num >= 10) {
                if (num < 40) {
                    for (int i = 0; i < num/10; i++)
                        builder.append('X');
                    num = num % 10;
                } else {
                    builder.append('X');
                    builder.append('L');
                    num = num % 10;
                }
            }
            if (num >= 5) {
                if (num < 9) {
                    for (int i = 0; i < num/5; i++)
                        builder.append('V');
                    num = num % 5;
                } else {
                    builder.append('I');
                    builder.append('X');
                    num = 0;
                }

            }
            if (num >= 1) {
                if (num < 4) {
                    for (int i = 0; i < num/1; i++)
                        builder.append('I');
                    num =  0;
                } else {
                    builder.append('I');
                    builder.append('V');
                    num =  0;
                }
            }

        }


        return String.valueOf(builder);
    }

}
