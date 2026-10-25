package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/EBillHistoryItemUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillHistoryItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillHistoryItemUISpecs f2596a = new EBillHistoryItemUISpecs();
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final UiEventHandler$Companion$fromLambda$1 f;

    public EBillHistoryItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, TextUIState.ChaloTextUIState chaloTextUIState4, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = chaloTextUIState3;
        this.e = chaloTextUIState4;
        this.f = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillHistoryItemUIState)) {
            return false;
        }
        EBillHistoryItemUIState eBillHistoryItemUIState = (EBillHistoryItemUIState) obj;
        return Intrinsics.d(this.f2596a, eBillHistoryItemUIState.f2596a) && Intrinsics.d(this.b, eBillHistoryItemUIState.b) && Intrinsics.d(this.c, eBillHistoryItemUIState.c) && Intrinsics.d(this.d, eBillHistoryItemUIState.d) && Intrinsics.d(this.e, eBillHistoryItemUIState.e) && Intrinsics.d(this.f, eBillHistoryItemUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.f(this.e, r30.f(this.d, r30.f(this.c, r30.f(this.b, this.f2596a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EBillHistoryItemUIState(specs=");
        sb.append(this.f2596a);
        sb.append(", accountNumber=");
        sb.append(this.b);
        sb.append(", amount=");
        r30.p(sb, this.c, ", bookingDate=", this.d, ", status=");
        sb.append(this.e);
        sb.append(", eventHandler=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
