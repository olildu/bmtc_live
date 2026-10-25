package app.chalo.instantticket.data.model.app.response;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/instantticket/data/model/app/response/FareBreakupOperationType;", "", CLConstants.FIELD_CODE, "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "ADDITION", "SUBTRACTION", "NO_OP", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FareBreakupOperationType {
    ADDITION(0),
    SUBTRACTION(1),
    NO_OP(-1);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final int code;

    FareBreakupOperationType(int i) {
        this.code = i;
    }

    public static EnumEntries<FareBreakupOperationType> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }
}
