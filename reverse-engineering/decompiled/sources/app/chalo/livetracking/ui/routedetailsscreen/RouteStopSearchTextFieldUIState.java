package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteStopSearchTextFieldUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStopSearchTextFieldUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseTextFieldUIState.TextFieldUIState f4888a;
    public final BorderUISpec b;

    public RouteStopSearchTextFieldUIState(BaseTextFieldUIState.TextFieldUIState textFieldUIState) {
        float fM7278constructorimpl = Dp.m7278constructorimpl(1);
        float fM7278constructorimpl2 = Dp.m7278constructorimpl(25);
        BorderUISpec borderUISpec = new BorderUISpec(fM7278constructorimpl, ChaloColorToken.TextFieldIndicator.f9859a, new UIShape.Rectangle(fM7278constructorimpl2, fM7278constructorimpl2, fM7278constructorimpl2, fM7278constructorimpl2));
        this.f4888a = textFieldUIState;
        this.b = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStopSearchTextFieldUIState)) {
            return false;
        }
        RouteStopSearchTextFieldUIState routeStopSearchTextFieldUIState = (RouteStopSearchTextFieldUIState) obj;
        return Intrinsics.d(this.f4888a, routeStopSearchTextFieldUIState.f4888a) && Intrinsics.d(this.b, routeStopSearchTextFieldUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4888a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteStopSearchTextFieldUIState(textField=" + this.f4888a + ", borderSpec=" + this.b + ")";
    }
}
