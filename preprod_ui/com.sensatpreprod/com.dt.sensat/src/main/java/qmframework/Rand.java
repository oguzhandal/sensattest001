package qmframework;

import java.util.Random;

public class Rand {
    public static void main(String[] args){
        String randomString =generateRandomString();
        System.out.println(randomString);
    }
    public static String generateRandomString(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        //iki hane rakam
        sb.append(random.nextInt(7));
        sb.append(random.nextInt(9));
        sb.append(" ");
        //üç hane harf
        char[] chars ="ABCDEFGHIJKLMNOPRSTUVYZ".toCharArray();
        for(int i=0;i<2;i++){
            char c=chars[random.nextInt(chars.length)];
            sb.append(c);

        }
        sb.append(" ");
        sb.append(random.nextInt(10));
        sb.append(random.nextInt(10));
        sb.append(random.nextInt(10));
        sb.append(" ");
        return sb.toString();
    }
}
