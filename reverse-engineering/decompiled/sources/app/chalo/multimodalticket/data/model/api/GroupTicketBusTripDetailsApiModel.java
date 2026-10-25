package app.chalo.multimodalticket.data.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBusTripDetailsApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketBusTripDetailsApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5804a;
    public final GroupTicketStopDetailsApiModel b;
    public final GroupTicketStopDetailsApiModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBusTripDetailsApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketBusTripDetailsApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketBusTripDetailsApiModel> serializer() {
            return GroupTicketBusTripDetailsApiModel$$serializer.f5805a;
        }
    }

    public /* synthetic */ GroupTicketBusTripDetailsApiModel(int i, String str, GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel, GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(GroupTicketBusTripDetailsApiModel$$serializer.f5805a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5804a = str;
        this.b = groupTicketStopDetailsApiModel;
        this.c = groupTicketStopDetailsApiModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBusTripDetailsApiModel)) {
            return false;
        }
        GroupTicketBusTripDetailsApiModel groupTicketBusTripDetailsApiModel = (GroupTicketBusTripDetailsApiModel) obj;
        return Intrinsics.d(this.f5804a, groupTicketBusTripDetailsApiModel.f5804a) && Intrinsics.d(this.b, groupTicketBusTripDetailsApiModel.b) && Intrinsics.d(this.c, groupTicketBusTripDetailsApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5804a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GroupTicketBusTripDetailsApiModel(routeId=" + this.f5804a + ", startStop=" + this.b + ", endStop=" + this.c + ")";
    }

    public GroupTicketBusTripDetailsApiModel(String routeId, GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel, GroupTicketStopDetailsApiModel groupTicketStopDetailsApiModel2) {
        Intrinsics.i(routeId, "routeId");
        this.f5804a = routeId;
        this.b = groupTicketStopDetailsApiModel;
        this.c = groupTicketStopDetailsApiModel2;
    }
}
