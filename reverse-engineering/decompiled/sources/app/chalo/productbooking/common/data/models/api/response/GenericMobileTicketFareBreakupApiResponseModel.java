package app.chalo.productbooking.common.data.models.api.response;

import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketFareBreakupApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GenericMobileTicketFareBreakupApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8120a;
    public final Long b;
    public final Integer c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketFareBreakupApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketFareBreakupApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GenericMobileTicketFareBreakupApiResponseModel> serializer() {
            return GenericMobileTicketFareBreakupApiResponseModel$$serializer.f8121a;
        }
    }

    public /* synthetic */ GenericMobileTicketFareBreakupApiResponseModel(int i, String str, Long l, Integer num) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(GenericMobileTicketFareBreakupApiResponseModel$$serializer.f8121a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8120a = str;
        this.b = l;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericMobileTicketFareBreakupApiResponseModel)) {
            return false;
        }
        GenericMobileTicketFareBreakupApiResponseModel genericMobileTicketFareBreakupApiResponseModel = (GenericMobileTicketFareBreakupApiResponseModel) obj;
        return Intrinsics.d(this.f8120a, genericMobileTicketFareBreakupApiResponseModel.f8120a) && Intrinsics.d(this.b, genericMobileTicketFareBreakupApiResponseModel.b) && Intrinsics.d(this.c, genericMobileTicketFareBreakupApiResponseModel.c);
    }

    public final int hashCode() {
        String str = this.f8120a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenericMobileTicketFareBreakupApiResponseModel(name=");
        sb.append(this.f8120a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", operation=");
        return pk0.k(sb, this.c, ")");
    }
}
