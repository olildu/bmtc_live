package app.chalo.multimodalticket.data.model.api;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryLegApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketSummaryLegApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5834a;
    public final String b;
    public final String c;
    public final GroupTicketSummaryTripDetailApiModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryLegApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryLegApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketSummaryLegApiModel> serializer() {
            return GroupTicketSummaryLegApiModel$$serializer.f5835a;
        }
    }

    public /* synthetic */ GroupTicketSummaryLegApiModel(int i, int i2, String str, String str2, GroupTicketSummaryTripDetailApiModel groupTicketSummaryTripDetailApiModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(GroupTicketSummaryLegApiModel$$serializer.f5835a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5834a = i2;
        this.b = str;
        this.c = str2;
        this.d = groupTicketSummaryTripDetailApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryLegApiModel)) {
            return false;
        }
        GroupTicketSummaryLegApiModel groupTicketSummaryLegApiModel = (GroupTicketSummaryLegApiModel) obj;
        return this.f5834a == groupTicketSummaryLegApiModel.f5834a && Intrinsics.d(this.b, groupTicketSummaryLegApiModel.b) && Intrinsics.d(this.c, groupTicketSummaryLegApiModel.c) && Intrinsics.d(this.d, groupTicketSummaryLegApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f5834a * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f5834a, "GroupTicketSummaryLegApiModel(sequence=", ", transportMode=", this.b, ", configurationId=");
        sbP.append(this.c);
        sbP.append(", tripDetail=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }

    public GroupTicketSummaryLegApiModel(int i, String transportMode, String configurationId, GroupTicketSummaryTripDetailApiModel groupTicketSummaryTripDetailApiModel) {
        Intrinsics.i(transportMode, "transportMode");
        Intrinsics.i(configurationId, "configurationId");
        this.f5834a = i;
        this.b = transportMode;
        this.c = configurationId;
        this.d = groupTicketSummaryTripDetailApiModel;
    }
}
