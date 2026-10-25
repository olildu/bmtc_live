package app.chalo.titoridedetail.data.app;

import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.location.LatLng;
import defpackage.i71;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRideDetailBusDataAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitoRideDetailBusDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9678a;
    public final LatLng b;
    public final boolean c;
    public final LiveBusDelayedState d;
    public final float e;

    public TitoRideDetailBusDataAppModel(String vehicleNumber, LatLng latLng, boolean z, LiveBusDelayedState delayedState, float f) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(delayedState, "delayedState");
        this.f9678a = vehicleNumber;
        this.b = latLng;
        this.c = z;
        this.d = delayedState;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoRideDetailBusDataAppModel)) {
            return false;
        }
        TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel = (TitoRideDetailBusDataAppModel) obj;
        return Intrinsics.d(this.f9678a, titoRideDetailBusDataAppModel.f9678a) && Intrinsics.d(this.b, titoRideDetailBusDataAppModel.b) && this.c == titoRideDetailBusDataAppModel.c && Intrinsics.d(this.d, titoRideDetailBusDataAppModel.d) && Float.compare(this.e, titoRideDetailBusDataAppModel.e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.e) + ((this.d.hashCode() + ((i71.d(this.b, this.f9678a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitoRideDetailBusDataAppModel(vehicleNumber=");
        sb.append(this.f9678a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", isHalted=");
        sb.append(this.c);
        sb.append(", delayedState=");
        sb.append(this.d);
        sb.append(", slope=");
        return py.g(sb, ")", this.e);
    }
}
