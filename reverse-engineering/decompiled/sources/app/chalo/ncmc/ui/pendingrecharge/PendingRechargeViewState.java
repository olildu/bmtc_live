package app.chalo.ncmc.ui.pendingrecharge;

import defpackage.b3;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingRechargeViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6423a;
    public final ArrayList b;
    public final boolean c;

    public PendingRechargeViewState(boolean z, ArrayList arrayList, boolean z2) {
        this.f6423a = z;
        this.b = arrayList;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingRechargeViewState)) {
            return false;
        }
        PendingRechargeViewState pendingRechargeViewState = (PendingRechargeViewState) obj;
        return this.f6423a == pendingRechargeViewState.f6423a && this.b.equals(pendingRechargeViewState.b) && this.c == pendingRechargeViewState.c;
    }

    public final int hashCode() {
        return xs.e(this.b, (this.f6423a ? 1231 : 1237) * 31, 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingRechargeViewState(showLoadingDialog=");
        sb.append(this.f6423a);
        sb.append(", unsyncedRecharges=");
        sb.append(this.b);
        sb.append(", isUvikTapAvailable=");
        return b3.g(")", sb, this.c);
    }
}
