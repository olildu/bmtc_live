package app.chalo.userprofile.domain.validation;

import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidator;", "", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileInputValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f10333a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidator$Companion;", "", "", "MIN_ACCEPTABLE_AGE", "I", "MIN_ACCEPTABLE_YEAR", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ProfileInputValidator(TimeUtilsContract timeUtilsContract) {
        this.f10333a = timeUtilsContract;
    }

    public final ProfileInputValidationError.Age a(String ageText) {
        Intrinsics.i(ageText, "ageText");
        String string = StringsKt.u0(ageText).toString();
        if (string.length() == 0) {
            return ProfileInputValidationError.Age.Empty.f10328a;
        }
        Integer numQ0 = StringsKt.q0(string);
        if (numQ0 == null) {
            return ProfileInputValidationError.Age.NonNumeric.f10329a;
        }
        int iIntValue = numQ0.intValue();
        if (iIntValue > new IntRange(10, Math.max(10, this.f10333a.E() - 1900), 1).b || 10 > iIntValue) {
            return ProfileInputValidationError.Age.OutOfRange.f10330a;
        }
        return null;
    }
}
