package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lapp/chalo/juspay/JusPaySdkError;", "", "errorCode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "Unknown", "IncorrectBusinessLogic", "UserBackPressed", "IntegrationError", "UserError", "NoInternet", "DelayInTransactionStatus", "DashboardConfigError", "UnsupportedFeature", "ServerError", "TransactionFailedAtPG", "InitiateRequestExceeded", "PermissionError", "UpiTechnicalFailure", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum JusPaySdkError {
    Unknown("JP_000"),
    IncorrectBusinessLogic("JP_001"),
    UserBackPressed("JP_002"),
    IntegrationError("JP_003"),
    UserError("JP_004"),
    NoInternet("JP_005"),
    DelayInTransactionStatus("JP_006"),
    DashboardConfigError("JP_008"),
    UnsupportedFeature("JP_010"),
    ServerError("JP_011"),
    TransactionFailedAtPG("JP_012"),
    InitiateRequestExceeded("JP_017"),
    PermissionError("JP_018"),
    UpiTechnicalFailure("JP_019");

    private final String errorCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    JusPaySdkError(String str) {
        this.errorCode = str;
    }

    public static EnumEntries<JusPaySdkError> getEntries() {
        return $ENTRIES;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }
}
