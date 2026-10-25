package app.chalo.premiumbus.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.eo0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsTripAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBAvailableSlotsTripAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7089a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final Integer i;
    public final Integer j;
    public final List k;
    public final PremiumBusSlotStatusType l;
    public final Long m;
    public final PremiumBusSlotArrivalStatus n;
    public final String o;
    public final PremiumBusSeatAssignmentType p;
    public final List q;
    public final boolean r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsTripAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBAvailableSlotsTripAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_MULTI_SEAT_SELECTION_ALLOWED", "Z", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBAvailableSlotsTripAppModel> serializer() {
            return PBAvailableSlotsTripAppModel$$serializer.f7090a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new Lazy[]{null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(16)), LazyKt.a(lazyThreadSafetyMode, new eo0(17)), null, LazyKt.a(lazyThreadSafetyMode, new eo0(18)), null, LazyKt.a(lazyThreadSafetyMode, new eo0(19)), LazyKt.a(lazyThreadSafetyMode, new eo0(20)), null};
    }

    public /* synthetic */ PBAvailableSlotsTripAppModel(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, Integer num, Integer num2, List list, PremiumBusSlotStatusType premiumBusSlotStatusType, Long l, PremiumBusSlotArrivalStatus premiumBusSlotArrivalStatus, String str7, PremiumBusSeatAssignmentType premiumBusSeatAssignmentType, List list2, boolean z) {
        if (262143 != (i & 262143)) {
            PluginExceptionsKt.b(PBAvailableSlotsTripAppModel$$serializer.f7090a.getDescriptor(), i, 262143);
            throw null;
        }
        this.f7089a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = j2;
        this.i = num;
        this.j = num2;
        this.k = list;
        this.l = premiumBusSlotStatusType;
        this.m = l;
        this.n = premiumBusSlotArrivalStatus;
        this.o = str7;
        this.p = premiumBusSeatAssignmentType;
        this.q = list2;
        this.r = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF7089a() {
        return this.f7089a;
    }

    public final boolean b() {
        Integer num = this.j;
        return (num != null ? num.intValue() : 0) > 0;
    }

    public final boolean c() {
        return this.p == PremiumBusSeatAssignmentType.SELECTION;
    }

    public final boolean d() {
        PremiumBusSlotStatusType premiumBusSlotStatusType = this.l;
        if (premiumBusSlotStatusType == null) {
            return true;
        }
        int i = PBAvailableSlotsAppModelKt.WhenMappings.f7084a[premiumBusSlotStatusType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBAvailableSlotsTripAppModel)) {
            return false;
        }
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) obj;
        return Intrinsics.d(this.f7089a, pBAvailableSlotsTripAppModel.f7089a) && Intrinsics.d(this.b, pBAvailableSlotsTripAppModel.b) && Intrinsics.d(this.c, pBAvailableSlotsTripAppModel.c) && Intrinsics.d(this.d, pBAvailableSlotsTripAppModel.d) && Intrinsics.d(this.e, pBAvailableSlotsTripAppModel.e) && Intrinsics.d(this.f, pBAvailableSlotsTripAppModel.f) && this.g == pBAvailableSlotsTripAppModel.g && this.h == pBAvailableSlotsTripAppModel.h && Intrinsics.d(this.i, pBAvailableSlotsTripAppModel.i) && Intrinsics.d(this.j, pBAvailableSlotsTripAppModel.j) && Intrinsics.d(this.k, pBAvailableSlotsTripAppModel.k) && this.l == pBAvailableSlotsTripAppModel.l && Intrinsics.d(this.m, pBAvailableSlotsTripAppModel.m) && this.n == pBAvailableSlotsTripAppModel.n && Intrinsics.d(this.o, pBAvailableSlotsTripAppModel.o) && this.p == pBAvailableSlotsTripAppModel.p && Intrinsics.d(this.q, pBAvailableSlotsTripAppModel.q) && this.r == pBAvailableSlotsTripAppModel.r;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f7089a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        long j = this.g;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.i;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        int iB = r30.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.k);
        PremiumBusSlotStatusType premiumBusSlotStatusType = this.l;
        int iHashCode2 = (iB + (premiumBusSlotStatusType == null ? 0 : premiumBusSlotStatusType.hashCode())) * 31;
        Long l = this.m;
        int iHashCode3 = (this.n.hashCode() + ((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str = this.o;
        int iHashCode4 = (this.p.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.q;
        return ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.r ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBAvailableSlotsTripAppModel(tripUniqueId=", this.f7089a, ", routeId=", this.b, ", routeName=");
        cb0.t(sbE, this.c, ", fromStopId=", this.d, ", toStopId=");
        cb0.t(sbE, this.e, ", tripId=", this.f, ", fromStopTime=");
        sbE.append(this.g);
        xs.r(this.h, ", toStopTime=", ", vehicleCapacity=", sbE);
        pk0.y(sbE, this.i, ", availableSeats=", this.j, ", specialFeatures=");
        sbE.append(this.k);
        sbE.append(", slotStatus=");
        sbE.append(this.l);
        sbE.append(", originalFromStopTime=");
        sbE.append(this.m);
        sbE.append(", slotArrivalStatus=");
        sbE.append(this.n);
        sbE.append(", vehicleNumber=");
        sbE.append(this.o);
        sbE.append(", seatAssignmentType=");
        sbE.append(this.p);
        sbE.append(", applicableRules=");
        sbE.append(this.q);
        sbE.append(", multiSeatAllowed=");
        sbE.append(this.r);
        sbE.append(")");
        return sbE.toString();
    }

    public PBAvailableSlotsTripAppModel(String tripUniqueId, String routeId, String routeName, String fromStopId, String toStopId, String tripId, long j, long j2, Integer num, Integer num2, List specialFeatures, PremiumBusSlotStatusType premiumBusSlotStatusType, Long l, PremiumBusSlotArrivalStatus slotArrivalStatus, String str, PremiumBusSeatAssignmentType seatAssignmentType, List list, boolean z) {
        Intrinsics.i(tripUniqueId, "tripUniqueId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(specialFeatures, "specialFeatures");
        Intrinsics.i(slotArrivalStatus, "slotArrivalStatus");
        Intrinsics.i(seatAssignmentType, "seatAssignmentType");
        this.f7089a = tripUniqueId;
        this.b = routeId;
        this.c = routeName;
        this.d = fromStopId;
        this.e = toStopId;
        this.f = tripId;
        this.g = j;
        this.h = j2;
        this.i = num;
        this.j = num2;
        this.k = specialFeatures;
        this.l = premiumBusSlotStatusType;
        this.m = l;
        this.n = slotArrivalStatus;
        this.o = str;
        this.p = seatAssignmentType;
        this.q = list;
        this.r = z;
    }
}
