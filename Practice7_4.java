import java.io.*;

class Practice7_4
{
  public static void main(String[] args) throws IOException {
    System.out.println("5人のテストの点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];

    for(int i = 0; i < test.length; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }

    for(int i = 0; i < test.length; i++){
      System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
    }

    for(int s = 0; s < test.length; s++){
      for(int t = s + 1; t < test.length; t++){
        if(test[t] > test[s]){
          int temp = test[t];
          test[t] = test[s];
          test[s] = temp;
        }
      }
    }

    System.out.println("最高点は" + test[0] + "です。");
  }
}
