package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DatesLoadingUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DatesLoadingUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9985a = ChaloThemeHelper.a().v;
    public final ChaloColorToken b = ChaloColorToken.ShimmerColor.f9853a;
    public final ChaloColorToken c = ChaloColorToken.ShimmerBackground.f9852a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatesLoadingUIState)) {
            return false;
        }
        DatesLoadingUIState datesLoadingUIState = (DatesLoadingUIState) obj;
        return Dp.m7283equalsimpl0(this.f9985a, datesLoadingUIState.f9985a) && Intrinsics.d(this.b, datesLoadingUIState.b) && Intrinsics.d(this.c, datesLoadingUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, Dp.m7284hashCodeimpl(this.f9985a) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f9985a);
        StringBuilder sb = new StringBuilder("DatesLoadingUIState(height=");
        sb.append(strM7289toStringimpl);
        sb.append(", shimmerColor=");
        sb.append(this.b);
        sb.append(", shimmerBackgroundColor=");
        return pk0.j(sb, this.c, ")");
    }
}
