package baseball.view;

public class OutputView {

	private static final String INPUT_RESTART_OR_FINISH = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static void printException(Exception exception) {
		System.out.println(exception.getMessage());
	}

	public static void printInputRestartOfFinish() {
		System.out.println(INPUT_RESTART_OR_FINISH);
	}
}
