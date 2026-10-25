package app.chalo.metro.data.api;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketOrderRequestPassengerDetail;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroTicketOrderRequestPassengerDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5418a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketOrderRequestPassengerDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/MetroTicketOrderRequestPassengerDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroTicketOrderRequestPassengerDetail> serializer() {
            return MetroTicketOrderRequestPassengerDetail$$serializer.f5419a;
        }
    }

    public /* synthetic */ MetroTicketOrderRequestPassengerDetail(int i, int i2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(MetroTicketOrderRequestPassengerDetail$$serializer.f5419a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5418a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketOrderRequestPassengerDetail)) {
            return false;
        }
        MetroTicketOrderRequestPassengerDetail metroTicketOrderRequestPassengerDetail = (MetroTicketOrderRequestPassengerDetail) obj;
        return this.f5418a == metroTicketOrderRequestPassengerDetail.f5418a && Intrinsics.d(this.b, metroTicketOrderRequestPassengerDetail.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5418a * 31);
    }

    public final String toString() {
        return hq0.d(this.f5418a, "MetroTicketOrderRequestPassengerDetail(count=", ", id=", this.b, ")");
    }

    public MetroTicketOrderRequestPassengerDetail(int i, String id) {
        Intrinsics.i(id, "id");
        this.f5418a = i;
        this.b = id;
    }
}
