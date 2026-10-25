package app.chalo.multimodalticket.data.model.api;

import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderLegApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketCreateOrderLegApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5808a;
    public final String b;
    public final String c;
    public final long d;
    public final GroupTicketCreateOrderTripDetailApiModel e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderLegApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderLegApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketCreateOrderLegApiModel> serializer() {
            return GroupTicketCreateOrderLegApiModel$$serializer.f5809a;
        }
    }

    public /* synthetic */ GroupTicketCreateOrderLegApiModel(int i, int i2, String str, String str2, long j, GroupTicketCreateOrderTripDetailApiModel groupTicketCreateOrderTripDetailApiModel) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(GroupTicketCreateOrderLegApiModel$$serializer.f5809a.getDescriptor(), i, 31);
            throw null;
        }
        this.f5808a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = groupTicketCreateOrderTripDetailApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderLegApiModel)) {
            return false;
        }
        GroupTicketCreateOrderLegApiModel groupTicketCreateOrderLegApiModel = (GroupTicketCreateOrderLegApiModel) obj;
        return this.f5808a == groupTicketCreateOrderLegApiModel.f5808a && Intrinsics.d(this.b, groupTicketCreateOrderLegApiModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderLegApiModel.c) && this.d == groupTicketCreateOrderLegApiModel.d && Intrinsics.d(this.e, groupTicketCreateOrderLegApiModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5808a * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.e.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f5808a, "GroupTicketCreateOrderLegApiModel(sequence=", ", transportMode=", this.b, ", configurationId=");
        n21.p(this.d, this.c, ", amount=", sbP);
        sbP.append(", tripDetail=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }

    public GroupTicketCreateOrderLegApiModel(int i, String transportMode, String configurationId, long j, GroupTicketCreateOrderTripDetailApiModel groupTicketCreateOrderTripDetailApiModel) {
        Intrinsics.i(transportMode, "transportMode");
        Intrinsics.i(configurationId, "configurationId");
        this.f5808a = i;
        this.b = transportMode;
        this.c = configurationId;
        this.d = j;
        this.e = groupTicketCreateOrderTripDetailApiModel;
    }
}
