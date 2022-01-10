package graphics;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.util.ArrayList;
import java.util.Random;



public class GraphicalUserInterface extends javax.swing.JFrame {
    int counter = 1;
    int noSoal;
    Stage1 test1 = new Stage1();
    Stage2 test2 = new Stage2 ();
    Stage3 test3 = new Stage3 ();
    Stage4 test4 = new Stage4 ();
    Random rand = new Random ();
    ArrayList <Integer> sudahDitanya = new ArrayList <Integer>();
    
    //Untuk ngambil angka random, buat nomor soal tiap bagian.
    public void GeneratorAngka (){
        if (counter <= 2){ //cek counter (level)
        int x = rand.nextInt(5); //ambil random 0-4 (buat acak soal biar ga sama)
        while (sudahDitanya.contains(x)){
               x = rand.nextInt(5); //kalau udah ditanya, random lagi
               }
            sudahDitanya.add(x); //kalau belum ditanya, no soal yang bakal ditanya masukin ke sudah ditanya
           noSoal = x; //pilih nomor soal dari randoman tadi
        }
        else if (counter == 3){
        sudahDitanya.clear(); //bersihin list yang udah ditanya, masuk ke bagian 2
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
        sudahDitanya.clear(); //bersihin list yang udah ditanya, masuk ke bagian 3
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
            sudahDitanya.clear(); //bersihin list yang udah ditanya, masuk ke bagian 4
        int x = rand.nextInt(5);
        while (sudahDitanya.contains(x)){
               x = rand.nextInt(5);
               }
            sudahDitanya.add(x);
           noSoal = x;
        }
        else if (counter > 9 && counter <= 12){
            int x = rand.nextInt(5);
            while (sudahDitanya.contains(x)){
                   x = rand.nextInt(5);
                   }
                sudahDitanya.add(x);
               noSoal = x;
        }   
        }  

    public GraphicalUserInterface() {
       GeneratorAngka();
        test1.setAngka (noSoal);
        initComponents();
        setSize(754,457);
        setResizable(false);
    }

    public void pertanyaanSelanjutnya1 (){
        //System.out.println("nosoal " + noSoal); //tracking
        //System.out.println("soal " + sudahDitanya); //tracking
        GeneratorAngka(); //jalanin generator angka (buat ambil nomor soal acak yang belum ditanya)
        test1.setAngka(noSoal); //set nomor soal yang udah dirandom 
        counter = counter + 1; //tambahin counter (level)
    
        hadiah(); //tampilin hadiah terkini kalau soalnya bener (lanjut)
        String a = test1.JawabanA(); //ambil jawaban a dari nomor soal (yang udah dirandom)
        A.setText(a); //set text button A jadi pilihan a (bukan 'A') dari nomor soal 
        String b = test1.JawabanB();
        B.setText(b); // B button 
        String c = test1.JawabanC();
        C.setText(c); // C button
        String d = test1.JawabanD();
        D.setText(d); // D button

        String soal = test1.getPertanyaan(); //ambil pertanyaan baru 
        Soal.setHorizontalAlignment(SwingConstants.CENTER); 
        Soal.setVerticalAlignment(SwingConstants.CENTER); 
        Soal.setText(soal); //set txt soal dengan soal selanjutnya
        //System.out.println(counter); //tracking
    }
     
    //sama kayak di atas cuma beda bagian 
    public void pertanyaanSelanjutnya2 (){  
        //System.out.println("nosoal " + noSoal); //tracking
        //System.out.println("soal " + sudahDitanya); //tracking
        GeneratorAngka();
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
        Soal.setHorizontalAlignment(SwingConstants.CENTER);
        Soal.setVerticalAlignment(SwingConstants.CENTER);
        Soal.setText(soal);
        //System.out.println(counter);
       
    }

    //bagian 3
    public void pertanyaanSelanjutnya3 (){
        //System.out.println("nosoal " + noSoal);
        //System.out.println("soal " + sudahDitanya);
       GeneratorAngka();
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
        Soal.setHorizontalAlignment(SwingConstants.CENTER);
        Soal.setVerticalAlignment(SwingConstants.CENTER);
        Soal.setText(soal);
        //System.out.println(counter);
        
    }
    
    //bagian 4
    public void pertanyaanSelanjutnya4 (){
        //System.out.println("nosoal " + noSoal);
        //System.out.println("soal " + sudahDitanya);
        GeneratorAngka();
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
        Soal.setHorizontalAlignment(SwingConstants.CENTER);
        Soal.setVerticalAlignment(SwingConstants.CENTER);
        Soal.setText(soal);
        //System.out.println(counter);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelUang = new javax.swing.JPanel();
        logoHadiah = new javax.swing.JLabel();
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
        labelSelamat = new javax.swing.JLabel();
        labelHadiah = new javax.swing.JLabel();
        totalHadiah = new javax.swing.JLabel();
        PanelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Who Wants To Be A milioner");
        getContentPane().setLayout(null);

        PanelUang.setBackground(new java.awt.Color(0, 0, 102));

        logoHadiah.setBackground(new java.awt.Color(255, 255, 255));
        logoHadiah.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelUangLayout = new javax.swing.GroupLayout(PanelUang);
        PanelUang.setLayout(PanelUangLayout);
        PanelUangLayout.setHorizontalGroup(
            PanelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoHadiah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelUangLayout.setVerticalGroup(
            PanelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoHadiah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        String a = test1.JawabanA();
        A.setText(a);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        String soal =  test1.getPertanyaan ();
        Soal.setHorizontalAlignment(SwingConstants.CENTER);
        Soal.setVerticalAlignment(SwingConstants.CENTER);
        Soal.setText(soal);
        Soal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Soal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        String b = test1.JawabanB();
        B.setText(b);
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        String c = test1.JawabanC();
        C.setText(c);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        String d = test1.JawabanD();
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

        labelSelamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSelamat.setText("Anda Berhasil Menyelesaikan Game ini");

        labelHadiah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHadiah.setText("Dengan Total Hadiah Sebesar");

        javax.swing.GroupLayout hasilGameLayout = new javax.swing.GroupLayout(hasilGame);
        hasilGame.setLayout(hasilGameLayout);
        hasilGameLayout.setHorizontalGroup(
            hasilGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hasilGameLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(labelSelamat, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
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
                .addComponent(labelSelamat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        ImageIcon logo = new ImageIcon(getClass().getResource("header.jpg"));
        labelLogo.setIcon(logo);

        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );

        getContentPane().add(PanelLogo);
        PanelLogo.setBounds(0, 0, 540, 140);

        pack();
    }// </editor-fold>                        
    
    //action mencet 'play'
    private void playActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if (evt.getSource() == play){
            PanelMenu.removeAll();
            PanelMenu.add(GAME);
            PanelMenu.repaint();
            PanelMenu.revalidate();
            hadiah();
        }
    }
    
    //action mencet 'exit'
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if (evt.getSource() == Exit){
            System.exit(0);
        }
    }                                    

    //action tiap pencet button A
    private void AActionPerformed(java.awt.event.ActionEvent evt) {   
         if (counter <= 2){ //cek level dan masuk ke bagian yang mana selanjutnya
            boolean benar1 = test1.checkJawaban('A', noSoal);  //cek jawaban dari bagian 1
            if (benar1 == true){ //cek jawaban bener apa engga
                pertanyaanSelanjutnya1(); //kalau bener, lanjut atur pertanyaan selanjutnya (bagian 1)
            }
            else if (benar1 == false){ //salah, game over
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter == 3){ 
             boolean benar1 = test1.checkJawaban('A', noSoal);
            if (benar1 == true){ //bener
                pertanyaanSelanjutnya2(); //bagian 2
            }
            else if (benar1 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 2 && counter <= 5){
             boolean benar2 = test2.checkJawaban('A', noSoal);
             if (benar2 == true){ //bener
                 pertanyaanSelanjutnya2(); //bagian 2
             }
             else if (benar2 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
         else if (counter == 6){ //ini juga nih, kenapa buat ini? bukannya sama kek yang bawah ??????????????????????
            boolean benar2 = test2.checkJawaban('A', noSoal);
            if (benar2 == true){ //bener
                pertanyaanSelanjutnya3(); //bagian 3
            }
            else if (benar2 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 6 && counter <= 8){
             boolean benar3 = test3.checkJawaban('A', noSoal);
             if (benar3 == true ){ //bener
                pertanyaanSelanjutnya3(); //bagian 3
             }
             else if (benar3 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
         else if (counter == 9){ 
            boolean benar3 = test3.checkJawaban('A', noSoal);
            if (benar3 == true){ //bener
                pertanyaanSelanjutnya4(); //bagian 4
            }
            else if (benar3 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 9 && counter <= 11){
             boolean benar4 = test4.checkJawaban('A', noSoal);
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
             boolean benar4 = test4.checkJawaban('A', noSoal);
             if (benar4 == true){ //bener
                counter = counter + 1;
                hadiah (); //level tertinggi, munculin hadiah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
                labelSelamat.setText("Selamat, Anda Berhasil Memenangkan Game ini"); //munculin teks
            }
            else if (benar4 == false){ //salah
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
    }                                 
    
    //b button
    private void BActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        if (counter <= 2){
            boolean benar1 = test1.checkJawaban('B', noSoal);
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
             boolean benar1 = test1.checkJawaban('B', noSoal);
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
             boolean benar2 = test2.checkJawaban('B', noSoal); 
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
             boolean benar2 = test2.checkJawaban('B', noSoal); 
            if (benar2 == true){
                pertanyaanSelanjutnya3();
            }
            else if (benar2 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 6 && counter <= 8){
             boolean benar3 = test3.checkJawaban('B', noSoal);
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
            boolean benar3 = test3.checkJawaban('B', noSoal);
            if (benar3 == true){
                pertanyaanSelanjutnya4();
            }
            else if (benar3 == false){ 
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 9 && counter <= 11){
            boolean benar4 = test4.checkJawaban('B', noSoal);
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
            boolean benar4 = test4.checkJawaban('B', noSoal);
            if (benar4 == true){
                counter = counter + 1;
                hadiah ();
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
                labelSelamat.setText("Selamat, Anda Berhasil Memenangkan Game ini");
            }
            else if (benar4 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
    }                                 

    //button c
    private void CActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        if (counter <= 2){
            boolean benar1 = test1.checkJawaban('C', noSoal);
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
            boolean benar1 = test1.checkJawaban('C', noSoal);
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
            boolean benar2 = test2.checkJawaban('C', noSoal);
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
            boolean benar2 = test2.checkJawaban('C', noSoal);
            if (benar2 == true){
                pertanyaanSelanjutnya3();
            }
            else if (benar2 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 6 && counter <= 8){
            boolean benar3 = test3.checkJawaban('C', noSoal);
            if (benar3 == true){
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
            boolean benar3 = test3.checkJawaban('C', noSoal);
            if (benar3 == true){
                pertanyaanSelanjutnya4();
            }
            else if (benar3 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 9 && counter <= 11){
            boolean benar4 = test4.checkJawaban('C', noSoal);
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
            boolean benar4 = test4.checkJawaban('C', noSoal);
            if (benar4 == true){
                counter = counter + 1;
                hadiah ();
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
                labelSelamat.setText("Selamat, Anda Berhasil Memenangkan Game ini");
            }
            else if (benar4 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
    }                                 

    //button D
    private void DActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        if (counter <= 2){
            boolean benar1 = test1.checkJawaban('D', noSoal);
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
            boolean benar1 = test1.checkJawaban('D', noSoal);
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
            boolean benar2 = test2.checkJawaban('D', noSoal);
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
            boolean benar2 = test2.checkJawaban('D', noSoal);
            if (benar2 == true){
                pertanyaanSelanjutnya3();
            }
            else if (benar2 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 6 && counter <= 8){
            boolean benar3 = test3.checkJawaban('D', noSoal);
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
            boolean benar3 = test3.checkJawaban('D', noSoal);
            if (benar3 == true){
                pertanyaanSelanjutnya4();
            }
            else if (benar3 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }   
         }
         else if (counter > 9 && counter <= 11){
            boolean benar4 = test4.checkJawaban('D', noSoal);
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
            boolean benar4 = test4.checkJawaban('D', noSoal);
            if (benar4 == true){
                counter = counter + 1;
                hadiah ();
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
                labelSelamat.setText("Selamat, Anda Berhasil Memenangkan Game ini");
            }
            else if (benar4 == false){
                PanelMenu.removeAll();
                PanelMenu.add(hasilGame);
                PanelMenu.repaint();
                PanelMenu.revalidate();
            }
         }
    }                                 

    //tampilkan hadiah
    public void hadiah (){
    String A; 
    switch (counter){ //selesai di level (counter)
           case 1 : 
           ImageIcon uang = new ImageIcon(getClass().getResource("0.jpg"));
           A = "Rp.0,00";
           logoHadiah.setIcon(uang);;
           totalHadiah.setText(A);
           break;
           case 2 : 
           uang = new ImageIcon(getClass().getResource("1.jpg"));
           A = "Rp.100.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 3 :
           uang = new ImageIcon(getClass().getResource("2.jpg"));
           A = "Rp.500.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 4 :
           uang = new ImageIcon(getClass().getResource("3.jpg"));
           A = "Rp.750.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 5 :
           uang = new ImageIcon(getClass().getResource("4.jpg"));
           A = "Rp.1.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 6 :
           uang = new ImageIcon(getClass().getResource("5.jpg"));
           A = "Rp.3.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 7 : 
           uang = new ImageIcon(getClass().getResource("6.jpg"));
           A = "Rp.5.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 8 :
           uang = new ImageIcon(getClass().getResource("7.jpg"));
           A = "Rp.10.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 9 :
           uang = new ImageIcon(getClass().getResource("8.jpg"));
           A = "Rp.15.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 10 :
           uang = new ImageIcon(getClass().getResource("9.jpg"));
           A = "Rp.20.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 11 :
           uang = new ImageIcon(getClass().getResource("10.jpg"));
           A = "Rp.25.000.000,00" ;
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 12 :
           uang = new ImageIcon(getClass().getResource("11.jpg"));
           A = "Rp.50.000.000,00" ;
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
           case 13 :
           uang = new ImageIcon(getClass().getResource("12.jpg"));
           A = "Rp.100.000.000,00";
           logoHadiah.setIcon(uang);
           totalHadiah.setText(A);
           break;
          

       }
       
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new GraphicalUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    private javax.swing.JLabel labelSelamat;
    private javax.swing.JLabel labelHadiah;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JButton play;
    private javax.swing.JLabel logoHadiah;
    private javax.swing.JLabel totalHadiah;
    // End of variables declaration                   
}
