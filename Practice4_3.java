import java.io.*;

class Practice4_3
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("正方形の辺の長さを入力してください。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply = br.readLine();
    int edge = Integer.parseInt(reply);

    System.out.println("正方形の面積は" + (edge * edge) + "です。");
  }
}
