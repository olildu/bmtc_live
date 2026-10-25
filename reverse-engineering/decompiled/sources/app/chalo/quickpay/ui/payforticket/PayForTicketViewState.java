package app.chalo.quickpay.ui.payforticket;

import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketViewState;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PayForTicketViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8890a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public PayForTicketViewState(String routeJsonString, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.i(routeJsonString, "routeJsonString");
        this.f8890a = z;
        this.b = z2;
        this.c = z3;
        this.d = routeJsonString;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayForTicketViewState)) {
            return false;
        }
        PayForTicketViewState payForTicketViewState = (PayForTicketViewState) obj;
        return this.f8890a == payForTicketViewState.f8890a && this.b == payForTicketViewState.b && this.c == payForTicketViewState.c && Intrinsics.d(this.d, payForTicketViewState.d) && Intrinsics.d(this.e, payForTicketViewState.e);
    }

    public final int hashCode() {
        int iE = nf1.e((((((this.f8890a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d);
        String str = this.e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PayForTicketViewState(automaticNavigationInProgress=", ", shouldShowChaloPayCard=", ", shouldShowFindFareCard=", this.f8890a, this.b);
        pk0.x(", routeJsonString=", this.d, ", remainingCurrentBalance=", sbR, this.c);
        return vo1.p(sbR, this.e, ")");
    }
}
