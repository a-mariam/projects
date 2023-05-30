package ArraySnacksByChibuzor;

import java.util.Arrays;

public class UsernameGeneration {

    public static String usernameGenerator(String mail) {
        char [] name = mail.toCharArray();
    for (int count = 0; count < name.length;count++){
        name[count] += count;
    }
    String str = new String();
    String username = str.copyValueOf(name);
//        System.out.println(mail);
//        System.out.println(name);
//        System.out.println(username);
        return username;
    }
    public static String name(String mails){
        char [] collect = mails.toCharArray();
        char [] names = mails.toCharArray();
//        for (int count = 0; count < names.length - 10; count++){
//            collect[count] += count;
//        }
        StringBuilder sb = new StringBuilder();
        for (char name: names){
            sb.append(name);
        }
//        for (char collecy : collect){
//            sb.append(collect);
//        }
        String n = "";
        int count =0 ;
        while (count < collect.length - 10) {
            n += count;
            count--;
        }
        System.out.println(Arrays.toString(collect));
        System.out.println(Arrays.toString(names));
       // System.out.println(n);//
      //  String nam = sb.toString();
        String username = sb.toString();
       // System.out.println(nam);
        //System.out.println(username);
        return username;
    }

    public static void main(String[] args) {
        String m = "mariam@gmail.com";
        usernameGenerator(m);
        name(m);
    }
}
