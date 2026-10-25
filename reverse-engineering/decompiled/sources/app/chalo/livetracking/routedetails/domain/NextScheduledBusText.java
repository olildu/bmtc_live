package app.chalo.livetracking.routedetails.domain;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/NextScheduledBusText;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NextScheduledBusText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4444a;
    public final boolean b;

    public NextScheduledBusText(String nextScheduledBusText, boolean z) {
        Intrinsics.i(nextScheduledBusText, "nextScheduledBusText");
        this.f4444a = nextScheduledBusText;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NextScheduledBusText)) {
            return false;
        }
        NextScheduledBusText nextScheduledBusText = (NextScheduledBusText) obj;
        return Intrinsics.d(this.f4444a, nextScheduledBusText.f4444a) && this.b == nextScheduledBusText.b;
    }

    public final int hashCode() {
        return (this.f4444a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("NextScheduledBusText(nextScheduledBusText=", this.f4444a, ", isFrequencySlot=", ")", this.b);
    }
}
