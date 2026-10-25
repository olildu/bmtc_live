package app.chalo.productpurchase.passselection.ui;

import app.chalo.constants.Source;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import defpackage.b3;
import defpackage.nf1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8533a;
    public final Source b;
    public final SuperPassPurchaseStopsInfo c;
    public final PostPassPurchaseSuccessFlowType d;
    public final ProductConfigResponseAppModel.SuperPassConfigAppModel e;
    public final Map f;
    public final Map g;
    public final PassSelectionScreenType h;
    public final boolean i;

    public PassSelectionDataState(String productId, Source previousScreenSource, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postSuccessFlow, ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel, Map map, Map map2, PassSelectionScreenType passSelectionScreenType, boolean z) {
        Intrinsics.i(productId, "productId");
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        Intrinsics.i(postSuccessFlow, "postSuccessFlow");
        this.f8533a = productId;
        this.b = previousScreenSource;
        this.c = superPassPurchaseStopsInfo;
        this.d = postSuccessFlow;
        this.e = superPassConfigAppModel;
        this.f = map;
        this.g = map2;
        this.h = passSelectionScreenType;
        this.i = z;
    }

    public static PassSelectionDataState a(PassSelectionDataState passSelectionDataState, ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel, HashMap map, LinkedHashMap linkedHashMap, PassSelectionScreenType passSelectionScreenType, int i) {
        String productId = passSelectionDataState.f8533a;
        Source previousScreenSource = passSelectionDataState.b;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = passSelectionDataState.c;
        PostPassPurchaseSuccessFlowType postSuccessFlow = passSelectionDataState.d;
        if ((i & 16) != 0) {
            superPassConfigAppModel = passSelectionDataState.e;
        }
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel2 = superPassConfigAppModel;
        Map map2 = map;
        if ((i & 32) != 0) {
            map2 = passSelectionDataState.f;
        }
        Map map3 = map2;
        Map map4 = linkedHashMap;
        if ((i & 64) != 0) {
            map4 = passSelectionDataState.g;
        }
        boolean z = passSelectionDataState.i;
        passSelectionDataState.getClass();
        Intrinsics.i(productId, "productId");
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        Intrinsics.i(postSuccessFlow, "postSuccessFlow");
        return new PassSelectionDataState(productId, previousScreenSource, superPassPurchaseStopsInfo, postSuccessFlow, superPassConfigAppModel2, map3, map4, passSelectionScreenType, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSelectionDataState)) {
            return false;
        }
        PassSelectionDataState passSelectionDataState = (PassSelectionDataState) obj;
        return Intrinsics.d(this.f8533a, passSelectionDataState.f8533a) && this.b == passSelectionDataState.b && Intrinsics.d(this.c, passSelectionDataState.c) && this.d == passSelectionDataState.d && Intrinsics.d(this.e, passSelectionDataState.e) && Intrinsics.d(this.f, passSelectionDataState.f) && Intrinsics.d(this.g, passSelectionDataState.g) && Intrinsics.d(this.h, passSelectionDataState.h) && this.i == passSelectionDataState.i;
    }

    public final int hashCode() {
        int iF = nf1.f(this.b, this.f8533a.hashCode() * 31, 31);
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.c;
        int iHashCode = (this.d.hashCode() + ((iF + (superPassPurchaseStopsInfo == null ? 0 : superPassPurchaseStopsInfo.hashCode())) * 31)) * 31;
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = this.e;
        int iHashCode2 = (iHashCode + (superPassConfigAppModel == null ? 0 : superPassConfigAppModel.hashCode())) * 31;
        Map map = this.f;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.g;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        PassSelectionScreenType passSelectionScreenType = this.h;
        return ((iHashCode4 + (passSelectionScreenType != null ? passSelectionScreenType.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassSelectionDataState(productId=");
        sb.append(this.f8533a);
        sb.append(", previousScreenSource=");
        sb.append(this.b);
        sb.append(", stopsInfo=");
        sb.append(this.c);
        sb.append(", postSuccessFlow=");
        sb.append(this.d);
        sb.append(", productConfig=");
        sb.append(this.e);
        sb.append(", masterBookablePassConfigMap=");
        sb.append(this.f);
        sb.append(", sortedCategoryIdCategoryMap=");
        sb.append(this.g);
        sb.append(", screenType=");
        sb.append(this.h);
        sb.append(", isPremiumPassLandingFlow=");
        return b3.g(")", sb, this.i);
    }

    public /* synthetic */ PassSelectionDataState(int i, Source source, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, String str) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Source.UNKNOWN : source, (i & 4) != 0 ? null : superPassPurchaseStopsInfo, (i & 8) != 0 ? PostPassPurchaseSuccessFlowType.ACTIVATION : postPassPurchaseSuccessFlowType, null, null, null, null, false);
    }
}
