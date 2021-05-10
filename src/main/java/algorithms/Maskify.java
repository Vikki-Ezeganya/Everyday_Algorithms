package algorithms;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("Christopher"));
    }

    public static String maskify(String cc) {
      if(cc.length() < 4 || cc.isEmpty())   return cc;
      int noOfStartChar = cc.length() - 4;
      String allAmpersands = "#".repeat(noOfStartChar);
      String strToReplace = cc.substring(0, noOfStartChar);
      return cc.replace(strToReplace, allAmpersands);
    }
}
