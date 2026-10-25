package app.chalo.premiumbus.ui.faredetails.contract;

import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import defpackage.b3;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsComponentDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsComponentDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusFareDetailsFlowType f7572a;
    public final PremiumBusFareDetailsDataState b;
    public final boolean c;
    public final PremiumBusFareDetailsSwitchError d;
    public final String e;
    public final List f;
    public final boolean g;

    public PremiumBusFareDetailsComponentDataState(PremiumBusFareDetailsFlowType activeFlowType, PremiumBusFareDetailsDataState premiumBusFareDetailsDataState, boolean z, PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError, String str, List passengerFareDetails, boolean z2) {
        Intrinsics.i(activeFlowType, "activeFlowType");
        Intrinsics.i(passengerFareDetails, "passengerFareDetails");
        this.f7572a = activeFlowType;
        this.b = premiumBusFareDetailsDataState;
        this.c = z;
        this.d = premiumBusFareDetailsSwitchError;
        this.e = str;
        this.f = passengerFareDetails;
        this.g = z2;
    }

    public static PremiumBusFareDetailsComponentDataState a(PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState, PremiumBusFareDetailsFlowType premiumBusFareDetailsFlowType, PremiumBusFareDetailsDataState premiumBusFareDetailsDataState, boolean z, PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError, String str, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            premiumBusFareDetailsFlowType = premiumBusFareDetailsComponentDataState.f7572a;
        }
        PremiumBusFareDetailsFlowType activeFlowType = premiumBusFareDetailsFlowType;
        if ((i & 2) != 0) {
            premiumBusFareDetailsDataState = premiumBusFareDetailsComponentDataState.b;
        }
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
        if ((i & 4) != 0) {
            z = premiumBusFareDetailsComponentDataState.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState.d;
        }
        PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError2 = premiumBusFareDetailsSwitchError;
        if ((i & 16) != 0) {
            str = premiumBusFareDetailsComponentDataState.e;
        }
        String totalPayableAmount = str;
        if ((i & 32) != 0) {
            list = premiumBusFareDetailsComponentDataState.f;
        }
        List passengerFareDetails = list;
        if ((i & 64) != 0) {
            z2 = premiumBusFareDetailsComponentDataState.g;
        }
        premiumBusFareDetailsComponentDataState.getClass();
        Intrinsics.i(activeFlowType, "activeFlowType");
        Intrinsics.i(totalPayableAmount, "totalPayableAmount");
        Intrinsics.i(passengerFareDetails, "passengerFareDetails");
        return new PremiumBusFareDetailsComponentDataState(activeFlowType, premiumBusFareDetailsDataState2, z3, premiumBusFareDetailsSwitchError2, totalPayableAmount, passengerFareDetails, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsComponentDataState)) {
            return false;
        }
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState = (PremiumBusFareDetailsComponentDataState) obj;
        return Intrinsics.d(this.f7572a, premiumBusFareDetailsComponentDataState.f7572a) && Intrinsics.d(this.b, premiumBusFareDetailsComponentDataState.b) && this.c == premiumBusFareDetailsComponentDataState.c && Intrinsics.d(this.d, premiumBusFareDetailsComponentDataState.d) && Intrinsics.d(this.e, premiumBusFareDetailsComponentDataState.e) && Intrinsics.d(this.f, premiumBusFareDetailsComponentDataState.f) && this.g == premiumBusFareDetailsComponentDataState.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.f7572a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError = this.d;
        return r30.b(nf1.e((iHashCode + (premiumBusFareDetailsSwitchError == null ? 0 : premiumBusFareDetailsSwitchError.hashCode())) * 31, 31, this.e), 31, this.f) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusFareDetailsComponentDataState(activeFlowType=");
        sb.append(this.f7572a);
        sb.append(", activeDelegateState=");
        sb.append(this.b);
        sb.append(", isSwitchInProgress=");
        sb.append(this.c);
        sb.append(", switchError=");
        sb.append(this.d);
        sb.append(", totalPayableAmount=");
        pk0.w(this.e, ", passengerFareDetails=", ", shouldDisablePlusCounterForAllCategories=", sb, this.f);
        return b3.g(")", sb, this.g);
    }
}
