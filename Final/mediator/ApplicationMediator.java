package mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator extends Mediator {
    private List<Colleague> colleagues;
    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }
    
    public void addColleague(Colleague colleague){
        colleagues.add(colleague);
    }
    
    
    @Override
    public void send(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for(Colleague colleague : colleagues){
            //don't tell ourselves
            if(colleague != originator){
                colleague.receive(message);
            }
        }
    }
    
}
