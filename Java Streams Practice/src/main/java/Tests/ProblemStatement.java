package Tests;

public class ProblemStatement {

    public static void main(String[] args) {

        String s = "This#is$my%first^discussion@with&Altimetrik";
        String result = "";
        String res = s.replaceAll("!@#%&"," ");
        System.out.println(res);

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>64 && s.charAt(i)<122) {

                //s.replace("^"," ");
                //s = s.replaceAll("#$%^!&", " ");
                result= result+s.charAt(i);

            }
        }
        System.out.println(result);
    }
}
