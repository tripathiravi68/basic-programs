import java.util.*;
public class trim
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the first string");
                String a=sc.nextLine();
                String b[]=a.split("ram");
                for(String s: b)
                {
                        System.out.println(s+"next");
                }
                for(int i=0;i<b.length;i++)
                System.out.println("the splitted part is--"+i+"---"+b[i]+"\n");//split karne ke bad usko array me rakhna hota hai

        }
}



//used to compare substring of a string within another sstring
//split returns  String array


/*
enter the first string
ramlaxmanrambharathramsatrughanramdasrathramramayan
next
laxmannext
bharathnext
satrughannext
dasrathnext
next
ayannext
the splitted part is--0---

the splitted part is--1---laxman

the splitted part is--2---bharath

the splitted part is--3---satrughan

the splitted part is--4---dasrath

the splitted part is--5---

the splitted part is--6---ayan
*/



//used to compare substring of a string within another sstring
//split returns  String array
