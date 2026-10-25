package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoFilterUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoFilterUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3321a;
    public final UiEventHandler$Companion$fromLambda$1 b;
    public final ChaloBusRouteInfoFilterUISpec c;

    public ChaloBusRouteInfoFilterUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ChaloBusRouteInfoFilterUISpec chaloBusRouteInfoFilterUISpec) {
        this.f3321a = chaloTextUIState;
        this.b = uiEventHandler$Companion$fromLambda$1;
        this.c = chaloBusRouteInfoFilterUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoFilterUIState)) {
            return false;
        }
        ChaloBusRouteInfoFilterUIState chaloBusRouteInfoFilterUIState = (ChaloBusRouteInfoFilterUIState) obj;
        return this.f3321a.equals(chaloBusRouteInfoFilterUIState.f3321a) && this.b.equals(chaloBusRouteInfoFilterUIState.b) && this.c.equals(chaloBusRouteInfoFilterUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gf.a(this.b, this.f3321a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChaloBusRouteInfoFilterUIState(title=" + this.f3321a + ", onClick=" + this.b + ", specs=" + this.c + ")";
    }
}
