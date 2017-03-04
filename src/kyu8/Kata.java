package kyu8;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by vlrkw on 2017-03-04.
 */
public class Kata {
    public static int tripleDouble(long num1, long num2){
        String num1String = Long.toString(num1);
        int tripleCount = 1;
        String beforeText = num1String.charAt(0) + "";
        for(int i = 1; i < num1String.length(); i++){
           if(beforeText.equals(num1String.charAt(i) + "")){
               tripleCount++;
            }else{
               tripleCount = 1;
           }
           if(tripleCount == 3){
               String num2String = Long.toString(num2);
               int doubleCount = 1;
               beforeText = num2String.charAt(0) + "";
               for (int j = 1; j < num2String.length(); j++) {
                   if (beforeText.equals(num2String.charAt(j) + "")) {
                       doubleCount++;
                   } else{
                       doubleCount = 1;
                   }
                   if(doubleCount == 2){
                       return 1;
                   }
                   beforeText = num2String.charAt(j) + "";
               }
               return 0;
           }
           beforeText = num1String.charAt(i) + "";

        }
        return 0;
    }

    @Test
    public void tripleDoubleTest(){
        Assertions.assertThat(tripleDouble(451999277l, 41177722899l)).isEqualTo(1); // num1 has straight triple 999s and
        // num2 has straight double 99s
        Assertions.assertThat(tripleDouble(1222345, 12345)).isEqualTo(0); // num1 has straight triple 2s but num2 has only a single 2

        Assertions.assertThat(tripleDouble(12345, 12345)).isEqualTo(0);

        Assertions.assertThat(tripleDouble(666789, 12345667)).isEqualTo(1);
    }
}
