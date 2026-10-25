package app.chalo.premiumbus.ui.stopdetails;

import app.chalo.location.LatLng;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetails;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusStopDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7942a;
    public final String b;
    public final String c;
    public final LatLng d;
    public final PBBusStopImageType e;

    public PremiumBusStopDetails(String str, String str2, String str3, LatLng latLng, PBBusStopImageType stopImages) {
        Intrinsics.i(stopImages, "stopImages");
        this.f7942a = str;
        this.b = str2;
        this.c = str3;
        this.d = latLng;
        this.e = stopImages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusStopDetails)) {
            return false;
        }
        PremiumBusStopDetails premiumBusStopDetails = (PremiumBusStopDetails) obj;
        return Intrinsics.d(this.f7942a, premiumBusStopDetails.f7942a) && Intrinsics.d(this.b, premiumBusStopDetails.b) && Intrinsics.d(this.c, premiumBusStopDetails.c) && Intrinsics.d(this.d, premiumBusStopDetails.d) && Intrinsics.d(this.e, premiumBusStopDetails.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7942a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        LatLng latLng = this.d;
        return this.e.hashCode() + ((iHashCode + (latLng != null ? latLng.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusStopDetails(stopId=", this.f7942a, ", stopName=", this.b, ", stopDescription=");
        sbE.append(this.c);
        sbE.append(", location=");
        sbE.append(this.d);
        sbE.append(", stopImages=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
