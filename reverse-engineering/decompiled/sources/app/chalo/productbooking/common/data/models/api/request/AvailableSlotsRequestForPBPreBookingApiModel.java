package app.chalo.productbooking.common.data.models.api.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.p7;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/AvailableSlotsRequestForPBPreBookingApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AvailableSlotsRequestForPBPreBookingApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(9)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8098a;
    public final String b;
    public final String c;
    public final List d;
    public final long e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/AvailableSlotsRequestForPBPreBookingApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/request/AvailableSlotsRequestForPBPreBookingApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AvailableSlotsRequestForPBPreBookingApiModel> serializer() {
            return AvailableSlotsRequestForPBPreBookingApiModel$$serializer.f8099a;
        }
    }

    public /* synthetic */ AvailableSlotsRequestForPBPreBookingApiModel(int i, String str, String str2, String str3, List list, long j, long j2, long j3) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(AvailableSlotsRequestForPBPreBookingApiModel$$serializer.f8099a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8098a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableSlotsRequestForPBPreBookingApiModel)) {
            return false;
        }
        AvailableSlotsRequestForPBPreBookingApiModel availableSlotsRequestForPBPreBookingApiModel = (AvailableSlotsRequestForPBPreBookingApiModel) obj;
        return Intrinsics.d(this.f8098a, availableSlotsRequestForPBPreBookingApiModel.f8098a) && Intrinsics.d(this.b, availableSlotsRequestForPBPreBookingApiModel.b) && Intrinsics.d(this.c, availableSlotsRequestForPBPreBookingApiModel.c) && Intrinsics.d(this.d, availableSlotsRequestForPBPreBookingApiModel.d) && this.e == availableSlotsRequestForPBPreBookingApiModel.e && this.f == availableSlotsRequestForPBPreBookingApiModel.f && this.g == availableSlotsRequestForPBPreBookingApiModel.g;
    }

    public final int hashCode() {
        int iB = r30.b(nf1.e(nf1.e(this.f8098a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        long j3 = this.g;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("AvailableSlotsRequestForPBPreBookingApiModel(passId=", this.f8098a, ", fromStopId=", this.b, ", toStopId=");
        pk0.w(this.c, ", routeIds=", ", startTimeInMillis=", sbE, this.d);
        sbE.append(this.e);
        xs.r(this.f, ", endTimeInMillis=", ", tripStartTimeInMillisSinceMidnight=", sbE);
        return uf0.m(this.g, ")", sbE);
    }

    public AvailableSlotsRequestForPBPreBookingApiModel(String passId, String fromStopId, String toStopId, List routeIds, long j, long j2, long j3) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(routeIds, "routeIds");
        this.f8098a = passId;
        this.b = fromStopId;
        this.c = toStopId;
        this.d = routeIds;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }
}
