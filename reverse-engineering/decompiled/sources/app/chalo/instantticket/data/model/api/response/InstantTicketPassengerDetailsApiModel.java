package app.chalo.instantticket.data.model.api.response;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketPassengerDetailsApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketPassengerDetailsApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3867a;
    public final String b;
    public final Integer c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final Boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/InstantTicketPassengerDetailsApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/InstantTicketPassengerDetailsApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketPassengerDetailsApiModel> serializer() {
            return InstantTicketPassengerDetailsApiModel$$serializer.f3868a;
        }
    }

    public /* synthetic */ InstantTicketPassengerDetailsApiModel(int i, String str, String str2, Integer num, Long l, Long l2, Integer num2, Boolean bool) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(InstantTicketPassengerDetailsApiModel$$serializer.f3868a.getDescriptor(), i, 127);
            throw null;
        }
        this.f3867a = str;
        this.b = str2;
        this.c = num;
        this.d = l;
        this.e = l2;
        this.f = num2;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketPassengerDetailsApiModel)) {
            return false;
        }
        InstantTicketPassengerDetailsApiModel instantTicketPassengerDetailsApiModel = (InstantTicketPassengerDetailsApiModel) obj;
        return Intrinsics.d(this.f3867a, instantTicketPassengerDetailsApiModel.f3867a) && Intrinsics.d(this.b, instantTicketPassengerDetailsApiModel.b) && Intrinsics.d(this.c, instantTicketPassengerDetailsApiModel.c) && Intrinsics.d(this.d, instantTicketPassengerDetailsApiModel.d) && Intrinsics.d(this.e, instantTicketPassengerDetailsApiModel.e) && Intrinsics.d(this.f, instantTicketPassengerDetailsApiModel.f) && Intrinsics.d(this.g, instantTicketPassengerDetailsApiModel.g);
    }

    public final int hashCode() {
        String str = this.f3867a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketPassengerDetailsApiModel(id=", this.f3867a, ", name=", this.b, ", count=");
        sbE.append(this.c);
        sbE.append(", actualAmount=");
        sbE.append(this.d);
        sbE.append(", payableAmount=");
        sbE.append(this.e);
        sbE.append(", discountPercentage=");
        sbE.append(this.f);
        sbE.append(", isDiscountApplicable=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
