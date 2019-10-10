package edu.cnm.deepdive.testone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
    return new float[]{minutes * 360, (hours/12F + 1/12F*minutes) * 360};
  }

  public static String reverseStringOne(String str){
    StringBuilder sb = new StringBuilder();
    for (int i = str.toCharArray().length - 1; i >= 0; i--) {
        sb.append(str.toCharArray()[i]);
    }
    return sb.toString();
  }

  public static String reverseStringTwo(String str){
    StringBuilder sb = new StringBuilder();
    str.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(
        sb::append);
    return sb.toString();
  }

  public static int[] leaderBoardRanking(int[] leaderBoard, int[] playerScores){

    int[] rankings = new int[playerScores.length];
    int i = 0;

    // up or down
//    for (int playerScore : playerScores) {
//      int above = 0;
//      while(playerScore >= leaderBoard[leaderBoard.length-above-1]){
//        above++;
//      }
//      rankings[i++] = leaderBoard.length-above+1;
//    }

    for (int playerScore : playerScores) {
      int position = 0;
      for (int leaderBoardScore : leaderBoard) {
        if(playerScore >= leaderBoardScore){
          break;
        }
        position++;
      }
      rankings[i++] = position+1;
    }

    return rankings;

  }



  public static void main(String[] args) {
//    for (String s : ladderBuilder(10)) {
//      System.out.println(s);
//    }
//    ladderBuilder(10);
//    System.out.println(Arrays.toString(clockAngles(1, 0)));
//    System.out.println(reverseString("Hello World"));
//    System.out.println(ladderBuilder(10));
//    String x = new String(new char[1000]).replace("\0","l");
//    System.out.println(x);
    System.out
        .println(Arrays
            .toString(leaderBoardRanking(new int[]{100, 90, 85, 70}, new int[]{5, 60, 80, 85, 95})));
    System.out.println(reverseStringTwo("Hello World"));
  }



}
