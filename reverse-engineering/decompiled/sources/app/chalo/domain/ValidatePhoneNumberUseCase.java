package app.chalo.domain;

import app.chalo.config.CountryPhoneNumberConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/ValidatePhoneNumberUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatePhoneNumberUseCase {
    public static PhoneNumberValidationResult a(String phoneNumberEntered, CountryPhoneNumberConfig phoneNumberConfig) {
        Intrinsics.i(phoneNumberEntered, "phoneNumberEntered");
        Intrinsics.i(phoneNumberConfig, "phoneNumberConfig");
        int i = phoneNumberConfig.d;
        for (int i2 = 0; i2 < phoneNumberEntered.length(); i2++) {
            if (!Character.isDigit(phoneNumberEntered.charAt(i2))) {
                return PhoneNumberValidationResult.NON_DIGIT_CHAR_USED;
            }
        }
        if (phoneNumberEntered.length() > i) {
            return PhoneNumberValidationResult.EXPECTED_LENGTH_EXCEEDED;
        }
        return phoneNumberEntered.length() < i ? PhoneNumberValidationResult.INSUFFICIENT_DIGITS : PhoneNumberValidationResult.VALID_PHONE_NUMBER;
    }
}
