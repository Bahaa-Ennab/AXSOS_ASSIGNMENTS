import java.util.ArrayList;

class Solution {
    public String removeStars(String s) {
        String[] arr = s.split("");
        ArrayList<String> arrlist = new ArrayList<String>();
        int i = 0;
        while (i<=arr.length-1){
            arrlist.add(arr[i]);
            i++;
        }
        int x =0;
        for (String charc : arrlist){
            // System.out.print(charc);
            if (charc.equals("*") ){
                System.out.print(charc);
                arrlist.remove(charc);
                String pre = arrlist.get(x-1);
                arrlist.remove(pre);
            }
            x++;
        }
        String output="";
        for (String letter : arrlist){
            output +=letter;
        }
        return output;
    }
    public static void main(String[] args) {
        Solution batata = new Solution();
        batata.removeStars("leet**cod*e");
    }
}
