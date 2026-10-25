package app.chalo.electricitybill.ui.paymenthistory;

import defpackage.b3;
import defpackage.cb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/ElectricityPaymentHistoryDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElectricityPaymentHistoryDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2598a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;

    public ElectricityPaymentHistoryDataState(boolean z, List list, String str, String str2, boolean z2) {
        this.f2598a = z;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = z2;
    }

    public static ElectricityPaymentHistoryDataState a(ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState, boolean z, List list, String str, String str2, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = electricityPaymentHistoryDataState.f2598a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            list = electricityPaymentHistoryDataState.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = electricityPaymentHistoryDataState.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = electricityPaymentHistoryDataState.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z2 = electricityPaymentHistoryDataState.e;
        }
        electricityPaymentHistoryDataState.getClass();
        return new ElectricityPaymentHistoryDataState(z3, list2, str3, str4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityPaymentHistoryDataState)) {
            return false;
        }
        ElectricityPaymentHistoryDataState electricityPaymentHistoryDataState = (ElectricityPaymentHistoryDataState) obj;
        return this.f2598a == electricityPaymentHistoryDataState.f2598a && Intrinsics.d(this.b, electricityPaymentHistoryDataState.b) && Intrinsics.d(this.c, electricityPaymentHistoryDataState.c) && Intrinsics.d(this.d, electricityPaymentHistoryDataState.d) && this.e == electricityPaymentHistoryDataState.e;
    }

    public final int hashCode() {
        int i = (this.f2598a ? 1231 : 1237) * 31;
        List list = this.b;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElectricityPaymentHistoryDataState(isLoading=");
        sb.append(this.f2598a);
        sb.append(", paymentHistoryList=");
        sb.append(this.b);
        sb.append(", infoMessage=");
        cb0.t(sb, this.c, ", genericErrorSnackBarMsg=", this.d, ", showLoadHistoryErrorSnackBar=");
        return b3.g(")", sb, this.e);
    }
}
