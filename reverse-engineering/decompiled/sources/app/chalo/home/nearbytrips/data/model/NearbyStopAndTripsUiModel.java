package app.chalo.home.nearbytrips.data.model;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/nearbytrips/data/model/NearbyStopAndTripsUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyStopAndTripsUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3114a;
    public final String b;
    public final String c;
    public final LatLng d;
    public final ChaloTransitMode e;
    public final double f;
    public final String g;
    public final List h;
    public final LatLng i;

    public NearbyStopAndTripsUiModel(String str, String stopId, String stopName, LatLng stopLatLng, ChaloTransitMode transitMode, double d, String formmattedDistanceStr, List summary, LatLng queryLatLng) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopLatLng, "stopLatLng");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(formmattedDistanceStr, "formmattedDistanceStr");
        Intrinsics.i(summary, "summary");
        Intrinsics.i(queryLatLng, "queryLatLng");
        this.f3114a = str;
        this.b = stopId;
        this.c = stopName;
        this.d = stopLatLng;
        this.e = transitMode;
        this.f = d;
        this.g = formmattedDistanceStr;
        this.h = summary;
        this.i = queryLatLng;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopAndTripsUiModel)) {
            return false;
        }
        NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = (NearbyStopAndTripsUiModel) obj;
        return Intrinsics.d(this.f3114a, nearbyStopAndTripsUiModel.f3114a) && Intrinsics.d(this.b, nearbyStopAndTripsUiModel.b) && Intrinsics.d(this.c, nearbyStopAndTripsUiModel.c) && Intrinsics.d(this.d, nearbyStopAndTripsUiModel.d) && this.e == nearbyStopAndTripsUiModel.e && Double.compare(this.f, nearbyStopAndTripsUiModel.f) == 0 && Intrinsics.d(this.g, nearbyStopAndTripsUiModel.g) && Intrinsics.d(this.h, nearbyStopAndTripsUiModel.h) && Intrinsics.d(this.i, nearbyStopAndTripsUiModel.i);
    }

    public final int hashCode() {
        int iC = n21.c(this.e, i71.d(this.d, nf1.e(nf1.e(this.f3114a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.f);
        return this.i.hashCode() + r30.b(nf1.e((iC + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NearbyStopAndTripsUiModel(id=", this.f3114a, ", stopId=", this.b, ", stopName=");
        sbE.append(this.c);
        sbE.append(", stopLatLng=");
        sbE.append(this.d);
        sbE.append(", transitMode=");
        sbE.append(this.e);
        sbE.append(", distance=");
        sbE.append(this.f);
        sbE.append(", formmattedDistanceStr=");
        sbE.append(this.g);
        sbE.append(", summary=");
        sbE.append(this.h);
        sbE.append(", queryLatLng=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }
}
