package app.chalo.livetracking.provider.tracking.model;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import defpackage.hq0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/FixedStopEtaUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FixedStopEtaUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4368a;
    public final boolean b;
    public final String c;
    public final LiveBusDelayedState d;

    public FixedStopEtaUiModel(String etaInMins, boolean z, String vehicleNumber, LiveBusDelayedState delayedState) {
        Intrinsics.i(etaInMins, "etaInMins");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(delayedState, "delayedState");
        this.f4368a = etaInMins;
        this.b = z;
        this.c = vehicleNumber;
        this.d = delayedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedStopEtaUiModel)) {
            return false;
        }
        FixedStopEtaUiModel fixedStopEtaUiModel = (FixedStopEtaUiModel) obj;
        return Intrinsics.d(this.f4368a, fixedStopEtaUiModel.f4368a) && this.b == fixedStopEtaUiModel.b && Intrinsics.d(this.c, fixedStopEtaUiModel.c) && Intrinsics.d(this.d, fixedStopEtaUiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(((this.f4368a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("FixedStopEtaUiModel(etaInMins=", this.f4368a, ", isBusHalted=", ", vehicleNumber=", this.b);
        sbM.append(this.c);
        sbM.append(", delayedState=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
