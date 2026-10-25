package app.chalo.uistate.fromto;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.cb0;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/fromto/StopBasedFromToSelectionContainerUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedFromToSelectionContainerUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10031a;
    public final CardUISpec b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final ChaloColorToken h;

    public StopBasedFromToSelectionContainerUISpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        CardUISpec cardUISpec = new CardUISpec(UIShape.d, 0.0f, 0.0f, 6);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().g;
        float f5 = ChaloThemeHelper.a().f;
        float f6 = ChaloThemeHelper.a().h;
        float f7 = ChaloThemeHelper.a().f;
        this.f10031a = chaloPadding;
        this.b = cardUISpec;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedFromToSelectionContainerUISpec)) {
            return false;
        }
        StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = (StopBasedFromToSelectionContainerUISpec) obj;
        return Intrinsics.d(this.f10031a, stopBasedFromToSelectionContainerUISpec.f10031a) && Intrinsics.d(this.b, stopBasedFromToSelectionContainerUISpec.b) && Dp.m7283equalsimpl0(this.c, stopBasedFromToSelectionContainerUISpec.c) && Dp.m7283equalsimpl0(this.d, stopBasedFromToSelectionContainerUISpec.d) && Dp.m7283equalsimpl0(this.e, stopBasedFromToSelectionContainerUISpec.e) && Dp.m7283equalsimpl0(this.f, stopBasedFromToSelectionContainerUISpec.f) && Dp.m7283equalsimpl0(this.g, stopBasedFromToSelectionContainerUISpec.g) && Intrinsics.d(this.h, stopBasedFromToSelectionContainerUISpec.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, (this.b.hashCode() + (this.f10031a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("StopBasedFromToSelectionContainerUISpec(contentPadding=");
        sb.append(this.f10031a);
        sb.append(", cardUISpec=");
        sb.append(this.b);
        sb.append(", titleAndStopSelectionSpacing=");
        cb0.t(sb, strM7289toStringimpl, ", fromToIconAndPlaceHolderSpacing=", strM7289toStringimpl2, ", fromAndToSelectionSpacing=");
        cb0.t(sb, strM7289toStringimpl3, ", fromToSelectionAndSearchButtonSpacing=", strM7289toStringimpl4, ", swapButtonImageEndSpacing=");
        sb.append(strM7289toStringimpl5);
        sb.append(", backgroundColor=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
