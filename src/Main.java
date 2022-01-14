public class Main {
    public static void main(String[] args){
        IObserverUser mehmet = new ObserverUser();
        IObserverUser yusuf = new ObserverUser();
        IObserverUser omer = new ObserverUser();
        IObserverUser suleyman = new ObserverUser();

        Iphone iphone = new Iphone();

        iphone.addObserver(yusuf);
        iphone.addObserver(mehmet);
        iphone.addObserver(omer);
        iphone.addObserver(suleyman);

        iphone.changePrice();
    }
}
