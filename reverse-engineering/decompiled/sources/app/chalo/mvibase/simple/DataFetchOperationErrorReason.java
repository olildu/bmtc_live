package app.chalo.mvibase.simple;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lapp/chalo/mvibase/simple/DataFetchOperationErrorReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "NO_INTERNET_ERROR", "SERVER_ERROR", "REQUEST_CANCELLATION_ERROR", "API_CALL_AUTHORISATION_ERROR", "UNEXPECTED_EXCEPTION_ERROR", "UNKNOWN_ERROR", "SUCCESS_RESPONSE_PARSING_ERROR", "ERROR_RESPONSE_PARSING_ERROR", "NO_UPDATE_IN_DATA_BASED_ON_ETAG", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DataFetchOperationErrorReason {
    NO_INTERNET_ERROR(10),
    SERVER_ERROR(11),
    REQUEST_CANCELLATION_ERROR(12),
    API_CALL_AUTHORISATION_ERROR(13),
    UNEXPECTED_EXCEPTION_ERROR(14),
    UNKNOWN_ERROR(15),
    SUCCESS_RESPONSE_PARSING_ERROR(16),
    ERROR_RESPONSE_PARSING_ERROR(17),
    NO_UPDATE_IN_DATA_BASED_ON_ETAG(18);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final int errorCode;

    DataFetchOperationErrorReason(int i) {
        this.errorCode = i;
    }

    public static EnumEntries<DataFetchOperationErrorReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
