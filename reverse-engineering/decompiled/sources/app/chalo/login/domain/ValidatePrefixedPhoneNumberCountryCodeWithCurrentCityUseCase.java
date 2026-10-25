package app.chalo.login.domain;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.constants.AppConstants;
import app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetCurrentCityPhoneNumberConfigUseCase f5253a;

    public ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase(GetCurrentCityPhoneNumberConfigUseCase getCurrentCityPhoneNumberConfigUseCase) {
        this.f5253a = getCurrentCityPhoneNumberConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, CountryPhoneNumberConfig countryPhoneNumberConfig, ContinuationImpl continuationImpl) {
        ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1 validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1;
        Integer num;
        int iIntValue;
        String str2;
        int length;
        if (continuationImpl instanceof ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1) {
            validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1 = (ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1) continuationImpl;
            int i = validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1 = new ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1 = new ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (countryPhoneNumberConfig == null) {
                validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.L$0 = str;
                validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.label = 1;
                objA = this.f5253a.a(validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (countryPhoneNumberConfig != null) {
                iIntValue = countryPhoneNumberConfig.d;
            } else {
                num = (Integer) CollectionsKt.H(AppConstants.f1940a);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 10;
                }
            }
            if (countryPhoneNumberConfig != null || (str2 = countryPhoneNumberConfig.c) == null) {
                str2 = "+91";
            }
            length = str.length() - iIntValue;
            if (length <= 1) {
                return Boolean.FALSE;
            }
            String strSubstring = str.substring(0, length);
            Intrinsics.h(strSubstring, "substring(...)");
            return Boolean.valueOf(str2.equals(strSubstring));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase$invoke$1.L$0;
        ResultKt.b(objA);
        countryPhoneNumberConfig = (CountryPhoneNumberConfig) objA;
        if (countryPhoneNumberConfig != null) {
            iIntValue = countryPhoneNumberConfig.d;
        } else {
            num = (Integer) CollectionsKt.H(AppConstants.f1940a);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 10;
            }
        }
        if (countryPhoneNumberConfig != null) {
            str2 = "+91";
        } else {
            str2 = "+91";
        }
        length = str.length() - iIntValue;
        if (length <= 1) {
            return Boolean.FALSE;
        }
        String strSubstring2 = str.substring(0, length);
        Intrinsics.h(strSubstring2, "substring(...)");
        return Boolean.valueOf(str2.equals(strSubstring2));
    }
}
