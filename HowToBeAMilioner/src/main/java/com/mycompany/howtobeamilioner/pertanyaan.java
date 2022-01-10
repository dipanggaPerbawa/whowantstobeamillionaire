package com.mycompany.howtobeamilioner;

public abstract class pertanyaan {
    public abstract void setAngka(int noSoal);
    public abstract String getPertanyaan();
    public abstract boolean checkJawaban (char jawaban, int noSoal);
}

class bagian1 extends pertanyaan  {
boolean jawabanBenar;
private int m;
    String soal;
    String [] Question  = {
        "Permainan kartu solitaire umumnya dimainkan oleh...orang", //1 orang
        "Istilah yang digunakan untuk menyebut orang buta adalah...", //Tuna Netra
        "AC adalah singkatan dari kata?", //Air Conditioner
        "Besar kecilnya arus listrik dapat dinyatakan dengan satuan...", //Ampere
        "Mana yang lebih besar?", //Terabyte
    };

    String [] jawaban1 = {
        "2 orang",
        "Tuna Wisma",
        "Air Conditioner", //bener
        "Volt",
        "Megabyte",
    };

    String [] jawaban2 = {
        "1 orang", //bener
        "Tuna Wicara",
        "Air Compressor",
        "Omega",
        "Gigabyte",
    };

    String [] jawaban3 = {
        "4 orang",
        "Tuna Netra", //bener
        "Air Controller",
        "Lambda",
        "Terabyte", //bener
    };

    String [] jawaban4 = {
        "3 orang",
        "Tuna Rungu",
        "Air Concealar",
        "Ampere", //bener
        "Byte",
    };

    @Override
    public void setAngka (int noSoal){
    m = noSoal;   
    }

    

    @Override
    public String getPertanyaan (){
   
    String soal;

    soal = Question [m];

    return soal;
    }


    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [m];
        return jawaban;
    }

    public String JawabanB (){
        String jawaban;
        jawaban = jawaban2 [m];
        return jawaban;
    }

    public String JawabanC (){
        String jawaban;
        jawaban = jawaban3 [m];
        return jawaban;
    }

    public String JawabanD (){
        String jawaban;
        jawaban = jawaban4 [m];
        return jawaban;
    }

    @Override
    public boolean checkJawaban (char jawaban, int noSoal){
        if (jawaban == 'A'){
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
        else if (jawaban == 'B'){
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
                jawabanBenar = true;               
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


class bagian2 extends pertanyaan {
    private int m;
    boolean jawabanBenar;
    String [] Question  = {
        "Golongan darah AB dapat disumbangkan ke golongan darah...", //AB
        "Ilmu yang mempelajari mengenai kehidupan Mikroorganisme disebut", //Mikrobiologi
        "Jumlah sudut dalam segitiga adalah...", //180
        "Pengaran novel 'Harry Potter' adalah...", //J.K.Rowling
        "Rotasi bumi akan mengakibatkan?", //Perbedaan Waktu
    };

    String [] jawaban1 = {
        "B",
        "Mikroobilogi",
        "180", //bener
        "Tere Liye",
        "Perbedaan Musim",
    };

    String [] jawaban2 = {
        "AB", //bener
        "Microbiologi",
        "120",
        "Victoria Aveyard",
        "Perbedaan Waktu", //bener
    };

    String [] jawaban3 = {
        "A",
        "Mikrokologi",
        "90",
        "Rick Jordans",
        "Perbedaan Cuaca",
    };
    
    String [] jawaban4 = {
        "O",
        "Mikrobiologi", //bener
        "270",
        "J.K.Rowling", //bener
        "Perbedaan Suhu",
    };

    @Override
    public void setAngka(int noSoal){
        m = noSoal;   
    }

    @Override
    public String getPertanyaan(){
        String soal;

        soal = Question [m];
    
        return soal;
    }
    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [m];
        return jawaban;
    }

    public String JawabanB (){
        String jawaban;
        jawaban = jawaban2 [m];
        return jawaban;
    }

    public String JawabanC (){
        String jawaban;
        jawaban = jawaban3 [m];
        return jawaban;
    }

    public String JawabanD (){
        String jawaban;
        jawaban = jawaban4 [m];
        return jawaban;
    }

    @Override
    public boolean checkJawaban (char jawaban, int noSoal){
        if (jawaban == 'A'){
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
        else if (jawaban == 'B'){
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

        else if (jawaban == 'C'){
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
                jawabanBenar = false;               
            }
            }

        else if (jawaban == 'D'){
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
                    jawabanBenar = true;                   
                }
                else if (noSoal == 4){
                    jawabanBenar = false;                  
                }
            }
        return jawabanBenar;
    }


}

class bagian3 extends pertanyaan {
    boolean jawabanBenar;
    private int m;
    String [] Question = {
        "Energi yang dihasilkan oleh kecepatan disebut?", //Energi Kinetik
        "Perpindahan penduduk antar wilayah disebut?", //Migrasi
        "Pimpinan daerah tingkat 2 adalah...", //Bupati
        "Rumus molekul 'Etana' adalah...", //C2H6
        "Organ tubuh yang mempunyai fungsi filtrasi, reabsorpsi dan augmentasi adalah...", //Ginjal
    };

    String [] jawaban1 = {
        "Energi Potensial",
        "Migrasi", //bener
        "Gubernur",
        "CH2O6",
        "Hati",    
    };

    String [] jawaban2 = {
        "Percepatan",
        "Urbanisasi",
        "Kepala Daerah",
        "C4H8",
        "Ginjal", //bener    
    };

    String [] jawaban3 = {
        "Energi Kinetik", //bener
        "Erosi",
        "Wali Kota",
        "C2H6", //bener
        "Pankreas",
    };

    String [] jawaban4 = {
        "Kekekalan Energi",
        "Abstraksi",
        "Bupati", //bener
        "C4H6O2",
        "Empedu",
    };


    @Override
    public void setAngka(int noSoal){
        m = noSoal; 
    }

    @Override
    public String getPertanyaan(){
        String soal;

        soal = Question [m];
    
        return soal;
    }

    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [m];
        return jawaban;
    }

    public String JawabanB (){
        String jawaban;
        jawaban = jawaban2 [m];
        return jawaban;
    }

    public String JawabanC (){
        String jawaban;
        jawaban = jawaban3 [m];
        return jawaban;
    }

    public String JawabanD (){
        String jawaban;
        jawaban = jawaban4 [m];
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

class bagian4 extends pertanyaan {
    private int m;
    boolean jawabanBenar;
    String [] Question = {
        "Hewan vertebrata yang tidak termasuk kelas mamalia adalah...", //Kuda Laut
        "Untuk memotong DNA Pada saat melakukan penelitian menggunakan?", //Enzim
        "Alat pencatat gempa adalah...", //Seismograf
        "Pembuatan kalender Masehi berdasar atas perputaran?", //Bumi dan Matahari
        "Angka yang menunjukan nilai energi bahan bakar bensin  adalah angka?", //Oktan
    };
    
    String [] jawaban1 = {
        "Kuda Laut", //bener
        "Senyawa Asam",
        "Seismograph",
        "Bulan pada Bumi",
        "Oktan", //bener
    };

    String [] jawaban2 = {
        "Anjing Laut",
        "Bakteri",
        "Seismograf", //bener
        "Bulan pada Matahari",
        "Oktana",
    };

    String [] jawaban3 = {
        "Salamander",
        "Enzim", //bener
        "Seistmograph",
        "Bumi pada Bulan",
        "Octane",
    };

    String [] jawaban4 = {
        "Cicak",
        "Hormon",
        "Seismografik",
        "Bumi pada Matahari", //bener
        "Octane",

    };

    @Override
    public void setAngka(int noSoal){
        m = noSoal; 
    }

    @Override
    public String getPertanyaan(){
        String soal;

        soal = Question [m];
    
        return soal;
    }
    
    
    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [m];
        return jawaban;
    }

    public String JawabanB (){
        String jawaban;
        jawaban = jawaban2 [m];
        return jawaban;
    }

    public String JawabanC (){
        String jawaban;
        jawaban = jawaban3 [m];
        return jawaban;
    }

    public String JawabanD (){
        String jawaban;
        jawaban = jawaban4 [m];
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