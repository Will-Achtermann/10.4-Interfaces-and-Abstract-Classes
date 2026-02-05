public class Drums extends Instrument{
    
    public Drums(String note, String name){
        super(name, note);
    }

    @Override
    public void playNoise(){
        System.out.println(" boom chick");
    }
}
