package app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/multipleorigindestinationselectionscreen/OriginDestinationInfoUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OriginDestinationInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OriginDestinationInfoUISpec f7684a;
    public final ModeToReachFromStopUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ModeToReachFromStopUIState d;
    public final TextUIState.ChaloTextUIState e;

    public OriginDestinationInfoUIState(ModeToReachFromStopUIState modeToReachFromStopUIState, TextUIState.ChaloTextUIState originName, ModeToReachFromStopUIState modeToReachFromStopUIState2, TextUIState.ChaloTextUIState chaloTextUIState) {
        OriginDestinationInfoUISpec originDestinationInfoUISpec = new OriginDestinationInfoUISpec();
        Intrinsics.i(originName, "originName");
        this.f7684a = originDestinationInfoUISpec;
        this.b = modeToReachFromStopUIState;
        this.c = originName;
        this.d = modeToReachFromStopUIState2;
        this.e = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationInfoUIState)) {
            return false;
        }
        OriginDestinationInfoUIState originDestinationInfoUIState = (OriginDestinationInfoUIState) obj;
        return Intrinsics.d(this.f7684a, originDestinationInfoUIState.f7684a) && Intrinsics.d(this.b, originDestinationInfoUIState.b) && Intrinsics.d(this.c, originDestinationInfoUIState.c) && Intrinsics.d(this.d, originDestinationInfoUIState.d) && Intrinsics.d(this.e, originDestinationInfoUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f7684a.hashCode() * 31;
        ModeToReachFromStopUIState modeToReachFromStopUIState = this.b;
        int iF = r30.f(this.c, (iHashCode + (modeToReachFromStopUIState == null ? 0 : modeToReachFromStopUIState.hashCode())) * 31, 961);
        ModeToReachFromStopUIState modeToReachFromStopUIState2 = this.d;
        return this.e.hashCode() + ((iF + (modeToReachFromStopUIState2 != null ? modeToReachFromStopUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginDestinationInfoUIState(spec=");
        sb.append(this.f7684a);
        sb.append(", modeToReachFromStopUIState=");
        sb.append(this.b);
        sb.append(", originName=");
        sb.append(this.c);
        sb.append(", dividerUIState=null, modeToReachToStopUIState=");
        sb.append(this.d);
        sb.append(", destinationName=");
        return py.f(sb, this.e, ")");
    }
}
