import java.util.Arrays;
import java.util.Collections;
public class Card {
    static int count=0;
    Player [] player = new Player[4];int i=0;
    String [] card ={"01C","02C","03C","04C","05C","06C","07C","08C","09C","10C","11C","12C","13C",
                    "01D","02D","03D","04D","05D","06D","07D","08D","09D","10D","11D","12D","13D",
                    "01H","02H","03H","04H","05H","06H","07H","08H","09H","10H","11H","12H","13H",
                    "01S","02S","03S","04S","05S","06S","07S","08S","09S","10S","11S","12S","13S"};
    public void Dealcard(){
        Collections.shuffle(Arrays.asList(card));
        if(count == 0){
            player[0] = new Player(card,0);//player
            player[1] = new Player(card,13);//bot1
            player[2] = new Player(card,26);//bot2
            player[3] = new Player(card,39);//bot3
            for(i = 0;i<4;i++)
                Arrays.sort(player[i].cardonhand);
        }else{
            for(int i=0;i<4;i++){
                player[i].setCardonhand(card,13*i);
                Arrays.sort(player[i].cardonhand);
            }
        }
        count++;
    }
    public void Sortcard(){
        for(int i=0;i<4;i++){
            Arrays.sort(player[i].cardonhand);
        }
    }
}
