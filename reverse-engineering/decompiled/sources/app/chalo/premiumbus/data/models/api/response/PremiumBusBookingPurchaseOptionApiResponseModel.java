package app.chalo.premiumbus.data.models.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusBookingPurchaseOptionApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7040a;
    public final String b;
    public final PremiumBusBookingPurchaseOptionDetailsApiResponseModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PremiumBusBookingPurchaseOptionApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusBookingPurchaseOptionApiResponseModel> serializer() {
            return PremiumBusBookingPurchaseOptionApiResponseModel$$serializer.f7041a;
        }
    }

    public /* synthetic */ PremiumBusBookingPurchaseOptionApiResponseModel(int i, Integer num, String str, PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PremiumBusBookingPurchaseOptionApiResponseModel$$serializer.f7041a.getDescriptor(), i, 7);
            throw null;
        }
        this.f7040a = num;
        this.b = str;
        this.c = premiumBusBookingPurchaseOptionDetailsApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingPurchaseOptionApiResponseModel)) {
            return false;
        }
        PremiumBusBookingPurchaseOptionApiResponseModel premiumBusBookingPurchaseOptionApiResponseModel = (PremiumBusBookingPurchaseOptionApiResponseModel) obj;
        return Intrinsics.d(this.f7040a, premiumBusBookingPurchaseOptionApiResponseModel.f7040a) && Intrinsics.d(this.b, premiumBusBookingPurchaseOptionApiResponseModel.b) && Intrinsics.d(this.c, premiumBusBookingPurchaseOptionApiResponseModel.c);
    }

    public final int hashCode() {
        Integer num = this.f7040a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PremiumBusBookingPurchaseOptionDetailsApiResponseModel premiumBusBookingPurchaseOptionDetailsApiResponseModel = this.c;
        return iHashCode2 + (premiumBusBookingPurchaseOptionDetailsApiResponseModel != null ? premiumBusBookingPurchaseOptionDetailsApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusBookingPurchaseOptionApiResponseModel(priority=" + this.f7040a + ", optionType=" + this.b + ", details=" + this.c + ")";
    }
}
