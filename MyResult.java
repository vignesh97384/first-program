import java.util.*;
public class MyResult {
public static void main(String args[]) {
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1103,"Pass");
map.put(1104,"pass");
map.put(1105,"fail");
map.put(1106,"fail");
map.put(1107,"pass");
int pass = 0;int fail = 0;
String check = "pass";
for(Map.Entry m  : map.entrySet())
{
if(m.getValue()==check)
{
pass++;
System.out.println("pass count = "+ pass +" id " +m.getKey());
}
else {
fail++;
System.out.println("fail count = "+ fail +" id "+ m.getKey());
}
}
pass = 0;
fail = 0;
}
}