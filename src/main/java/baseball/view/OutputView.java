package baseball.view;

public class OutputView {

	private static final String INPUT_RESTART_OR_FINISH = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
	private static final String INPUT_NUMBERS = "숫자를 입력해주세요 : ";
	private static final int NO_BALL = 0;
	private static final int NO_STRIKE = 0;
	private static final String NOTHING = "낫싱";
	private static final String STRIKE = "스트라이크";
	private static final String BALL = "볼";
	private static final String SPACE = " ";
	private static final String ANSWER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

	public static void printException(Exception exception) {
		System.out.println(exception.getMessage());
	}

	public static void printInputRestartOfFinish() {
		System.out.println(INPUT_RESTART_OR_FINISH);
	}

	public static void printInputNumbers() {
		System.out.print(INPUT_NUMBERS);
	}

	public static void printHint(int ball, int strike) {
		System.out.println(getHint(ball, strike));
	}

	private static String getHint(int ball, int strike) {
		if (ball == NO_BALL && strike == NO_STRIKE) {
			return NOTHING;
		}
		if (ball == NO_BALL) {
			return strike + STRIKE;
		}
		if (strike == NO_STRIKE) {
			return ball + BALL;
		}
		return ball + BALL + SPACE + strike + STRIKE;
	}

	public static void printAnswer() {
		System.out.println(ANSWER);
	}
}
