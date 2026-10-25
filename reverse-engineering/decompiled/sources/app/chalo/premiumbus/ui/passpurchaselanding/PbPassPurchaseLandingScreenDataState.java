package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.scenes.args.PassLandingFlowType;
import defpackage.b3;
import defpackage.cb0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbPassPurchaseLandingScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassLandingFlowType f7652a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PBStopSelectionScreenBottomSheetType e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    static {
        PassLandingFlowType.Companion companion = PassLandingFlowType.INSTANCE;
    }

    public PbPassPurchaseLandingScreenDataState(PassLandingFlowType flowType, boolean z, boolean z2, boolean z3, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, String str, String str2, String str3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.i(flowType, "flowType");
        this.f7652a = flowType;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = pBStopSelectionScreenBottomSheetType;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
    }

    public static PbPassPurchaseLandingScreenDataState a(PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState, PassLandingFlowType passLandingFlowType, boolean z, boolean z2, boolean z3, PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, String str, String str2, String str3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            passLandingFlowType = pbPassPurchaseLandingScreenDataState.f7652a;
        }
        PassLandingFlowType flowType = passLandingFlowType;
        if ((i & 2) != 0) {
            z = pbPassPurchaseLandingScreenDataState.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = pbPassPurchaseLandingScreenDataState.c;
        }
        boolean z7 = z2;
        boolean z8 = (i & 8) != 0 ? pbPassPurchaseLandingScreenDataState.d : z3;
        pbPassPurchaseLandingScreenDataState.getClass();
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType2 = (i & 32) != 0 ? pbPassPurchaseLandingScreenDataState.e : pBStopSelectionScreenBottomSheetType;
        String str4 = (i & 64) != 0 ? pbPassPurchaseLandingScreenDataState.f : str;
        String str5 = (i & 128) != 0 ? pbPassPurchaseLandingScreenDataState.g : str2;
        String str6 = (i & 256) != 0 ? pbPassPurchaseLandingScreenDataState.h : str3;
        boolean z9 = (i & 512) != 0 ? pbPassPurchaseLandingScreenDataState.i : true;
        boolean z10 = (i & 1024) != 0 ? pbPassPurchaseLandingScreenDataState.j : z4;
        boolean z11 = (i & 2048) != 0 ? pbPassPurchaseLandingScreenDataState.k : z5;
        pbPassPurchaseLandingScreenDataState.getClass();
        Intrinsics.i(flowType, "flowType");
        return new PbPassPurchaseLandingScreenDataState(flowType, z6, z7, z8, pBStopSelectionScreenBottomSheetType2, str4, str5, str6, z9, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbPassPurchaseLandingScreenDataState)) {
            return false;
        }
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState = (PbPassPurchaseLandingScreenDataState) obj;
        return Intrinsics.d(this.f7652a, pbPassPurchaseLandingScreenDataState.f7652a) && this.b == pbPassPurchaseLandingScreenDataState.b && this.c == pbPassPurchaseLandingScreenDataState.c && this.d == pbPassPurchaseLandingScreenDataState.d && Intrinsics.d(this.e, pbPassPurchaseLandingScreenDataState.e) && Intrinsics.d(this.f, pbPassPurchaseLandingScreenDataState.f) && Intrinsics.d(this.g, pbPassPurchaseLandingScreenDataState.g) && Intrinsics.d(this.h, pbPassPurchaseLandingScreenDataState.h) && this.i == pbPassPurchaseLandingScreenDataState.i && this.j == pbPassPurchaseLandingScreenDataState.j && this.k == pbPassPurchaseLandingScreenDataState.k;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f7652a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + 1237) * 31;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = this.e;
        int iHashCode2 = (iHashCode + (pBStopSelectionScreenBottomSheetType == null ? 0 : pBStopSelectionScreenBottomSheetType.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return ((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PbPassPurchaseLandingScreenDataState(flowType=");
        sb.append(this.f7652a);
        sb.append(", showOdPairSelectionCard=");
        sb.append(this.b);
        sb.append(", showFullScreenLoading=");
        z40.r(sb, this.c, ", isLoading=", this.d, ", showErrorScreen=false, bottomSheetType=");
        sb.append(this.e);
        sb.append(", fromStopSelectedName=");
        sb.append(this.f);
        sb.append(", toStopSelectedName=");
        cb0.t(sb, this.g, ", passInfoImageUrl=", this.h, ", showPassInfoPlotlineWidget=");
        z40.r(sb, this.i, ", isCurrentLocationAvailable=", this.j, ", shouldEnableProceedBtn=");
        return b3.g(")", sb, this.k);
    }
}
