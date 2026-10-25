package app.chalo.multimodalticket.data.model.api;

import defpackage.dd;
import defpackage.l60;
import defpackage.nf1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketBookingFareRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5800a;
    public final String b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketBookingFareRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketBookingFareRequestApiModel> serializer() {
            return GroupTicketBookingFareRequestApiModel$$serializer.f5801a;
        }
    }

    public GroupTicketBookingFareRequestApiModel(String str, String journeyConfigurationId, ArrayList arrayList) {
        Intrinsics.i(journeyConfigurationId, "journeyConfigurationId");
        this.f5800a = str;
        this.b = journeyConfigurationId;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBookingFareRequestApiModel)) {
            return false;
        }
        GroupTicketBookingFareRequestApiModel groupTicketBookingFareRequestApiModel = (GroupTicketBookingFareRequestApiModel) obj;
        return Intrinsics.d(this.f5800a, groupTicketBookingFareRequestApiModel.f5800a) && Intrinsics.d(this.b, groupTicketBookingFareRequestApiModel.b) && Intrinsics.d(this.c, groupTicketBookingFareRequestApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5800a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(dd.e("GroupTicketBookingFareRequestApiModel(city=", this.f5800a, ", journeyConfigurationId=", this.b, ", legs="), this.c, ")");
    }

    public /* synthetic */ GroupTicketBookingFareRequestApiModel(List list, int i, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(GroupTicketBookingFareRequestApiModel$$serializer.f5801a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5800a = str;
        this.b = str2;
        this.c = list;
    }
}
