package app.chalo.models.ondc;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import defpackage.yn0;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptEntity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketReceiptEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5631a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Map m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ondc/OndcTicketReceiptEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketReceiptEntity> serializer() {
            return OndcTicketReceiptEntity$$serializer.f5632a;
        }
    }

    public /* synthetic */ OndcTicketReceiptEntity(int i, String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.b(OndcTicketReceiptEntity$$serializer.f5632a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f5631a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketReceiptEntity)) {
            return false;
        }
        OndcTicketReceiptEntity ondcTicketReceiptEntity = (OndcTicketReceiptEntity) obj;
        return Intrinsics.d(this.f5631a, ondcTicketReceiptEntity.f5631a) && this.b == ondcTicketReceiptEntity.b && this.c == ondcTicketReceiptEntity.c && Intrinsics.d(this.d, ondcTicketReceiptEntity.d) && Intrinsics.d(this.e, ondcTicketReceiptEntity.e) && Intrinsics.d(this.f, ondcTicketReceiptEntity.f) && Intrinsics.d(this.g, ondcTicketReceiptEntity.g) && Intrinsics.d(this.h, ondcTicketReceiptEntity.h) && Intrinsics.d(this.i, ondcTicketReceiptEntity.i) && Intrinsics.d(this.j, ondcTicketReceiptEntity.j) && Intrinsics.d(this.k, ondcTicketReceiptEntity.k) && Intrinsics.d(this.l, ondcTicketReceiptEntity.l) && Intrinsics.d(this.m, ondcTicketReceiptEntity.m);
    }

    public final int hashCode() {
        int iHashCode = this.f5631a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        Map map = this.m;
        return iE + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "OndcTicketReceiptEntity(bookingId=", this.f5631a, ", punchTime=");
        xs.r(this.c, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", startStopName=");
        cb0.t(sbM, this.f, ", endStopName=", this.g, ", endStopId=");
        cb0.t(sbM, this.h, ", routeName=", this.i, ", productType=");
        cb0.t(sbM, this.j, ", productSubType=", this.k, ", userId=");
        sbM.append(this.l);
        sbM.append(", passengerDetails=");
        sbM.append(this.m);
        sbM.append(")");
        return sbM.toString();
    }

    public OndcTicketReceiptEntity(String bookingId, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String endStopId, String routeName, String productType, String productSubType, String userId, Map map) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(userId, "userId");
        this.f5631a = bookingId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = startStopName;
        this.g = endStopName;
        this.h = endStopId;
        this.i = routeName;
        this.j = productType;
        this.k = productSubType;
        this.l = userId;
        this.m = map;
    }
}
