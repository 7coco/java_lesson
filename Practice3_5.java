import java.io.*;

class Practice3_5
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("身長と体重を入力してください。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply1 = br.readLine();
    String reply2 = br.readLine();
    double height = Double.parseDouble(reply1);
    double weight = Double.parseDouble(reply2);
    System.out.println("身長は" + height + "です。");
    System.out.println("体重は" + weight + "です。");
  }
}
