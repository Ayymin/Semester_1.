package opgave2.exercise2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gui extends Application
{


    @Override
    public void start(Stage stage)
    {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Loops1");
        stage.setScene(scene);
        stage.show();

    }

    private GridPane initContent()
    {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc)
    {
        // Replace the statement here with your code.

        //Datamatiker med forløkke
        String datamatiker = "Datamatiker";
        int i=0;
        while(i<datamatiker.length()){
            datamatiker.substring(0,i+1);
            i++;
        }


        //Baseline
   int x1 = 0;
   int y = 150;
   int x2 = 180;
    gc.strokeLine(x1,y,x2,y);

    //Små lodrette linjer
    for (int linjer = 0; linjer < 11;linjer++){
        int y1;
        int y2;
        int x = 15 + linjer *15;
        if (linjer % 5 == 0){
            y1 = 140;
            y2 = 160;
        }
        else {
            y1 =145;
            y2 =155;
        }
        gc.strokeLine(x,y1,x,y2);
        int xPil = 180;
        int yPil = 150;
        gc.strokeLine(xPil, yPil, xPil -5, y +3);
        gc.strokeLine(xPil, yPil, xPil -5, y -3);
    }

    //Tal på lineal
        String s = "0";
       gc.fillText(s,15,170);
       String x = "5";
       gc.fillText(x,85,170);
       String c = "10";
       gc.fillText(c,160,170);

   }


    }

    //Application 2

