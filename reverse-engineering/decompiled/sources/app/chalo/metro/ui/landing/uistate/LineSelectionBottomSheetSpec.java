package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/LineSelectionBottomSheetSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineSelectionBottomSheetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5516a;
    public final float b;

    public LineSelectionBottomSheetSpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().i;
        this.f5516a = chaloPadding;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSelectionBottomSheetSpec)) {
            return false;
        }
        LineSelectionBottomSheetSpec lineSelectionBottomSheetSpec = (LineSelectionBottomSheetSpec) obj;
        return Intrinsics.d(this.f5516a, lineSelectionBottomSheetSpec.f5516a) && Dp.m7283equalsimpl0(this.b, lineSelectionBottomSheetSpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (this.f5516a.hashCode() * 31);
    }

    public final String toString() {
        return t8.h("LineSelectionBottomSheetSpec(contentPadding=", this.f5516a, ", titleAndLineListSpacing=", Dp.m7289toStringimpl(this.b), ")");
    }
}
