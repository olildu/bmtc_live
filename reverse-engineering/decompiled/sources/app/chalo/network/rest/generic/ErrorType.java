package app.chalo.network.rest.generic;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lapp/chalo/network/rest/generic/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_CLIENT_ERROR", "TYPE_COMMON_HEADER", "TYPE_NETWORK_ERROR", "TYPE_NO_INTERNET", "TYPE_NO_UPDATE_IN_DATA", "TYPE_NONE", "TYPE_REQUEST_CANCELLED", "TYPE_SERVER_ERROR", "TYPE_TIMEOUT", "TYPE_UNAUTHORIZED", "TYPE_UNKNOWN", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ErrorType {
    TYPE_CLIENT_ERROR,
    TYPE_COMMON_HEADER,
    TYPE_NETWORK_ERROR,
    TYPE_NO_INTERNET,
    TYPE_NO_UPDATE_IN_DATA,
    TYPE_NONE,
    TYPE_REQUEST_CANCELLED,
    TYPE_SERVER_ERROR,
    TYPE_TIMEOUT,
    TYPE_UNAUTHORIZED,
    TYPE_UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/generic/ErrorType$Companion;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ErrorType a(int i) {
            if (i == 304) {
                return ErrorType.TYPE_NO_UPDATE_IN_DATA;
            }
            if (i == 401) {
                return ErrorType.TYPE_UNAUTHORIZED;
            }
            if (400 > i || i >= 500) {
                return (500 > i || i >= 600) ? ErrorType.TYPE_UNKNOWN : ErrorType.TYPE_SERVER_ERROR;
            }
            return ErrorType.TYPE_CLIENT_ERROR;
        }
    }

    public static EnumEntries<ErrorType> getEntries() {
        return $ENTRIES;
    }
}
