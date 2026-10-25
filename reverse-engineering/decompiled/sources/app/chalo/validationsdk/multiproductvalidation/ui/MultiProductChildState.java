package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductChildState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiProductChildState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationData f10688a;
    public final boolean b;
    public final boolean c;

    public MultiProductChildState(ProductValidationData productData, boolean z, boolean z2) {
        Intrinsics.i(productData, "productData");
        this.f10688a = productData;
        this.b = z;
        this.c = z2;
    }

    public static MultiProductChildState a(MultiProductChildState multiProductChildState, boolean z, boolean z2) {
        ProductValidationData productData = multiProductChildState.f10688a;
        multiProductChildState.getClass();
        Intrinsics.i(productData, "productData");
        return new MultiProductChildState(productData, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductChildState)) {
            return false;
        }
        MultiProductChildState multiProductChildState = (MultiProductChildState) obj;
        return Intrinsics.d(this.f10688a, multiProductChildState.f10688a) && this.b == multiProductChildState.b && this.c == multiProductChildState.c;
    }

    public final int hashCode() {
        return (((this.f10688a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiProductChildState(productData=");
        sb.append(this.f10688a);
        sb.append(", isExpired=");
        sb.append(this.b);
        sb.append(", isUsed=");
        return b3.g(")", sb, this.c);
    }
}
