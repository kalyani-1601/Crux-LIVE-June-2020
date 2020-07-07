package info.company.Lec17;

public class Games {

    int exp;

    int lvl;

    String name;

    public Games(){

        this.exp= 0;
        this.lvl=0;
        this.name="game";

    }

    public Games(int exp, int lvl, String name) {

        this.exp=exp;
        this.lvl=lvl;
        this.name=name;
    }
//
   String category= "Action";


   public void experience(){

       exp= exp+10;

       if(exp==150){
           System.out.println("Level up");
           lvl=lvl+1;
       }
   }

   public static void launchevent(){
       System.out.println("Game launch today");
   }
}
