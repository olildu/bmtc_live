package app.chalo.models.ondc;

import defpackage.dd;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptPassengerDetailsApiResponseModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketReceiptPassengerDetailsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5633a;
    public final String b;
    public final Integer c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/ondc/OndcTicketReceiptPassengerDetailsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/ondc/OndcTicketReceiptPassengerDetailsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketReceiptPassengerDetailsApiResponseModel> serializer() {
            return OndcTicketReceiptPassengerDetailsApiResponseModel$$serializer.f5634a;
        }
    }

    public /* synthetic */ OndcTicketReceiptPassengerDetailsApiResponseModel(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(OndcTicketReceiptPassengerDetailsApiResponseModel$$serializer.f5634a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5633a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketReceiptPassengerDetailsApiResponseModel)) {
            return false;
        }
        OndcTicketReceiptPassengerDetailsApiResponseModel ondcTicketReceiptPassengerDetailsApiResponseModel = (OndcTicketReceiptPassengerDetailsApiResponseModel) obj;
        return Intrinsics.d(this.f5633a, ondcTicketReceiptPassengerDetailsApiResponseModel.f5633a) && Intrinsics.d(this.b, ondcTicketReceiptPassengerDetailsApiResponseModel.b) && Intrinsics.d(this.c, ondcTicketReceiptPassengerDetailsApiResponseModel.c);
    }

    public final int hashCode() {
        String str = this.f5633a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return pk0.k(dd.e("OndcTicketReceiptPassengerDetailsApiResponseModel(id=", this.f5633a, ", name=", this.b, ", count="), this.c, ")");
    }
}
