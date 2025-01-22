import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Observer{
    void update(int temparature);
}

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}

class WeatherStation implements Subject {
    List<Observer> observerList = new ArrayList<>();
    int temparature;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer : observerList ){
            observer.update(temparature);
        }
    }

    void setTemparature(int newTemparature){
        temparature = newTemparature;
        notifyAllObservers();
    }
}

class PhoneApp implements Observer{

    int temparature;

    @Override
    public void update(int temparature) {
        this.temparature = temparature;
        System.out.println("Phone App, temparature is updated to : " + this.temparature);
    }
}

class WebApp implements Observer {

    int temparature;
    @Override
    public void update(int temparature) {
        this.temparature = temparature;
        System.out.println("Web App, temparature is updated to : " + this.temparature);
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        WeatherStation weatherStation = new WeatherStation();
        Observer ixigo = new PhoneApp();
        Observer mmt = new WebApp();

        weatherStation.addObserver(ixigo);
        weatherStation.addObserver(mmt);

        weatherStation.setTemparature(26);

    }
}