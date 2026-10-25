package app.chalo.productactivation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductActivationUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8044a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public ProductActivationUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().k, 1);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f8044a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActivationUISpec)) {
            return false;
        }
        ProductActivationUISpec productActivationUISpec = (ProductActivationUISpec) obj;
        return Intrinsics.d(this.f8044a, productActivationUISpec.f8044a) && Intrinsics.d(this.b, productActivationUISpec.b) && Intrinsics.d(this.c, productActivationUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f8044a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.e(py.i(this.b, this.f8044a, "ProductActivationUISpec(backgroundColor=", ", paddingAroundCard=", ", userProfilingBannerPadding="), this.c, ")");
    }
}
