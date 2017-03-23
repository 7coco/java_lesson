import java.io.*;

class Practice6_2
{
  public static void main(String[] args) throws IOException {
    System.out.println("テストの点数を入力してください。0で終了。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean bl = true;
    int sum = 0;

    while (bl) {
      String str = br.readLine();
      int score = Integer.parseInt(str);
      sum += score;
      if(score == 0) break;
    }
    System.out.println("テストの合計点は" + sum + "点です。");
  }
}
