package app.chalo.productbooking.common.data.models.app.response;

import app.chalo.uistate.dialog.DateAvailabilityStatus;
import defpackage.t10;
import defpackage.z61;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/SlotAvailableOnDateInfo;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SlotAvailableOnDateInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8238a;
    public final long b;
    public final DateAvailabilityStatus c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/SlotAvailableOnDateInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/response/SlotAvailableOnDateInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SlotAvailableOnDateInfo> serializer() {
            return SlotAvailableOnDateInfo$$serializer.f8239a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new z61(16)), LazyKt.a(lazyThreadSafetyMode, new z61(17))};
    }

    public /* synthetic */ SlotAvailableOnDateInfo(int i, String str, long j, DateAvailabilityStatus dateAvailabilityStatus, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(SlotAvailableOnDateInfo$$serializer.f8239a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8238a = str;
        this.b = j;
        this.c = dateAvailabilityStatus;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotAvailableOnDateInfo)) {
            return false;
        }
        SlotAvailableOnDateInfo slotAvailableOnDateInfo = (SlotAvailableOnDateInfo) obj;
        return Intrinsics.d(this.f8238a, slotAvailableOnDateInfo.f8238a) && this.b == slotAvailableOnDateInfo.b && this.c == slotAvailableOnDateInfo.c && Intrinsics.d(this.d, slotAvailableOnDateInfo.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8238a.hashCode() * 31;
        long j = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "SlotAvailableOnDateInfo(id=", this.f8238a, ", date=");
        sbM.append(", remark=");
        sbM.append(this.c);
        sbM.append(", slots=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public SlotAvailableOnDateInfo(String id, long j, DateAvailabilityStatus remark, ArrayList arrayList) {
        Intrinsics.i(id, "id");
        Intrinsics.i(remark, "remark");
        this.f8238a = id;
        this.b = j;
        this.c = remark;
        this.d = arrayList;
    }
}
