package app.chalo.multimodalticket.validation;

import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalChildValidationTarget;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiModalChildValidationTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationData f5972a;
    public final ProductValidationConfig b;

    public MultiModalChildValidationTarget(ProductValidationData productValidationData, ProductValidationConfig validationConfig) {
        Intrinsics.i(validationConfig, "validationConfig");
        this.f5972a = productValidationData;
        this.b = validationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalChildValidationTarget)) {
            return false;
        }
        MultiModalChildValidationTarget multiModalChildValidationTarget = (MultiModalChildValidationTarget) obj;
        return Intrinsics.d(this.f5972a, multiModalChildValidationTarget.f5972a) && Intrinsics.d(this.b, multiModalChildValidationTarget.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5972a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiModalChildValidationTarget(validationData=" + this.f5972a + ", validationConfig=" + this.b + ")";
    }
}
