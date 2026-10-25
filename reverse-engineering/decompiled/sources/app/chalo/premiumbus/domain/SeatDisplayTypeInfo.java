package app.chalo.premiumbus.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayTypeInfo;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatDisplayTypeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeatDisplayType f7257a;
    public final boolean b;

    public SeatDisplayTypeInfo(SeatDisplayType seatDisplayType, boolean z) {
        this.f7257a = seatDisplayType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatDisplayTypeInfo)) {
            return false;
        }
        SeatDisplayTypeInfo seatDisplayTypeInfo = (SeatDisplayTypeInfo) obj;
        return Intrinsics.d(this.f7257a, seatDisplayTypeInfo.f7257a) && this.b == seatDisplayTypeInfo.b;
    }

    public final int hashCode() {
        return (this.f7257a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SeatDisplayTypeInfo(displayType=" + this.f7257a + ", isBlockedInCurrentContext=" + this.b + ")";
    }
}
