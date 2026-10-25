package app.chalo.uistate.multimodal;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/LineIndicatorUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LineIndicatorUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineIndicatorUISpecs f10042a = new LineIndicatorUISpecs();
    public final ChaloColorToken b;

    public LineIndicatorUIState(ChaloColorToken chaloColorToken) {
        this.b = chaloColorToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineIndicatorUIState)) {
            return false;
        }
        LineIndicatorUIState lineIndicatorUIState = (LineIndicatorUIState) obj;
        return Intrinsics.d(this.f10042a, lineIndicatorUIState.f10042a) && Intrinsics.d(this.b, lineIndicatorUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10042a.hashCode() * 31);
    }

    public final String toString() {
        return "LineIndicatorUIState(specs=" + this.f10042a + ", lineIndicatorFillColor=" + this.b + ")";
    }
}
