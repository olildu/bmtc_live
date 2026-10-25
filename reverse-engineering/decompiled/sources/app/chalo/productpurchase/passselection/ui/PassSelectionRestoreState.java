package app.chalo.productpurchase.passselection.ui;

import app.chalo.constants.Source;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import defpackage.to0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionRestoreState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassSelectionRestoreState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8540a;
    public final Source b;
    public final SuperPassPurchaseStopsInfo c;
    public final PostPassPurchaseSuccessFlowType d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionRestoreState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionRestoreState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassSelectionRestoreState> serializer() {
            return PassSelectionRestoreState$$serializer.f8541a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new to0(28)), null, LazyKt.a(lazyThreadSafetyMode, new to0(29))};
    }

    public /* synthetic */ PassSelectionRestoreState(int i, Source source, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, String str) {
        this.f8540a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = source;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = superPassPurchaseStopsInfo;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = postPassPurchaseSuccessFlowType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassSelectionRestoreState)) {
            return false;
        }
        PassSelectionRestoreState passSelectionRestoreState = (PassSelectionRestoreState) obj;
        return Intrinsics.d(this.f8540a, passSelectionRestoreState.f8540a) && this.b == passSelectionRestoreState.b && Intrinsics.d(this.c, passSelectionRestoreState.c) && this.d == passSelectionRestoreState.d;
    }

    public final int hashCode() {
        int iHashCode = this.f8540a.hashCode() * 31;
        Source source = this.b;
        int iHashCode2 = (iHashCode + (source == null ? 0 : source.hashCode())) * 31;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.c;
        int iHashCode3 = (iHashCode2 + (superPassPurchaseStopsInfo == null ? 0 : superPassPurchaseStopsInfo.hashCode())) * 31;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = this.d;
        return iHashCode3 + (postPassPurchaseSuccessFlowType != null ? postPassPurchaseSuccessFlowType.hashCode() : 0);
    }

    public final String toString() {
        return "PassSelectionRestoreState(productId=" + this.f8540a + ", previousScreenSource=" + this.b + ", stopsInfo=" + this.c + ", postSuccessFlow=" + this.d + ")";
    }

    public PassSelectionRestoreState(String productId, Source source, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType) {
        Intrinsics.i(productId, "productId");
        this.f8540a = productId;
        this.b = source;
        this.c = superPassPurchaseStopsInfo;
        this.d = postPassPurchaseSuccessFlowType;
    }
}
