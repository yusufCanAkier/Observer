class Iphone extends ObservableProduct{

    public void changePrice(){
        this.message.productName = "Iphone";
        this.message.message="Iphone's price updated.";
        this.notifyObserver();
    }
}
