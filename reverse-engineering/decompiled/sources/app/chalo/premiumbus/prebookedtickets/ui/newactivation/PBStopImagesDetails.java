package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImagesDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PBStopImagesDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7402a;
    public final String b;
    public final PBStopImageType c;

    public PBStopImagesDetails(String stopId, String stopTitle, PBStopImageType pBStopImageType) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopTitle, "stopTitle");
        this.f7402a = stopId;
        this.b = stopTitle;
        this.c = pBStopImageType;
    }

    public static PBStopImagesDetails a(PBStopImagesDetails pBStopImagesDetails, PBStopImageType pBStopImageType) {
        String stopId = pBStopImagesDetails.f7402a;
        String stopTitle = pBStopImagesDetails.b;
        pBStopImagesDetails.getClass();
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopTitle, "stopTitle");
        return new PBStopImagesDetails(stopId, stopTitle, pBStopImageType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBStopImagesDetails)) {
            return false;
        }
        PBStopImagesDetails pBStopImagesDetails = (PBStopImagesDetails) obj;
        return Intrinsics.d(this.f7402a, pBStopImagesDetails.f7402a) && Intrinsics.d(this.b, pBStopImagesDetails.b) && Intrinsics.d(this.c, pBStopImagesDetails.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f7402a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBStopImagesDetails(stopId=", this.f7402a, ", stopTitle=", this.b, ", imageDetailsType=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
