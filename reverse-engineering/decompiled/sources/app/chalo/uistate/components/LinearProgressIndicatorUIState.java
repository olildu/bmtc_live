package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/LinearProgressIndicatorUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LinearProgressIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9939a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final float d;

    public LinearProgressIndicatorUIState(float f) {
        float f2 = ChaloThemeHelper.a().f1916a;
        this.f9939a = f;
        this.b = ChaloColorToken.OrangePrimary.f9835a;
        this.c = ChaloColorToken.GreyColor.f9806a;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearProgressIndicatorUIState)) {
            return false;
        }
        LinearProgressIndicatorUIState linearProgressIndicatorUIState = (LinearProgressIndicatorUIState) obj;
        return Float.compare(this.f9939a, linearProgressIndicatorUIState.f9939a) == 0 && Intrinsics.d(this.b, linearProgressIndicatorUIState.b) && Intrinsics.d(this.c, linearProgressIndicatorUIState.c) && Dp.m7283equalsimpl0(this.d, linearProgressIndicatorUIState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, z40.b(this.b, Float.floatToIntBits(this.f9939a) * 31, 31), 31);
    }

    public final String toString() {
        return "LinearProgressIndicatorUIState(progress=" + this.f9939a + ", progressColor=" + this.b + ", trackColor=" + this.c + ", gapSize=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
