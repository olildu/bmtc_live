package app.chalo.electricitybill.ui.ebillfetch;

import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillfetch/EBillFetchDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EBillFetchDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2558a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ElectricityBillAppModel h;

    public EBillFetchDataState(boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, boolean z5, ElectricityBillAppModel electricityBillAppModel) {
        this.f2558a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = electricityBillAppModel;
    }

    public static EBillFetchDataState a(EBillFetchDataState eBillFetchDataState, boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, boolean z5, ElectricityBillAppModel electricityBillAppModel, int i) {
        if ((i & 1) != 0) {
            z = eBillFetchDataState.f2558a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            str = eBillFetchDataState.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z2 = eBillFetchDataState.c;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            str2 = eBillFetchDataState.d;
        }
        String currentlyEnteredNumber = str2;
        if ((i & 16) != 0) {
            z3 = eBillFetchDataState.e;
        }
        boolean z8 = z3;
        if ((i & 32) != 0) {
            z4 = eBillFetchDataState.f;
        }
        boolean z9 = z4;
        boolean z10 = (i & 64) != 0 ? eBillFetchDataState.g : z5;
        ElectricityBillAppModel electricityBillAppModel2 = (i & 128) != 0 ? eBillFetchDataState.h : electricityBillAppModel;
        eBillFetchDataState.getClass();
        Intrinsics.i(currentlyEnteredNumber, "currentlyEnteredNumber");
        return new EBillFetchDataState(z6, str3, z7, currentlyEnteredNumber, z8, z9, z10, electricityBillAppModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EBillFetchDataState)) {
            return false;
        }
        EBillFetchDataState eBillFetchDataState = (EBillFetchDataState) obj;
        return this.f2558a == eBillFetchDataState.f2558a && Intrinsics.d(this.b, eBillFetchDataState.b) && this.c == eBillFetchDataState.c && Intrinsics.d(this.d, eBillFetchDataState.d) && this.e == eBillFetchDataState.e && this.f == eBillFetchDataState.f && this.g == eBillFetchDataState.g && Intrinsics.d(this.h, eBillFetchDataState.h);
    }

    public final int hashCode() {
        int i = (this.f2558a ? 1231 : 1237) * 31;
        String str = this.b;
        int iE = (((((nf1.e((((i + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31, 31, this.d) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        ElectricityBillAppModel electricityBillAppModel = this.h;
        return iE + (electricityBillAppModel != null ? electricityBillAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EBillFetchDataState(isLoading=");
        sb.append(this.f2558a);
        sb.append(", customerNoError=");
        sb.append(this.b);
        sb.append(", isNextBtnClickable=");
        pk0.x(", currentlyEnteredNumber=", this.d, ", showEBillPaymentDialog=", sb, this.c);
        z40.r(sb, this.e, ", showEBillFetchSnackBar=", this.f, ", showInternetConnectionSnackBar=");
        sb.append(this.g);
        sb.append(", electricityBillAppModel=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
