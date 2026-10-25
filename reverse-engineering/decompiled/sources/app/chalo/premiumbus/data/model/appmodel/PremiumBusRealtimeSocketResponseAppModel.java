package app.chalo.premiumbus.data.model.appmodel;

import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/model/appmodel/PremiumBusRealtimeSocketResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusRealtimeSocketResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6983a;
    public final long b;
    public final String c;
    public final Long d;
    public final long e;
    public final Integer f;

    public PremiumBusRealtimeSocketResponseAppModel(String etaId, long j, String vehicleNumber, Long l, long j2, Integer num) {
        Intrinsics.i(etaId, "etaId");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f6983a = etaId;
        this.b = j;
        this.c = vehicleNumber;
        this.d = l;
        this.e = j2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusRealtimeSocketResponseAppModel)) {
            return false;
        }
        PremiumBusRealtimeSocketResponseAppModel premiumBusRealtimeSocketResponseAppModel = (PremiumBusRealtimeSocketResponseAppModel) obj;
        return Intrinsics.d(this.f6983a, premiumBusRealtimeSocketResponseAppModel.f6983a) && this.b == premiumBusRealtimeSocketResponseAppModel.b && Intrinsics.d(this.c, premiumBusRealtimeSocketResponseAppModel.c) && Intrinsics.d(this.d, premiumBusRealtimeSocketResponseAppModel.d) && this.e == premiumBusRealtimeSocketResponseAppModel.e && Intrinsics.d(this.f, premiumBusRealtimeSocketResponseAppModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f6983a.hashCode() * 31;
        long j = this.b;
        int iE = nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
        Long l = this.d;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        long j2 = this.e;
        int i = (((iE + iHashCode2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        Integer num = this.f;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumBusRealtimeSocketResponseAppModel(etaId=", this.f6983a, ", eta=");
        sbM.append(", vehicleNumber=");
        sbM.append(this.c);
        sbM.append(", delayInSeconds=");
        sbM.append(this.d);
        xs.r(this.e, ", timeStamp=", ", distanceToReach=", sbM);
        return pk0.k(sbM, this.f, ")");
    }
}
