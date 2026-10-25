package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/FromToStopIconUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromToStopIconUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9937a;
    public final float b;

    public FromToStopIconUISpec() {
        float f = ChaloThemeHelper.a().f;
        this.f9937a = 0.58f;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromToStopIconUISpec)) {
            return false;
        }
        FromToStopIconUISpec fromToStopIconUISpec = (FromToStopIconUISpec) obj;
        return Float.compare(this.f9937a, fromToStopIconUISpec.f9937a) == 0 && Dp.m7283equalsimpl0(this.b, fromToStopIconUISpec.b);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.b) + (Float.floatToIntBits(this.f9937a) * 31);
    }

    public final String toString() {
        return "FromToStopIconUISpec(heightFraction=" + this.f9937a + ", circleShapeSize=" + Dp.m7289toStringimpl(this.b) + ")";
    }
}
