package baseball.type;

public enum ExceptionType {
	DUPLICATE("중복된 수가 있습니다."),
	OUT_OF_LENGTH("3자리의 숫자로 입력해주세요."),
	WRONG_TYPE_INPUT("1 ~ 9가 아닌 수가 포함되어 있습니다."),
	;

	private String message;

	ExceptionType(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}