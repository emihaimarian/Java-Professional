package Decorator;

public class ObiectDecorator implements Decorat{
    
    private ObiectDecorat decorat;
    
    public ObiectDecorator(ObiectDecorat decorat){
        this.decorat = decorat;
    }
    
    @Override
    public void metodaUnu(){
        decorat.metodaUnu();
    }
    
    @Override
    public void metodaDoi(){
        decorat.metodaDoi();
    }
}