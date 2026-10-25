package app.chalo.login.truecaller;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerError;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL", "NETWORK", "USER_DENIED", "PROFILE_NOT_FOUND", "UNAUTHORIZED_USER", "TRUECALLER_CLOSED_UNEXPECTEDLY", "TRUESDK_TOO_OLD", "POSSIBLE_REQ_CODE_COLLISION", "RESPONSE_SIGNATURE_MISMATCH", "REQUEST_NONCE_MISMATCH", "INVALID_ACCOUNT_STATE", "TC_NOT_INSTALLED", "PARTNER_INFO_NULL", "USER_DENIED_WHILE_LOADING", "CONTINUE_WITH_DIFFERENT_NUMBER", "ACTIVITY_NOT_FOUND", "DEVICE_NOT_SUPPORTED", "UNKNOWN", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TruecallerError {
    INTERNAL,
    NETWORK,
    USER_DENIED,
    PROFILE_NOT_FOUND,
    UNAUTHORIZED_USER,
    TRUECALLER_CLOSED_UNEXPECTEDLY,
    TRUESDK_TOO_OLD,
    POSSIBLE_REQ_CODE_COLLISION,
    RESPONSE_SIGNATURE_MISMATCH,
    REQUEST_NONCE_MISMATCH,
    INVALID_ACCOUNT_STATE,
    TC_NOT_INSTALLED,
    PARTNER_INFO_NULL,
    USER_DENIED_WHILE_LOADING,
    CONTINUE_WITH_DIFFERENT_NUMBER,
    ACTIVITY_NOT_FOUND,
    DEVICE_NOT_SUPPORTED,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<TruecallerError> getEntries() {
        return $ENTRIES;
    }
}
