public class Die {
    private int sides;
    public Die(int initsides){
        sides=initsides;

    }
    public int rolled(){
        return 1+ (int)(Math.random()*(sides-1)) +1;

    }
    public static void main(String[] args){
        Die d1 = new Die(5);
        System.out.println(d1.rolled());
        Die d2 = new Die(25);
        System.out.println(d2.rolled());


    }
}
