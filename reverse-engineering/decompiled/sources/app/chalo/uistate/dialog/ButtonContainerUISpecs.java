package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ButtonContainerUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ButtonContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9966a;
    public final UiAlignment.Vertical b;
    public final UiAlignment.BiasAlignment c;
    public final float d;

    public ButtonContainerUISpecs(int i) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UiAlignment.BiasAlignment biasAlignment = (i & 4) != 0 ? UiAlignment.BiasAlignment.Center.f9878a : UiAlignment.BiasAlignment.CenterEnd.f9879a;
        float f3 = ChaloThemeHelper.a().p;
        this.f9966a = chaloPadding;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = biasAlignment;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonContainerUISpecs)) {
            return false;
        }
        ButtonContainerUISpecs buttonContainerUISpecs = (ButtonContainerUISpecs) obj;
        return Intrinsics.d(this.f9966a, buttonContainerUISpecs.f9966a) && Intrinsics.d(this.b, buttonContainerUISpecs.b) && Intrinsics.d(this.c, buttonContainerUISpecs.c) && Dp.m7283equalsimpl0(this.d, buttonContainerUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + uf0.e(this.b, this.f9966a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ButtonContainerUISpecs(padding=" + this.f9966a + ", verticalAlignment=" + this.b + ", btnAlignment=" + this.c + ", btnMinHeight=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
