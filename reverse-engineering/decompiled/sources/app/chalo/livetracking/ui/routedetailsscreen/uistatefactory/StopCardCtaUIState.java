package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/StopCardCtaUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopCardCtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f4952a;
    public final DividerUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final float d;

    public StopCardCtaUIState(TextUIState.ChaloTextUIState chaloTextUIState, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        float f = ChaloThemeHelper.a().g;
        this.f4952a = chaloTextUIState;
        this.b = dividerUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopCardCtaUIState)) {
            return false;
        }
        StopCardCtaUIState stopCardCtaUIState = (StopCardCtaUIState) obj;
        return Intrinsics.d(this.f4952a, stopCardCtaUIState.f4952a) && Intrinsics.d(this.b, stopCardCtaUIState.b) && Intrinsics.d(this.c, stopCardCtaUIState.c) && Dp.m7283equalsimpl0(this.d, stopCardCtaUIState.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + gf.a(this.c, py.c(this.b, this.f4952a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "StopCardCtaUIState(text=" + this.f4952a + ", divider=" + this.b + ", eventHandler=" + this.c + ", spaceAroundDivider=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
