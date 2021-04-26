import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
        public int add(String numbers) throws Exception {
            int result = 0,j=0;
            String[] tokens;
            tokens = numbers.split(",|\n|;|\\*|%|//|\\[|\\]|$|&|^");
            for(String i : tokens){
                i = i.strip();
                if(i.equals(" ") || i.equals("")){
                    j = 0;
                }else if(Integer.parseInt(i)<0){
                    List<Integer> list = new ArrayList<>();
                    for(String x : tokens){
                        if(Integer.parseInt(x) < 0){
                            list.add(Integer.parseInt(x));
                        }
                    }
                    if(list.size() > 1) {
                        throw new Exception("negatives not allowed : "+ list);
                    }else{
                        throw new Exception("negatives not allowed");
                    }
                }
                else if(Integer.parseInt(i)>1000){
                    j = 0;
                }
                else{
                    j = Integer.parseInt(i);
                    result = result + j;
                }
            }
            return result;
        }
    public static void main(String args[]) throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("3,-9,40,-1,42,31");
        System.out.println(result);
    }
}
