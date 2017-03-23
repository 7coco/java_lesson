import java.io.*;

class Practice4_5
{
  public static void main(String[] args)throws IOException
  {
    System.out.println("科目1~5の点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply1 = br.readLine();
    String reply2 = br.readLine();
    String reply3 = br.readLine();
    String reply4 = br.readLine();
    String reply5 = br.readLine();

    int sum = 0;
    sum = Integer.parseInt(reply1) + Integer.parseInt(reply2) + Integer.parseInt(reply3)
      + Integer.parseInt(reply4) + Integer.parseInt(reply5);
    double ave = ((double)sum / 5);

    System.out.println("5科目の合計点は" + sum + "です。");
    System.out.println("5科目の平均点は" + ave + "です。");
  }
}
