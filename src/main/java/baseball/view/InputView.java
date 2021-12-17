package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
	public static String inputRestartOrFinish() {
		return input();
	}

	private static String input() {
		return Console.readLine();
	}
}
