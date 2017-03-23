import java.io.*;

class Practice5_3
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("2つの整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply1 = br.readLine();
    String reply2 = br.readLine();

    int num1 = Integer.parseInt(reply1);
    int num2 = Integer.parseInt(reply2);

    if(num1 == num2){
      System.out.println("2つの数は同じ値です。");
    }else if(num1 > num2){
      System.out.println(num2 + "より" + num1 + "の方が大きい値です。");
    }else if(num1 < num2){
      System.out.println(num2 + "より" + num1 + "の方が小さい値です。");
    }
  }
}
