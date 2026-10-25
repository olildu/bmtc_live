package app.chalo.stoptripdetails.data.model.app;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.nf1;
import defpackage.ra1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopTripAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9499a;
    public final String b;
    public final LatLng c;
    public final ChaloTransitMode d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/StopTripAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/app/StopTripAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopTripAppModel> serializer() {
            return StopTripAppModel$$serializer.f9500a;
        }
    }

    public /* synthetic */ StopTripAppModel(int i, String str, String str2, LatLng latLng, ChaloTransitMode chaloTransitMode) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.b(StopTripAppModel$$serializer.f9500a.getDescriptor(), i, 11);
            throw null;
        }
        this.f9499a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = latLng;
        }
        this.d = chaloTransitMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopTripAppModel)) {
            return false;
        }
        StopTripAppModel stopTripAppModel = (StopTripAppModel) obj;
        return Intrinsics.d(this.f9499a, stopTripAppModel.f9499a) && Intrinsics.d(this.b, stopTripAppModel.b) && Intrinsics.d(this.c, stopTripAppModel.c) && this.d == stopTripAppModel.d;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f9499a.hashCode() * 31, 31, this.b);
        LatLng latLng = this.c;
        return this.d.hashCode() + ((iE + (latLng == null ? 0 : latLng.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopTripAppModel(stopId=", this.f9499a, ", stopName=", this.b, ", stopLatLng=");
        sbE.append(this.c);
        sbE.append(", transitMode=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public StopTripAppModel(String stopId, String stopName, LatLng latLng, ChaloTransitMode transitMode) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(transitMode, "transitMode");
        this.f9499a = stopId;
        this.b = stopName;
        this.c = latLng;
        this.d = transitMode;
    }
}
