import java.io.*;
import javax.swing.JOptionPane;
public class Rule {
    ChangeIcon icon = new ChangeIcon();
    private static String oripoint = "";
    private String king = "";private String slave = "";
    private String people = "";private String queen = "";
    private static int round =0;private static int count=0;
    static int match = 0;private int newround =0;
    String pointfortran = "";private static int order=0;
    int countend = 0;
    private boolean checkTrancard = true,checkP=true,checkS=true,checkQ=true,checkK=true;
    public int Rule1(Player player[]){//เชคคนที่มีใบ 3Clubs
        if(match == 0 && count == 0){
            if(player[0].cardonhand[0].equals("01C")){
                round = 0; 
            }else if(player[1].cardonhand[0].equals("01C")){
                round = 1; 
            }else if(player[2].cardonhand[0].equals("01C")){
                round = 2;
            }else if(player[3].cardonhand[0].equals("01C")){
                round = 3;
            } 
            count++;
        }else if(match == 1 && count ==1){
            count++;
            for(int i=0;i<4;i++){
                if(player[i].rank.equals("Slave")){
                    round = i;
                    break;
                }
            }            
        }else{
            round = this.Round();
        }
        return round;
    }
    public boolean RulePlay(String point)throws Exception{
        boolean check = true;
        if( oripoint.equalsIgnoreCase("")){
            if(point.equalsIgnoreCase("skip")){
                JOptionPane.showMessageDialog(null,"เริ่มรอบใหม่ที่คุณ ไม่สามารถ skip ได้","Warning !!!!!",JOptionPane.WARNING_MESSAGE);
            }else{
                switch(point.length()/3){
                    case 1:
                        oripoint = point;
                        check = false;
                        break;
                    case 2:
                        if(point.substring(0,2).equalsIgnoreCase(point.substring(3,5))){
                            oripoint = point;
                            check = false;
                        }
                        break;
                    case 3:
                        if( point.substring(0,2).equalsIgnoreCase(point.substring(3,5)) 
                                && point.substring(0, 2).equalsIgnoreCase(point.substring(6,9))){
                            oripoint = point;
                            check = false;
                        }
                        break;
                    case 4:
                        if( point.substring(0,2).equalsIgnoreCase(point.substring(3,5)) 
                                && point.substring(0, 2).equalsIgnoreCase(point.substring(7,9))
                                && point.substring(0, 2).equalsIgnoreCase(point.substring(9,11))){
                            oripoint = point;
                            check = false;
                        }                    
                        break;
                }
                if(check) JOptionPane.showMessageDialog(null,"คุณลงไพ่ไม่ถูกต้อง","Warning !!!!!",JOptionPane.WARNING_MESSAGE);
            }
        }else if( !point.equalsIgnoreCase("skip") && !point.equalsIgnoreCase("use")){
            switch(oripoint.length()/3){
//=====================Play One Card======================
                case 1:
                        if( point.length()/3 == 1){
                            if(Integer.parseInt(point.substring(0,2)) > Integer.parseInt(oripoint.substring(0,2))){
                                check = false;
                                oripoint = point;
                            }else if(Integer.parseInt(point.substring(0,2)) == Integer.parseInt(oripoint.substring(0,2))){
                                 switch(oripoint.charAt(2)){
                                    case 'C':
                                        if(point.charAt(2) == 'C'){
                                            check=true;
                                        }else if(point.charAt(2) == 'D' || point.charAt(2) == 'H' || point.charAt(2) == 'S'){
                                            check = false;
                                            oripoint = point;
                                        }else check= true;
                                    break;
                                    case 'D':
                                        if(point.charAt(2) == 'C'){
                                            check = true;
                                        }else if(point.charAt(2) == 'H' || point.charAt(2) == 'S'){
                                            check = false;
                                            oripoint = point;
                                        }else check = true;
                                    break;
                                    case 'H':
                                        if(point.charAt(2) == 'C' || point.charAt(2) == 'D'){
                                            check = true;
                                        }else if(point.charAt(2) == 'S'){
                                            check = false;
                                            oripoint = point;
                                        }else check = true;
                                    break;
                                    case 'S':
                                        check = true;
                                    break;
                                    default :
                                        check = true;
                                    break;
                                }
                            }   
                        }else if(point.length()/3 == 3){
                            if(point.substring(0,2).equalsIgnoreCase(point.substring(3,5))&&
                                point.substring(0,2).equalsIgnoreCase(point.substring(6,8))){
                                    check = false;
                                    oripoint = point;
                            }
                        }else check = true;
                break;
//=====================Play Two Card======================
                case 2:
                    if( oripoint.substring(0,2).equalsIgnoreCase(oripoint.substring(3,5)) ){
                        if(point.length()/3 == 2 && point.substring(0,2).equalsIgnoreCase(point.substring(3,5))){
                            if(Integer.parseInt(point.substring(0,2)) > Integer.parseInt(oripoint.substring(0,2))){
                                check = false;
                                oripoint = point;
                            }else if(Integer.parseInt(oripoint.substring(0,2)) == Integer.parseInt(oripoint.substring(0,2))){
                                if(oripoint.charAt(2) == 'S' || oripoint.charAt(5) == 'S'){
                                    check = true;
                                }else if(point.charAt(2) == 'S' || point.charAt(5) == 'S'){
                                    check = false;
                                    oripoint = point;
                                }
                            }else check = true;
                        }else if(point.length()/3 == 4 && point.substring(0,2).equalsIgnoreCase(point.substring(3,5)) &&
                            point.substring(0,2).equalsIgnoreCase(point.substring(6,8)) && 
                            point.substring(0,2).equalsIgnoreCase(point.substring(9,11))){
                            check = false;
                            oripoint = point;
                        }else check = true;
                    }else check = true;
                break;
//=====================Play Three Card====================
                case 3:
                    if(oripoint.length()/3 == 3 
                        && oripoint.substring(0, 2).equalsIgnoreCase(oripoint.substring(3, 5)) 
                        && oripoint.substring(0, 2).equalsIgnoreCase(oripoint.substring(6,8)) ){
                        if(point.substring(0, 2).equalsIgnoreCase(point.substring(3, 5))
                            && point.substring(0, 2).equalsIgnoreCase(point.substring(6, 8))){
                            if(Integer.parseInt(oripoint.substring(0,2)) < Integer.parseInt(point.substring(0, 2))){
                                check = false;
                                oripoint = point;
                            }else check = true;
                        }else check = true;
                    }else check=true;
                break;
//=====================Play Four Card=====================
                case 4:
                    if(oripoint.length()/3 == 4 && 
                        oripoint.substring(0, 2).equalsIgnoreCase(oripoint.substring(3, 5))
                        && oripoint.substring(6,8).equalsIgnoreCase(oripoint.substring(9,11))
                        && oripoint.substring(0, 2).equalsIgnoreCase(oripoint.substring(6,8)) ){
                        if(point.length()/3 == 4 && 
                            point.substring(0, 2).equalsIgnoreCase(point.substring(3, 5))
                            && point.substring(6,8).equalsIgnoreCase(point.substring(9,11))
                            && point.substring(0, 2).equalsIgnoreCase(point.substring(6,8))){
                            if( Integer.parseInt(oripoint.substring(0, 2)) < Integer.parseInt(point.substring(0,2)) ){
                                check = false;
                                oripoint = point;
                            }else check = true;
                        }else check = true;
                    }else check = true;
                break;
//=====================Bug ===============================
                default: check = true;
                    break;
            }
        }else if(point.equalsIgnoreCase("skip")){
            if(point.equalsIgnoreCase("skip")){
                check = false;
            }else check = true;
        }
        if(check && !point.equalsIgnoreCase("skip")) JOptionPane.showMessageDialog(null,"แต้มน้อยกว่า","Warning !!!!!",JOptionPane.WARNING_MESSAGE);
        return check;
    }
    public String getOripoint(){
        return oripoint;
    }
    public void resetpoint(){
        oripoint = "";
    }
    public boolean CheckEnd(Player player[]){
        if(player[0].end + player[1].end + player[2].end + player[3].end >=3){
            return false;
        }else return true;
    }
    public boolean RuleEnd(Player player[]){
        if(player[0].end + player[1].end + player[2].end + player[3].end >=3){
            if(countend == 0){
               JOptionPane.showMessageDialog(null,"เริ่มรอบใหม่");
               player[0].skip =0;player[0].end = 0;player[0].countcard = 13;
               player[1].skip =0;player[1].end = 0;player[1].countcard = 13;
               player[2].skip =0;player[2].end = 0;player[2].countcard = 13;
               player[3].skip =0;player[3].end = 0;player[3].countcard = 13;
               oripoint = "";
               countend++; 
            }else if(countend == 1){
                JOptionPane.showMessageDialog(null,"ขอบคุณ");
                System.exit(0);
            }
            return false;
        }else
            return true;
    }
    public boolean Ruleskip(Player player[]){
        if(player[0].skip + player[1].skip + player[2].skip + player[3].skip == 3){
            oripoint = "";
            return false;
        }else
            return true;
    }
    public int skipround(){
        return 1;
    }
    public void getPointforTran(String point){
        pointfortran = point;
    }
    public void Ruletrancard(Player player[])throws Exception{
        int a=0;
        order = 0;
        for(int i=0;i<4;i++){
            a=0;
            switch(player[i].rank){
                case "King":
                    if(checkK){
                        if(i==0){
                            if(pointfortran.length()/3 == 2){
                                checkK = false;
                                king = pointfortran;
                            }
                            if(!checkK){
                                for(a=0 ;a< 13 ;a++){
                                    if(king.substring(0,3).equals(player[i].cardonhand[a])){
                                        player[i].cardonhand[a] = "";
                                    }else if(king.substring(3,6).equals(player[i].cardonhand[a])){
                                        player[i].cardonhand[a] = "";
                                    }
                                }         
                            }else{
                                JOptionPane.showMessageDialog(null,"คุณเป็น King กรุณาลงไพ่เพื่อแลก");
                                pointfortran = "";
                            }
                        }else{
                            king = player[i].cardonhand[0]+player[i].cardonhand[1];
                            player[i].cardonhand[0] = "";
                            player[i].cardonhand[1] = "";
                            checkK = false;
                        }                        
                    }
                    break;
                case "Queen":
                    if(checkQ){
                        if(i==0){
                            if(pointfortran.length()/3 == 1){
                                checkQ = false;
                                queen = pointfortran;
                            }
                            if(!checkQ){
                                for(a=0 ;a<13;a++){
                                        if(queen.equals(player[i].cardonhand[a])){
                                            player[i].cardonhand[a] = "";
                                            break;
                                        }
                                    }                                
                            }else{
                                JOptionPane.showMessageDialog(null,"คุณเป็น Queen กรุณาลงไพ่เพื่อแลก");
                                pointfortran = "";
                            }                        
                        }else{
                            queen = player[i].cardonhand[0];
                            player[i].cardonhand[0] = "";
                            checkQ = false;
                        }                        
                    }
                    break;
                case "People":
                    if(checkP){
                        people = player[i].cardonhand[12];
                        player[i].cardonhand[12] = "";          
                        checkP = false;
                    }

                    break;
                case "Slave":
                    if(checkS){
                        slave = player[i].cardonhand[11]+ player[i].cardonhand[12];
                        player[i].cardonhand[11] = "";
                        player[i].cardonhand[12] = "";    
                        checkS = false;
                    }
                    break;
            }            
        }
        pointfortran = "";
        if(!(checkK || checkQ || checkP || checkS)){
            for(int i=0;i<4;i++){
                switch(player[i].rank){
                    case "King":
                        a=0;
                        while(!player[i].cardonhand[a].equals("")){
                            a++;
                        }
                        player[i].cardonhand[a] = slave.substring(0,3);
                        a=0;
                        while(!player[i].cardonhand[a].equals("")){
                            a++;
                        }
                        player[i].cardonhand[a] = slave.substring(3);
                        break;
                    case "Queen":
                        a=0;
                        while(!player[i].cardonhand[a].equals("")){
                            a++;
                        }
                        player[i].cardonhand[a] = people;
                        break;
                    case "People":
                        player[i].cardonhand[12] = queen;
                        break;
                    case "Slave":
                        player[i].cardonhand[11] = king.substring(0, 3);
                        player[i].cardonhand[12] = king.substring(3, 6);
                        break;
                }            
            }
            checkTrancard = false;
        }
    }
    public boolean getCheckTrancard(){
        return checkK || checkQ || checkP || checkS;
    }
    public void RuleforEnd(Player player[],int b)throws Exception{
        switch(order){
            case 0:
                if(player[b].rank.equals("none")){//1
                    if( b==0){
                        icon.Audio(3);
                    }                    
                    player[b].rank = "King";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;
                }else if(player[b].rank.equals("King")){//2
                    player[b].rank = "King";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;                    
                }else if(!player[b].rank.equals("King") && !player[b].equals("none")){//3
                    for(int i=0;i<4;i++){
                        if(player[i].rank.equals("Slave")){
                            player[i].rank = "none";
                        }else if(player[i].rank.equals("People")){
                            player[i].rank = "none";
                        }else if(player[i].rank.equals("Queen")){
                            player[i].rank = "none";
                        }
                    }
                    for(int i=0;i<4;i++){
                        if(player[i].rank.equals("King")){
                            if(i==0){
                                JOptionPane.showMessageDialog(null,"คุณโดนล้ม");
                                for(int z=0;z<13;z++){
                                    player[i].cardonhand[z] = "use";
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,i);
                                for(int z=0;z<13;z++){
                                    player[i].cardonhand[z] = "use";
                                }                                
                            }
                            player[i].rank = "Slave";
                            player[i].end = 1;
                            player[i].skip = 1;
                            player[i].countcard = 0;
                        }                        
                    }
                    player[b].rank = "King";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;    
                }//3
                break;
            case 1:
                if(player[b].rank.equals("none")){//1
                    if( b==0){
                        icon.Audio(6);
                    }
                    player[b].rank = "Queen";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;
                }else   if(player[b].rank.equals("Queen")){//2
                    player[b].rank = "Queen";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;
                }else   if(!player[b].rank.equals("Queen") && !player[b].rank.equals("none")){//3
                    for(int i=0;i<4;i++){
                        if(player[i].rank.equals("Queen")){
                            player[i].rank = "none";
                        }
                    }
                    player[b].rank = "Queen";
                    player[b].skip = 1;
                    player[b].end = 1;
                    player[b].countcard = 0;
                }
                break;
            case 2:
                if(player[b].rank.equals("none")){
                    if( b==0){
                        icon.Audio(5);
                    }                    
                    player[b].rank = "People";
                    player[b].skip = 1;
                    player[b].countcard = 0;
                    player[b].end = 1;
                    for(int i=0;i<4;i++){
                        if(player[i].rank.equals("none")){
                            if( i==0){
                                icon.Audio(7);
                            }                            
                            player[i].rank = "Slave";
                            player[i].skip = 1;
                            player[i].countcard = 0;
                            player[i].end = 1;
                        }
                    }
                }
                break;
            case 3:
                if(player[b].rank.equals("none")){
                    player[b].rank = "Slave";
                    player[b].skip = 1;
                    player[b].countcard = 0;
                    player[b].end = 1;
                }
                break;
        }
        order++;
    }
    public void getMatch(){
        match++;
    }
    public int Round(){
        if(round == 3){
            round = 0;
        }else{
            round ++;
        }
        return round;
    }
    public int getRound(int round,Player player[]){
        switch(round){
            case 0:
                if(player[1].CountCard() && player[1].skip != 1){
                    round = 1;
                }else if(player[2].CountCard() && player[2].skip != 1){
                    round = 2;
                }else if(player[3].CountCard() && player[3].skip != 1){
                    round = 3;
                }
                break;
            case 1:
                if(player[2].CountCard() && player[2].skip != 1){
                    round = 2;
                }else if(player[3].CountCard() && player[3].skip != 1){
                    round = 3;
                }else if(player[0].CountCard() && player[0].skip != 1){
                    round = 0;
                }
                break;
            case 2:
                if(player[3].CountCard() && player[3].skip != 1){
                    round = 3;
                }else if(player[0].CountCard() && player[0].skip != 1){
                    round = 0;
                }else if(player[1].CountCard() && player[1].skip != 1){
                    round = 1;
                }
                break;
            case 3:
                if(player[0].CountCard() && player[0].skip != 1){
                    round = 0;
                }else if(player[1].CountCard() && player[1].skip != 1){
                    round = 1;
                }else if(player[2].CountCard() && player[2].skip != 1){
                    round = 2;
                }
                break;
        }
        return round;
    }
    public void setSkip(int newround){
        this.newround = newround;
    }
    public int getSkip(){
        return newround;
    }
    public int RoundforSlave(Player player[]){
        for(int i=0;i<4;i++){
            if(player[i].rank.equals("Slave")){
                round = i;
                break;
            }
        }
        return round;
    }
    public int getround(){
        return round;
    }
    public boolean RulecheckCard(String cardonhand[],String outpoint){
        boolean check = true;int count =0;
        switch(outpoint.length()/3){
            case 1:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equalsIgnoreCase(outpoint)){
                        check = false;
                        break;
                    }
                }
                break;
            case 2:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equalsIgnoreCase(outpoint.substring(0, 3))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(3, 6))){
                        count++;
                    }
                }
                if(count == 2){
                    check = false;
                }
                break;
            case 3:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equalsIgnoreCase(outpoint.substring(0, 3))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(3, 6))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(6, 9))){
                        count++;
                    }
                }
                if(count == 3){
                    check = false;
                }
                break;
            case 4:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equalsIgnoreCase(outpoint.substring(0, 3))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(3, 6))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(6, 9))){
                        count++;
                    }else if(cardonhand[i].equalsIgnoreCase(outpoint.substring(9, 12))){
                        count++;
                    }                    
                }
                if(count == 4){
                    check = false;
                }
                break;
            default:check = true;
                break;
        }
        if(outpoint.equalsIgnoreCase("skip")) check = false;
        if(check) JOptionPane.showMessageDialog(null,"คุณลงไพ่ที่คุณไม่มี","Warning !!!!!",JOptionPane.WARNING_MESSAGE);
        return check;
    }
    public boolean RulecheckCard1(String p){
        boolean check = true;
        switch(p.length()/3){
            case 1:
                check = false;
                break;
            case 2:
                if(p.substring(0, 2).equalsIgnoreCase(p.substring(3, 5))){
                    check = false;
                }else check = true;
                break;
            case 3:
                if(p.substring(0, 2).equalsIgnoreCase(p.substring(3, 5)) &&
                    p.substring(0, 2).equalsIgnoreCase(p.substring(6, 8)) ){
                    check = false;
                }else check = true;
                break;
            case 4:
                if(p.substring(0, 2).equalsIgnoreCase(p.substring(3, 5)) &&
                        p.substring(0, 2).equalsIgnoreCase(p.substring(6, 8)) &&
                        p.substring(0, 2).equalsIgnoreCase(p.substring(9, 11))){
                    check = false;
                }else check = true;
                break;
            default :
                check = true;
                break;
        }
        if(check){
            JOptionPane.showMessageDialog(null,"คุณลงไพ่ไม่ถูกต้อง","Warning !!!!!",JOptionPane.WARNING_MESSAGE);
        }
        return check;
    }
}
