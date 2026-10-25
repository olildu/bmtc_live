package app.chalo.premiumbus.data.models.api.response;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import defpackage.z61;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/SlotSearchRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SlotSearchRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new z61(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7064a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final boolean f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/SlotSearchRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/SlotSearchRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SlotSearchRequestApiModel> serializer() {
            return SlotSearchRequestApiModel$$serializer.f7065a;
        }
    }

    public /* synthetic */ SlotSearchRequestApiModel(int i, String str, String str2, long j, long j2, String str3, boolean z, List list) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(SlotSearchRequestApiModel$$serializer.f7065a.getDescriptor(), i, 127);
            throw null;
        }
        this.f7064a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = z;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotSearchRequestApiModel)) {
            return false;
        }
        SlotSearchRequestApiModel slotSearchRequestApiModel = (SlotSearchRequestApiModel) obj;
        return Intrinsics.d(this.f7064a, slotSearchRequestApiModel.f7064a) && Intrinsics.d(this.b, slotSearchRequestApiModel.b) && this.c == slotSearchRequestApiModel.c && this.d == slotSearchRequestApiModel.d && Intrinsics.d(this.e, slotSearchRequestApiModel.e) && this.f == slotSearchRequestApiModel.f && Intrinsics.d(this.g, slotSearchRequestApiModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7064a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return this.g.hashCode() + ((nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.e) + (this.f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SlotSearchRequestApiModel(fromStopId=", this.f7064a, ", toStopId=", this.b, ", windowStartTime=");
        sbE.append(this.c);
        xs.r(this.d, ", windowEndTime=", ", city=", sbE);
        t10.s(this.e, ", fetchAvailableSeats=", ", routeIds=", sbE, this.f);
        return xs.l(sbE, this.g, ")");
    }

    public SlotSearchRequestApiModel(String fromStopId, String toStopId, long j, long j2, String city, boolean z, List routeIds) {
        Intrinsics.i(fromStopId, "fromStopId");
        Intrinsics.i(toStopId, "toStopId");
        Intrinsics.i(city, "city");
        Intrinsics.i(routeIds, "routeIds");
        this.f7064a = fromStopId;
        this.b = toStopId;
        this.c = j;
        this.d = j2;
        this.e = city;
        this.f = z;
        this.g = routeIds;
    }
}
