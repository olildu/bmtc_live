package app.chalo.uistate;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/VerticalDashedLineUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VerticalDashedLineUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9751a;
    public final ChaloColorToken b;

    public VerticalDashedLineUIState(float f, ChaloColorToken color) {
        Intrinsics.i(color, "color");
        this.f9751a = f;
        this.b = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalDashedLineUIState)) {
            return false;
        }
        VerticalDashedLineUIState verticalDashedLineUIState = (VerticalDashedLineUIState) obj;
        return Float.compare(this.f9751a, verticalDashedLineUIState.f9751a) == 0 && Intrinsics.d(this.b, verticalDashedLineUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.f9751a) * 31);
    }

    public final String toString() {
        return "VerticalDashedLineUIState(width=" + this.f9751a + ", color=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VerticalDashedLineUIState(int i) {
        ChaloColorToken chaloColorToken;
        if ((i & 2) != 0) {
            chaloColorToken = ChaloColorToken.Black.f9759a;
        } else {
            chaloColorToken = ChaloColorToken.Orange2.f9830a;
        }
        this(6.0f, chaloColorToken);
    }
}
