package day3.Assignment;

public class Constructor {
    public static void main(String[] args) {
        
        /*char[] ch = {'j','a','v','a'};
        String s1 = new String(ch);

        byte[] b = {97,98,99};String s2= new String(b);
        String s = new String(b);

        System.out.println(s1 + " " + s);*/


        /*String s3 = "java";
        String s4 = s3.toString();
        String s5 = s3.toLowerCase();
        String s6 = s3.toUpperCase();
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3==s6);*/

        /*String s3= "java";
        s3 = s3.concat("trainer");
        System.out.println(s3);*/

        /*String s= " ";
        s.trim();
        System.out.println(s.equals(" ")+" "+s.isEmpty());*/

        StringBuffer sb = new StringBuffer();
        sb.append("1234567895679081234567");
        System.out.println(sb.capacity() + " "+sb.length());
    }
}
