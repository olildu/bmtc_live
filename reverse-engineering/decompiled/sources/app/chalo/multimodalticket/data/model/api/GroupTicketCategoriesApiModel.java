package app.chalo.multimodalticket.data.model.api;

import defpackage.dd;
import defpackage.l60;
import defpackage.nf1;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCategoriesApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketCategoriesApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5806a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final Integer f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketCategoriesApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketCategoriesApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketCategoriesApiModel> serializer() {
            return GroupTicketCategoriesApiModel$$serializer.f5807a;
        }
    }

    public /* synthetic */ GroupTicketCategoriesApiModel(int i, String str, String str2, Long l, Long l2, Integer num, Integer num2, List list) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(GroupTicketCategoriesApiModel$$serializer.f5807a.getDescriptor(), i, 127);
            throw null;
        }
        this.f5806a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = num;
        this.f = num2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketCategoriesApiModel)) {
            return false;
        }
        GroupTicketCategoriesApiModel groupTicketCategoriesApiModel = (GroupTicketCategoriesApiModel) obj;
        return Intrinsics.d(this.f5806a, groupTicketCategoriesApiModel.f5806a) && Intrinsics.d(this.b, groupTicketCategoriesApiModel.b) && Intrinsics.d(this.c, groupTicketCategoriesApiModel.c) && Intrinsics.d(this.d, groupTicketCategoriesApiModel.d) && Intrinsics.d(this.e, groupTicketCategoriesApiModel.e) && Intrinsics.d(this.f, groupTicketCategoriesApiModel.f) && Intrinsics.d(this.g, groupTicketCategoriesApiModel.g);
    }

    public final int hashCode() {
        String str = this.f5806a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketCategoriesApiModel(id=", this.f5806a, ", name=", this.b, ", payableAmount=");
        nf1.w(sbE, this.c, ", actualAmount=", this.d, ", minIssueCount=");
        pk0.y(sbE, this.e, ", maxIssueCount=", this.f, ", legBreakup=");
        return xs.l(sbE, this.g, ")");
    }
}
