package app.chalo.ncmc.ui.pendingrecharge;

import defpackage.b3;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingRechargeDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6420a;
    public final List b;
    public final boolean c;

    public PendingRechargeDataState(List unsyncedRecharges, boolean z, boolean z2) {
        Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
        this.f6420a = z;
        this.b = unsyncedRecharges;
        this.c = z2;
    }

    public static PendingRechargeDataState a(PendingRechargeDataState pendingRechargeDataState, boolean z, List unsyncedRecharges, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = pendingRechargeDataState.f6420a;
        }
        if ((i & 2) != 0) {
            unsyncedRecharges = pendingRechargeDataState.b;
        }
        if ((i & 4) != 0) {
            z2 = pendingRechargeDataState.c;
        }
        pendingRechargeDataState.getClass();
        Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
        return new PendingRechargeDataState(unsyncedRecharges, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingRechargeDataState)) {
            return false;
        }
        PendingRechargeDataState pendingRechargeDataState = (PendingRechargeDataState) obj;
        return this.f6420a == pendingRechargeDataState.f6420a && Intrinsics.d(this.b, pendingRechargeDataState.b) && this.c == pendingRechargeDataState.c;
    }

    public final int hashCode() {
        return r30.b((this.f6420a ? 1231 : 1237) * 31, 31, this.b) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingRechargeDataState(showLoadingDialog=");
        sb.append(this.f6420a);
        sb.append(", unsyncedRecharges=");
        sb.append(this.b);
        sb.append(", isUvikTapAvailable=");
        return b3.g(")", sb, this.c);
    }
}
