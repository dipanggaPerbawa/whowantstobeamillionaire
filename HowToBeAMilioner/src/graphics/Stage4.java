package graphics;

class Stage4 extends Pertanyaan {
    String [] Question = {
        "Hewan vertebrata yang tidak termasuk kelas mamalia adalah...", //Kuda Laut
        "Pengarang lagu wajib Bagimu negeri", //R. Kusbini
        "Alat pencatat gempa adalah...", //Seismograf
        "Pembuatan kalender Masehi berdasar atas perputaran?", //Bumi dan Matahari
        "Ibu kota negara Madagaskar adalah?", //Antananarivo
    };
    
    String [] jawaban1 = {
        "Kuda Laut", //bener
        "W.R. Supratman",
        "Seismograph",
        "Bulan pada Bumi",
        "Antananarivo", //bener
    };

    String [] jawaban2 = {
        "Anjing Laut",
        "Cornel Simajuntak",
        "Seismograf", //bener
        "Bulan pada Matahari",
        "Tripoli",
    };

    String [] jawaban3 = {
        "Salamander",
        "R. Kusbini", //bener
        "Seistmograph",
        "Bumi pada Bulan",
        "Abuja",
    };

    String [] jawaban4 = {
        "Cicak",
        "R. Soerardjo",
        "Seismografik",
        "Bumi pada Matahari", //bener
        "Mogadishu",

    };

    @Override
    public void setAngka(int noSoal){
        pilihSoal = noSoal; 
    }

    @Override
    public String getPertanyaan(){
        return Question [pilihSoal];
    }
    
    
    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [pilihSoal];
        return jawaban;
    }

    public String JawabanB (){
        String jawaban;
        jawaban = jawaban2 [pilihSoal];
        return jawaban;
    }

    public String JawabanC (){
        String jawaban;
        jawaban = jawaban3 [pilihSoal];
        return jawaban;
    }

    public String JawabanD (){
        String jawaban;
        jawaban = jawaban4 [pilihSoal];
        return jawaban;
    }


    @Override
    public boolean checkJawaban (char jawaban, int noSoal){
        if (jawaban == 'A'){
            if (noSoal == 0){
                jawabanBenar = true;
            }
            else if (noSoal == 1){
                jawabanBenar = false;
            }
            else if (noSoal == 2){
                jawabanBenar = false;
            }
            else if (noSoal == 3){
                jawabanBenar = false;
            }
            else if (noSoal == 4){
                jawabanBenar = true;
            }
        }
        else if (jawaban == 'B'){
            if (noSoal == 0){
                jawabanBenar = false;
            }
            else if (noSoal == 1){
                jawabanBenar = false;              
            }
            else if (noSoal == 2){
                jawabanBenar = true;               
            }
            else if (noSoal == 3){
                jawabanBenar = false;               
            }
            else if (noSoal == 4){
                jawabanBenar = false;              
            }
        }

        else if (jawaban == 'C'){
            if (noSoal == 0){
                jawabanBenar = false;               
            }
            else if (noSoal == 1){
                jawabanBenar = true;              
            }
            else if (noSoal == 2){
                jawabanBenar = false;              
            }
            else if (noSoal == 3){
                jawabanBenar = false;             
            }
            else if (noSoal == 4){
                jawabanBenar = false;               
            }
            }

        else if (jawaban == 'D'){
                if (noSoal == 0){
                    jawabanBenar = false;                  
                }
                else if (noSoal == 1){
                    jawabanBenar = false;                   
                }
                else if (noSoal == 2){
                    jawabanBenar = false;                   
                }
                else if (noSoal == 3){
                    jawabanBenar = true;                   
                }
                else if (noSoal == 4){
                    jawabanBenar = false;                  
                }
            }
        return jawabanBenar;
    }
}