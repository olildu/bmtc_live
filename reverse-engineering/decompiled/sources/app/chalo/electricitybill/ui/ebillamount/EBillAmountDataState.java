package app.chalo.electricitybill.ui.ebillamount;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillamount/EBillAmountDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillAmountDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2548a;
    public final ElectricityBillAppModel b;
    public final String c;
    public final String d;

    public EBillAmountDataState(boolean z, ElectricityBillAppModel electricityBillAppModel, String str, String str2) {
        this.f2548a = z;
        this.b = electricityBillAppModel;
        this.c = str;
        this.d = str2;
    }

    public static EBillAmountDataState a(EBillAmountDataState eBillAmountDataState, boolean z, ElectricityBillAppModel electricityBillAppModel, String str, String str2, int i) {
        if ((i & 2) != 0) {
            electricityBillAppModel = eBillAmountDataState.b;
        }
        if ((i & 8) != 0) {
            str2 = eBillAmountDataState.d;
        }
        eBillAmountDataState.getClass();
        return new EBillAmountDataState(z, electricityBillAppModel, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillAmountDataState)) {
            return false;
        }
        EBillAmountDataState eBillAmountDataState = (EBillAmountDataState) obj;
        return this.f2548a == eBillAmountDataState.f2548a && Intrinsics.d(this.b, eBillAmountDataState.b) && Intrinsics.d(this.c, eBillAmountDataState.c) && Intrinsics.d(this.d, eBillAmountDataState.d);
    }

    public final int hashCode() {
        int i = (this.f2548a ? 1231 : 1237) * 31;
        ElectricityBillAppModel electricityBillAppModel = this.b;
        int iHashCode = (i + (electricityBillAppModel == null ? 0 : electricityBillAppModel.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EBillAmountDataState(isNextBtnEnabled=");
        sb.append(this.f2548a);
        sb.append(", electricityBillAppModel=");
        sb.append(this.b);
        sb.append(", currentlyEnteredAmountString=");
        return r30.i(sb, this.c, ", eBillAmountError=", this.d, ")");
    }
}
