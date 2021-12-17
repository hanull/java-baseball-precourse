package baseball.domain;

import java.util.List;

public class Result {

	private static final int NUMBERS_LENGTH = 3;
	private static final int TARGET_ANSWER_COUNT = 3;

	private int strike;
	private int ball;

	public Result(List<Integer> answerNumbers, List<Integer> playerNumbers) {
		checkBall(answerNumbers, playerNumbers);
		checkStrike(answerNumbers, playerNumbers);
	}

	private void checkStrike(List<Integer> answerNumbers, List<Integer> playerNumbers) {
		int index = 0;
		while (index < NUMBERS_LENGTH) {
			if (answerNumbers.get(index).equals(playerNumbers.get(index))) {
				addStrike();
				decreaseBall();
			}
			index++;
		}
	}

	private void decreaseBall() {
		--ball;
	}

	private void addStrike() {
		++strike;
	}

	private void checkBall(List<Integer> answerNumbers, List<Integer> playerNumbers) {
		for (Integer playerNumber : playerNumbers) {
			if (answerNumbers.contains(playerNumber)) {
				addBall();
			}
		}
	}

	private void addBall() {
		++ball;
	}

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	public boolean isAnswer() {
		return strike == TARGET_ANSWER_COUNT;
	}
}
