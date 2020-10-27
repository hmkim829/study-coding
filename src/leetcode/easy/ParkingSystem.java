package leetcode.easy;

// 1603. Design Parking System
// https://leetcode.com/problems/design-parking-system/
public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        boolean answer = false;
        if(carType == 1){
            if(big >= 1){
                answer = true;
                big--;
            }
        }else if(carType == 2){
            if(medium >= 1){
                answer = true;
                medium--;
            }
        }else if(carType == 3){
            if(small >= 1){
                answer = true;
                small--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

//    ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
//    [[1, 1, 0], [1], [2], [3], [1]]

        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        boolean param_1 = obj.addCar(1);
        boolean param_2 = obj.addCar(2);
        boolean param_3 = obj.addCar(3);
        boolean param_4 = obj.addCar(1);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
