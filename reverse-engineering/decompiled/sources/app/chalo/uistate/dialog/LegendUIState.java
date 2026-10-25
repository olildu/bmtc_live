package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/LegendUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LegendUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10004a;
    public final ChaloColorToken b;
    public final TextUIState.ChaloTextUIState c;
    public final float d;

    public LegendUIState(ChaloColorToken color, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().d;
        Intrinsics.i(color, "color");
        this.f10004a = f;
        this.b = color;
        this.c = chaloTextUIState;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegendUIState)) {
            return false;
        }
        LegendUIState legendUIState = (LegendUIState) obj;
        return Dp.m7283equalsimpl0(this.f10004a, legendUIState.f10004a) && Intrinsics.d(this.b, legendUIState.b) && Intrinsics.d(this.c, legendUIState.c) && Dp.m7283equalsimpl0(this.d, legendUIState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + r30.f(this.c, z40.b(this.b, Dp.m7284hashCodeimpl(this.f10004a) * 31, 31), 31);
    }

    public final String toString() {
        return "LegendUIState(dotSize=" + Dp.m7289toStringimpl(this.f10004a) + ", color=" + this.b + ", descriptionTextUIState=" + this.c + ", spaceBtwDotAndText=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
