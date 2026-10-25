package app.chalo.validationsdk.blevalidation.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/ProductDetailsDisplayFieldData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDetailsDisplayFieldData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10617a;
    public final String b;

    public ProductDetailsDisplayFieldData(String fieldHeading, String fieldValue) {
        Intrinsics.i(fieldHeading, "fieldHeading");
        Intrinsics.i(fieldValue, "fieldValue");
        this.f10617a = fieldHeading;
        this.b = fieldValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsDisplayFieldData)) {
            return false;
        }
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) obj;
        return Intrinsics.d(this.f10617a, productDetailsDisplayFieldData.f10617a) && Intrinsics.d(this.b, productDetailsDisplayFieldData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10617a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ProductDetailsDisplayFieldData(fieldHeading=", this.f10617a, ", fieldValue=", this.b, ")");
    }
}
