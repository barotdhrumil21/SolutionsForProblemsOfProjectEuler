import java.util.ArrayList;
import java.util.List;

public class Problem_50 {
    public static void main(String[] args){
        List<Integer> listOfTwoDigitLongNums=new ArrayList<Integer>();
        List<Integer> listOfThreeAndFourDigitLongNums=new ArrayList<Integer>();
        List<Integer> listOfFiveAndSixDigitLongNums=new ArrayList<Integer>();
        //List<Integer> listOfSevenDigitLongNums=new ArrayList<Integer>();
        listOfTwoDigitLongNums.add(0,2);
        listOfTwoDigitLongNums.add(1,3);
        listOfTwoDigitLongNums.add(2,5);
        listOfTwoDigitLongNums.add(3,7);
        int init=10;
        for(int i=0;i<1_000_000;i++){
            int length=(int)Math.log10(init) + 1;
            switch (init){
                case 1:
                length=2;
                    for (int j = 0; j <init/3 ; j++) {
                        if(init%listOfTwoDigitLongNums.get(j)==0){
                            listOfTwoDigitLongNums.add(init);
                        }
                        
                    }
                    break;
                case 2:
                    if(length==3 || length==4){
                        for (int j = 0; j < init/10; j++) {
                            if(init%)
                        }
                    }

            }
        }


    }
}
