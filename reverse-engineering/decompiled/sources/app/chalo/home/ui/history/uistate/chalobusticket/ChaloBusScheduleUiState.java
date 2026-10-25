package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusScheduleUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusScheduleUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBusScheduleSpec f3501a;
    public final boolean b;
    public final TextUIState.ChaloTextUIState c;
    public final ChaloBusPickupScheduleTimeViewState d;
    public final TextUIState.ChaloTextUIState e;
    public final AlertTextWithIconUiState f;

    public ChaloBusScheduleUiState(TextUIState.ChaloTextUIState scheduleTitle, ChaloBusPickupScheduleTimeViewState scheduleTime, TextUIState.ChaloTextUIState chaloTextUIState, AlertTextWithIconUiState alertTextWithIconUiState, int i) {
        ChaloBusScheduleSpec chaloBusScheduleSpec = new ChaloBusScheduleSpec();
        boolean z = (i & 2) == 0;
        chaloTextUIState = (i & 16) != 0 ? null : chaloTextUIState;
        alertTextWithIconUiState = (i & 32) != 0 ? null : alertTextWithIconUiState;
        Intrinsics.i(scheduleTitle, "scheduleTitle");
        Intrinsics.i(scheduleTime, "scheduleTime");
        this.f3501a = chaloBusScheduleSpec;
        this.b = z;
        this.c = scheduleTitle;
        this.d = scheduleTime;
        this.e = chaloTextUIState;
        this.f = alertTextWithIconUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusScheduleUiState)) {
            return false;
        }
        ChaloBusScheduleUiState chaloBusScheduleUiState = (ChaloBusScheduleUiState) obj;
        return Intrinsics.d(this.f3501a, chaloBusScheduleUiState.f3501a) && this.b == chaloBusScheduleUiState.b && Intrinsics.d(this.c, chaloBusScheduleUiState.c) && Intrinsics.d(this.d, chaloBusScheduleUiState.d) && Intrinsics.d(this.e, chaloBusScheduleUiState.e) && Intrinsics.d(this.f, chaloBusScheduleUiState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r30.f(this.c, ((this.f3501a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        AlertTextWithIconUiState alertTextWithIconUiState = this.f;
        return iHashCode2 + (alertTextWithIconUiState != null ? alertTextWithIconUiState.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloBusScheduleUiState(spec=" + this.f3501a + ", loadingShimmerState=" + this.b + ", scheduleTitle=" + this.c + ", scheduleTime=" + this.d + ", originalScheduleTime=" + this.e + ", scheduleAlertText=" + this.f + ")";
    }
}
