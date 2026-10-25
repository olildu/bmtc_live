package app.chalo.checkout.ui.screen.upi;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/NoUpiAppsErrorUiSpecs;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoUpiAppsErrorUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f1599a;
    public final UiAlignment.Horizontal b;
    public final float c;

    public NoUpiAppsErrorUiSpecs() {
        float f = ChaloThemeHelper.a().u;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().i;
        this.f1599a = chaloPadding;
        this.b = UiAlignment.Horizontal.Center.f9884a;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoUpiAppsErrorUiSpecs)) {
            return false;
        }
        NoUpiAppsErrorUiSpecs noUpiAppsErrorUiSpecs = (NoUpiAppsErrorUiSpecs) obj;
        return Intrinsics.d(this.f1599a, noUpiAppsErrorUiSpecs.f1599a) && Intrinsics.d(this.b, noUpiAppsErrorUiSpecs.b) && Dp.m7283equalsimpl0(this.c, noUpiAppsErrorUiSpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.d(this.b, this.f1599a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("NoUpiAppsErrorUiSpecs(internalPadding=");
        sb.append(this.f1599a);
        sb.append(", horizontalAlignment=");
        sb.append(this.b);
        sb.append(", spaceBetweenImageAndText=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
