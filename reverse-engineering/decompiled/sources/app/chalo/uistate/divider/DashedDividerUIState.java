package app.chalo.uistate.divider;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/divider/DashedDividerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DashedDividerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10016a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;

    public DashedDividerUIState(float f, ChaloColorToken color, float f2, float f3) {
        Intrinsics.i(color, "color");
        this.f10016a = f;
        this.b = color;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashedDividerUIState)) {
            return false;
        }
        DashedDividerUIState dashedDividerUIState = (DashedDividerUIState) obj;
        return Dp.m7283equalsimpl0(this.f10016a, dashedDividerUIState.f10016a) && Intrinsics.d(this.b, dashedDividerUIState.b) && Dp.m7283equalsimpl0(this.c, dashedDividerUIState.c) && Dp.m7283equalsimpl0(this.d, dashedDividerUIState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, z40.b(this.b, Dp.m7284hashCodeimpl(this.f10016a) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f10016a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("DashedDividerUIState(thickness=");
        sb.append(strM7289toStringimpl);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", dashWidth=");
        return r30.i(sb, strM7289toStringimpl2, ", dashGap=", strM7289toStringimpl3, ")");
    }

    public DashedDividerUIState(float f, int i, ChaloColorToken chaloColorToken) {
        this((i & 1) != 0 ? ChaloThemeHelper.a().c : f, (i & 2) != 0 ? ChaloColorToken.LightGray.f9814a : chaloColorToken, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d);
    }
}
