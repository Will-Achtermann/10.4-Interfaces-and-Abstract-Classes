public abstract class Instrument implements Musical{
    protected String note;
    protected String name;
    protected boolean playing;

    public Instrument (String name, String note){
        this.name = name;
        this.note = note;
        this.playing = false;
    }

    @Override
    public void playNote(){
        this.playing = true;
        System.out.print(this.name + " started playing");
    }

    @Override
    public String getNote(){
        return this.note;
    }

    public abstract void playNoise();
}