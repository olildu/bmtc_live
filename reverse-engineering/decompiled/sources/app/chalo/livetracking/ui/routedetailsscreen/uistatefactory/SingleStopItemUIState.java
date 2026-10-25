package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/SingleStopItemUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SingleStopItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopNameAndEtaUIState f4951a;
    public final FromStopAndBusIconUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final SingleStopItemUISpec d;

    public SingleStopItemUIState(StopNameAndEtaUIState stopNameAndEta, FromStopAndBusIconUIState fromStopAndBusIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, SingleStopItemUISpec singleStopItemUISpec) {
        Intrinsics.i(stopNameAndEta, "stopNameAndEta");
        this.f4951a = stopNameAndEta;
        this.b = fromStopAndBusIconUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = singleStopItemUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleStopItemUIState)) {
            return false;
        }
        SingleStopItemUIState singleStopItemUIState = (SingleStopItemUIState) obj;
        return Intrinsics.d(this.f4951a, singleStopItemUIState.f4951a) && this.b.equals(singleStopItemUIState.b) && this.c.equals(singleStopItemUIState.c) && this.d.equals(singleStopItemUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gf.a(this.c, (this.b.hashCode() + (this.f4951a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "SingleStopItemUIState(stopNameAndEta=" + this.f4951a + ", fromStopAndBusIcon=" + this.b + ", eventHandler=" + this.c + ", spec=" + this.d + ")";
    }
}
