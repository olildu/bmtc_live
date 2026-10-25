package app.chalo.validationsdk.blevalidation.config;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/config/ChildValidationDelegate;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChildValidationDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationProduct f10469a;
    public final ProductValidationData b;
    public final ProductValidationConfig c;

    static {
        ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
    }

    public ChildValidationDelegate(ValidationProduct validationProduct, ProductValidationData productValidationData, ProductValidationConfig validationConfig) {
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationConfig, "validationConfig");
        this.f10469a = validationProduct;
        this.b = productValidationData;
        this.c = validationConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildValidationDelegate)) {
            return false;
        }
        ChildValidationDelegate childValidationDelegate = (ChildValidationDelegate) obj;
        return Intrinsics.d(this.f10469a, childValidationDelegate.f10469a) && Intrinsics.d(this.b, childValidationDelegate.b) && Intrinsics.d(this.c, childValidationDelegate.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f10469a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChildValidationDelegate(validationProduct=" + this.f10469a + ", validationData=" + this.b + ", validationConfig=" + this.c + ")";
    }
}
