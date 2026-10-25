package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import defpackage.b3;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationDataState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiProductValidationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiProductValidationData f10691a;
    public final List b;
    public final ProductValidationData c;
    public final ActiveQrState d;
    public final boolean e;

    public MultiProductValidationDataState(MultiProductValidationData multiProductValidationData, List children, ProductValidationData productValidationData, ActiveQrState activeQrState, boolean z) {
        Intrinsics.i(children, "children");
        Intrinsics.i(activeQrState, "activeQrState");
        this.f10691a = multiProductValidationData;
        this.b = children;
        this.c = productValidationData;
        this.d = activeQrState;
        this.e = z;
    }

    public static MultiProductValidationDataState a(MultiProductValidationDataState multiProductValidationDataState, List list, ProductValidationData productValidationData, ActiveQrState activeQrState, boolean z, int i) {
        List children = list;
        MultiProductValidationData multiProductValidationData = multiProductValidationDataState.f10691a;
        if ((i & 2) != 0) {
            children = multiProductValidationDataState.b;
        }
        if ((i & 4) != 0) {
            productValidationData = multiProductValidationDataState.c;
        }
        if ((i & 8) != 0) {
            activeQrState = multiProductValidationDataState.d;
        }
        if ((i & 16) != 0) {
            z = multiProductValidationDataState.e;
        }
        boolean z2 = z;
        multiProductValidationDataState.getClass();
        Intrinsics.i(children, "children");
        Intrinsics.i(activeQrState, "activeQrState");
        ActiveQrState activeQrState2 = activeQrState;
        return new MultiProductValidationDataState(multiProductValidationData, children, productValidationData, activeQrState2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductValidationDataState)) {
            return false;
        }
        MultiProductValidationDataState multiProductValidationDataState = (MultiProductValidationDataState) obj;
        return Intrinsics.d(this.f10691a, multiProductValidationDataState.f10691a) && Intrinsics.d(this.b, multiProductValidationDataState.b) && Intrinsics.d(this.c, multiProductValidationDataState.c) && Intrinsics.d(this.d, multiProductValidationDataState.d) && this.e == multiProductValidationDataState.e;
    }

    public final int hashCode() {
        MultiProductValidationData multiProductValidationData = this.f10691a;
        int iB = r30.b((multiProductValidationData == null ? 0 : multiProductValidationData.hashCode()) * 31, 31, this.b);
        ProductValidationData productValidationData = this.c;
        return ((this.d.hashCode() + ((iB + (productValidationData != null ? productValidationData.hashCode() : 0)) * 31)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiProductValidationDataState(groupData=");
        sb.append(this.f10691a);
        sb.append(", children=");
        sb.append(this.b);
        sb.append(", activeChild=");
        sb.append(this.c);
        sb.append(", activeQrState=");
        sb.append(this.d);
        sb.append(", isGroupExpired=");
        return b3.g(")", sb, this.e);
    }
}
