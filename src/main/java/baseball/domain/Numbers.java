package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Numbers {

	private static final String ERROR_NOT_DIGIT = "숫자로 입력해주세요.";
	private static final String ERROR_INVALID_LENGTH = "3자리의 임의의 수로 입력해주세요.";
	private static final String ERROR_DUPLICATE = "중복된 숫자가 존재합니다.";
	private static final int NUMBER_LENGTH = 3;

	private List<Integer> numbers;

	public Numbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public Numbers(String inputNumbers) {
		validateInputNumbers(inputNumbers);
		this.numbers = generateNumbers(inputNumbers);
	}

	private List<Integer> generateNumbers(String inputNumbers) {
		List<Integer> numberList = new ArrayList<>();
		for (char number : inputNumbers.toCharArray()) {
			numberList.add(number - '0');
		}
		return numberList;
	}

	private void validateInputNumbers(String inputNumbers) {
		if (!isDigit(inputNumbers)) {
			throw new IllegalArgumentException(ERROR_NOT_DIGIT);
		}
		if (!isValidLength(inputNumbers.length())) {
			throw new IllegalArgumentException(ERROR_INVALID_LENGTH);
		}
		if (isDuplicate(inputNumbers)) {
			throw new IllegalArgumentException(ERROR_DUPLICATE);
		}
	}

	private boolean isDuplicate(String inputNumbers) {
		List<Character> numberList = new ArrayList<>();
		for (Character number : inputNumbers.toCharArray()) {
			numberList.add(number);
		}
		return numberList.size() != new HashSet<>(numberList).size();
	}

	private boolean isValidLength(int length) {
		return length == NUMBER_LENGTH;
	}

	private boolean isDigit(String inputNumbers) {
		for (char number : inputNumbers.toCharArray()) {
			if (!Character.isDigit(number)) {
				return false;
			}
		}
		return true;
	}
}
