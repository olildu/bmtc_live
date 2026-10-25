package app.chalo.home.domain;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lapp/chalo/home/domain/AutoLinkDeviceIdFailureReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "UNKNOWN_ERROR", "UNAUTHORIZED", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AutoLinkDeviceIdFailureReason {
    UNKNOWN_ERROR(0),
    UNAUTHORIZED(1);

    private final int errorCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/AutoLinkDeviceIdFailureReason$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static AutoLinkDeviceIdFailureReason a(int i) {
            AutoLinkDeviceIdFailureReason next;
            Iterator<AutoLinkDeviceIdFailureReason> it = AutoLinkDeviceIdFailureReason.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getErrorCode() != i);
            AutoLinkDeviceIdFailureReason autoLinkDeviceIdFailureReason = next;
            return autoLinkDeviceIdFailureReason == null ? AutoLinkDeviceIdFailureReason.UNKNOWN_ERROR : autoLinkDeviceIdFailureReason;
        }
    }

    AutoLinkDeviceIdFailureReason(int i) {
        this.errorCode = i;
    }

    public static EnumEntries<AutoLinkDeviceIdFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
