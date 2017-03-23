import java.io.*;

class Practice5_5
{
  public static void main(String[] args) throws IOException{
    System.out.println("成績を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String res = br.readLine();
    int grade = Integer.parseInt(res);

    switch (grade) {
      case 1:
        System.out.println("もっと頑張りましょう。");
        break;
      case 2:
        System.out.println("もう少し頑張りましょう。");
        break;
      case 3:
        System.out.println("さらに上を目指しましょう。");
        break;
      case 4:
        System.out.println("大変よくできました。");
        break;
      case 5:
        System.out.println("大変優秀です。");
        break;
    }
  }
}
