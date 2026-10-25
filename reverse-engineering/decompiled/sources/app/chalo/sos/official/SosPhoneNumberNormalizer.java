package app.chalo.sos.official;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/sos/official/SosPhoneNumberNormalizer;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosPhoneNumberNormalizer {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/official/SosPhoneNumberNormalizer$Companion;", "", "", "MIN_PHONE_DIGITS", "I", "MAX_PHONE_DIGITS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public static String a(String phoneNumber) {
        Intrinsics.i(phoneNumber, "phoneNumber");
        String string = StringsKt.u0(phoneNumber).toString();
        if (string.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        if (StringsKt.a0(string, "+", false)) {
            string2 = vo1.m("+", string2);
        }
        String strM = StringsKt.M(string2, "+");
        int length2 = strM.length();
        if (3 > length2 || length2 >= 16) {
            return null;
        }
        for (int i2 = 0; i2 < strM.length(); i2++) {
            if (!Character.isDigit(strM.charAt(i2))) {
                return null;
            }
        }
        return string2;
    }
}
