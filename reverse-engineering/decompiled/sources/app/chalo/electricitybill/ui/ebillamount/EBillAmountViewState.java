package app.chalo.electricitybill.ui.ebillamount;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillAmountViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EBillAmountUISpecs f2553a;
    public final ToolbarUIState b;
    public final EnterAmountCardUIState c;
    public final CustomerInfoUIState d;
    public final TransactionInfoUIState e;
    public final DividerUIState f;

    public EBillAmountViewState(ToolbarUIState toolbar, EnterAmountCardUIState enterAmountCard, CustomerInfoUIState customerInfoUIState, TransactionInfoUIState transactionInfoUIState) {
        EBillAmountUISpecs eBillAmountUISpecs = new EBillAmountUISpecs();
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.NewActivityColor.f9827a, null, 4);
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(enterAmountCard, "enterAmountCard");
        this.f2553a = eBillAmountUISpecs;
        this.b = toolbar;
        this.c = enterAmountCard;
        this.d = customerInfoUIState;
        this.e = transactionInfoUIState;
        this.f = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillAmountViewState)) {
            return false;
        }
        EBillAmountViewState eBillAmountViewState = (EBillAmountViewState) obj;
        return Intrinsics.d(this.f2553a, eBillAmountViewState.f2553a) && Intrinsics.d(this.b, eBillAmountViewState.b) && Intrinsics.d(this.c, eBillAmountViewState.c) && Intrinsics.d(this.d, eBillAmountViewState.d) && Intrinsics.d(this.e, eBillAmountViewState.e) && Intrinsics.d(this.f, eBillAmountViewState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + t8.d(this.b, this.f2553a.f2552a.hashCode() * 31, 31)) * 31;
        CustomerInfoUIState customerInfoUIState = this.d;
        int iHashCode2 = (iHashCode + (customerInfoUIState == null ? 0 : customerInfoUIState.hashCode())) * 31;
        TransactionInfoUIState transactionInfoUIState = this.e;
        return this.f.hashCode() + ((iHashCode2 + (transactionInfoUIState != null ? transactionInfoUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EBillAmountViewState(specs=" + this.f2553a + ", toolbar=" + this.b + ", enterAmountCard=" + this.c + ", consumerDetailsCard=" + this.d + ", billDetailsCard=" + this.e + ", divider=" + this.f + ")";
    }
}
