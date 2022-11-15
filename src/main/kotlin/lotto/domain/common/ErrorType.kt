package lotto.domain.common

enum class ErrorType(val errorMessage: String) {
    MONEY(ERROR_FORMAT.format(ERROR_TICKET_MONEY_MESSAGE)),
    RANGE(ERROR_FORMAT.format(ERROR_NUMBER_RANGE_MESSAGE)),
    COUNT(ERROR_FORMAT.format(ERROR_NUMBER_COUNT_MESSAGE)),
    DUPLICATION(ERROR_FORMAT.format(ERROR_DUPLICATED_NUMBER_MESSAGE)),
    NORMAL("")
}