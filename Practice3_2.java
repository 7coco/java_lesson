import java.io.*;

class Practice3_2
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("あなたは何歳ですか？");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply = br.readLine();
    int age = Integer.parseInt(reply);
    System.out.println("あなたは" + age + "歳です。");
  }
}
