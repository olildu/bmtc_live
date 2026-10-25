package app.chalo.livetracking.stoptripplannerresult.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/NearbyStopResultsContainerHeaderUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopResultsContainerHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NearbyStopResultsContainerHeaderUISpec f4599a = new NearbyStopResultsContainerHeaderUISpec();
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public NearbyStopResultsContainerHeaderUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopResultsContainerHeaderUIState)) {
            return false;
        }
        NearbyStopResultsContainerHeaderUIState nearbyStopResultsContainerHeaderUIState = (NearbyStopResultsContainerHeaderUIState) obj;
        return Intrinsics.d(this.f4599a, nearbyStopResultsContainerHeaderUIState.f4599a) && Intrinsics.d(this.b, nearbyStopResultsContainerHeaderUIState.b) && Intrinsics.d(this.c, nearbyStopResultsContainerHeaderUIState.c) && Intrinsics.d(this.d, nearbyStopResultsContainerHeaderUIState.d);
    }

    public final int hashCode() {
        int iE = r30.e(this.c, r30.f(this.b, this.f4599a.hashCode() * 31, 31), 31);
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.d;
        return iE + (uiEventHandler$Companion$fromLambda$1 == null ? 0 : uiEventHandler$Companion$fromLambda$1.hashCode());
    }

    public final String toString() {
        return "NearbyStopResultsContainerHeaderUIState(specs=" + this.f4599a + ", headerText=" + this.b + ", headerTrailingIcon=" + this.c + ", headerUIEventHandler=" + this.d + ")";
    }
}
