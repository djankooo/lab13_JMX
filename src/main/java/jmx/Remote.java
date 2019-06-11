package jmx;

public class Remote implements RemoteMBean {

    App app;

    @Override
    public void setSquence() {
        System.out.println("Remote set sequence     : " + this.app);
    }

    @Override
    public void togleLights() {
        System.out.println("Remote togle lights     : " + this.app);
        app.togleLightsIN();
    }

    @Override
    public void startSimulation() {
        System.out.println("Remote start simulation : " + this.app);
    }

    @Override
    public void openWindow() {
        app.launch(App.class);
        System.out.println("Remote get lamps        : " + this.app);
    }

    Remote(){
        this.app = new App();

    }
}
