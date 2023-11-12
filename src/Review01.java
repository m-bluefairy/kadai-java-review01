
public class Review01 {

    public static void main(String [] args) {

      //変数の宣言
      int num1 = 1500; // 商品価格を代入

      //商品価格に消費税の加算結果を代入
      int result ;
      result = tax(num1);
      System.out.println( num1 + "円の商品の税込価格は" + (num1 + result) + "（消費税は" + result + "円）です。");
      }

      //消費税額の算出
          public static int tax(int num1) {
          int result = num1 /10;
          return result;

      }
}