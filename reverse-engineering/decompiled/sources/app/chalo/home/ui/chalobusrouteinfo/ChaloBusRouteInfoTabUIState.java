package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoTabUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteInfoTabUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3334a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final DividerUIState d;
    public final ChaloBusRouteInfoTabUISpec e;

    public ChaloBusRouteInfoTabUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, DividerUIState dividerUIState) {
        ChaloBusRouteInfoTabUISpec chaloBusRouteInfoTabUISpec = new ChaloBusRouteInfoTabUISpec();
        this.f3334a = imageUIState;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = dividerUIState;
        this.e = chaloBusRouteInfoTabUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteInfoTabUIState)) {
            return false;
        }
        ChaloBusRouteInfoTabUIState chaloBusRouteInfoTabUIState = (ChaloBusRouteInfoTabUIState) obj;
        return Intrinsics.d(this.f3334a, chaloBusRouteInfoTabUIState.f3334a) && Intrinsics.d(this.b, chaloBusRouteInfoTabUIState.b) && Intrinsics.d(this.c, chaloBusRouteInfoTabUIState.c) && Intrinsics.d(this.d, chaloBusRouteInfoTabUIState.d) && Intrinsics.d(this.e, chaloBusRouteInfoTabUIState.e);
    }

    public final int hashCode() {
        ImageUIState imageUIState = this.f3334a;
        return this.e.hashCode() + py.c(this.d, gf.a(this.c, r30.f(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("ChaloBusRouteInfoTabUIState(icon=", this.f3334a, ", title=", this.b, ", onClick=");
        sbN.append(this.c);
        sbN.append(", bottomLineUIState=");
        sbN.append(this.d);
        sbN.append(", specs=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
