package app.chalo.multimodalticket.data.model.api;

import defpackage.cb0;
import defpackage.l60;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegBreakupApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketLegBreakupApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5826a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegBreakupApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegBreakupApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketLegBreakupApiModel> serializer() {
            return GroupTicketLegBreakupApiModel$$serializer.f5827a;
        }
    }

    public /* synthetic */ GroupTicketLegBreakupApiModel(int i, Integer num, String str, String str2, String str3, Long l, Long l2, List list) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(GroupTicketLegBreakupApiModel$$serializer.f5827a.getDescriptor(), i, 127);
            throw null;
        }
        this.f5826a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = l2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketLegBreakupApiModel)) {
            return false;
        }
        GroupTicketLegBreakupApiModel groupTicketLegBreakupApiModel = (GroupTicketLegBreakupApiModel) obj;
        return Intrinsics.d(this.f5826a, groupTicketLegBreakupApiModel.f5826a) && Intrinsics.d(this.b, groupTicketLegBreakupApiModel.b) && Intrinsics.d(this.c, groupTicketLegBreakupApiModel.c) && Intrinsics.d(this.d, groupTicketLegBreakupApiModel.d) && Intrinsics.d(this.e, groupTicketLegBreakupApiModel.e) && Intrinsics.d(this.f, groupTicketLegBreakupApiModel.f) && Intrinsics.d(this.g, groupTicketLegBreakupApiModel.g);
    }

    public final int hashCode() {
        Integer num = this.f5826a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupTicketLegBreakupApiModel(sequence=");
        sb.append(this.f5826a);
        sb.append(", transportMode=");
        sb.append(this.b);
        sb.append(", productId=");
        cb0.t(sb, this.c, ", categoryId=", this.d, ", payableAmount=");
        nf1.w(sb, this.e, ", actualAmount=", this.f, ", legFareBreakup=");
        return xs.l(sb, this.g, ")");
    }
}
