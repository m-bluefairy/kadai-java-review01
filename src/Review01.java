
public class Review01 {

    public static void main(String [] args) {

      int num1 = 1500; // 商品価格を代入

      double result ;
      result = tax(num1); //消費税を代入

      System.out.println( num1 + "円の商品の税込価格は" + (num1 + result + "円") + ("（消費税は" + result + "円）です。"));
    }

    //消費税額の算出
    public static double tax(int num1) {
        double result = num1 * 0.1;
        return result;
    }

}