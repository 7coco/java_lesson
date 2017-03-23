import java.io.*;

class Practice4_4
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("三角形の高さと底辺を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String reply1 = br.readLine();
    String reply2 = br.readLine();
    double height = Double.parseDouble(reply1);
    double base = Double.parseDouble(reply2);

    System.out.println("三角形の面積は" + ((height * base) / 2) + "です。");
  }
}
