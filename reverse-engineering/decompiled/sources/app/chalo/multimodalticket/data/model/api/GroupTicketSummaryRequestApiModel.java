package app.chalo.multimodalticket.data.model.api;

import defpackage.dd;
import defpackage.l60;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketSummaryRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5840a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketSummaryRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketSummaryRequestApiModel> serializer() {
            return GroupTicketSummaryRequestApiModel$$serializer.f5841a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new l60(26)), LazyKt.a(lazyThreadSafetyMode, new l60(27))};
    }

    public /* synthetic */ GroupTicketSummaryRequestApiModel(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(GroupTicketSummaryRequestApiModel$$serializer.f5841a.getDescriptor(), i, 31);
            throw null;
        }
        this.f5840a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSummaryRequestApiModel)) {
            return false;
        }
        GroupTicketSummaryRequestApiModel groupTicketSummaryRequestApiModel = (GroupTicketSummaryRequestApiModel) obj;
        return Intrinsics.d(this.f5840a, groupTicketSummaryRequestApiModel.f5840a) && Intrinsics.d(this.b, groupTicketSummaryRequestApiModel.b) && Intrinsics.d(this.c, groupTicketSummaryRequestApiModel.c) && Intrinsics.d(this.d, groupTicketSummaryRequestApiModel.d) && Intrinsics.d(this.e, groupTicketSummaryRequestApiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.b(nf1.e(nf1.e(this.f5840a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketSummaryRequestApiModel(city=", this.f5840a, ", journeyConfigurationId=", this.b, ", transactionId=");
        pk0.w(this.c, ", passengerDetails=", ", legs=", sbE, this.d);
        return xs.l(sbE, this.e, ")");
    }

    public GroupTicketSummaryRequestApiModel(String str, String journeyConfigurationId, String transactionId, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.i(journeyConfigurationId, "journeyConfigurationId");
        Intrinsics.i(transactionId, "transactionId");
        this.f5840a = str;
        this.b = journeyConfigurationId;
        this.c = transactionId;
        this.d = arrayList;
        this.e = arrayList2;
    }
}
