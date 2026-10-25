package app.chalo.multimodalticket.data.model.api;

import defpackage.l60;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketBookingFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5802a;
    public final Integer b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketBookingFareResponseApiModel> serializer() {
            return GroupTicketBookingFareResponseApiModel$$serializer.f5803a;
        }
    }

    public /* synthetic */ GroupTicketBookingFareResponseApiModel(int i, Integer num, String str, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(GroupTicketBookingFareResponseApiModel$$serializer.f5803a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5802a = str;
        this.b = num;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBookingFareResponseApiModel)) {
            return false;
        }
        GroupTicketBookingFareResponseApiModel groupTicketBookingFareResponseApiModel = (GroupTicketBookingFareResponseApiModel) obj;
        return Intrinsics.d(this.f5802a, groupTicketBookingFareResponseApiModel.f5802a) && Intrinsics.d(this.b, groupTicketBookingFareResponseApiModel.b) && Intrinsics.d(this.c, groupTicketBookingFareResponseApiModel.c);
    }

    public final int hashCode() {
        String str = this.f5802a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketBookingFareResponseApiModel(transactionId=");
        sb.append(this.f5802a);
        sb.append(", maxTotalIssueCount=");
        sb.append(this.b);
        sb.append(", categories=");
        return xs.l(sb, this.c, ")");
    }
}
