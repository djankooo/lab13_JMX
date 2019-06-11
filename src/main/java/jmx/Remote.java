package jmx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Remote implements RemoteMBean {

    App app;

    @Override
    public void setSquence() {
        System.out.println("Remote set sequence     : " + this.app);
    }

    @Override
    public void togleLights() {
        System.out.println("Remote togle lights     : " + this.app);
        this.app.togleLightsIN();
    }

    @Override
    public void startSimulation() {
        System.out.println("Remote start simulation : " + this.app);
    }

    @Override
    public void openWindow() {
        System.out.println("Remote get lamps        : " + this.app);
//        TO SSIE PALKE
//        try {
//            Stage addingStage = new Stage();
//            app.start(addingStage);
//            addingStage.show();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        TO TEZ SSIE PALE
//          this.app.main(new String[]{});

//        I TO TEZ SSIE PALKE
        this.app.launch(App.class);


    }

    Remote(){
        this.app = new App();
    }
}
