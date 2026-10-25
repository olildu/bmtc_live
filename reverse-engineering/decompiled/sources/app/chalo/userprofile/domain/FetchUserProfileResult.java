package app.chalo.userprofile.domain;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000ej\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lapp/chalo/userprofile/domain/FetchUserProfileResult;", "", "<init>", "(Ljava/lang/String;I)V", "PROFILE_UPDATED_SUCCESSFULLY", "USER_NOT_LOGGED_IN", "USER_DOES_NOT_EXIST", "USER_ID_MISMATCH", "UNKNOWN_LOCAL_EXCEPTION", "SERVER_ERROR", "RESPONSE_PARSE_EXCEPTION", "INVALID_RESPONSE", "UNKNOWN", "getFeatureErrorCode", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FetchUserProfileResult {
    PROFILE_UPDATED_SUCCESSFULLY,
    USER_NOT_LOGGED_IN,
    USER_DOES_NOT_EXIST,
    USER_ID_MISMATCH,
    UNKNOWN_LOCAL_EXCEPTION,
    SERVER_ERROR,
    RESPONSE_PARSE_EXCEPTION,
    INVALID_RESPONSE,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10322a;

        static {
            int[] iArr = new int[FetchUserProfileResult.values().length];
            try {
                iArr[FetchUserProfileResult.PROFILE_UPDATED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchUserProfileResult.USER_NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchUserProfileResult.USER_DOES_NOT_EXIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchUserProfileResult.USER_ID_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchUserProfileResult.UNKNOWN_LOCAL_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FetchUserProfileResult.SERVER_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FetchUserProfileResult.RESPONSE_PARSE_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FetchUserProfileResult.INVALID_RESPONSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FetchUserProfileResult.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10322a = iArr;
        }
    }

    public static EnumEntries<FetchUserProfileResult> getEntries() {
        return $ENTRIES;
    }

    public final int getFeatureErrorCode() {
        switch (WhenMappings.f10322a[ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 200;
            case 3:
                return ComposerKt.compositionLocalMapKey;
            case 4:
                return ComposerKt.providerValuesKey;
            case 5:
                return ComposerKt.providerMapsKey;
            case 6:
                return 205;
            case 7:
                return ComposerKt.referenceKey;
            case 8:
                return ComposerKt.reuseKey;
            case 9:
                return 212;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
