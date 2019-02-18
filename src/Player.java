public class Player {
    String cardonhand[] = new String[13];
    String rank="none";
    int end=0;//การจบ
    int skip=0;
    int countcard = 13;
    public void setCard(String point){
        switch(point.length()/3){
            case 1:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equals("")){
                        cardonhand[i] = point.substring(0,3);
                        countcard = countcard +1;
                        break;
                    }
                }
                break;
            case 2:
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equals("")){
                        cardonhand[i] = point.substring(0,3);
                        countcard = countcard +1;
                        break;
                    }
                }
                for(int i=0;i<13;i++){
                    if(cardonhand[i].equals("")){
                        cardonhand[i] = point.substring(3,6);
                        countcard = countcard +1;
                        break;
                    }
                }
                break;
        }
    }
    public Player(String card[],int a){
        System.arraycopy(card,a,cardonhand,0, 13);
    }
    public String trancardBOT(){
        String  point ="";
        switch(rank){
            case "King":
                point = cardonhand[0]+cardonhand[1];
                break;
            case "Queen":
                point = cardonhand[0];
                break;
            case "People":
                point = cardonhand[12];
                break;
            case "Slave":
                point = cardonhand[11]+cardonhand[12];
                break;
        }
        return point;
    }
    public String ProcessBOT(String oripoint){
        String point = "";
        if(oripoint.equalsIgnoreCase("")){
            for(int a=0;a<13;a++){
                if(!cardonhand[a].equalsIgnoreCase("use")){
                    point = cardonhand[a];
                    break;
                }
            }
        }else{
            switch(oripoint.length()/3){
//==========================Bot play 1 card=================================================
                case 1:
                    for (int a=0;a<cardonhand.length;a++) {
                        if(!cardonhand[a].equalsIgnoreCase("use")){
                            if(Integer.parseInt(cardonhand[a].substring(0, 2)) == Integer.parseInt(oripoint.substring(0, 2)) ){
                                if(oripoint.charAt(2) == 'C'){
                                    point = cardonhand[a];
//                                    cardonhand[a] = "";
//                                    countcard--;
                                    break;
                                }else if(oripoint.charAt(2) == 'D'){
                                    if(cardonhand[a].charAt(2) == 'H' || cardonhand[a].charAt(2) == 'S' ){
                                        point = cardonhand[a];
//                                        cardonhand[a] = "";
//                                        countcard--;
                                        break;
                                    }
                                }else if(oripoint.charAt(2) == 'H'){
                                    if(cardonhand[a].charAt(2) == 'S'){
                                        point = cardonhand[a];
//                                        cardonhand[a] = "";
//                                        countcard--;
                                        break;
                                    }
                                }
                            }else if( Integer.parseInt(cardonhand[a].substring(0, 2)) > Integer.parseInt(oripoint.substring(0, 2)) ){
                                point = cardonhand[a];
//                                cardonhand[a] = "";
//                                countcard--;
                                break;
                            }else if( Integer.parseInt(cardonhand[a].substring(0, 2)) < Integer.parseInt(oripoint.substring(0, 2)) ){
                                outloop:
                                for(int b=a+1;b<cardonhand.length;b++){
                                    if(!cardonhand[b].equals("use"))
                                        for(int c=a+2;c<cardonhand.length;c++)
                                            if(!cardonhand[c].equals("use")){
                                                if( cardonhand[a].substring(0, 2).equalsIgnoreCase(cardonhand[b].substring(0, 2)) &&
                                                        cardonhand[a].substring(0, 2).equalsIgnoreCase(cardonhand[c].substring(0, 2))){
                                                    if(cardonhand[a].charAt(2) != cardonhand[b].charAt(2) &&
                                                            cardonhand[c].charAt(2) != cardonhand[a].charAt(2) &&
                                                            cardonhand[b].charAt(2) != cardonhand[c].charAt(2)){
                                                        point = cardonhand[a]+cardonhand[b]+cardonhand[c];
//                                                        cardonhand[a] = "";
//                                                        cardonhand[b] = "";
//                                                        cardonhand[c] = "";
//                                                        countcard = countcard - 3;
                                                        break outloop;
                                                    }

                                                }//else point = "skip";
                                            }
                                }if(!point.equals("")) break;
                            }
                        }
                    }if(point.equals("")) {point = "skip";skip=1;}
                    break;
//===========================BOT play 2 cards===========================================
                case 2:
                    outloop:
                    for(int a=0;a<cardonhand.length;a++){
                        if(!cardonhand[a].equals("use"))
                            for(int b=a+1;b<cardonhand.length;b++){
                                if(!cardonhand[b].equals("use"))
                                    if(cardonhand[a].substring(0, 2).equals(cardonhand[b].substring(0, 2))){
                                        if( Integer.parseInt(cardonhand[a].substring(0, 2)) == Integer.parseInt(oripoint.substring(0, 2)) ){
                                            if( cardonhand[a].charAt(2) == 'S' || cardonhand[b].charAt(2) == 'S'){
                                                point = cardonhand[a]+cardonhand[b];
//                                                cardonhand[a] = "";
//                                                cardonhand[b] = "";
//                                                countcard = countcard - 2;
                                                break outloop;
                                            }
                                        }else if( Integer.parseInt(cardonhand[a].substring(0, 2)) > Integer.parseInt(oripoint.substring(0, 2)) ){
                                                point = cardonhand[a]+cardonhand[b];
//                                                cardonhand[a] = "";
//                                                cardonhand[b] = "";
//                                                countcard = countcard - 2;
                                                break outloop;                                        
                                        }else if( Integer.parseInt(cardonhand[a].substring(0, 2)) < Integer.parseInt(oripoint.substring(0, 2)) ){
                                            out1loop:
                                            for(int c=a+2;c<cardonhand.length;c++)
                                                if(!cardonhand[c].equals("use"))
                                                    for(int d=a+3;d<cardonhand.length;d++)
                                                        if(!cardonhand[d].equals("use"))
                                                            if(cardonhand[a].substring(0, 2).equals(cardonhand[b].substring(0, 2)) &&
                                                                   cardonhand[c].substring(0, 2).equals(cardonhand[d].substring(0, 2)) &&
                                                                    cardonhand[a].substring(0, 2).equals(cardonhand[c].substring(0, 2))){
                                                                if(cardonhand[a].charAt(2) != cardonhand[b].charAt(2) &&
                                                                        cardonhand[a].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[a].charAt(2) != cardonhand[d].charAt(2) && 
                                                                       cardonhand[b].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[b].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[b].charAt(2) != cardonhand[d].charAt(2) &&
                                                                        cardonhand[c].charAt(2) != cardonhand[d].charAt(2)) {
                                                                    point = cardonhand[a]+cardonhand[b]+cardonhand[c]+cardonhand[d];
//                                                                    cardonhand[a] = "";
//                                                                    cardonhand[b] = "";
//                                                                    cardonhand[c] = "";
//                                                                    cardonhand[d] = "";
//                                                                    countcard = countcard - 4;
                                                                    break out1loop;
                                                                }
                                                            }
                                    }
                                }if(!point.equals("")) break outloop;
                            }
                    }if(point.equals("")) {point = "skip";skip=1;}
                    break;
//===========================Bot play 3 cards===========================================
                case 3:
                    outloop3:
                    for(int a=0;a<cardonhand.length;a++)
                        if(!cardonhand[a].equals("use"))
                            for(int b=a+1;b<cardonhand.length;b++)
                                if(!cardonhand[b].equals("use"))
                                    for(int c=a+2;c<cardonhand.length;c++)
                                        if(!cardonhand[c].equals("use")){
                                            if(cardonhand[a].substring(0, 2).equals(cardonhand[b].substring(0, 2)) &&
                                                   cardonhand[a].substring(0, 2).equals(cardonhand[c].substring(0, 2)) ){
                                                if(Integer.parseInt(cardonhand[a].substring(0, 2)) > Integer.parseInt(oripoint.substring(0, 2))){
                                                    if(cardonhand[a].charAt(2) != cardonhand[b].charAt(2) &&
                                                            cardonhand[c].charAt(2) != cardonhand[a].charAt(2) &&
                                                            cardonhand[b].charAt(2) != cardonhand[c].charAt(2)){
                                                        point = cardonhand[a]+cardonhand[b]+cardonhand[c];
//                                                        cardonhand[a] = "";
//                                                        cardonhand[b] = "";
//                                                        cardonhand[c] = "";
//                                                        countcard = countcard - 3;
                                                        break outloop3;
                                                    }             

                                                }
                                            }
                                        }if(point.equals("")) {point = "skip";skip=1;}
                    break;
//===========================Bot play 4 cards===========================================
                case 4:
                    outloop4:
                    for(int a=0;a<cardonhand.length;a++)
                        if( !cardonhand[a].equals("use") )
                            for(int b=a+1;b<cardonhand.length;b++)
                                if( !cardonhand[b].equals("use") )
                                    for(int c=a+2;c<cardonhand.length;c++)
                                        if( !cardonhand[c].equals("use") )
                                            for(int d=a+3;a<cardonhand.length;d++)
                                                if(!cardonhand[d].equals("use")){
                                                    if( cardonhand[a].substring(0, 2).equals(cardonhand[b].substring(0, 2)) &&
                                                            cardonhand[c].substring(0, 2).equals(cardonhand[d].substring(0, 2)) &&
                                                            cardonhand[a].substring(0, 2).equals(cardonhand[d].substring(0, 2))){
                                                        if( Integer.parseInt(cardonhand[a].substring(0, 2)) > Integer.parseInt(oripoint.substring(0, 2)) ){
                                                                if(cardonhand[a].charAt(2) != cardonhand[b].charAt(2) &&
                                                                        cardonhand[a].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[a].charAt(2) != cardonhand[d].charAt(2) && 
                                                                        cardonhand[b].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[b].charAt(2) != cardonhand[c].charAt(2) &&
                                                                        cardonhand[b].charAt(2) != cardonhand[d].charAt(2) &&
                                                                        cardonhand[c].charAt(2) != cardonhand[d].charAt(2)) {
                                                                    point = cardonhand[a]+cardonhand[b]+cardonhand[c]+cardonhand[d];
//                                                                    cardonhand[a] = "";
//                                                                    cardonhand[b] = "";
//                                                                    cardonhand[c] = "";
//                                                                    cardonhand[d] = "";
//                                                                    countcard = countcard -4;
                                                                    break outloop4;                                                                    
                                                                }                                                            
                                                        }
                                                    }
                                                }if( point.equals("")){
                                                    point = "skip";
                                                    skip=1;
                                                }
                    break;
            }
        }
        return point;
    }
    public void setcardused(String point){
        if(!point.equals("skip")){
            for(int i=0;i<13;i++){
                switch(point.length()/3){
                    case 1:
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point)) {
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        break;
                    case 2:
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(0, 3))) {
                                cardonhand[a]="use"; 
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(3, 6))) {
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        break;
                    case 3:
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(0, 3))) {
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(3, 6))) {
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(6, 9))){
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        break;
                    case 4:
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(0, 3))) {
                                cardonhand[a]="use"; 
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(3, 6))) {
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(6, 9))){
                                cardonhand[a]="use"; 
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        for(int a=0;a<13;a++){
                            if(cardonhand[a].equals(point.substring(9, 12))){
                                cardonhand[a]="use";
                                countcard = countcard - 1;
                                break;
                            }
                        }
                        break;
                }
            }
        }else if(point.equals("skip")) {skip=1; }   
    }
    public boolean CountCard(){
        if(countcard == 0){
            end= 1;
            skip =1;
            return false;
        }else return true;
    }
    public void ClearStatus(){
        skip =0;
    }
    public void setStatus(){
        skip = 1;
    }
    public void setCardonhand(String card[],int a){
        System.arraycopy(card,a,cardonhand,0, 13);
    }
    public void resetrank(){
        skip = 0;
        end=0;
        countcard = 13;
    }
}
