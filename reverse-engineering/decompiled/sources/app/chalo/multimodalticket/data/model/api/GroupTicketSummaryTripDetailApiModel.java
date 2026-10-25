package app.chalo.multimodalticket.data.model.api;

import defpackage.l60;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryTripDetailApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketSummaryTripDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5846a;
    public final GroupTicketSummaryStopApiModel b;
    public final GroupTicketSummaryStopApiModel c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryTripDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryTripDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketSummaryTripDetailApiModel> serializer() {
            return GroupTicketSummaryTripDetailApiModel$$serializer.f5847a;
        }
    }

    public /* synthetic */ GroupTicketSummaryTripDetailApiModel(int i, String str, GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel, GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel2, List list) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.b(GroupTicketSummaryTripDetailApiModel$$serializer.f5847a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f5846a = null;
        } else {
            this.f5846a = str;
        }
        this.b = groupTicketSummaryStopApiModel;
        this.c = groupTicketSummaryStopApiModel2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryTripDetailApiModel)) {
            return false;
        }
        GroupTicketSummaryTripDetailApiModel groupTicketSummaryTripDetailApiModel = (GroupTicketSummaryTripDetailApiModel) obj;
        return Intrinsics.d(this.f5846a, groupTicketSummaryTripDetailApiModel.f5846a) && Intrinsics.d(this.b, groupTicketSummaryTripDetailApiModel.b) && Intrinsics.d(this.c, groupTicketSummaryTripDetailApiModel.c) && Intrinsics.d(this.d, groupTicketSummaryTripDetailApiModel.d);
    }

    public final int hashCode() {
        String str = this.f5846a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GroupTicketSummaryTripDetailApiModel(routeId=" + this.f5846a + ", startStop=" + this.b + ", endStop=" + this.c + ", journeyOverview=" + this.d + ")";
    }

    public GroupTicketSummaryTripDetailApiModel(String str, GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel, GroupTicketSummaryStopApiModel groupTicketSummaryStopApiModel2, ArrayList arrayList) {
        this.f5846a = str;
        this.b = groupTicketSummaryStopApiModel;
        this.c = groupTicketSummaryStopApiModel2;
        this.d = arrayList;
    }
}
