package app.chalo.productbooking.common.data.models.api.response;

import defpackage.dd;
import defpackage.t40;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketPassengerDetailsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GenericMobileTicketPassengerDetailsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new t40(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8122a;
    public final String b;
    public final Integer c;
    public final Long d;
    public final Long e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketPassengerDetailsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketPassengerDetailsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GenericMobileTicketPassengerDetailsApiResponseModel> serializer() {
            return GenericMobileTicketPassengerDetailsApiResponseModel$$serializer.f8123a;
        }
    }

    public /* synthetic */ GenericMobileTicketPassengerDetailsApiResponseModel(int i, String str, String str2, Integer num, Long l, Long l2, List list) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(GenericMobileTicketPassengerDetailsApiResponseModel$$serializer.f8123a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8122a = str;
        this.b = str2;
        this.c = num;
        this.d = l;
        this.e = l2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericMobileTicketPassengerDetailsApiResponseModel)) {
            return false;
        }
        GenericMobileTicketPassengerDetailsApiResponseModel genericMobileTicketPassengerDetailsApiResponseModel = (GenericMobileTicketPassengerDetailsApiResponseModel) obj;
        return Intrinsics.d(this.f8122a, genericMobileTicketPassengerDetailsApiResponseModel.f8122a) && Intrinsics.d(this.b, genericMobileTicketPassengerDetailsApiResponseModel.b) && Intrinsics.d(this.c, genericMobileTicketPassengerDetailsApiResponseModel.c) && Intrinsics.d(this.d, genericMobileTicketPassengerDetailsApiResponseModel.d) && Intrinsics.d(this.e, genericMobileTicketPassengerDetailsApiResponseModel.e) && Intrinsics.d(this.f, genericMobileTicketPassengerDetailsApiResponseModel.f);
    }

    public final int hashCode() {
        String str = this.f8122a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GenericMobileTicketPassengerDetailsApiResponseModel(id=", this.f8122a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualAmount=");
        sbE.append(this.d);
        sbE.append(", payableAmount=");
        sbE.append(this.e);
        sbE.append(", fareBreakup=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
