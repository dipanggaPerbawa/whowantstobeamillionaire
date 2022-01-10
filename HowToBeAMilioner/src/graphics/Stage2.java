package graphics;

class Stage2 extends Pertanyaan {
    String [] Question  = {
        "Golongan darah AB dapat disumbangkan ke golongan darah...", //AB
        "Senjata Tradisional Jawa barat", //Kujang
        "Jumlah sudut dalam segitiga adalah...", //180
        "Pengaran novel 'Harry Potter' adalah...", //J.K.Rowling
        "Rotasi bumi akan mengakibatkan?", //Perbedaan Waktu
    };

    String [] jawaban1 = {
        "B",
        "Dohong",
        "180", //bener
        "Tere Liye",
        "Perbedaan Musim",
    };

    String [] jawaban2 = {
        "AB", //bener
        "Clurit",
        "120",
        "Victoria Aveyard",
        "Perbedaan Waktu", //bener
    };

    String [] jawaban3 = {
        "A",
        "Karih",
        "90",
        "Rick Jordans",
        "Perbedaan Cuaca",
    };
    
    String [] jawaban4 = {
        "O",
        "Kujang", //bener
        "270",
        "J.K.Rowling", //bener
        "Perbedaan Suhu",
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
