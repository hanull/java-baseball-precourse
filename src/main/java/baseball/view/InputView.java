package baseball.view;

import baseball.domain.Numbers;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
	public static String inputRestartOrFinish() {
		return input();
	}

	private static String input() {
		return Console.readLine();
	}

	public static Numbers inputNumbers() {
		return new Numbers(input());
	}
}
