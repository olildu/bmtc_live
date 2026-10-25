package app.chalo.productbooking.common.data.models.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/request/AvailableSlotsRequestForPBPreBookingAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AvailableSlotsRequestForPBPreBookingAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8229a;
    public final String b;
    public final String c;
    public final List d;
    public final long e;
    public final long f;
    public final long g;

    public AvailableSlotsRequestForPBPreBookingAppModel(String passId, String fromStopId, String toStopId, List routeIds, long j, long j2, long j3) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(routeIds, "routeIds");
        this.f8229a = passId;
        this.b = fromStopId;
        this.c = toStopId;
        this.d = routeIds;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSlotsRequestForPBPreBookingAppModel)) {
            return false;
        }
        AvailableSlotsRequestForPBPreBookingAppModel availableSlotsRequestForPBPreBookingAppModel = (AvailableSlotsRequestForPBPreBookingAppModel) obj;
        return Intrinsics.d(this.f8229a, availableSlotsRequestForPBPreBookingAppModel.f8229a) && Intrinsics.d(this.b, availableSlotsRequestForPBPreBookingAppModel.b) && Intrinsics.d(this.c, availableSlotsRequestForPBPreBookingAppModel.c) && Intrinsics.d(this.d, availableSlotsRequestForPBPreBookingAppModel.d) && this.e == availableSlotsRequestForPBPreBookingAppModel.e && this.f == availableSlotsRequestForPBPreBookingAppModel.f && this.g == availableSlotsRequestForPBPreBookingAppModel.g;
    }

    public final int hashCode() {
        int iB = r30.b(nf1.e(nf1.e(this.f8229a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        long j3 = this.g;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("AvailableSlotsRequestForPBPreBookingAppModel(passId=", this.f8229a, ", fromStopId=", this.b, ", toStopId=");
        pk0.w(this.c, ", routeIds=", ", startTimeInMillis=", sbE, this.d);
        sbE.append(this.e);
        xs.r(this.f, ", endTimeInMillis=", ", tripStartTimeInMillisSinceMidnight=", sbE);
        return uf0.m(this.g, ")", sbE);
    }
}
