package app.chalo.premiumbus.ui.stopdetails;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PremiumBusStopDetailsViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusStopDetailsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7950a;
    public final boolean b;
    public final PremiumBusStopDetails c;
    public final PremiumBusStopDetails d;
    public final PBStopDetailsMapState e;
    public final PBStopDetailsZoomedImageState f;

    public PremiumBusStopDetailsViewState(boolean z, boolean z2, PremiumBusStopDetails premiumBusStopDetails, PremiumBusStopDetails premiumBusStopDetails2, PBStopDetailsMapState pBStopDetailsMapState, PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState) {
        this.f7950a = z;
        this.b = z2;
        this.c = premiumBusStopDetails;
        this.d = premiumBusStopDetails2;
        this.e = pBStopDetailsMapState;
        this.f = pBStopDetailsZoomedImageState;
    }

    public static PremiumBusStopDetailsViewState a(PremiumBusStopDetailsViewState premiumBusStopDetailsViewState, boolean z, boolean z2, PremiumBusStopDetails premiumBusStopDetails, PremiumBusStopDetails premiumBusStopDetails2, PBStopDetailsMapState pBStopDetailsMapState, PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState, int i) {
        if ((i & 1) != 0) {
            z = premiumBusStopDetailsViewState.f7950a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = premiumBusStopDetailsViewState.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            premiumBusStopDetails = premiumBusStopDetailsViewState.c;
        }
        PremiumBusStopDetails premiumBusStopDetails3 = premiumBusStopDetails;
        if ((i & 8) != 0) {
            premiumBusStopDetails2 = premiumBusStopDetailsViewState.d;
        }
        PremiumBusStopDetails premiumBusStopDetails4 = premiumBusStopDetails2;
        if ((i & 16) != 0) {
            pBStopDetailsMapState = premiumBusStopDetailsViewState.e;
        }
        PBStopDetailsMapState pBStopDetailsMapState2 = pBStopDetailsMapState;
        if ((i & 32) != 0) {
            pBStopDetailsZoomedImageState = premiumBusStopDetailsViewState.f;
        }
        PBStopDetailsZoomedImageState zoomedImagesState = pBStopDetailsZoomedImageState;
        premiumBusStopDetailsViewState.getClass();
        Intrinsics.i(zoomedImagesState, "zoomedImagesState");
        return new PremiumBusStopDetailsViewState(z3, z4, premiumBusStopDetails3, premiumBusStopDetails4, pBStopDetailsMapState2, zoomedImagesState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusStopDetailsViewState)) {
            return false;
        }
        PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = (PremiumBusStopDetailsViewState) obj;
        return this.f7950a == premiumBusStopDetailsViewState.f7950a && this.b == premiumBusStopDetailsViewState.b && Intrinsics.d(this.c, premiumBusStopDetailsViewState.c) && Intrinsics.d(this.d, premiumBusStopDetailsViewState.d) && Intrinsics.d(this.e, premiumBusStopDetailsViewState.e) && Intrinsics.d(this.f, premiumBusStopDetailsViewState.f);
    }

    public final int hashCode() {
        int i = (((this.f7950a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        PremiumBusStopDetails premiumBusStopDetails = this.c;
        int iHashCode = (i + (premiumBusStopDetails == null ? 0 : premiumBusStopDetails.hashCode())) * 31;
        PremiumBusStopDetails premiumBusStopDetails2 = this.d;
        int iHashCode2 = (iHashCode + (premiumBusStopDetails2 == null ? 0 : premiumBusStopDetails2.hashCode())) * 31;
        PBStopDetailsMapState pBStopDetailsMapState = this.e;
        return this.f.hashCode() + ((iHashCode2 + (pBStopDetailsMapState != null ? pBStopDetailsMapState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("PremiumBusStopDetailsViewState(isFullScreenLoading=", ", isFullScreenError=", ", fromStopDetails=", this.f7950a, this.b);
        sbR.append(this.c);
        sbR.append(", toStopDetails=");
        sbR.append(this.d);
        sbR.append(", mapState=");
        sbR.append(this.e);
        sbR.append(", zoomedImagesState=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ PremiumBusStopDetailsViewState() {
        this(false, false, null, null, null, PBStopDetailsZoomedImageState.Hide.f7940a);
    }
}
