public class Person implements Musical{
    private boolean singing;
    private String note;

    public Person(String note){
        this.singing = false;
        this.note = note;
    }
    
    @Override
    public void playNote(){
        this.singing = true;
        System.out.println("do ra me fa so la ti do");
    }

    @Override
    public String getNote(){
        return this.note;
    }
}
