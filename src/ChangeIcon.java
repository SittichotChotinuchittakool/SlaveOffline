import java.io.IOException;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class ChangeIcon {
    ImageIcon a;
    String point="";
    public String roundToname(int b){
        String name="";
        if(b == 0){
            name = "Player";
        }else if(b == 1){
            name = "BOT 1";
        }else if(b == 2){
            name = "BOT 2";
        }else if(b == 3){
            name = "BOT 3";
        }
        return name;
    }
    public String Tranpoint(Icon point){
        int index = point.toString().lastIndexOf('/');
        String name = point.toString().substring(index+1);
        String name1 = name.substring(0,3);
        return name1;
    }
    public ImageIcon Icon(String b){
        switch(b){
//--------------------------------Club
            case "01C" : a= new ImageIcon(getClass().getResource("/Image/01C.jpg"));break;
            case "02C" : a= new ImageIcon(getClass().getResource("/Image/02C.jpg"));break;
            case "03C" : a= new ImageIcon(getClass().getResource("/Image/03C.jpg"));break;
            case "04C" : a= new ImageIcon(getClass().getResource("/Image/04C.jpg"));break;
            case "05C" : a= new ImageIcon(getClass().getResource("/Image/05C.jpg"));break;
            case "06C" : a= new ImageIcon(getClass().getResource("/Image/06C.jpg"));break;
            case "07C" : a= new ImageIcon(getClass().getResource("/Image/07C.jpg"));break;
            case "08C" : a= new ImageIcon(getClass().getResource("/Image/08C.jpg"));break;
            case "09C" : a= new ImageIcon(getClass().getResource("/Image/09C.jpg"));break;
            case "10C" : a= new ImageIcon(getClass().getResource("/Image/10C.jpg"));break;
            case "11C" : a= new ImageIcon(getClass().getResource("/Image/11C.jpg"));break;
            case "12C" : a= new ImageIcon(getClass().getResource("/Image/12C.jpg"));break;
            case "13C" : a= new ImageIcon(getClass().getResource("/Image/13C.jpg"));break;
//---------------------------------Diamonds
            case "01D" : a= new ImageIcon(getClass().getResource("/Image/01D.jpg"));break;
            case "02D" : a= new ImageIcon(getClass().getResource("/Image/02D.jpg"));break;
            case "03D" : a= new ImageIcon(getClass().getResource("/Image/03D.jpg"));break;
            case "04D" : a= new ImageIcon(getClass().getResource("/Image/04D.jpg"));break;
            case "05D" : a= new ImageIcon(getClass().getResource("/Image/05D.jpg"));break;
            case "06D" : a= new ImageIcon(getClass().getResource("/Image/06D.jpg"));break;
            case "07D" : a= new ImageIcon(getClass().getResource("/Image/07D.jpg"));break;
            case "08D" : a= new ImageIcon(getClass().getResource("/Image/08D.jpg"));break;
            case "09D" : a= new ImageIcon(getClass().getResource("/Image/09D.jpg"));break;
            case "10D" : a= new ImageIcon(getClass().getResource("/Image/10D.jpg"));break;
            case "11D" : a= new ImageIcon(getClass().getResource("/Image/11D.jpg"));break;
            case "12D" : a= new ImageIcon(getClass().getResource("/Image/12D.jpg"));break;
            case "13D" : a= new ImageIcon(getClass().getResource("/Image/13D.jpg"));break;
//---------------------------------Hearts
            case "01H" : a= new ImageIcon(getClass().getResource("/Image/01H.jpg"));break;
            case "02H" : a= new ImageIcon(getClass().getResource("/Image/02H.jpg"));break;
            case "03H" : a= new ImageIcon(getClass().getResource("/Image/03H.jpg"));break;
            case "04H" : a= new ImageIcon(getClass().getResource("/Image/04H.jpg"));break;
            case "05H" : a= new ImageIcon(getClass().getResource("/Image/05H.jpg"));break;
            case "06H" : a= new ImageIcon(getClass().getResource("/Image/06H.jpg"));break;
            case "07H" : a= new ImageIcon(getClass().getResource("/Image/07H.jpg"));break;
            case "08H" : a= new ImageIcon(getClass().getResource("/Image/08H.jpg"));break;
            case "09H" : a= new ImageIcon(getClass().getResource("/Image/09H.jpg"));break;
            case "10H" : a= new ImageIcon(getClass().getResource("/Image/10H.jpg"));break;
            case "11H" : a= new ImageIcon(getClass().getResource("/Image/11H.jpg"));break;
            case "12H" : a= new ImageIcon(getClass().getResource("/Image/12H.jpg"));break;
            case "13H" : a= new ImageIcon(getClass().getResource("/Image/13H.jpg"));break;
//----------------------------------Spades
            case "01S" : a= new ImageIcon(getClass().getResource("/Image/01S.jpg"));break;
            case "02S" : a= new ImageIcon(getClass().getResource("/Image/02S.jpg"));break;
            case "03S" : a= new ImageIcon(getClass().getResource("/Image/03S.jpg"));break;
            case "04S" : a= new ImageIcon(getClass().getResource("/Image/04S.jpg"));break;
            case "05S" : a= new ImageIcon(getClass().getResource("/Image/05S.jpg"));break;
            case "06S" : a= new ImageIcon(getClass().getResource("/Image/06S.jpg"));break;
            case "07S" : a= new ImageIcon(getClass().getResource("/Image/07S.jpg"));break;
            case "08S" : a= new ImageIcon(getClass().getResource("/Image/08S.jpg"));break;
            case "09S" : a= new ImageIcon(getClass().getResource("/Image/09S.jpg"));break;
            case "10S" : a= new ImageIcon(getClass().getResource("/Image/10S.jpg"));break;
            case "11S" : a= new ImageIcon(getClass().getResource("/Image/11S.jpg"));break;
            case "12S" : a= new ImageIcon(getClass().getResource("/Image/12S.jpg"));break;
            case "13S" : a= new ImageIcon(getClass().getResource("/Image/13S.jpg"));break;
            default : a= new ImageIcon(getClass().getResource("/Image/use.jpg"));break;
        }
        return a;
    }
    int audio1=0,audio2=0,audio3=0,audio4=0,audio5=0,audio6=0,audio7=0,audio8=0;
    public void resetAudio(){
        audio1=0;
        audio2=0;
        audio3=0;
        audio4=0;
        audio5=0;
        audio6=0;
        audio7=0;
        audio8=0;
    }
    int count =0;
    InputStream b = getClass().getResourceAsStream("/audio/background.wav");;
    AudioStream sb;
    public void Soundback(){
        try{
            sb = new AudioStream(b);
                AudioPlayer.player.start(sb);
        }catch(Exception ex){
        }
    }
    public void Stopsound(){
        AudioPlayer.player.stop(sb);
    }
    public void Audio(int i){
        InputStream a;
        AudioStream audio;
        try{
            switch(i){
                case 1:
                    if(audio1 == 0){
                        audio1++;
                        a = getClass().getResourceAsStream("/audio/card3.wav");
                        audio = new AudioStream(a);
                        AudioPlayer.player.start(audio);                 
                    }
                    break;   
                case 2:
                    a = getClass().getResourceAsStream("/audio/fight3card.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 3:
                    a = getClass().getResourceAsStream("/audio/king.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 4:
                    a = getClass().getResourceAsStream("/audio/outcard.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 5:
                    a = getClass().getResourceAsStream("/audio/people.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 6:
                    a = getClass().getResourceAsStream("/audio/queen.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 7:
                    a = getClass().getResourceAsStream("/audio/slave.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
                case 8:
                    a = getClass().getResourceAsStream("/audio/startegame.wav");
                    audio = new AudioStream(a);
                    AudioPlayer.player.start(audio);                    
                    break;
            }
        }catch(Exception e){            
        }
    }
    public ImageIcon Rank(String rank){
        switch(rank){
            case "King": a= new ImageIcon(getClass().getResource("/Image/king.png"));break;
            case "Slave": a= new ImageIcon(getClass().getResource("/Image/slave.png"));break;
            case "none": a= null;break;
            case "Queen": a= new ImageIcon(getClass().getResource("/Image/queen.png"));break;
            case "People": a= new ImageIcon(getClass().getResource("/Image/people.png"));break;
        }
        return a;
    }
    public String getNamepoint(String point,int i){
        String name = "";
        switch(point.length()/3){
            case 1:
                if(i==1){
                    name = point;
                }else name = "use";
                break;
            case 2:
                if(i == 1){
                    name = point.substring(0, 3);
                }else if(i == 2){
                    name = point.substring(3, 6);
                }else name = "use";
                break;
            case 3:
                if(i == 1){
                    name = point.substring(0, 3);
                }else if(i == 2){
                    name = point.substring(3, 6);
                }else if(i == 3){
                    name = point.substring(6, 9);
                }else name = "use";
                break;
            case 4:
                if(i == 1){
                    name = point.substring(0, 3);
                }else if(i == 2){
                    name = point.substring(3, 6);
                }else if(i == 3){
                    name = point.substring(6, 9);
                }else if(i == 4){
                    name = point.substring(9, 12);
                }
                break;
        }
        return name;
    }
    public ImageIcon Tutorial(int i){
        switch(i){
            case 0:
                a= new ImageIcon(getClass().getResource("/Tutorial/t0.gif"));
                break;
            case 1:
                a= new ImageIcon(getClass().getResource("/Tutorial/t1.gif"));
                break;
            case 2:
                a= new ImageIcon(getClass().getResource("/Tutorial/t2.gif"));
                break;
            case 3:
                a= new ImageIcon(getClass().getResource("/Tutorial/t3.gif"));
                break;
        }
        return a;
    }
}
