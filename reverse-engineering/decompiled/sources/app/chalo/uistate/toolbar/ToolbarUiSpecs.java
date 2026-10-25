package app.chalo.uistate.toolbar;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.b3;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarUiSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToolbarUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10121a;
    public final ChaloPadding b;
    public final UiAlignment.Vertical c;
    public final float d;
    public final boolean e;

    public ToolbarUiSpecs(ChaloColorToken backgroundColor, ChaloPadding chaloPadding, float f, int i) {
        backgroundColor = (i & 1) != 0 ? ChaloColorToken.ToolbarBgColor.f9863a : backgroundColor;
        if ((i & 2) != 0) {
            float f2 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        }
        f = (i & 8) != 0 ? ChaloThemeHelper.a().h : f;
        boolean z = (i & 16) != 0;
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f10121a = backgroundColor;
        this.b = chaloPadding;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolbarUiSpecs)) {
            return false;
        }
        ToolbarUiSpecs toolbarUiSpecs = (ToolbarUiSpecs) obj;
        return Intrinsics.d(this.f10121a, toolbarUiSpecs.f10121a) && Intrinsics.d(this.b, toolbarUiSpecs.b) && Intrinsics.d(this.c, toolbarUiSpecs.c) && Dp.m7283equalsimpl0(this.d, toolbarUiSpecs.d) && this.e == toolbarUiSpecs.e;
    }

    public final int hashCode() {
        return uf0.a(this.d, uf0.e(this.c, r30.c(this.b, this.f10121a.hashCode() * 31, 31), 31), 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbI = py.i(this.b, this.f10121a, "ToolbarUiSpecs(backgroundColor=", ", internalPadding=", ", verticalAlignment=");
        sbI.append(this.c);
        sbI.append(", spaceBetweenIconAndTitle=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", showClickRipple=");
        return b3.g(")", sbI, this.e);
    }
}
