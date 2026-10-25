package app.chalo.uistate.divider;

import androidx.compose.material3.DividerDefaults;
import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/divider/DividerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DividerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10017a;
    public final ChaloColorToken b;
    public final DividerOrientation c;

    public DividerUIState(float f, ChaloColorToken color, DividerOrientation orientation) {
        Intrinsics.i(color, "color");
        Intrinsics.i(orientation, "orientation");
        this.f10017a = f;
        this.b = color;
        this.c = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerUIState)) {
            return false;
        }
        DividerUIState dividerUIState = (DividerUIState) obj;
        return Dp.m7283equalsimpl0(this.f10017a, dividerUIState.f10017a) && Intrinsics.d(this.b, dividerUIState.b) && this.c == dividerUIState.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, Dp.m7284hashCodeimpl(this.f10017a) * 31, 31);
    }

    public final String toString() {
        return "DividerUIState(thickness=" + Dp.m7289toStringimpl(this.f10017a) + ", color=" + this.b + ", orientation=" + this.c + ")";
    }

    public /* synthetic */ DividerUIState(float f, ChaloColorToken chaloColorToken, DividerOrientation dividerOrientation, int i) {
        this((i & 1) != 0 ? DividerDefaults.INSTANCE.m1948getThicknessD9Ej5fM() : f, (i & 2) != 0 ? ChaloColorToken.LightGray.f9814a : chaloColorToken, (i & 4) != 0 ? DividerOrientation.Horizontal : dividerOrientation);
    }
}
