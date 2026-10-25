package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PBOdPairWithSlotsCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBOdPairWithSlotsCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBOdPairWithSlotsCardUISpecs f7822a;
    public final ODPairTagsUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final List g;
    public final OutlinedButtonUIState h;
    public final OutlinedButtonUIState i;
    public final StandardErrorScreenUIState.ErrorWithMsgAndRetry j;

    public PBOdPairWithSlotsCardUIState(ODPairTagsUIState oDPairTagsUIState, TextUIState.ChaloTextUIState fromStop, TextUIState.ChaloTextUIState toStop, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, List slots, OutlinedButtonUIState directionsToStopUIState, OutlinedButtonUIState outlinedButtonUIState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry, int i) {
        PBOdPairWithSlotsCardUISpecs pBOdPairWithSlotsCardUISpecs = new PBOdPairWithSlotsCardUISpecs();
        slots = (i & 64) != 0 ? EmptyList.f17557a : slots;
        outlinedButtonUIState = (i & 256) != 0 ? null : outlinedButtonUIState;
        errorWithMsgAndRetry = (i & 512) != 0 ? null : errorWithMsgAndRetry;
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        Intrinsics.i(slots, "slots");
        Intrinsics.i(directionsToStopUIState, "directionsToStopUIState");
        this.f7822a = pBOdPairWithSlotsCardUISpecs;
        this.b = oDPairTagsUIState;
        this.c = fromStop;
        this.d = toStop;
        this.e = chaloTextUIState;
        this.f = chaloTextUIState2;
        this.g = slots;
        this.h = directionsToStopUIState;
        this.i = outlinedButtonUIState;
        this.j = errorWithMsgAndRetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBOdPairWithSlotsCardUIState)) {
            return false;
        }
        PBOdPairWithSlotsCardUIState pBOdPairWithSlotsCardUIState = (PBOdPairWithSlotsCardUIState) obj;
        return Intrinsics.d(this.f7822a, pBOdPairWithSlotsCardUIState.f7822a) && Intrinsics.d(this.b, pBOdPairWithSlotsCardUIState.b) && Intrinsics.d(this.c, pBOdPairWithSlotsCardUIState.c) && Intrinsics.d(this.d, pBOdPairWithSlotsCardUIState.d) && Intrinsics.d(this.e, pBOdPairWithSlotsCardUIState.e) && Intrinsics.d(this.f, pBOdPairWithSlotsCardUIState.f) && Intrinsics.d(this.g, pBOdPairWithSlotsCardUIState.g) && Intrinsics.d(this.h, pBOdPairWithSlotsCardUIState.h) && Intrinsics.d(this.i, pBOdPairWithSlotsCardUIState.i) && Intrinsics.d(this.j, pBOdPairWithSlotsCardUIState.j);
    }

    public final int hashCode() {
        int iHashCode = this.f7822a.hashCode() * 31;
        ODPairTagsUIState oDPairTagsUIState = this.b;
        int iF = r30.f(this.d, r30.f(this.c, (iHashCode + (oDPairTagsUIState == null ? 0 : oDPairTagsUIState.hashCode())) * 31, 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.f;
        int iHashCode3 = (this.h.hashCode() + r30.b((iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31, 31, this.g)) * 31;
        OutlinedButtonUIState outlinedButtonUIState = this.i;
        int iHashCode4 = (iHashCode3 + (outlinedButtonUIState == null ? 0 : outlinedButtonUIState.hashCode())) * 31;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry = this.j;
        return iHashCode4 + (errorWithMsgAndRetry != null ? errorWithMsgAndRetry.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBOdPairWithSlotsCardUIState(pbOdPairWithSlotsCardUISpecs=");
        sb.append(this.f7822a);
        sb.append(", oDPairTagsUIState=");
        sb.append(this.b);
        sb.append(", fromStop=");
        r30.p(sb, this.c, ", toStop=", this.d, ", fromStopInfo=");
        r30.p(sb, this.e, ", toStopInfo=", this.f, ", slots=");
        sb.append(this.g);
        sb.append(", directionsToStopUIState=");
        sb.append(this.h);
        sb.append(", viewAllTimeSlots=");
        sb.append(this.i);
        sb.append(", noSlotAvailableUIState=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
