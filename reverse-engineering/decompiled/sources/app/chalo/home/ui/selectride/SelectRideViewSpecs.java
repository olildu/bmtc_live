package app.chalo.home.ui.selectride;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectride/SelectRideViewSpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectRideViewSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3700a;
    public final float b;
    public final CardUISpec c;

    public SelectRideViewSpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        CardUISpec cardUISpec = new CardUISpec(UIShape.e, ChaloThemeHelper.a().f, 0.0f, 4);
        this.f3700a = chaloPadding;
        this.b = f2;
        this.c = cardUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectRideViewSpecs)) {
            return false;
        }
        SelectRideViewSpecs selectRideViewSpecs = (SelectRideViewSpecs) obj;
        return Intrinsics.d(this.f3700a, selectRideViewSpecs.f3700a) && Dp.m7283equalsimpl0(this.b, selectRideViewSpecs.b) && Intrinsics.d(this.c, selectRideViewSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f3700a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("SelectRideViewSpecs(contentPadding=", this.f3700a, ", fieldSpacing=", Dp.m7289toStringimpl(this.b), ", cardUISpec=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
