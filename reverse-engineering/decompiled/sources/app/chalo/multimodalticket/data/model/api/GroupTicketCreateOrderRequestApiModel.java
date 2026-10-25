package app.chalo.multimodalticket.data.model.api;

import defpackage.dd;
import defpackage.l60;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketCreateOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5814a;
    public final String b;
    public final String c;
    public final long d;
    public final List e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketCreateOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketCreateOrderRequestApiModel> serializer() {
            return GroupTicketCreateOrderRequestApiModel$$serializer.f5815a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new l60(14)), LazyKt.a(lazyThreadSafetyMode, new l60(15))};
    }

    public /* synthetic */ GroupTicketCreateOrderRequestApiModel(int i, String str, String str2, String str3, long j, List list, List list2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(GroupTicketCreateOrderRequestApiModel$$serializer.f5815a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5814a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCreateOrderRequestApiModel)) {
            return false;
        }
        GroupTicketCreateOrderRequestApiModel groupTicketCreateOrderRequestApiModel = (GroupTicketCreateOrderRequestApiModel) obj;
        return Intrinsics.d(this.f5814a, groupTicketCreateOrderRequestApiModel.f5814a) && Intrinsics.d(this.b, groupTicketCreateOrderRequestApiModel.b) && Intrinsics.d(this.c, groupTicketCreateOrderRequestApiModel.c) && this.d == groupTicketCreateOrderRequestApiModel.d && Intrinsics.d(this.e, groupTicketCreateOrderRequestApiModel.e) && Intrinsics.d(this.f, groupTicketCreateOrderRequestApiModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5814a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.f.hashCode() + r30.b((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketCreateOrderRequestApiModel(city=", this.f5814a, ", journeyConfigurationId=", this.b, ", transactionId=");
        n21.p(this.d, this.c, ", amount=", sbE);
        sbE.append(", passengerDetails=");
        sbE.append(this.e);
        sbE.append(", legs=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public GroupTicketCreateOrderRequestApiModel(String str, String journeyConfigurationId, String transactionId, long j, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(journeyConfigurationId, "journeyConfigurationId");
        Intrinsics.i(transactionId, "transactionId");
        this.f5814a = str;
        this.b = journeyConfigurationId;
        this.c = transactionId;
        this.d = j;
        this.e = arrayList;
        this.f = arrayList2;
    }
}
