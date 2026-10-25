package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/EmptyScreenSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EmptyScreenSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3469a;
    public final ChaloColorToken b;
    public final float c;
    public final ChaloPadding d;
    public final float e;
    public final float f;

    public EmptyScreenSpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().f1916a;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        float f3 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().k, 0.0f, 2);
        float f4 = ChaloThemeHelper.a().n;
        float f5 = ChaloThemeHelper.a().i;
        this.f3469a = chaloPadding;
        this.b = ChaloColorToken.Transparent.f9864a;
        this.c = f3;
        this.d = chaloPadding2;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyScreenSpec)) {
            return false;
        }
        EmptyScreenSpec emptyScreenSpec = (EmptyScreenSpec) obj;
        return Intrinsics.d(this.f3469a, emptyScreenSpec.f3469a) && Intrinsics.d(this.b, emptyScreenSpec.b) && Dp.m7283equalsimpl0(this.c, emptyScreenSpec.c) && Intrinsics.d(this.d, emptyScreenSpec.d) && Dp.m7283equalsimpl0(this.e, emptyScreenSpec.e) && Dp.m7283equalsimpl0(this.f, emptyScreenSpec.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.a(this.e, r30.c(this.d, uf0.a(this.c, z40.b(this.b, this.f3469a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbL = gf.l(this.f3469a, this.b, "EmptyScreenSpec(contentPadding=", ", backgroundColor=", ", imageAndMessageSpacing=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", customerSupportPadding=");
        sbL.append(this.d);
        sbL.append(", messageAndProductBookingTitleSpace=");
        return r30.i(sbL, strM7289toStringimpl2, ", productBookingTitleAndProductBookingCardsSpacing=", strM7289toStringimpl3, ")");
    }
}
