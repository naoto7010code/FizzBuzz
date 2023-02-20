public class FizzBuzz {
  public static void main(String[] args){

    int i =0;
    int loopCount =100;
    int numFizz =3;
    int numBuzz =5;
    String strFizz = "Fizz";
    String strBuzz = "Buzz";
  
  // forで繰り返し処理
  // 1から開始して解決したら1を足す
  for (i = 1; i <=loopCount; i++) {
          // もしiが15の倍数であれば"FizzBuzz"を表示
          if (i % (numFizz * numBuzz) == 0) {
              System.out.println(strFizz + strBuzz);
          // もしiが上記の結果以外かつ3の倍数であれば"Fizz"を表示
          } else if (i % numFizz == 0) {
              System.out.println(strFizz);
          // もしiが上記の結果以外かつ5の倍数であれば"Buzz"を表示
          } else if (i % numBuzz == 0) {
              System.out.println(strBuzz);
          // もしiが上記の結果以外であればi(数値)を表示
          } else {
              System.out.println(i);
          }
   }
 }
}