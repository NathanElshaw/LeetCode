import java.util.List;
import java.util.Objects;

class Solution {
    public String destCity(List<List<String>> paths) {
        String ans = "";
        for(int i = 0; i < paths.size(); i++){
            int count = 0;
            for(int j = 0; j < paths.size(); j++){

                if(paths.get(i).get(1).equals(paths.get(j).get(0))){
                    count++;
                }
            }
            if(count == 0){
                ans = paths.get(i).get(1);
                break;
            }
        }
        return ans;
    }
}