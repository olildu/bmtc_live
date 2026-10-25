package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketTripPropertiesAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketTripPropertiesAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7117a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final PremiumStopDetailsAppModel g;
    public final PremiumStopDetailsAppModel h;
    public final boolean i;

    public PremiumReserveTicketTripPropertiesAppModel(String str, long j, long j2, long j3, String routeId, String str2, PremiumStopDetailsAppModel premiumStopDetailsAppModel, PremiumStopDetailsAppModel premiumStopDetailsAppModel2, boolean z) {
        Intrinsics.i(routeId, "routeId");
        this.f7117a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = routeId;
        this.f = str2;
        this.g = premiumStopDetailsAppModel;
        this.h = premiumStopDetailsAppModel2;
        this.i = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PremiumStopDetailsAppModel getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PremiumStopDetailsAppModel getH() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketTripPropertiesAppModel)) {
            return false;
        }
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = (PremiumReserveTicketTripPropertiesAppModel) obj;
        return Intrinsics.d(this.f7117a, premiumReserveTicketTripPropertiesAppModel.f7117a) && this.b == premiumReserveTicketTripPropertiesAppModel.b && this.c == premiumReserveTicketTripPropertiesAppModel.c && this.d == premiumReserveTicketTripPropertiesAppModel.d && Intrinsics.d(this.e, premiumReserveTicketTripPropertiesAppModel.e) && Intrinsics.d(this.f, premiumReserveTicketTripPropertiesAppModel.f) && Intrinsics.d(this.g, premiumReserveTicketTripPropertiesAppModel.g) && Intrinsics.d(this.h, premiumReserveTicketTripPropertiesAppModel.h) && this.i == premiumReserveTicketTripPropertiesAppModel.i;
    }

    public final int hashCode() {
        int iHashCode = this.f7117a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        return ((this.h.hashCode() + ((this.g.hashCode() + nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.e), 31, this.f)) * 31)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketTripPropertiesAppModel(tripId=", this.f7117a, ", tripStaticSlotTime=");
        xs.r(this.c, ", expectedTripStartTime=", ", expectedTripEndTime=", sbM);
        dd.k(this.d, ", routeId=", this.e, sbM);
        sbM.append(", routeName=");
        sbM.append(this.f);
        sbM.append(", fromStopDetails=");
        sbM.append(this.g);
        sbM.append(", toStopDetails=");
        sbM.append(this.h);
        sbM.append(", isTripFeedbackCollected=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
