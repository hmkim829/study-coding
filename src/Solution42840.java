import java.util.*;

public class Solution42840 {

    public static void main(String[] args) {

        //int[] answers = {1,2,3,4,5};
        int[] answers = {1,3,2,4,2};

        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {

        int[] answer = {};

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1, 0));
        list.add(new Person(2, 0));
        list.add(new Person(3, 0));

        for(int i=0;i<answers.length;i++){

            if(answers[i] == p1[i%p1.length]){
                list.get(0).setScore(list.get(0).getScore()+1);
            }

            if(answers[i] == p2[i%p2.length]){
                list.get(1).setScore(list.get(1).getScore()+1);
            }

            if(answers[i] == p3[i%p3.length]){
                list.get(2).setScore(list.get(2).getScore()+1);
            }
        }

        Collections.sort(list);

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).getScore() == 0 || (i>0 && list.get(i-1).getScore() > list.get(i).getScore())){
                list.remove(i);
            }
        }

        answer = new int[list.size()];

        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i).getName();
        }

        return answer;
    }
}

class Person implements Comparable<Person>{

    int name;
    int score;

    public Person(int name, int score){
        this.name = name;
        this.score = score;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Person o) {
        return  o.score - this.score;
    }
}
