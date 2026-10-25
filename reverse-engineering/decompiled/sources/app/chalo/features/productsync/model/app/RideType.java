package app.chalo.features.productsync.model.app;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lapp/chalo/features/productsync/model/app/RideType;", "", "rideType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRideType", "()Ljava/lang/String;", "SUPER_PASS_RIDE", "INSTANT_TICKET_RIDE", "PREMIUM_RESERVE_TICKET_RIDE", "ONDC_RIDE", "QUICK_PAY_RIDE", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum RideType {
    SUPER_PASS_RIDE("SUPER_PASS_RIDE"),
    INSTANT_TICKET_RIDE("INSTANT_TICKET_RIDE"),
    PREMIUM_RESERVE_TICKET_RIDE("PREMIUM_RESERVE_TICKET_RIDE"),
    ONDC_RIDE("ONDC_RIDE"),
    QUICK_PAY_RIDE("QUICK_PAY_RIDE"),
    UNKNOWN("");

    private final String rideType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/productsync/model/app/RideType$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static RideType a(String rideType) {
            RideType next;
            Intrinsics.i(rideType, "rideType");
            Iterator<RideType> it = RideType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getRideType(), rideType));
            RideType rideType2 = next;
            return rideType2 == null ? RideType.UNKNOWN : rideType2;
        }
    }

    RideType(String str) {
        this.rideType = str;
    }

    public static EnumEntries<RideType> getEntries() {
        return $ENTRIES;
    }

    public final String getRideType() {
        return this.rideType;
    }
}
