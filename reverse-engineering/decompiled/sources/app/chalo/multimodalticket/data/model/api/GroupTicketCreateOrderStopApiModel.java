package app.chalo.multimodalticket.data.model.api;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderStopApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketCreateOrderStopApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5816a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderStopApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderStopApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketCreateOrderStopApiModel> serializer() {
            return GroupTicketCreateOrderStopApiModel$$serializer.f5817a;
        }
    }

    public /* synthetic */ GroupTicketCreateOrderStopApiModel(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(GroupTicketCreateOrderStopApiModel$$serializer.f5817a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5816a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderStopApiModel)) {
            return false;
        }
        GroupTicketCreateOrderStopApiModel groupTicketCreateOrderStopApiModel = (GroupTicketCreateOrderStopApiModel) obj;
        return Intrinsics.d(this.f5816a, groupTicketCreateOrderStopApiModel.f5816a) && Intrinsics.d(this.b, groupTicketCreateOrderStopApiModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderStopApiModel.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5816a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(dd.e("GroupTicketCreateOrderStopApiModel(stopId=", this.f5816a, ", stopName=", this.b, ", partnerStopCode="), this.c, ")");
    }

    public GroupTicketCreateOrderStopApiModel(String stopId, String stopName, String str) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f5816a = stopId;
        this.b = stopName;
        this.c = str;
    }
}
