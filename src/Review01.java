
public class Review01 {

    public static void main(String [] args) {

      int num1 = 1500; // 商品価格を代入

      double result ;
      result = tax(num1); //消費税を代入

      double price = num1 + result; //税込価格を算出
      System.out.println(
              num1 + "円の商品の税込価格は"
            + Math.round(price)+"円"
            + ("（消費税は" + Math.round(result) + "円）です。"));
    }

    //消費税額の算出
    public static double tax(int num1) {
      double result = Math.round(num1 /10);
      return result;
    }

}