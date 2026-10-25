package app.chalo.instantticket.ui.routeselection.uistate;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.gf;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/uistate/RouteSelectionInputUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSelectionInputUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3972a;
    public final TextWithSpecialFeaturesTagsUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final DividerUIState d;
    public final TextUIState e;
    public final RouteSelectionInputUISpec f;

    public RouteSelectionInputUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, TextUIState.ChaloTextUIState chaloTextUIState2, RouteSelectionInputUISpec routeSelectionInputUISpec) {
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_20.f9762a, null, 4);
        this.f3972a = chaloTextUIState;
        this.b = textWithSpecialFeaturesTagsUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = dividerUIState;
        this.e = chaloTextUIState2;
        this.f = routeSelectionInputUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSelectionInputUIState)) {
            return false;
        }
        RouteSelectionInputUIState routeSelectionInputUIState = (RouteSelectionInputUIState) obj;
        return Intrinsics.d(this.f3972a, routeSelectionInputUIState.f3972a) && Intrinsics.d(this.b, routeSelectionInputUIState.b) && Intrinsics.d(this.c, routeSelectionInputUIState.c) && Intrinsics.d(this.d, routeSelectionInputUIState.d) && Intrinsics.d(this.e, routeSelectionInputUIState.e) && Intrinsics.d(this.f, routeSelectionInputUIState.f);
    }

    public final int hashCode() {
        int iC = py.c(this.d, gf.a(this.c, (this.b.hashCode() + (this.f3972a.hashCode() * 31)) * 31, 31), 31);
        TextUIState textUIState = this.e;
        return this.f.hashCode() + ((iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "RouteSelectionInputUIState(label=" + this.f3972a + ", value=" + this.b + ", eventHandler=" + this.c + ", dividerUIState=" + this.d + ", errorStatus=" + this.e + ", spec=" + this.f + ")";
    }
}
