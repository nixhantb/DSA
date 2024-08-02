public class RomanInteger {
    
    public static int romanToInt(String s) {
        int arr[] = new int[s.length()];
        String x = s;
        for(int i = 0; i < s.length(); i++){

            switch (x.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            
                default:
                    break;
            }
        }
        // IV = [1, 5] = sum = sum - a[i]
        // VIII = [5, 1, 1, 1] = 3
        // XIX [10, 1, 10]  
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
           if(arr[i] < arr[i+1]){
            sum -= arr[i];
           }
           else{
            sum += arr[i];
           }
        }

        sum = sum + arr[arr.length-1];


        return sum;
    }
    public static void main(String[] args){
        String s = "LVIII";
        int an = romanToInt(s);
        System.out.println(an);
    }
}
