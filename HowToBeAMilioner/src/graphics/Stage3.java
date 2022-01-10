
package graphics;

class Stage3 extends Pertanyaan {
    String [] Question = {
        "Energi yang dihasilkan oleh kecepatan disebut?", //Energi Kinetik
        "Perpindahan penduduk antar wilayah disebut?", //Migrasi
        "Pimpinan daerah tingkat 2 adalah...", //Bupati
        "Rumus molekul 'Etana' adalah...", //C2H6
        "Besar kecilnya arus listrik dapat dinyatakan dengan satuan?", //Ampere
    };

    String [] jawaban1 = {
        "Energi Potensial",
        "Migrasi", //bener
        "Gubernur",
        "CH2O6",
        "Ohm",    
    };

    String [] jawaban2 = {
        "Percepatan",
        "Urbanisasi",
        "Kepala Daerah",
        "C4H8",
        "Ampere", //bener    
    };

    String [] jawaban3 = {
        "Energi Kinetik", //bener
        "Erosi",
        "Wali Kota",
        "C2H6", //bener
        "Volt",
    };

    String [] jawaban4 = {
        "Kekekalan Energi",
        "Abstraksi",
        "Bupati", //bener
        "C4H6O2",
        "Lamda",
    };


    @Override
    public void setAngka(int noSoal){
        pilihSoal = noSoal; 
    }

    @Override
    public String getPertanyaan(){
        //soal = Question [pilihSoal]
        return Question [pilihSoal];
        //return soal;
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
        else if (jawaban == 'B'){
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
                jawabanBenar = false;               
            }
            else if (noSoal == 4){
                jawabanBenar = true;              
            }
        }

        else if (jawaban == 'C'){
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
                jawabanBenar = true;             
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
                    jawabanBenar = true;                   
                }
                else if (noSoal == 3){
                    jawabanBenar = false;                   
                }
                else if (noSoal == 4){
                    jawabanBenar = false;                  
                }
            }
        return jawabanBenar;
    }



}