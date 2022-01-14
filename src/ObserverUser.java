public class ObserverUser implements IObserverUser{
    public void sendNotification(ProductUpdateMessage message){
        System.out.println(message.toString());
    }
}
