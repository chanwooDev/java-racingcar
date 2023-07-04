package racingcar;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (InputManager inputManager = new InputManager()) {
            RacingManager racingManager = RacingManager.of(inputManager.readCarNames(), inputManager.readRound());
            RacingViewManager racingViewManager = new RacingViewManager(racingManager);
            racingManager.playRacing();
            racingViewManager.printResult();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}