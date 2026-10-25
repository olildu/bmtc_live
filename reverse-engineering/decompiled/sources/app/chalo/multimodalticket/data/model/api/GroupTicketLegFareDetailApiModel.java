package app.chalo.multimodalticket.data.model.api;

import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegFareDetailApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketLegFareDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5828a;
    public final FareBreakupApiModel b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegFareDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegFareDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketLegFareDetailApiModel> serializer() {
            return GroupTicketLegFareDetailApiModel$$serializer.f5829a;
        }
    }

    public /* synthetic */ GroupTicketLegFareDetailApiModel(int i, int i2, FareBreakupApiModel fareBreakupApiModel, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(GroupTicketLegFareDetailApiModel$$serializer.f5829a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5828a = i2;
        this.b = fareBreakupApiModel;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegFareDetailApiModel)) {
            return false;
        }
        GroupTicketLegFareDetailApiModel groupTicketLegFareDetailApiModel = (GroupTicketLegFareDetailApiModel) obj;
        return this.f5828a == groupTicketLegFareDetailApiModel.f5828a && Intrinsics.d(this.b, groupTicketLegFareDetailApiModel.b) && Intrinsics.d(this.c, groupTicketLegFareDetailApiModel.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5828a * 31)) * 31;
        List list = this.c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketLegFareDetailApiModel(sequence=");
        sb.append(this.f5828a);
        sb.append(", legFare=");
        sb.append(this.b);
        sb.append(", legFareBreakup=");
        return xs.l(sb, this.c, ")");
    }
}
