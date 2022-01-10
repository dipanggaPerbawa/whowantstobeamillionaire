package com.mycompany.howtobeamilioner;

import javax.swing.ImageIcon; 
import java.util.Random;
import java.util.ArrayList;


public class GUI extends javax.swing.JFrame {
    int counter = 1;
    int noSoal;
    Random rand = new Random ();
    bagian1 test = new bagian1();
    bagian2 test2 = new bagian2 ();
    bagian3 test3 = new bagian3 ();
    bagian4 test4 = new bagian4 ();

   
    ArrayList <Integer> sudahDitanya = new ArrayList <Integer>();
    public void CheckSudah (){
    if (counter <= 2){
    int x = rand.nextInt(5);
	while (sudahDitanya.contains(x)){
           x = rand.nextInt(5);
           }
        sudahDitanya.add(x);
        noSoal = x;
    }
    else if (counter == 3){
    sudahDitanya.clear();
    int x = rand.nextInt(5);
	while (sudahDitanya.contains(x)){
           x = rand.nextInt(5);
           }
        sudahDitanya.add(x);
        noSoal = x;
    }
    else if (counter > 3 && counter <= 5){
        int x = rand.nextInt(5);
        while (sudahDitanya.contains(x)){
               x = rand.nextInt(5);
               }
            sudahDitanya.add(x);
            noSoal = x;
    }
    else if (counter == 6){
    sudahDitanya.clear();
    int x = rand.nextInt(5);
	while (sudahDitanya.contains(x)){
           x = rand.nextInt(5);
           }
        sudahDitanya.add(x);
        noSoal = x;
    }
    else if (counter > 6 && counter <= 8){
        int x = rand.nextInt(5);
        while (sudahDitanya.contains(x)){
               x = rand.nextInt(5);
               }
            sudahDitanya.add(x);
            noSoal = x;
    }   
    else if (counter == 9){
        sudahDitanya.clear();
    int x = rand.nextInt(5);
	while (sudahDitanya.contains(x)){
           x = rand.nextInt(5);
           }
        sudahDitanya.add(x);
        noSoal = x;
    }
    else if (counter > 10 && counter <= 12){
        int x = rand.nextInt(5);
        while (sudahDitanya.contains(x)){
               x = rand.nextInt(5);
               }
            sudahDitanya.add(x);
            noSoal = x;
    }   
    }

    public GUI() {
        CheckSudah ();
        test.setAngka (noSoal);
        initComponents();
        setSize(754,457);
    }

     public void pertanyaanSelanjutnya1 (){
        System.out.println("nosoal " + noSoal);
        System.out.println("soal " + sudahDitanya);
        CheckSudah();
        test.setAngka(noSoal);
        counter = counter + 1;
    
        hadiah();
        String a = test.JawabanA();
        A.setText(a);
        String b = test.JawabanB();
        B.setText(b);
        String c = test.JawabanC();
        C.setText(c);
        String d = test.JawabanD();
        D.setText(d);

        String soal = test.getPertanyaan();
        Soal.setText(soal);
        System.out.println(counter);
      
    }

    public void pertanyaanSelanjutnya2 (){  
        System.out.println("nosoal " + noSoal);
        System.out.println("soal " + sudahDitanya);       
        CheckSudah();
        test2.setAngka(noSoal);
        counter = counter + 1;
        
        hadiah();
        String a = test2.JawabanA();
        A.setText(a);
        String b = test2.JawabanB();
        B.setText(b);
        String c = test2.JawabanC();
        C.setText(c);
        String d = test2.JawabanD();
        D.setText(d);

        String soal = test2.getPertanyaan();
        Soal.setText(soal);
        System.out.println(counter);
       
    }

    public void pertanyaanSelanjutnya3 (){
        System.out.println("nosoal " + noSoal);
        System.out.println("soal " + sudahDitanya);
        CheckSudah();
        test3.setAngka(noSoal);
        counter = counter + 1;
        
        hadiah();
        String a = test3.JawabanA();
        A.setText(a);
        String b = test3.JawabanB();
        B.setText(b);
        String c = test3.JawabanC();
        C.setText(c);
        String d = test3.JawabanD();
        D.setText(d);

        String soal = test3.getPertanyaan();
        Soal.setText(soal);
        System.out.println(counter);
        
    }

    public void pertanyaanSelanjutnya4 (){
        System.out.println("nosoal " + noSoal);
        System.out.println("soal " + sudahDitanya);
        CheckSudah();
        test4.setAngka(noSoal);
        counter = counter + 1;
        
        hadiah();
        String a = test4.JawabanA();
        A.setText(a);
        String b = test4.JawabanB();
        B.setText(b);
        String c = test4.JawabanC();
        C.setText(c);
        String d = test4.JawabanD();
        D.setText(d);

        String soal = test4.getPertanyaan();
        Soal.setText(soal);
        System.out.println(counter);
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUang = new javax.swing.JPanel();
        textHadiah = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        MainMenu = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        GAME = new javax.swing.JPanel();
        A = new javax.swing.JButton();
        Soal = new javax.swing.JLabel();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        hasilGame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelHadiah = new javax.swing.JLabel();
        totalHadiah = new javax.swing.JLabel();
        PanelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Who Wants To Be A milioner");
        getContentPane().setLayout(null);

        PanelUang.setBackground(new java.awt.Color(0, 0, 102));

        textHadiah.setBackground(new java.awt.Color(255, 255, 255));
        textHadiah.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelUangLayout = new javax.swing.GroupLayout(PanelUang);
        PanelUang.setLayout(PanelUangLayout);
        PanelUangLayout.setHorizontalGroup(
            PanelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textHadiah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelUangLayout.setVerticalGroup(
            PanelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textHadiah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(PanelUang);
        PanelUang.setBounds(540, 0, 200, 420);

        PanelMenu.setLayout(new java.awt.CardLayout());

        labelMenu.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(0, 0, 204));
        labelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenu.setText("MAIN MENU");

        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        Exit.setText("Exit game");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(187, 187, 187))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        PanelMenu.add(MainMenu, "card2");

        String a = test.JawabanA();
        A.setText(a);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        String soal =  test.getPertanyaan ();
        Soal.setText(soal);
        Soal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Soal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        String b = test.JawabanB();
        B.setText(b);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        String c = test.JawabanC();
        C.setText(c);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        String d = test.JawabanD();
        D.setText(d);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GAMELayout = new javax.swing.GroupLayout(GAME);
        GAME.setLayout(GAMELayout);
        GAMELayout.setHorizontalGroup(
            GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAMELayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Soal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GAMELayout.createSequentialGroup()
                        .addGroup(GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        GAMELayout.setVerticalGroup(
            GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GAMELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Soal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(GAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        PanelMenu.add(GAME, "card3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Anda Berhasil Menyelesaikan Game ini");

        labelHadiah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHadiah.setText("Dengan Total Hadiah Sebesar");

        javax.swing.GroupLayout hasilGameLayout = new javax.swing.GroupLayout(hasilGame);
        hasilGame.setLayout(hasilGameLayout);
        hasilGameLayout.setHorizontalGroup(
            hasilGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilGameLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hasilGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hasilGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalHadiah, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHadiah))
                .addGap(19, 19, 19))
        );
        hasilGameLayout.setVerticalGroup(
            hasilGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilGameLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelHadiah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalHadiah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelMenu.add(hasilGame, "card4");

        getContentPane().add(PanelMenu);
        PanelMenu.setBounds(0, 140, 540, 280);

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );

        getContentPane().add(PanelLogo);
        PanelLogo.setBounds(0, 0, 540, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        if (evt.getSource() == play){
            PanelMenu.removeAll();
            PanelMenu.add(GAME);
            PanelMenu.repaint();
            PanelMenu.revalidate();
            hadiah();
        }
    }//GEN-LAST:event_playActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
           boolean benar1 = test.checkJawaban('A', noSoal);
        boolean benar2 = test2.checkJawaban('A', noSoal);
        boolean benar3 = test3.checkJawaban('A', noSoal);
        boolean benar4 = test4.checkJawaban('A', noSoal);                    
         if (counter <= 2){
            if (benar1 == true){
                pertanyaanSelanjutnya1();
            }
            else if (benar1 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter == 3){
            if (benar1 == true){
                pertanyaanSelanjutnya2();
            }
            else if (benar1 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 2 && counter <= 5){
             if (benar2 == true){
                 pertanyaanSelanjutnya2();
             }
             else if (benar2 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
         else if (counter == 6){
            if (benar2 == true){
                pertanyaanSelanjutnya3();
            }
            else if (benar1 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 6 && counter <= 8){
             if (benar3 == true ){
                pertanyaanSelanjutnya3();
             }
             else if (benar3 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
         else if (counter == 9){
            if (benar3 == true){
                pertanyaanSelanjutnya4();
            }
            else if (benar1 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 9 && counter <= 11){
             if (benar4 == true){
                 pertanyaanSelanjutnya4();
             }
             else if (benar4 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
         else if (counter == 12){
            if (benar4 == true){
                counter = counter + 1;
                hadiah ();
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
            else if (benar4 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
    }//GEN-LAST:event_AActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         if (evt.getSource() == Exit){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        Boolean benar = test.checkJawaban('B', noSoal);
            if (benar == true){
            if (counter <= 3){
            pertanyaanSelanjutnya1();
            }
            else if (counter > 3 && counter <= 6){

            }
            else if (counter > 6 && counter <= 9){

            }       
            }
            else if (benar == false){
                Soal.setText("Anda Kalah");
                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
            }
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        Boolean benar = test.checkJawaban('C', noSoal);           
            if (benar == true){
            if (counter <= 3){
            pertanyaanSelanjutnya1();
            }
            else if (counter > 3 && counter <= 6){

            }
            else if (counter > 6 && counter <= 9){

            }       
            }
            else if (benar == false){
                Soal.setText("Anda Kalah");
                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
            }
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
       Boolean benar = test.checkJawaban('D', noSoal);
            if (benar == true){
            if (counter <= 3){
            pertanyaanSelanjutnya1();
            }
            else if (counter > 3 && counter <= 6){

            }
            else if (counter > 6 && counter <= 9){

            }       
            }
            else if (benar == false){
                Soal.setText("Anda Kalah");
                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
            }
    }//GEN-LAST:event_DActionPerformed

    public void hadiah (){
    String A; 
    switch (counter){
           case 0 :
           A = "Rp.0,00";
           textHadiah.setText(A);
           break;
           case 1 :
           A = "Rp.10.000,00";
           textHadiah.setText(A);
           break;
           case 2 :
           A = "Rp.100.000,00";
           textHadiah.setText(A);
           break;
           case 3 :
           A = "Rp.200.000,00";
           textHadiah.setText(A);
           break;
           case 4 :
           A = "Rp.500.000,00";
           textHadiah.setText(A);
           break;
           case 5 :
           A = "Rp.1.000.000,00";
           textHadiah.setText(A);
           break;
       }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton Exit;
    private javax.swing.JPanel GAME;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelUang;
    private javax.swing.JLabel Soal;
    private javax.swing.JPanel hasilGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHadiah;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JButton play;
    private javax.swing.JLabel textHadiah;
    private javax.swing.JLabel totalHadiah;
    // End of variables declaration//GEN-END:variables
}
