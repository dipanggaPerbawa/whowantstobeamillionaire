package graphics;

class  Stage1 extends Pertanyaan  { 
    String [] Question  = {
        "Permainan kartu solitaire umumnya dimainkan oleh...orang", //1 orang
        "Istilah yang digunakan untuk menyebut orang buta adalah...", //Tuna Netra
        "AC adalah singkatan dari kata?", //Air Conditioner
        "Akar dari 121 adalah", //11
        "Mana yang lebih besar?", //Terabyte
    };

    String [] jawaban1 = {
        "2 orang",
        "Tuna Wisma",
        "Air Conditioner", //bener
        "12",
        "Megabyte",
    };

    String [] jawaban2 = {
        "1 orang", //bener
        "Tuna Wicara",
        "Air Compressor",
        "10",
        "Gigabyte",
    };

    String [] jawaban3 = {
        "4 orang",
        "Tuna Netra", //bener
        "Air Controller",
        "13",
        "Terabyte", //bener
    };

    String [] jawaban4 = {
        "3 orang",
        "Tuna Rungu",
        "Air Concealar",
        "11", //bener
        "Byte",
    };

    @Override
    public void setAngka (int noSoal){
        pilihSoal = noSoal;   
    }

    @Override //Dapetin pertanyaan tiap naek level 
    public String getPertanyaan (){
        return Question [pilihSoal]; //return naskah soal
    }


    public String JawabanA (){
        String jawaban;
        jawaban = jawaban1 [pilihSoal]; //ambil jawaban ke m
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
