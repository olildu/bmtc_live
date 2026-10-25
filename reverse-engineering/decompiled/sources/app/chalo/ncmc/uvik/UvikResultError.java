package app.chalo.ncmc.uvik;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResultError;", "", CLConstants.FIELD_CODE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "PLAY_INTEGRITY_ID", "PLAYSTORE_CERTIFICATE_HASH", "PROVIDER_INSTALL_FAILED", "INVALID_ARGUMENTS", "MOBILE_MISSING", "SERVICE_ID_MISSING", "SERVICE_INFO_MISSING", "REFERENCE_NUMBER_MISSING", "INTENT_HASH_MISSING", "DUPLICATE_PHONENUMBER", "NETWORK_ERROR", "TXN_CANCELLED", "UNKNOWN_ERROR", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum UvikResultError {
    PLAY_INTEGRITY_ID("U_501"),
    PLAYSTORE_CERTIFICATE_HASH("U_502"),
    PROVIDER_INSTALL_FAILED("U_503"),
    INVALID_ARGUMENTS("U_401"),
    MOBILE_MISSING("U_402"),
    SERVICE_ID_MISSING("U_403"),
    SERVICE_INFO_MISSING("U_404"),
    REFERENCE_NUMBER_MISSING("U_405"),
    INTENT_HASH_MISSING("U_406"),
    DUPLICATE_PHONENUMBER("U_407"),
    NETWORK_ERROR("U_301"),
    TXN_CANCELLED("U_302"),
    UNKNOWN_ERROR("U_000");

    private final String code;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    UvikResultError(String str) {
        this.code = str;
    }

    public static EnumEntries<UvikResultError> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }
}
