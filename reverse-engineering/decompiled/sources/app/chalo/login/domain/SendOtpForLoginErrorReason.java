package app.chalo.login.domain;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, d2 = {"Lapp/chalo/login/domain/SendOtpForLoginErrorReason;", "", "<init>", "(Ljava/lang/String;I)V", "OTP_STATUS_FALSE", "INVALID_REF_NO", "PARSE_EXCEPTION", "SERVER_ERROR", "UNKNOWN_ERROR", "PREVIOUS_OTP_EXPIRED", "getErrorCodeForReason", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SendOtpForLoginErrorReason {
    OTP_STATUS_FALSE,
    INVALID_REF_NO,
    PARSE_EXCEPTION,
    SERVER_ERROR,
    UNKNOWN_ERROR,
    PREVIOUS_OTP_EXPIRED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5248a;

        static {
            int[] iArr = new int[SendOtpForLoginErrorReason.values().length];
            try {
                iArr[SendOtpForLoginErrorReason.OTP_STATUS_FALSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.INVALID_REF_NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.PARSE_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.SERVER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.PREVIOUS_OTP_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f5248a = iArr;
        }
    }

    public static EnumEntries<SendOtpForLoginErrorReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCodeForReason() {
        switch (WhenMappings.f5248a[ordinal()]) {
            case 1:
                return 102;
            case 2:
                return 101;
            case 3:
                return 103;
            case 4:
                return 100;
            case 5:
                return 104;
            case 6:
                return 112;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
