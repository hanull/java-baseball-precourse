package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {

	private static final int MAXIMUM_NUMBER = 9;
	private static final int MINIMUM_NUMBER = 1;
	private static final int TARGET_PICK_COUNT = 3;
	private static final int RESTART = 1;
	private static final String RESTART_STRING_TYPE = "1";
	private static final String FINISH_STRING_TYPE = "2";
	private static final String ERROR_INVALID_RESTART_OR_FINISH = "[ERROR] 입력값이 잘못되었습니다.";

	private Numbers answerNumbers;

	public BaseballGame() {
		this.answerNumbers = generateNumbers();
	}

	private Numbers generateNumbers() {
		List<Integer> answerNumbers = new ArrayList<>();
		while (answerNumbers.size() == TARGET_PICK_COUNT) {
			int pickNumber = Randoms.pickNumberInRange(MINIMUM_NUMBER, MAXIMUM_NUMBER);
			if (!answerNumbers.contains(pickNumber)) {
				answerNumbers.add(pickNumber);
			}
		}
		return new Numbers(answerNumbers);
	}

	public void play() {

	}

	public boolean isFinish() {
		int restartOfFinish = getRestartOfFinish();
		if (restartOfFinish == RESTART) {
			return false;
		}
		return true;
	}

	private int getRestartOfFinish() {
		try {
			OutputView.printInputRestartOfFinish();
			String inputRestartOrFinish = InputView.inputRestartOrFinish();
			validateInputRestartOfFinish(inputRestartOrFinish);
			return Integer.parseInt(inputRestartOrFinish);
		} catch (IllegalArgumentException exception) {
			OutputView.printException(exception);
			return getRestartOfFinish();
		}
	}

	private void validateInputRestartOfFinish(String inputRestartOrFinish) {
		if (!inputRestartOrFinish.equals(RESTART_STRING_TYPE) && !inputRestartOrFinish.equals(FINISH_STRING_TYPE)) {
			throw new IllegalArgumentException(ERROR_INVALID_RESTART_OR_FINISH);
		}
	}
}
