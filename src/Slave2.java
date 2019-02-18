import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Slave2 extends javax.swing.JFrame {
    public Slave2() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picbot1 = new javax.swing.JLabel();
        picbot2 = new javax.swing.JLabel();
        picbot3 = new javax.swing.JLabel();
        namebot2 = new javax.swing.JLabel();
        pointtable1 = new javax.swing.JLabel();
        pointtable2 = new javax.swing.JLabel();
        pointtable4 = new javax.swing.JLabel();
        pointtable3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bcard1 = new javax.swing.JButton();
        bcard2 = new javax.swing.JButton();
        bcard3 = new javax.swing.JButton();
        bcard4 = new javax.swing.JButton();
        bcard5 = new javax.swing.JButton();
        bcard6 = new javax.swing.JButton();
        bcard7 = new javax.swing.JButton();
        bcard8 = new javax.swing.JButton();
        bcard9 = new javax.swing.JButton();
        bcard10 = new javax.swing.JButton();
        bcard11 = new javax.swing.JButton();
        bcard12 = new javax.swing.JButton();
        bcard13 = new javax.swing.JButton();
        rankbot1 = new javax.swing.JLabel();
        rankbot2 = new javax.swing.JLabel();
        rankbot3 = new javax.swing.JLabel();
        rankplayer = new javax.swing.JLabel();
        namebot1 = new javax.swing.JLabel();
        namebot3 = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setMaximumSize(new java.awt.Dimension(1150, 500));
        setMinimumSize(new java.awt.Dimension(1150, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1150, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picbot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picbot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bot1.gif"))); // NOI18N
        getContentPane().add(picbot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, -1));

        picbot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picbot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bot2.gif"))); // NOI18N
        getContentPane().add(picbot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 130, -1));

        picbot3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picbot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bot3.gif"))); // NOI18N
        getContentPane().add(picbot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 130, 147));

        namebot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbot2.gif"))); // NOI18N
        getContentPane().add(namebot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 130, 27));

        pointtable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/use.jpg"))); // NOI18N
        pointtable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pointtable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        pointtable2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/use.jpg"))); // NOI18N
        pointtable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pointtable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        pointtable4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/use.jpg"))); // NOI18N
        pointtable4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pointtable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        pointtable3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/use.jpg"))); // NOI18N
        pointtable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(pointtable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        jButton3.setText("เริ่มเกม");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, 70, 60));

        jButton2.setText("Skip");
        jButton2.setToolTipText("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, 70, 60));

        bcard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard1.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard1.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard1MouseClicked(evt);
            }
        });
        getContentPane().add(bcard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 50, 60));

        bcard2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard2.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard2.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard2MouseClicked(evt);
            }
        });
        getContentPane().add(bcard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 50, 60));

        bcard3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard3.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard3.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard3MouseClicked(evt);
            }
        });
        getContentPane().add(bcard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 50, 60));

        bcard4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard4.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard4.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard4MouseClicked(evt);
            }
        });
        getContentPane().add(bcard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 50, 60));

        bcard5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard5.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard5.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard5MouseClicked(evt);
            }
        });
        getContentPane().add(bcard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 50, 60));

        bcard6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard6.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard6.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard6MouseClicked(evt);
            }
        });
        getContentPane().add(bcard6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 50, 60));

        bcard7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard7.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard7.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard7MouseClicked(evt);
            }
        });
        getContentPane().add(bcard7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 50, 60));

        bcard8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard8.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard8.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard8MouseClicked(evt);
            }
        });
        getContentPane().add(bcard8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 50, 60));

        bcard9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard9.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard9.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard9MouseClicked(evt);
            }
        });
        getContentPane().add(bcard9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 50, 60));

        bcard10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard10.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard10.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard10MouseClicked(evt);
            }
        });
        getContentPane().add(bcard10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 50, 60));

        bcard11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard11.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard11.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard11MouseClicked(evt);
            }
        });
        getContentPane().add(bcard11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 50, 60));

        bcard12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard12.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard12.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard12MouseClicked(evt);
            }
        });
        getContentPane().add(bcard12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 50, 60));

        bcard13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        bcard13.setMaximumSize(new java.awt.Dimension(52, 66));
        bcard13.setMinimumSize(new java.awt.Dimension(52, 66));
        bcard13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcard13MouseClicked(evt);
            }
        });
        getContentPane().add(bcard13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 50, 60));
        getContentPane().add(rankbot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 140, 50));
        getContentPane().add(rankbot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 140, 50));
        getContentPane().add(rankbot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 140, 50));
        getContentPane().add(rankplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 140, 50));

        namebot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbot1.gif"))); // NOI18N
        getContentPane().add(namebot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 27));

        namebot3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playbot3.gif"))); // NOI18N
        getContentPane().add(namebot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 130, 27));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.gif"))); // NOI18N
        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int count = 0;
    public void setLabel(){
        this.bcard1.setIcon(icon.Icon(t.card.player[0].cardonhand[0]));
        this.bcard2.setIcon(icon.Icon(t.card.player[0].cardonhand[1]));
        this.bcard3.setIcon(icon.Icon(t.card.player[0].cardonhand[2]));
        this.bcard4.setIcon(icon.Icon(t.card.player[0].cardonhand[3]));
        this.bcard5.setIcon(icon.Icon(t.card.player[0].cardonhand[4]));
        this.bcard6.setIcon(icon.Icon(t.card.player[0].cardonhand[5]));
        this.bcard7.setIcon(icon.Icon(t.card.player[0].cardonhand[6]));
        this.bcard8.setIcon(icon.Icon(t.card.player[0].cardonhand[7]));
        this.bcard9.setIcon(icon.Icon(t.card.player[0].cardonhand[8]));
        this.bcard10.setIcon(icon.Icon(t.card.player[0].cardonhand[9]));
        this.bcard11.setIcon(icon.Icon(t.card.player[0].cardonhand[10]));
        this.bcard12.setIcon(icon.Icon(t.card.player[0].cardonhand[11]));
        this.bcard13.setIcon(icon.Icon(t.card.player[0].cardonhand[12]));        
    }
    public void setrank(){
        this.rankbot1.setIcon(icon.Rank(t.card.player[1].rank));
        this.rankbot2.setIcon(icon.Rank(t.card.player[2].rank));
        this.rankbot3.setIcon(icon.Rank(t.card.player[3].rank));
        this.rankplayer.setIcon(icon.Rank(t.card.player[0].rank));
    }
    public void setLineBorder(){
        this.bcard1.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard2.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard3.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard4.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard5.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard6.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard7.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard8.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard9.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard10.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard11.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard12.setBorder(new LineBorder(Color.BLACK,3));
        this.bcard13.setBorder(new LineBorder(Color.BLACK,3));
    }
    public void setOripoint(){
        this.pointtable1.setIcon(icon.Icon(icon.getNamepoint(t.rule.getOripoint(),1)));
        this.pointtable2.setIcon(icon.Icon(icon.getNamepoint(t.rule.getOripoint(),2)));
        this.pointtable3.setIcon(icon.Icon(icon.getNamepoint(t.rule.getOripoint(),3)));
        this.pointtable4.setIcon(icon.Icon(icon.getNamepoint(t.rule.getOripoint(),4)));
    }
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        t.setPoint(point);
        this.setLabel();
        if( count == 0){
            this.jButton3.setText("ถัดไป");
            count ++;
        }
        t.main(this);
        this.setrank();
        this.setLabel();
        this.setOripoint();
        this.setCountCard();
        point = "";
        this.setLineBorder();
    }//GEN-LAST:event_jButton3MouseClicked
    String point = "";
    public void setCountCard(){
        countC1=true;
        countC2=true;
        countC3=true;
        countC4=true;
        countC5=true;
        countC6=true;
        countC7=true;
        countC8=true;
        countC9=true;
        countC10=true;
        countC11=true;
        countC12=true;
        countC13=true;
    }
    boolean countC1=true,countC2=true,countC3=true,countC4=true,countC5=true,countC6=true,countC7=true,
            countC8=true,countC9=true,countC10=true,countC11=true,countC12=true,countC13=true;
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        point = "skip";
        t.setPoint(point);
    }//GEN-LAST:event_jButton2MouseClicked

    private void bcard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard1MouseClicked
        if(countC1 && !icon.Tranpoint(this.bcard1.getIcon()).equalsIgnoreCase("use") ){
            this.bcard1.setBorder(new LineBorder(Color.GREEN,3));
            countC1 = false;
            point+=icon.Tranpoint(this.bcard1.getIcon());
        }else if(!countC1 && !icon.Tranpoint(this.bcard1.getIcon()).equalsIgnoreCase("use") ){
            this.bcard1.setBorder(new LineBorder(Color.BLACK,3));
            countC1 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard1.getIcon()));
        }
    }//GEN-LAST:event_bcard1MouseClicked

    private void bcard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard2MouseClicked
        if(countC2 && !icon.Tranpoint(this.bcard2.getIcon()).equalsIgnoreCase("use") ){
            this.bcard2.setBorder(new LineBorder(Color.GREEN,3));
            countC2 = false;
            point+=icon.Tranpoint(this.bcard2.getIcon());
        }else if(!countC2 && !icon.Tranpoint(this.bcard2.getIcon()).equalsIgnoreCase("use") ){
            this.bcard2.setBorder(new LineBorder(Color.BLACK,3));
            countC2 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard2.getIcon()));
        }
    }//GEN-LAST:event_bcard2MouseClicked

    private void bcard3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard3MouseClicked
        if(countC3 && !icon.Tranpoint(this.bcard3.getIcon()).equalsIgnoreCase("use") ){
            this.bcard3.setBorder(new LineBorder(Color.GREEN,3));
            countC3 = false;
            point+=icon.Tranpoint(this.bcard3.getIcon());
        }else if(!countC3 && !icon.Tranpoint(this.bcard3.getIcon()).equalsIgnoreCase("use") ){
            this.bcard3.setBorder(new LineBorder(Color.BLACK,3));
            countC3 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard3.getIcon()));
        }
    }//GEN-LAST:event_bcard3MouseClicked

    private void bcard4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard4MouseClicked
        if(countC4 && !icon.Tranpoint(this.bcard4.getIcon()).equalsIgnoreCase("use") ){
            this.bcard4.setBorder(new LineBorder(Color.GREEN,3));
            countC4 = false;
            point+=icon.Tranpoint(this.bcard4.getIcon());
        }else if(!countC4 && !icon.Tranpoint(this.bcard4.getIcon()).equalsIgnoreCase("use") ){
            this.bcard4.setBorder(new LineBorder(Color.BLACK,3));
            countC4 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard4.getIcon()));
        }
    }//GEN-LAST:event_bcard4MouseClicked

    private void bcard5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard5MouseClicked
        if(countC5 && !icon.Tranpoint(this.bcard5.getIcon()).equalsIgnoreCase("use") ){
            this.bcard5.setBorder(new LineBorder(Color.GREEN,3));
            countC5 = false;
            point+=icon.Tranpoint(this.bcard5.getIcon());
        }else if(!countC5 && !icon.Tranpoint(this.bcard5.getIcon()).equalsIgnoreCase("use") ){
            this.bcard5.setBorder(new LineBorder(Color.BLACK,3));
            countC5 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard5.getIcon()));
        }
    }//GEN-LAST:event_bcard5MouseClicked

    private void bcard6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard6MouseClicked
        if(countC6 && !icon.Tranpoint(this.bcard6.getIcon()).equalsIgnoreCase("use") ){
            this.bcard6.setBorder(new LineBorder(Color.GREEN,3));
            countC6 = false;
            point+=icon.Tranpoint(this.bcard6.getIcon());
        }else if(!countC6 && !icon.Tranpoint(this.bcard6.getIcon()).equalsIgnoreCase("use") ){
            this.bcard6.setBorder(new LineBorder(Color.BLACK,3));
            countC6 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard6.getIcon()));
        }
    }//GEN-LAST:event_bcard6MouseClicked

    private void bcard7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard7MouseClicked
        if(countC7 && !icon.Tranpoint(this.bcard7.getIcon()).equalsIgnoreCase("use") ){
            this.bcard7.setBorder(new LineBorder(Color.GREEN,3));
            countC7 = false;
            point+=icon.Tranpoint(this.bcard7.getIcon());
        }else if(!countC7 && !icon.Tranpoint(this.bcard7.getIcon()).equalsIgnoreCase("use") ){
            this.bcard7.setBorder(new LineBorder(Color.BLACK,3));
            countC7 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard7.getIcon()));
        }
    }//GEN-LAST:event_bcard7MouseClicked

    private void bcard8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard8MouseClicked
        if(countC8 && !icon.Tranpoint(this.bcard8.getIcon()).equalsIgnoreCase("use") ){
            this.bcard8.setBorder(new LineBorder(Color.GREEN,3));
            countC8 = false;
            point+=icon.Tranpoint(this.bcard8.getIcon());
        }else if(!countC8 && !icon.Tranpoint(this.bcard8.getIcon()).equalsIgnoreCase("use") ){
            this.bcard8.setBorder(new LineBorder(Color.BLACK,3));
            countC8 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard8.getIcon()));
        }
    }//GEN-LAST:event_bcard8MouseClicked

    private void bcard9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard9MouseClicked
        if(countC9 && !icon.Tranpoint(this.bcard9.getIcon()).equalsIgnoreCase("use") ){
            this.bcard9.setBorder(new LineBorder(Color.GREEN,3));
            countC9 = false;
            point+=icon.Tranpoint(this.bcard9.getIcon());
        }else if(!countC9 && !icon.Tranpoint(this.bcard9.getIcon()).equalsIgnoreCase("use")){
            this.bcard9.setBorder(new LineBorder(Color.BLACK,3));
            countC9 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard9.getIcon()));
        }
    }//GEN-LAST:event_bcard9MouseClicked

    private void bcard10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard10MouseClicked
        if(countC10 && !icon.Tranpoint(this.bcard10.getIcon()).equalsIgnoreCase("use") ){
            this.bcard10.setBorder(new LineBorder(Color.GREEN,3));
            countC10 = false;
            point+=icon.Tranpoint(this.bcard10.getIcon());
        }else if(!countC10 && !icon.Tranpoint(this.bcard10.getIcon()).equalsIgnoreCase("use") ){
            this.bcard10.setBorder(new LineBorder(Color.BLACK,3));
            countC10 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard10.getIcon()));
        }
    }//GEN-LAST:event_bcard10MouseClicked

    private void bcard11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard11MouseClicked
        if(countC11 && !icon.Tranpoint(this.bcard11.getIcon()).equalsIgnoreCase("use") ){
            this.bcard11.setBorder(new LineBorder(Color.GREEN,3));
            countC11 = false;
            point+=icon.Tranpoint(this.bcard11.getIcon());
        }else if(!countC11  && !icon.Tranpoint(this.bcard11.getIcon()).equalsIgnoreCase("use")){
            this.bcard11.setBorder(new LineBorder(Color.BLACK,3));
            countC11 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard11.getIcon()));
        }
    }//GEN-LAST:event_bcard11MouseClicked

    private void bcard12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard12MouseClicked
        if(countC12 && !icon.Tranpoint(this.bcard12.getIcon()).equalsIgnoreCase("use")){
            this.bcard12.setBorder(new LineBorder(Color.GREEN,3));
            countC12 = false;
            point+=icon.Tranpoint(this.bcard12.getIcon());
        }else if(!countC12 && !icon.Tranpoint(this.bcard12.getIcon()).equalsIgnoreCase("use") ){
            this.bcard12.setBorder(new LineBorder(Color.BLACK,3));
            countC12 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard12.getIcon()));
        }
    }//GEN-LAST:event_bcard12MouseClicked

    private void bcard13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcard13MouseClicked
        if(countC13  && !icon.Tranpoint(this.bcard13.getIcon()).equalsIgnoreCase("use")){
            this.bcard13.setBorder(new LineBorder(Color.GREEN,3));
            countC13 = false;
            point+=icon.Tranpoint(this.bcard13.getIcon());
        }else if(!countC13 && !icon.Tranpoint(this.bcard13.getIcon()).equalsIgnoreCase("use") ){
            this.bcard13.setBorder(new LineBorder(Color.BLACK,3));
            countC13 = true;
            point = t.deletePoint(point,icon.Tranpoint(this.bcard13.getIcon()));
        }
    }//GEN-LAST:event_bcard13MouseClicked

    Main t = new Main();ChangeIcon icon = new ChangeIcon();
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Slave2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slave2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slave2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slave2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slave2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton bcard1;
    private javax.swing.JButton bcard10;
    private javax.swing.JButton bcard11;
    private javax.swing.JButton bcard12;
    private javax.swing.JButton bcard13;
    private javax.swing.JButton bcard2;
    private javax.swing.JButton bcard3;
    private javax.swing.JButton bcard4;
    private javax.swing.JButton bcard5;
    private javax.swing.JButton bcard6;
    private javax.swing.JButton bcard7;
    private javax.swing.JButton bcard8;
    private javax.swing.JButton bcard9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel namebot1;
    private javax.swing.JLabel namebot2;
    private javax.swing.JLabel namebot3;
    private javax.swing.JLabel picbot1;
    private javax.swing.JLabel picbot2;
    private javax.swing.JLabel picbot3;
    private javax.swing.JLabel pointtable1;
    private javax.swing.JLabel pointtable2;
    private javax.swing.JLabel pointtable3;
    private javax.swing.JLabel pointtable4;
    private javax.swing.JLabel rankbot1;
    private javax.swing.JLabel rankbot2;
    private javax.swing.JLabel rankbot3;
    private javax.swing.JLabel rankplayer;
    // End of variables declaration//GEN-END:variables

}
