package app.chalo.productsummary.ui.data;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/ProductSummarySuccessScreenUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSummarySuccessScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8757a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final float d;

    public ProductSummarySuccessScreenUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 9);
        float f = ChaloThemeHelper.a().i;
        this.f8757a = chaloPadding;
        this.b = ChaloColorToken.ActivityBackground.f9755a;
        this.c = ChaloColorToken.White.f9870a;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSummarySuccessScreenUISpec)) {
            return false;
        }
        ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = (ProductSummarySuccessScreenUISpec) obj;
        return Intrinsics.d(this.f8757a, productSummarySuccessScreenUISpec.f8757a) && Intrinsics.d(this.b, productSummarySuccessScreenUISpec.b) && Intrinsics.d(this.c, productSummarySuccessScreenUISpec.c) && Dp.m7283equalsimpl0(this.d, productSummarySuccessScreenUISpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, z40.b(this.b, this.f8757a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f8757a, this.b, "ProductSummarySuccessScreenUISpec(contentPadding=", ", screenBackgroundColorToken=", ", itemBackgroundColorToken=");
        sbL.append(this.c);
        sbL.append(", zigZagViewAndBookingHelpSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}
