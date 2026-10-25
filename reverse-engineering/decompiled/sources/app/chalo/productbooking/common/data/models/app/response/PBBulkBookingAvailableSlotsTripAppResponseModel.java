package app.chalo.productbooking.common.data.models.app.response;

import app.chalo.premiumbus.data.models.app.PremiumBusSeatAssignmentType;
import defpackage.dd;
import defpackage.eo0;
import defpackage.nf1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/PBBulkBookingAvailableSlotsTripAppResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBBulkBookingAvailableSlotsTripAppResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8236a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final PremiumBusSeatAssignmentType f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/PBBulkBookingAvailableSlotsTripAppResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/response/PBBulkBookingAvailableSlotsTripAppResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBBulkBookingAvailableSlotsTripAppResponseModel> serializer() {
            return PBBulkBookingAvailableSlotsTripAppResponseModel$$serializer.f8237a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new eo0(22)), LazyKt.a(lazyThreadSafetyMode, new eo0(23))};
    }

    public /* synthetic */ PBBulkBookingAvailableSlotsTripAppResponseModel(int i, String str, String str2, long j, long j2, long j3, PremiumBusSeatAssignmentType premiumBusSeatAssignmentType, List list) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(PBBulkBookingAvailableSlotsTripAppResponseModel$$serializer.f8237a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8236a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = premiumBusSeatAssignmentType;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBBulkBookingAvailableSlotsTripAppResponseModel)) {
            return false;
        }
        PBBulkBookingAvailableSlotsTripAppResponseModel pBBulkBookingAvailableSlotsTripAppResponseModel = (PBBulkBookingAvailableSlotsTripAppResponseModel) obj;
        return Intrinsics.d(this.f8236a, pBBulkBookingAvailableSlotsTripAppResponseModel.f8236a) && Intrinsics.d(this.b, pBBulkBookingAvailableSlotsTripAppResponseModel.b) && this.c == pBBulkBookingAvailableSlotsTripAppResponseModel.c && this.d == pBBulkBookingAvailableSlotsTripAppResponseModel.d && this.e == pBBulkBookingAvailableSlotsTripAppResponseModel.e && this.f == pBBulkBookingAvailableSlotsTripAppResponseModel.f && Intrinsics.d(this.g, pBBulkBookingAvailableSlotsTripAppResponseModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8236a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBBulkBookingAvailableSlotsTripAppResponseModel(routeId=", this.f8236a, ", tripId=", this.b, ", fromStopTime=");
        sbE.append(this.c);
        xs.r(this.d, ", toStopTime=", ", tripStartTime=", sbE);
        sbE.append(this.e);
        sbE.append(", seatAssignmentType=");
        sbE.append(this.f);
        sbE.append(", specialFeatures=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }

    public PBBulkBookingAvailableSlotsTripAppResponseModel(String routeId, String tripId, long j, long j2, long j3, PremiumBusSeatAssignmentType seatAssignmentType, List specialFeatures) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(seatAssignmentType, "seatAssignmentType");
        Intrinsics.i(specialFeatures, "specialFeatures");
        this.f8236a = routeId;
        this.b = tripId;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = seatAssignmentType;
        this.g = specialFeatures;
    }
}
