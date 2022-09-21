package opgave2.exercise1;

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
   int x1 = 10;
   int y1 = 1;
   int x2 = 50;
   int y2 = 20;
   while (x2 <= 180) {
       gc.strokeLine(x1, y1, x2, y2);
       x2 = x2 + 40;
   }


    }

    //Application 2

}
