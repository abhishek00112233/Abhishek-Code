package ConditionalStatement;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringInJava {
    static String vowelCount(String str){
        int vowelCount=0;
        int constantCount=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
            else
                constantCount++;
        }
        System.out.println("vowel = "+vowelCount);
        System.out.println("constant = "+constantCount);
        return str;
    }
    public static void main(String[] args) {

//        char [] ch={'a','b','h','i'};
//        int [] arr={1,2,3,4,5};
//        System.out.println(ch);
//        System.out.println(arr);

//        String  [] str={"hello"};
//        System.out.println(str[0]);



//        // String pool

        // immutable String
//        String str="aba";
//        String str1="hello";
//
////        String  Store int heap
//        String str2=new String("hello");
//        String str3=new String("hello");
//
//        System.out.println(str==str1);
//        System.out.println(str2.equals(str3));
//        System.out.println(str2==str3);
//
//        String check="";
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            check=ch+check;
//        }
//        System.out.println(str==check);
//        System.out.println(str.equals(check));



//        String str1="hello";
//        String str2="World";
//        System.out.println(str1+str2);
//        String str3=new String("hello");
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str3));
//
//        String str="hello";
//        String str1="hello world";
////        str1+="lo";
//
////        System.out.println(str==str1);
//         String str5=str.concat(" world");
//        System.out.println(str);
//        String str3=new String("hello");
//        System.out.println(str.concat(" world"));
//        str3+=" world";
////        System.out.println(str.concat(str1));
//
//        System.out.println(str==str1);
//        System.out.println(str5==str1);
//        System.out.println(str5.equals(str1));
//        System.out.println(str.equals(str3));
////        System.out.println(str1.equals(str3));


//        String str="hello";
//        str+=" world";
//        System.out.println(str.concat(" men"));


        // mutable string

//        StringBuffer str=new StringBuffer("hello world");
//        StringBuffer st=new StringBuffer("hello");
//        st.append(" world");
////        System.out.println(str.equals(st));
//        System.out.println(st);
//        StringBuilder str6=new StringBuilder("hello world");
//        StringBuilder str7=new StringBuilder("hello world in the string testing the programm and what are you doing ");
//        StringBuilder str8=new StringBuilder("hello");
//        str8.append(" world");
//        System.out.println(str6.equals(str7));
//        System.out.println(str6.equals(str7));
//        System.out.println(str7.length());
//        System.out.println(str6.delete(0,3));
//        System.out.println(str6.reverse());
//        System.out.println(str7.repeat(0,1));
//        System.out.println(str7.compareTo(str6));
//        System.out.println(str7.capacity());
//
//
//        String st1="Geeks for Geeks";
//        String target="for";
//        char check=' ';
//        for (int j=0;j<1;j++){
//            char ch=target.charAt(j);
//            check+=ch;
//
//        }
//        System.out.println(target);
//        for (int i=0;i<st1.length();i++){
//            char ch=st1.charAt(i);
//            if (ch==check){
//                System.out.println("true");
//            }else
//                System.out.println("false");
//        }

        String str="abc";
        vowelCount(str);
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
            String check="hello every one how are you";
//            String[] warray= check.split(" ");
//            System.out.println(Arrays.toString(warray));
//
//        System.out.println(warray[4]);

        System.out.println();
        System.out.println(check.contains("llo"));

        System.out.println(check.intern());
        String stt5="hello";
        String str6=new String("hello");
        System.out.println(stt5==str6);
    }

}
