import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Main{
    Card card = new Card();Rule rule = new Rule();
    ChangeIcon icon = new ChangeIcon();
    private String point = "";
    static int round =0;
    int count = 0;
    public String deletePoint(String point,String delete){
        String del[] = new String[4];
        int count = 0;
        String finaldel = "";
        if(point.length()/3 == 1){
            finaldel = "";
        }else if(point.length()/3 == 2){
            del[0] = point.substring(0,3);
            del[1] = point.substring(3,6);
            for(int i=0;i<2;i++){
                if(del[i].equalsIgnoreCase(delete)){
                    del[i] = "";
                }
            }
            finaldel = del[0]+del[1];
        }else if(point.length()/3 == 3){
            del[0] = point.substring(0,3);
            del[1] = point.substring(3,6);
            del[2] = point.substring(6,9);
            for(int i=0;i<3;i++){
                if(del[i].equalsIgnoreCase(delete)){
                    del[i] = "";
                }
            }
            finaldel = del[0]+del[1]+del[2];
        }else if(point.length()/3 == 4){
            del[0] = point.substring(0,3);
            del[1] = point.substring(3,6);
            del[2] = point.substring(6,9);
            del[3] = point.substring(9,12);
            for(int i=0;i<4;i++){
                if(del[i].equalsIgnoreCase(delete)){
                    del[i] = "";
                }
            }
            finaldel = del[0]+del[1]+del[2]+del[3];
        }
        return finaldel;
    }
    public void setPoint(String po){
        point = po;
    }
    public String getPoint(){
        return point;
    }
    boolean check = true;boolean check1 = false;
    public String getround(){
        String text="";
        if(round == 0){
            text = "Player";
        }else if(round == 1){
            text = "BOT 1";
        }else if(round == 2){
            text = "BOT 2";
        }else if(round == 3){
            text ="BOT 3";
        }
        return text;
    }
    public void main(Slave2 slave2){
        try{
            if(check){
                check = false;
                round = rule.Rule1(card.player);
                point = card.player[round].cardonhand[0];
                rule.RulePlay(point);
                card.player[round].setcardused(point);
                JOptionPane.showMessageDialog(null,"เริ่มที่ :"+this.getround());
                round = rule.Round();
            }else if(check1){
                rule.getPointforTran(point);
                rule.Ruletrancard(card.player);
                point ="";
                if(!rule.getCheckTrancard()){
                    check1 =false;
                    JOptionPane.showMessageDialog(null,"เริ่มเกมใหม่ เริ่มที่ Slave");
                    card.Sortcard();
                    round = rule.RoundforSlave(card.player);                   
                }
            }else{ 
                if(!rule.Ruleskip(card.player)){
                    round = rule.getSkip();
                    while(!card.player[round].CountCard()){
                        round = round = rule.getRound(round, card.player);
                    }
                    JOptionPane.showMessageDialog(null,"รีแต้มเริ่มรอบใหม่ที่"+this.getround()); 
                    if(card.player[0].CountCard())card.player[0].skip = 0;
                    if(card.player[1].CountCard())card.player[1].skip = 0;
                    if(card.player[2].CountCard())card.player[2].skip = 0;
                    if(card.player[3].CountCard())card.player[3].skip = 0;                    
                }
                if( card.player[round].CountCard() && card.player[round].skip != 1){
                    if(round == 0){
                        if(point.equalsIgnoreCase(""))
                            JOptionPane.showMessageDialog(null,"ตาคุณกรุณาลงไพ่"); 
                        if(!point.equalsIgnoreCase("")){
                            if(!rule.RulecheckCard(card.player[round].cardonhand, point) && !rule.RulecheckCard1(point))
                                if(!rule.RulePlay(point)){
                                    card.player[0].setcardused(point);
                                    if( !card.player[round].CountCard() ) rule.RuleforEnd(card.player, round);
                                    if( !point.equalsIgnoreCase("skip")){ rule.setSkip(round);
                                        icon.Audio(4);
                                    }
                                    if(rule.getOripoint().length() == 9 || rule.getOripoint().length() == 12){
                                        if(!point.equalsIgnoreCase("skip")){
                                            icon.Audio(2);
                                        }
                                    }
                                    round = rule.getRound(round, card.player);
                                }                       
                        }
                    }else{ 
                        while(rule.Ruleskip(card.player) && round != 0 && rule.CheckEnd(card.player)){
                            if(card.player[round].CountCard() && card.player[round].skip != 1){
                                final JOptionPane optionPane = new JOptionPane(this.getround(), JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
                                final JDialog dialog = new JDialog();
                                dialog.setTitle("Message");
                                dialog.setModal(true);
                                dialog.setContentPane(optionPane);
                                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                                dialog.pack();
                                Timer timer = new Timer(1000, new AbstractAction() {
                                    @Override
                                    public void actionPerformed(ActionEvent ae) {
                                        dialog.dispose();
                                    }
                                });
                                timer.setRepeats(false);
                                timer.start();
                                dialog.setVisible(true);                                
                                point = card.player[round].ProcessBOT(rule.getOripoint());
                                rule.RulePlay(point);
                                card.player[round].setcardused(point);
                                if( !card.player[round].CountCard() ){
                                    rule.RuleforEnd(card.player, round);
                                    JOptionPane.showMessageDialog(null,this.getround()+"ได้เป็น"+card.player[round].rank+"เรียบร้อย");
                                }
                                if( !point.equalsIgnoreCase("skip")) rule.setSkip(round);
                                else JOptionPane.showMessageDialog(null,this.getround()+"หมอบ");
                                if(!rule.Ruleskip(card.player)) break;
                                if(point.length() == 9 || point.length() == 12) icon.Audio(1);
                                round = rule.getRound(round, card.player);  
                                slave2.setOripoint();
                            }else round = rule.getRound(round, card.player);
                        }
                    }                    
                }else round = rule.getRound(round, card.player);
            }
            if( !rule.RuleEnd(card.player) ){
                check1= true;
                card.Dealcard();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex,"Waring !!!!!",JOptionPane.WARNING_MESSAGE);
        }
        point = "";
    }
}

