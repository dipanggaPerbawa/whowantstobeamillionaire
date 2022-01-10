package graphics;
public abstract class Pertanyaan {
    protected boolean jawabanBenar;
    protected int pilihSoal;
    public abstract void setAngka(int noSoal);
    public abstract String getPertanyaan();
    public abstract boolean checkJawaban (char jawaban, int noSoal);
}


