package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import defpackage.nf1;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7693a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final Integer e;
    public final PremiumBusProductPurchaseFlowType f;
    public final boolean g;
    public final PremiumBusProductSelectionConfig h;
    public final String i;

    public PremiumBusProductSelectionDataState(boolean z, boolean z2, List list, boolean z3, Integer num, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, boolean z4, PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, String str) {
        this.f7693a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = num;
        this.f = premiumBusProductPurchaseFlowType;
        this.g = z4;
        this.h = premiumBusProductSelectionConfig;
        this.i = str;
    }

    public static PremiumBusProductSelectionDataState a(PremiumBusProductSelectionDataState premiumBusProductSelectionDataState, boolean z, boolean z2, ArrayList arrayList, boolean z3, Integer num, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, boolean z4, PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, String str, int i) {
        if ((i & 1) != 0) {
            z = premiumBusProductSelectionDataState.f7693a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = premiumBusProductSelectionDataState.b;
        }
        boolean z6 = z2;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = premiumBusProductSelectionDataState.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z3 = premiumBusProductSelectionDataState.d;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            num = premiumBusProductSelectionDataState.e;
        }
        Integer num2 = num;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType2 = (i & 32) != 0 ? premiumBusProductSelectionDataState.f : premiumBusProductPurchaseFlowType;
        boolean z8 = (i & 64) != 0 ? premiumBusProductSelectionDataState.g : z4;
        PremiumBusProductSelectionConfig premiumBusProductSelectionConfig2 = (i & 128) != 0 ? premiumBusProductSelectionDataState.h : premiumBusProductSelectionConfig;
        String str2 = (i & 256) != 0 ? premiumBusProductSelectionDataState.i : str;
        premiumBusProductSelectionDataState.getClass();
        Intrinsics.i(premiumBusProductSelectionConfig2, "premiumBusProductSelectionConfig");
        return new PremiumBusProductSelectionDataState(z5, z6, list2, z7, num2, premiumBusProductPurchaseFlowType2, z8, premiumBusProductSelectionConfig2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionDataState)) {
            return false;
        }
        PremiumBusProductSelectionDataState premiumBusProductSelectionDataState = (PremiumBusProductSelectionDataState) obj;
        return this.f7693a == premiumBusProductSelectionDataState.f7693a && this.b == premiumBusProductSelectionDataState.b && Intrinsics.d(this.c, premiumBusProductSelectionDataState.c) && this.d == premiumBusProductSelectionDataState.d && Intrinsics.d(this.e, premiumBusProductSelectionDataState.e) && Intrinsics.d(this.f, premiumBusProductSelectionDataState.f) && this.g == premiumBusProductSelectionDataState.g && Intrinsics.d(this.h, premiumBusProductSelectionDataState.h) && Intrinsics.d(this.i, premiumBusProductSelectionDataState.i);
    }

    public final int hashCode() {
        int i = (((this.f7693a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        List list = this.c;
        int iHashCode = (((i + (list == null ? 0 : list.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = this.f;
        int iHashCode3 = (this.h.hashCode() + ((((iHashCode2 + (premiumBusProductPurchaseFlowType == null ? 0 : premiumBusProductPurchaseFlowType.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31)) * 31;
        String str = this.i;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PremiumBusProductSelectionDataState(isLoading=", ", showLoadingDialog=", ", productsList=", this.f7693a, this.b);
        sbR.append(this.c);
        sbR.append(", shouldShowError=");
        sbR.append(this.d);
        sbR.append(", errorCode=");
        sbR.append(this.e);
        sbR.append(", premiumBusProductPurchaseFlowType=");
        sbR.append(this.f);
        sbR.append(", isFirstElementAtTop=");
        sbR.append(this.g);
        sbR.append(", premiumBusProductSelectionConfig=");
        sbR.append(this.h);
        sbR.append(", selectedProductId=");
        return vo1.p(sbR, this.i, ")");
    }
}
