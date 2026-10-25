package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/EligibleSubProductAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EligibleSubProductAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8631a;
    public final String b;
    public final String c;

    public EligibleSubProductAppModel(String productType, String productSubType, String productId) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(productId, "productId");
        this.f8631a = productType;
        this.b = productSubType;
        this.c = productId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibleSubProductAppModel)) {
            return false;
        }
        EligibleSubProductAppModel eligibleSubProductAppModel = (EligibleSubProductAppModel) obj;
        return Intrinsics.d(this.f8631a, eligibleSubProductAppModel.f8631a) && Intrinsics.d(this.b, eligibleSubProductAppModel.b) && Intrinsics.d(this.c, eligibleSubProductAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f8631a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("EligibleSubProductAppModel(productType=", this.f8631a, ", productSubType=", this.b, ", productId="), this.c, ")");
    }
}
