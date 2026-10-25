package app.chalo.uistate.multimodal;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/MetroLineContainerUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLineContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10043a;
    public final UiAlignment.Vertical b;
    public final UIShape c;
    public final float d;

    public MetroLineContainerUISpecs() {
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        UIShape.Rectangle backgroundShape = UIShape.g;
        float f3 = ChaloThemeHelper.a().f;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f10043a = chaloPadding;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = backgroundShape;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLineContainerUISpecs)) {
            return false;
        }
        MetroLineContainerUISpecs metroLineContainerUISpecs = (MetroLineContainerUISpecs) obj;
        return Intrinsics.d(this.f10043a, metroLineContainerUISpecs.f10043a) && Intrinsics.d(this.b, metroLineContainerUISpecs.b) && Intrinsics.d(this.c, metroLineContainerUISpecs.c) && Dp.m7283equalsimpl0(this.d, metroLineContainerUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + pk0.b(this.c, uf0.e(this.b, this.f10043a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MetroLineContainerUISpecs(internalPadding=" + this.f10043a + ", verticalAlignment=" + this.b + ", backgroundShape=" + this.c + ", spaceBetweenIndicatorAndLineText=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
