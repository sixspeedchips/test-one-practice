package edu.cnm.deepdive.testone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestOneMainClass {


  //1
  public static boolean perfectCube(long value){
    long temp = Math.round(Math.cbrt(value));
    return temp*temp*temp==value;
  }

  //2
  public static int[] filterNegatives(int[] input){
    List<Integer> nn = Arrays.stream(input).boxed().collect(Collectors.toList());
    nn = nn.stream().filter(integer -> integer >= 0).collect(Collectors.toList());
    int[] nonNegatives = new int[nn.size()];
    for (int i = 0; i < nonNegatives.length; i++) {
      nonNegatives[i] = nn.get(i);
    }
    return nonNegatives;
  }




  public static List<String> ladderBuilder(int height){
    StringBuilder stringBuilder = new StringBuilder();
    List<String> ladder = new ArrayList<>();

    for (int i =1; i < height; i++) {
      String str = "";

      for (int j = 0; j < height - i; j++) {
        str+=" ";
      }
      for (int k = 0; k < i; k++) {
        str+="*";
      }

//      str+=new String(new char[height-i]).replace("\0", " ");
//      str+=new String(new char[i]).replace("\0","*");
      ladder.add(str);
    }
    return ladder;
  }

  public static float[] clockAngles(int hours, float minutes){

    hours %= 12;
    minutes /= 60;
    minutes *= 360;
    float hourHand = hours /12F;

    return new float[]{minutes, hourHand*360};


  }




  public static void main(String[] args) {
//    for (String s : ladderBuilder(10)) {
//      System.out.println(s);
//    }
    ladderBuilder(10);
    System.out.println(Arrays.toString(clockAngles(1, 30)));

//    System.out.println(ladderBuilder(10));
//    String x = new String(new char[1000]).replace("\0","l");
//    System.out.println(x);

  }



}
