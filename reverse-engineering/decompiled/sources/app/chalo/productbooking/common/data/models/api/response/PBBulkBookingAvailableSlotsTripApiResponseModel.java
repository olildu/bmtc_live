package app.chalo.productbooking.common.data.models.api.response;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/PBBulkBookingAvailableSlotsTripApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBBulkBookingAvailableSlotsTripApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new eo0(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8143a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/PBBulkBookingAvailableSlotsTripApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/PBBulkBookingAvailableSlotsTripApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBBulkBookingAvailableSlotsTripApiResponseModel> serializer() {
            return PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer.f8144a;
        }
    }

    public /* synthetic */ PBBulkBookingAvailableSlotsTripApiResponseModel(int i, String str, String str2, Long l, Long l2, Long l3, Integer num, List list) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer.f8144a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8143a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = num;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBBulkBookingAvailableSlotsTripApiResponseModel)) {
            return false;
        }
        PBBulkBookingAvailableSlotsTripApiResponseModel pBBulkBookingAvailableSlotsTripApiResponseModel = (PBBulkBookingAvailableSlotsTripApiResponseModel) obj;
        return Intrinsics.d(this.f8143a, pBBulkBookingAvailableSlotsTripApiResponseModel.f8143a) && Intrinsics.d(this.b, pBBulkBookingAvailableSlotsTripApiResponseModel.b) && Intrinsics.d(this.c, pBBulkBookingAvailableSlotsTripApiResponseModel.c) && Intrinsics.d(this.d, pBBulkBookingAvailableSlotsTripApiResponseModel.d) && Intrinsics.d(this.e, pBBulkBookingAvailableSlotsTripApiResponseModel.e) && Intrinsics.d(this.f, pBBulkBookingAvailableSlotsTripApiResponseModel.f) && Intrinsics.d(this.g, pBBulkBookingAvailableSlotsTripApiResponseModel.g);
    }

    public final int hashCode() {
        String str = this.f8143a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBBulkBookingAvailableSlotsTripApiResponseModel(routeId=", this.f8143a, ", tripId=", this.b, ", fromStopTime=");
        nf1.w(sbE, this.c, ", toStopTime=", this.d, ", tripStartTime=");
        sbE.append(this.e);
        sbE.append(", seatAssignmentType=");
        sbE.append(this.f);
        sbE.append(", specialFeatures=");
        return xs.l(sbE, this.g, ")");
    }
}
