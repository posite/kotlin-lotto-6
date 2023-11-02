package lotto.constant

enum class ErrorMessage(val message: String) {
    NOT_NUMBER_PURCHASE_AMOUNT("[ERROR] 구매금액은 정수여야 합니다."),
    NOT_PURCHASE_AMOUNT_FORMAT("[ERROR] 구매금액은 1000원단위여야 합니다."),
    NOT_BONUS_NUMBER_FORMAT("[ERROR] 보너스 금액은 정수여야 합니다."),
    NOT_NUMBER_WINNING_NUMBER("[ERROR] 당첨번호는 정수여야 합니다.")
}