import java.sql.DriverManager;
import java.util.Random;
import java.util.Scanner;

class Generateword
{     static String name;String word;
    String [] arr;
    String str;
    int ind;
    int a;

    String word()
    {
        String [] movies= {"ddlj","indian","kgf2","pk","omg"};

        Random obj = new Random();
        int index = obj.nextInt(movies.length-1);
        String word = movies[index];
        System.out.println(word);
        return word;
    }
    void check()
    {
        word =word();
        System.out.println("Guess the bollywood movie ! \n Lenght : "+word.length());
        Scanner sc = new Scanner(System.in);
      String arr []= new String[word.length()];
        for(int i=0,j=0;j<=4 & i<=word.length();) {
            name = sc.next();
            if (word.contains(name)) {
                i++;
                System.out.println("Right word");
                 ind = word.indexOf(name);
                arr[ind] = name;
               // System.out.println(word);
                word = word.replaceFirst(name, " ");

                for (String string : arr) {
                    if(string==null){
                        System.out.print("_");
                    }else
                    System.out.print(string);
                }

                if(i==word.length()){
                    System.out.println("\nCongrats!! You win");
                    break;
                }
            } else {
                System.out.println("Wrong word Try again");
                j++;
                if(j>4)
                {
                    System.out.println("Game Over....!");
                }
            }
        } System.out.println("\n");
            }
}

public class GuessTheWord {
    public static void main(String[] args) {
        Generateword g = new Generateword();
        g.check();
    }

}
