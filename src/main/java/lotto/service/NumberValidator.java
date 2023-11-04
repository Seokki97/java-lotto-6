package lotto.service;

import java.util.regex.Pattern;
import lotto.domain.LottoNumbers;

public class NumberValidator {

    private static final String NUMBER = "^[0-9]+$";

    public void validateNumberInRange(int lottoNumber) {
        if (lottoNumber < LottoNumbers.MIN_LOTTO_NUMBER.getNumber()
                || lottoNumber > LottoNumbers.MAX_LOTTO_NUMBER.getNumber()) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1~45까지의 숫자만 입력할 수 있습니다.");
        }
    }

    public void validatePurchasePriceIsNumber(String purchasePrice){
        if (!Pattern.matches(NUMBER, purchasePrice)) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력할 수 있습니다.");
        }
    }

    public void validatePurchasePriceUnit(int price){
        if (price % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 1000원 단위로 입력해야 합니다.");
        }
    }
}
