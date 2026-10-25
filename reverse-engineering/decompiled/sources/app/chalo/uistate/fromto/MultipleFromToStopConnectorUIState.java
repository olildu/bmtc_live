package app.chalo.uistate.fromto;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/fromto/MultipleFromToStopConnectorUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultipleFromToStopConnectorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10026a;
    public final ChaloColorToken b;

    public MultipleFromToStopConnectorUIState(float f, ChaloColorToken indicatorSeparatorColor) {
        Intrinsics.i(indicatorSeparatorColor, "indicatorSeparatorColor");
        this.f10026a = f;
        this.b = indicatorSeparatorColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleFromToStopConnectorUIState)) {
            return false;
        }
        MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState = (MultipleFromToStopConnectorUIState) obj;
        return Dp.m7283equalsimpl0(this.f10026a, multipleFromToStopConnectorUIState.f10026a) && Intrinsics.d(this.b, multipleFromToStopConnectorUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Dp.m7284hashCodeimpl(this.f10026a) * 31);
    }

    public final String toString() {
        return "MultipleFromToStopConnectorUIState(indicatorSeparatorWidth=" + Dp.m7289toStringimpl(this.f10026a) + ", indicatorSeparatorColor=" + this.b + ")";
    }
}
