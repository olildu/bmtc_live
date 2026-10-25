package app.chalo.uistate.components;

import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/RegularBusPickupScheduleUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegularBusPickupScheduleUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegularBusPickupScheduleSpec f9946a;
    public final TextUIState.ChaloTextUIState b;
    public final RegularBusPickupScheduleTimeViewState.FixedTime c;

    public RegularBusPickupScheduleUiState(TextUIState.ChaloTextUIState scheduleTitle, RegularBusPickupScheduleTimeViewState.FixedTime fixedTime) {
        RegularBusPickupScheduleSpec regularBusPickupScheduleSpec = new RegularBusPickupScheduleSpec();
        Intrinsics.i(scheduleTitle, "scheduleTitle");
        this.f9946a = regularBusPickupScheduleSpec;
        this.b = scheduleTitle;
        this.c = fixedTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusPickupScheduleUiState)) {
            return false;
        }
        RegularBusPickupScheduleUiState regularBusPickupScheduleUiState = (RegularBusPickupScheduleUiState) obj;
        return Intrinsics.d(this.f9946a, regularBusPickupScheduleUiState.f9946a) && Intrinsics.d(this.b, regularBusPickupScheduleUiState.b) && Intrinsics.d(this.c, regularBusPickupScheduleUiState.c);
    }

    public final int hashCode() {
        return this.c.f9945a.hashCode() + r30.f(this.b, this.f9946a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RegularBusPickupScheduleUiState(spec=" + this.f9946a + ", scheduleTitle=" + this.b + ", scheduleTime=" + this.c + ")";
    }
}
