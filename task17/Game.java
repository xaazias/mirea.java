package Game;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game extends Application
{
    public static void main(String[] args) {
        launch(args);
    }

    public void showNotificationAlert(double score, Stage stage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Игра окончена");
        alert.setHeaderText("Ваш результат: " + Math.round(score));
        alert.setContentText("Нажмите ОК, чтобы попробовать еще раз!");
        alert.setOnHidden(evt -> {
            stage.close();
            new Game().start(new Stage());
        });
        alert.show();
    }

    public void start(Stage theStage)
    {
        theStage.setTitle("Jump 0v3r");

        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        ArrayList<String> input = new ArrayList<>();

        theScene.setOnKeyPressed(e -> {
            String code = e.getCode().toString();
            if ( !input.contains(code))
                input.add(code);
        });

        theScene.setOnKeyReleased(e -> {
            String code = e.getCode().toString();
            input.remove(code);
        });

        String currentDir = System.getProperty("user.dir");

        ImageView backgroundImage = new ImageView("file:///" + currentDir + "/src/Game/assets/background.png");
        root.getChildren().add(backgroundImage);

        Image characterFlyImage = new Image("file:///" + currentDir + "/src/Game/assets/hero_fly.png");
        Image characterImage = new Image("file:///" + currentDir + "/src/Game/assets/hero.png");

        ImageView playCharacter = new ImageView();
        playCharacter.setImage(characterImage);
        playCharacter.setX(80.0f);
        playCharacter.setY(452.0f);

        ArrayList<ImageView> playEnemies = new ArrayList<>(
                Arrays.asList(
                    new ImageView("file:///" + currentDir + "/src/Game/assets/enemy-green.png"),
                    new ImageView("file:///" + currentDir + "/src/Game/assets/enemy-blue.png"),
                    new ImageView("file:///" + currentDir + "/src/Game/assets/enemy-pink.png")
                )
        );

        for (ImageView i : playEnemies) {
            i.setY(462.0f);
            root.getChildren().add(i);
        }

        double canvasWidth = 768.0;
        Canvas canvas = new Canvas(canvasWidth, 512);

        Label scoreLabel = new Label("Score: " + 0);
        scoreLabel.setTranslateY(20.f);
        scoreLabel.setTranslateX(20.f);
        scoreLabel.setTextFill(Color.rgb(30, 220, 80));
        scoreLabel.setFont(Font.font ("", 20));

        root.getChildren().addAll(canvas, playCharacter, scoreLabel);

        final long startNanoTime = System.nanoTime();

        new AnimationTimer()
        {
            double score = 0;
            double jumpInterval = -1.0;
            double cosStart = 0;

            double moveSpeed = 4.0f;
            final double[] rectDistance = { 300.f, 550.f };
            double currentX = canvasWidth * 3 + rectDistance[1] + 1;

            public void handle(long currentNanoTime)
            {
                score += 0.1f;
                scoreLabel.setText("Score: " + Math.round(score));

                double t = (currentNanoTime - startNanoTime) / 10000000.0;
                double s = (currentNanoTime - startNanoTime) / 1000000000.0;

                if (input.contains("SPACE") && (jumpInterval + 0.625) < s){
                    jumpInterval = s;
                    cosStart = 0;
                }

                if ((jumpInterval + 0.50) > s) {
                    cosStart += 0.05065 * 4; // 0.50s // cosStart += 0.068475 * 2; 0.75s
                    double circleY = 382 + 70 * Math.cos(cosStart);
                    playCharacter.setY(circleY);
                    playCharacter.setImage(characterFlyImage);
                }
                else playCharacter.setImage(characterImage);

                double[] rectCoordsX = new double[3];
                rectCoordsX[0] = canvasWidth * 3 - (t * moveSpeed % (canvasWidth * 3));
                rectCoordsX[1] = canvasWidth * 3 - (t * moveSpeed % (canvasWidth * 3)) - rectDistance[0];
                rectCoordsX[2] = canvasWidth * 3 - (t * moveSpeed % (canvasWidth * 3)) - rectDistance[1];

                if (rectCoordsX[0] < currentX) {
                    currentX = rectCoordsX[0];
                }
                else {
                    Collections.shuffle(playEnemies);
                    rectDistance[0] = new Random().nextInt(300) + 270;
                    rectDistance[1] = new Random().nextInt(300) + rectDistance[0] + 270;
                    currentX = canvasWidth * 3 + rectDistance[1] + 1;
                    if (moveSpeed < 5.25) moveSpeed += 0.125;
                    else moveSpeed += 0.125 / 2;
                }

                for (ImageView i : playEnemies) {
                    if (playCharacter.getY() + 60.0f > 462.0 && playCharacter.getX() >= i.getX() - 30.0f && playCharacter.getX() <= i.getX() + 15.0f) {
                        stop();
                        showNotificationAlert(score, theStage);
                    }
                }

                for (int i = 0; i < playEnemies.size(); i++)
                    playEnemies.get(i).setX(rectCoordsX[i]);
            }
        }.start();

        theStage.show();
    }
}