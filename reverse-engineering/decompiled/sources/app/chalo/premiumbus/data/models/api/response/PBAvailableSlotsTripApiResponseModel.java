package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.eo0;
import defpackage.py;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBAvailableSlotsTripApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBAvailableSlotsTripApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7026a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Integer h;
    public final Integer i;
    public final List j;
    public final Long k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;
    public final List p;
    public final Boolean q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBAvailableSlotsTripApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PBAvailableSlotsTripApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBAvailableSlotsTripApiResponseModel> serializer() {
            return PBAvailableSlotsTripApiResponseModel$$serializer.f7027a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        r = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(14)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(15)), null};
    }

    public /* synthetic */ PBAvailableSlotsTripApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2, Integer num, Integer num2, List list, Long l3, String str6, String str7, String str8, Integer num3, List list2, Boolean bool) {
        if (131071 != (i & 131071)) {
            PluginExceptionsKt.b(PBAvailableSlotsTripApiResponseModel$$serializer.f7027a.getDescriptor(), i, 131071);
            throw null;
        }
        this.f7026a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l;
        this.g = l2;
        this.h = num;
        this.i = num2;
        this.j = list;
        this.k = l3;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = num3;
        this.p = list2;
        this.q = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBAvailableSlotsTripApiResponseModel)) {
            return false;
        }
        PBAvailableSlotsTripApiResponseModel pBAvailableSlotsTripApiResponseModel = (PBAvailableSlotsTripApiResponseModel) obj;
        return Intrinsics.d(this.f7026a, pBAvailableSlotsTripApiResponseModel.f7026a) && Intrinsics.d(this.b, pBAvailableSlotsTripApiResponseModel.b) && Intrinsics.d(this.c, pBAvailableSlotsTripApiResponseModel.c) && Intrinsics.d(this.d, pBAvailableSlotsTripApiResponseModel.d) && Intrinsics.d(this.e, pBAvailableSlotsTripApiResponseModel.e) && Intrinsics.d(this.f, pBAvailableSlotsTripApiResponseModel.f) && Intrinsics.d(this.g, pBAvailableSlotsTripApiResponseModel.g) && Intrinsics.d(this.h, pBAvailableSlotsTripApiResponseModel.h) && Intrinsics.d(this.i, pBAvailableSlotsTripApiResponseModel.i) && Intrinsics.d(this.j, pBAvailableSlotsTripApiResponseModel.j) && Intrinsics.d(this.k, pBAvailableSlotsTripApiResponseModel.k) && Intrinsics.d(this.l, pBAvailableSlotsTripApiResponseModel.l) && Intrinsics.d(this.m, pBAvailableSlotsTripApiResponseModel.m) && Intrinsics.d(this.n, pBAvailableSlotsTripApiResponseModel.n) && Intrinsics.d(this.o, pBAvailableSlotsTripApiResponseModel.o) && Intrinsics.d(this.p, pBAvailableSlotsTripApiResponseModel.p) && Intrinsics.d(this.q, pBAvailableSlotsTripApiResponseModel.q);
    }

    public final int hashCode() {
        String str = this.f7026a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.l;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.o;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list2 = this.p;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.q;
        return iHashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBAvailableSlotsTripApiResponseModel(fromStopId=", this.f7026a, ", toStopId=", this.b, ", tripId=");
        cb0.t(sbE, this.c, ", routeId=", this.d, ", routeName=");
        cb0.r(this.f, this.e, ", fromStopTime=", ", toStopTime=", sbE);
        sbE.append(this.g);
        sbE.append(", vehicleCapacity=");
        sbE.append(this.h);
        sbE.append(", availableSeats=");
        sbE.append(this.i);
        sbE.append(", specialFeatures=");
        sbE.append(this.j);
        sbE.append(", originalFromStopTime=");
        py.t(this.k, ", tripStatus=", this.l, ", slotStatus=", sbE);
        cb0.t(sbE, this.m, ", vehicleNumber=", this.n, ", seatAssignmentType=");
        sbE.append(this.o);
        sbE.append(", applicableRules=");
        sbE.append(this.p);
        sbE.append(", multiSeatAllowed=");
        sbE.append(this.q);
        sbE.append(")");
        return sbE.toString();
    }
}
