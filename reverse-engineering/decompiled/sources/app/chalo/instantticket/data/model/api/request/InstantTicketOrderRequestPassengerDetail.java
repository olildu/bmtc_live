package app.chalo.instantticket.data.model.api.request;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestPassengerDetail;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketOrderRequestPassengerDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3855a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestPassengerDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/InstantTicketOrderRequestPassengerDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketOrderRequestPassengerDetail> serializer() {
            return InstantTicketOrderRequestPassengerDetail$$serializer.f3856a;
        }
    }

    public /* synthetic */ InstantTicketOrderRequestPassengerDetail(int i, int i2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(InstantTicketOrderRequestPassengerDetail$$serializer.f3856a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3855a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketOrderRequestPassengerDetail)) {
            return false;
        }
        InstantTicketOrderRequestPassengerDetail instantTicketOrderRequestPassengerDetail = (InstantTicketOrderRequestPassengerDetail) obj;
        return this.f3855a == instantTicketOrderRequestPassengerDetail.f3855a && Intrinsics.d(this.b, instantTicketOrderRequestPassengerDetail.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3855a * 31);
    }

    public final String toString() {
        return hq0.d(this.f3855a, "InstantTicketOrderRequestPassengerDetail(count=", ", id=", this.b, ")");
    }

    public InstantTicketOrderRequestPassengerDetail(int i, String id) {
        Intrinsics.i(id, "id");
        this.f3855a = i;
        this.b = id;
    }
}
