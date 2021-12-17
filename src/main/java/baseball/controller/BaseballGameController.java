package baseball.controller;

import baseball.domain.BaseballGame;

public class BaseballGameController {

	private BaseballGame baseballGame;

	public void run() {
		do {
			baseballGame = new BaseballGame();
			baseballGame.play();
		} while (!baseballGame.isFinish());
	}
}
