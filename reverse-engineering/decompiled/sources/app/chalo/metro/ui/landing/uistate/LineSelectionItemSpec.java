package app.chalo.metro.ui.landing.uistate;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/LineSelectionItemSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineSelectionItemSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5518a;
    public final float b;
    public final float c;
    public final UiAlignment.Vertical d;

    public LineSelectionItemSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().d;
        this.f5518a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = UiAlignment.Vertical.Center.f9888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionItemSpec)) {
            return false;
        }
        LineSelectionItemSpec lineSelectionItemSpec = (LineSelectionItemSpec) obj;
        return Intrinsics.d(this.f5518a, lineSelectionItemSpec.f5518a) && Dp.m7283equalsimpl0(this.b, lineSelectionItemSpec.b) && Dp.m7283equalsimpl0(this.c, lineSelectionItemSpec.c) && Intrinsics.d(this.d, lineSelectionItemSpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, uf0.a(this.b, this.f5518a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        StringBuilder sbN = t10.n("LineSelectionItemSpec(contentPadding=", this.f5518a, ", indicatorAndTitleSpacing=", strM7289toStringimpl, ", titleAndDescriptionSpacing=");
        sbN.append(strM7289toStringimpl2);
        sbN.append(", contentAlignment=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
