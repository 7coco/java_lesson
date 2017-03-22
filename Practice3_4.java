import java.io.*;

class Practice3_4
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("円周率の値はいくつですか？");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String reply = br.readLine();
    double pi = Double.parseDouble(reply);
    System.out.println("円周率の値は" + pi + "です。");
  }
}
