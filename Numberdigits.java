import java.io.*;
import java.util.*;
public class Numberdigits
{
public static void main(String args[])
{
int count=0,num=123456;
while(num!=0)
{
num/=10;
++count;
}
System.out.println("number of digits" +count)
}
}
