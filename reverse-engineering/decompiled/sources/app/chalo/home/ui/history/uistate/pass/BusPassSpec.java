package app.chalo.home.ui.history.uistate.pass;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/pass/BusPassSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusPassSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3513a;
    public final UIShape b;
    public final float c;
    public final float d;
    public final float e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BusPassSpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle containerShape = UIShape.d;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().h;
        Intrinsics.i(containerShape, "containerShape");
        this.f3513a = chaloPadding;
        this.b = containerShape;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusPassSpec)) {
            return false;
        }
        BusPassSpec busPassSpec = (BusPassSpec) obj;
        return Intrinsics.d(this.f3513a, busPassSpec.f3513a) && Intrinsics.d(this.b, busPassSpec.b) && Dp.m7283equalsimpl0(this.c, busPassSpec.c) && Dp.m7283equalsimpl0(this.d, busPassSpec.d) && Dp.m7283equalsimpl0(this.e, busPassSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, uf0.a(this.c, pk0.b(this.b, this.f3513a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("BusPassSpec(contentSpacing=");
        sb.append(this.f3513a);
        sb.append(", containerShape=");
        sb.append(this.b);
        sb.append(", passBannerAndDetailsSpacing=");
        cb0.t(sb, strM7289toStringimpl, ", multipleBannerSpacing=", strM7289toStringimpl2, ", passDetailsContainerAndFooterSpacing=");
        return vo1.p(sb, strM7289toStringimpl3, ")");
    }
}
