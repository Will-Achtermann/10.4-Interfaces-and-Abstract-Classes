public class Trombone extends Instrument{
    
    public Trombone(String note, String name){
        super(name, note);
    }

    @Override
    public void playNoise(){
        System.out.println(" wah wah wah");
    }
}
