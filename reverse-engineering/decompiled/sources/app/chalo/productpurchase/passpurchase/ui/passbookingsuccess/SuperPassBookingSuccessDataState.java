package app.chalo.productpurchase.passpurchase.ui.passbookingsuccess;

import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passbookingsuccess/SuperPassBookingSuccessDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBookingSuccessDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8435a;
    public final String b;
    public final SuperPassSubType c;
    public final boolean d;
    public final SuperPassPurchaseStopsInfo e;

    public SuperPassBookingSuccessDataState(String str, String str2, SuperPassSubType superPassSubType, boolean z, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo) {
        this.f8435a = str;
        this.b = str2;
        this.c = superPassSubType;
        this.d = z;
        this.e = superPassPurchaseStopsInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBookingSuccessDataState)) {
            return false;
        }
        SuperPassBookingSuccessDataState superPassBookingSuccessDataState = (SuperPassBookingSuccessDataState) obj;
        return Intrinsics.d(this.f8435a, superPassBookingSuccessDataState.f8435a) && Intrinsics.d(this.b, superPassBookingSuccessDataState.b) && this.c == superPassBookingSuccessDataState.c && this.d == superPassBookingSuccessDataState.d && Intrinsics.d(this.e, superPassBookingSuccessDataState.e);
    }

    public final int hashCode() {
        String str = this.f8435a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SuperPassSubType superPassSubType = this.c;
        int iHashCode3 = (((iHashCode2 + (superPassSubType == null ? 0 : superPassSubType.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.e;
        return iHashCode3 + (superPassPurchaseStopsInfo != null ? superPassPurchaseStopsInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassBookingSuccessDataState(source=", this.f8435a, ", passId=", this.b, ", subType=");
        sbE.append(this.c);
        sbE.append(", canActivate=");
        sbE.append(this.d);
        sbE.append(", purchaseStopsInfo=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
