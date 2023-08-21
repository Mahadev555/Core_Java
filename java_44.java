public class java_44 {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 500;
        int finalscore= score;
        int bonus = 100;
        int level = 6;

        if(gameover){
            finalscore += (level*bonus);
            System.out.println("Your final score was " + finalscore);
        }
    }
}
