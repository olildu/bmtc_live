package app.chalo.uistate.fromto;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/fromto/MultipleFromToStopItemUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultipleFromToStopItemUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10027a;
    public final float b;
    public final float c;
    public final float d;
    public final UiAlignment.Vertical e;
    public final UiAlignment.Horizontal f;

    public MultipleFromToStopItemUISpecs() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().b;
        this.f10027a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = UiAlignment.Vertical.Center.f9888a;
        this.f = UiAlignment.Horizontal.Center.f9884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleFromToStopItemUISpecs)) {
            return false;
        }
        MultipleFromToStopItemUISpecs multipleFromToStopItemUISpecs = (MultipleFromToStopItemUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f10027a, multipleFromToStopItemUISpecs.f10027a) && Dp.m7283equalsimpl0(this.b, multipleFromToStopItemUISpecs.b) && Dp.m7283equalsimpl0(this.c, multipleFromToStopItemUISpecs.c) && Dp.m7283equalsimpl0(this.d, multipleFromToStopItemUISpecs.d) && Intrinsics.d(this.e, multipleFromToStopItemUISpecs.e) && Intrinsics.d(this.f, multipleFromToStopItemUISpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + uf0.e(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f10027a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f10027a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbE = dd.e("MultipleFromToStopItemUISpecs(indicatorColumnWidth=", strM7289toStringimpl, ", stopTextStartPadding=", strM7289toStringimpl2, ", stopTextSpacing=");
        cb0.t(sbE, strM7289toStringimpl3, ", defaultConnectorWidth=", strM7289toStringimpl4, ", rowVerticalAlignment=");
        sbE.append(this.e);
        sbE.append(", indicatorHorizontalAlignment=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
