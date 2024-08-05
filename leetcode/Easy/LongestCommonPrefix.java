public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        
        String hello = strs[0];
       
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(hello)!=0){

                hello = hello.substring(0, hello.length()-1);
               
                if(hello.isEmpty()){
                    return "";
                }
            }
        }
           
        return hello;
    }
    
    public static void main(String[] args) {
        String strs[] = { "flower","flow","flight"};

        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
}

