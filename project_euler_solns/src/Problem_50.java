import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_50 {
    public static int ifNumberIsAddedOnce=0;
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
        for(int i=0;i<1000000;i++){
            int length=(int)Math.log10(init) + 1;
            switch (length) {
                case 2:
                    //length = 2;

                    for (int j = 0; j < init / 3; j++) {
                        if (init % listOfTwoDigitLongNums.get(j) == 0) {
                            ifNumberIsAddedOnce = 0;
                            j = init / 3;
                            try {
                                listOfTwoDigitLongNums.remove(listOfTwoDigitLongNums.indexOf(init));
                            } catch (Exception e) {

                            }
                        } else if (ifNumberIsAddedOnce != 1) {
                            listOfTwoDigitLongNums.add(init);
                            ifNumberIsAddedOnce = 1;
                        }


                    }
                    init = init + 1;
                    ifNumberIsAddedOnce = 0;
                    break;
                case 3:

                    //length = 3;
                {
                    for (int j = 0; j < init / 10; j++) {
                        if (init % listOfThreeAndFourDigitLongNums.get(j) == 0) {
                            ifNumberIsAddedOnce = 0;
                            j = init / 10;
                            try {
                                listOfThreeAndFourDigitLongNums.remove(listOfThreeAndFourDigitLongNums.indexOf(init));
                            } catch (Exception e) {

                            }
                        } else if (ifNumberIsAddedOnce != 1) {
                            listOfThreeAndFourDigitLongNums.add(init);
                            ifNumberIsAddedOnce = 1;
                        }
                    }
                }
                init = init + 1;
                ifNumberIsAddedOnce = 0;
                break;
                case 4:
                    //length = 4;
                    for (int j = 0; j < init / 10; j++) {
                        if (init % listOfThreeAndFourDigitLongNums.get(j) == 0) {
                            ifNumberIsAddedOnce = 0;
                            j = init / 10;
                            try {
                                listOfThreeAndFourDigitLongNums.remove(listOfThreeAndFourDigitLongNums.indexOf(init));
                            } catch (Exception e) {

                            }
                        } else if (ifNumberIsAddedOnce != 1) {
                            listOfThreeAndFourDigitLongNums.add(init);
                            ifNumberIsAddedOnce = 1;
                        }
                    }
                    init = init + 1;
                    ifNumberIsAddedOnce = 0;
                    break;
                case 5:
                    //length = 5;
                    for (int j = 0; j < init / 100; j++) {
                        if (init % listOfFiveAndSixDigitLongNums.get(j) == 0) {
                            ifNumberIsAddedOnce = 0;
                            j = init / 100;
                            try {
                                listOfFiveAndSixDigitLongNums.remove(listOfFiveAndSixDigitLongNums.indexOf(init));
                            } catch (Exception e) {

                            }
                        } else if (ifNumberIsAddedOnce != 1) {
                            listOfFiveAndSixDigitLongNums.add(init);
                            ifNumberIsAddedOnce = 1;
                        }
                    }
                    init = init + 1;
                    ifNumberIsAddedOnce = 0;
                    break;
                case 6:
                    //length = 6;
                    for (int j = 0; j < init / 100; j++) {
                        if (init % listOfFiveAndSixDigitLongNums.get(j) == 0) {
                            ifNumberIsAddedOnce = 0;
                            j = init / 100;
                            try {
                                listOfFiveAndSixDigitLongNums.remove(listOfFiveAndSixDigitLongNums.indexOf(init));
                            } catch (Exception e) {

                            }
                        } else if (ifNumberIsAddedOnce != 1) {
                            listOfFiveAndSixDigitLongNums.add(init);
                            ifNumberIsAddedOnce = 1;
                        }
                    }
                    init = init + 1;
                    ifNumberIsAddedOnce = 0;
                    break;
                default: {
                }

                    /*case 6:
                    length=7;
                    for (int j = 0; j < init/100; j++) {
                        if(init%listOfFiveAndSixDigitLongNums.get(j)==0){
                            ifNumberIsAddedOnce=0;
                            j=init/100;
                            try{
                                listOfFiveAndSixDigitLongNums.remove(listOfFiveAndSixDigitLongNums.indexOf(init));
                            }catch(Exception e){

                            }
                        }else
                        if(ifNumberIsAddedOnce!=1){
                            listOfFiveAndSixDigitLongNums.add(init);
                            ifNumberIsAddedOnce=1;
                        }
                    }
                    init=init+1;
                    ifNumberIsAddedOnce=0;
                    break;
                    */
                {//TESTING FOR PRIME NUMBER
                    Scanner input = new Scanner(System.in);
                    System.out.println("enter the number");
                    int inputInt = input.nextInt();
                    int Length = (int) Math.log10(inputInt) + 1;
                    if ((Length == 1) || (Length == 2)) {
                        System.out.println(listOfTwoDigitLongNums.get(listOfTwoDigitLongNums.indexOf(inputInt)));
                    }
                    if ((Length == 3) || (Length == 4)) {
                        System.out.println(listOfThreeAndFourDigitLongNums.get(listOfThreeAndFourDigitLongNums.indexOf(inputInt)));
                    }
                    if ((Length == 5) || (Length == 6)) {
                        System.out.println(listOfFiveAndSixDigitLongNums.get(listOfFiveAndSixDigitLongNums.indexOf(inputInt)));
                }
            }



            }
        }
    }
        public static void Test(){

        }


    }


