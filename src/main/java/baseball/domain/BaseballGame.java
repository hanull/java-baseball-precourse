package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {

	private static final int MAXIMUM_NUMBER = 9;
	private static final int MINIMUM_NUMBER = 1;
	private static final int TARGET_PICK_COUNT = 3;

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

}
