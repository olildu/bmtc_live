package app.chalo.productbooking.pickroutelocation;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/NoRoutesUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoRoutesUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8273a;
    public final float b;
    public final float c;
    public final UiAlignment.Horizontal d;

    public NoRoutesUiSpecs() {
        float f = ChaloThemeHelper.a().l;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().f;
        this.f8273a = chaloPadding;
        this.b = f3;
        this.c = f4;
        this.d = UiAlignment.Horizontal.Center.f9884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoRoutesUiSpecs)) {
            return false;
        }
        NoRoutesUiSpecs noRoutesUiSpecs = (NoRoutesUiSpecs) obj;
        return Intrinsics.d(this.f8273a, noRoutesUiSpecs.f8273a) && Dp.m7283equalsimpl0(this.b, noRoutesUiSpecs.b) && Dp.m7283equalsimpl0(this.c, noRoutesUiSpecs.c) && Intrinsics.d(this.d, noRoutesUiSpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, uf0.a(this.b, this.f8273a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sbN = t10.n("NoRoutesUiSpecs(screenPadding=", this.f8273a, ", imageAndTitleSpacing=", strM7289toStringimpl, ", titleAndMessagePadding=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", alignment=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
