package app.chalo.electricitybill.ui.ebillpayment;

import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.button.ButtonUIState;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/TotalAmountUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TotalAmountUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalAmountUISpecs f2580a;
    public final TransactionInfoUIState b;
    public final ButtonUIState c;

    public TotalAmountUIState(TransactionInfoUIState totalAmount, ButtonUIState buttonUIState) {
        TotalAmountUISpecs totalAmountUISpecs = new TotalAmountUISpecs();
        Intrinsics.i(totalAmount, "totalAmount");
        this.f2580a = totalAmountUISpecs;
        this.b = totalAmount;
        this.c = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalAmountUIState)) {
            return false;
        }
        TotalAmountUIState totalAmountUIState = (TotalAmountUIState) obj;
        return Intrinsics.d(this.f2580a, totalAmountUIState.f2580a) && Intrinsics.d(this.b, totalAmountUIState.b) && Intrinsics.d(this.c, totalAmountUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2580a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalAmountUIState(specs=");
        sb.append(this.f2580a);
        sb.append(", totalAmount=");
        sb.append(this.b);
        sb.append(", payBtn=");
        return hq0.j(sb, this.c, ")");
    }
}
