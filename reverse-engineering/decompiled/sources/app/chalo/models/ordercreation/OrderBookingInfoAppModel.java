package app.chalo.models.ordercreation;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ordercreation/OrderBookingInfoAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OrderBookingInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5642a;
    public final Long b;
    public final Long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ordercreation/OrderBookingInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ordercreation/OrderBookingInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OrderBookingInfoAppModel> serializer() {
            return OrderBookingInfoAppModel$$serializer.f5643a;
        }
    }

    public /* synthetic */ OrderBookingInfoAppModel(int i, Long l, Long l2, Long l3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(OrderBookingInfoAppModel$$serializer.f5643a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5642a = l;
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderBookingInfoAppModel)) {
            return false;
        }
        OrderBookingInfoAppModel orderBookingInfoAppModel = (OrderBookingInfoAppModel) obj;
        return Intrinsics.d(this.f5642a, orderBookingInfoAppModel.f5642a) && Intrinsics.d(this.b, orderBookingInfoAppModel.b) && Intrinsics.d(this.c, orderBookingInfoAppModel.c);
    }

    public final int hashCode() {
        Long l = this.f5642a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderBookingInfoAppModel(bookingTime=");
        sb.append(this.f5642a);
        sb.append(", expiryTime=");
        sb.append(this.b);
        sb.append(", startTime=");
        return pk0.l(sb, this.c, ")");
    }

    public OrderBookingInfoAppModel(Long l, Long l2, Long l3) {
        this.f5642a = l;
        this.b = l2;
        this.c = l3;
    }
}
