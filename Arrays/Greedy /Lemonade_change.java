
//860. Lemonade Change
//Easy
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tenChange = 0; 
        int fiveChange = 0;

        for(int bill : bills){
            if(bill == 5){
                fiveChange++;
            }else if(bill == 10){
                if(fiveChange == 0) return false;

                fiveChange--;
                tenChange++;
            }else{ // change for 20 dollar cash
                if(tenChange > 0 && fiveChange > 0) { // first priority to 10 dollar change if available
                    tenChange--;  
                    fiveChange--;
                }else if(fiveChange>=3){  // or if 3x5 = 15 dollar change available 
                    fiveChange -= 3;
                }else{
                    return false;
                }
            }
        }


        return true;
    }


}
