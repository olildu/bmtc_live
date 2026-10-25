package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.fromto.StopBasedFromToSelectionContainerUISpec;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/FromToSelectionContainerUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromToSelectionContainerUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopBasedFromToSelectionContainerUISpec f5515a;
    public final float b;
    public final float c;

    public FromToSelectionContainerUISpec() {
        StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = new StopBasedFromToSelectionContainerUISpec();
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().h;
        this.f5515a = stopBasedFromToSelectionContainerUISpec;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromToSelectionContainerUISpec)) {
            return false;
        }
        FromToSelectionContainerUISpec fromToSelectionContainerUISpec = (FromToSelectionContainerUISpec) obj;
        return Intrinsics.d(this.f5515a, fromToSelectionContainerUISpec.f5515a) && Dp.m7283equalsimpl0(this.b, fromToSelectionContainerUISpec.b) && Dp.m7283equalsimpl0(this.c, fromToSelectionContainerUISpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f5515a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("FromToSelectionContainerUISpec(uiSpec=");
        sb.append(this.f5515a);
        sb.append(", metroLineAndFromSelectionSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", titleAndLineSelectionSpacing=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }
}
