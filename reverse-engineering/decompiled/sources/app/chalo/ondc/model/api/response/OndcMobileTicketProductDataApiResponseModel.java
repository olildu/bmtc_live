package app.chalo.ondc.model.api.response;

import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketProductApiResponseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcMobileTicketProductDataApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcMobileTicketProductDataApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericMobileTicketProductApiResponseModel f6758a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcMobileTicketProductDataApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/response/OndcMobileTicketProductDataApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcMobileTicketProductDataApiResponseModel> serializer() {
            return OndcMobileTicketProductDataApiResponseModel$$serializer.f6759a;
        }
    }

    public /* synthetic */ OndcMobileTicketProductDataApiResponseModel(int i, GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel) {
        if (1 == (i & 1)) {
            this.f6758a = genericMobileTicketProductApiResponseModel;
        } else {
            PluginExceptionsKt.b(OndcMobileTicketProductDataApiResponseModel$$serializer.f6759a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OndcMobileTicketProductDataApiResponseModel) && Intrinsics.d(this.f6758a, ((OndcMobileTicketProductDataApiResponseModel) obj).f6758a);
    }

    public final int hashCode() {
        GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel = this.f6758a;
        if (genericMobileTicketProductApiResponseModel == null) {
            return 0;
        }
        return genericMobileTicketProductApiResponseModel.hashCode();
    }

    public final String toString() {
        return "OndcMobileTicketProductDataApiResponseModel(mobileTicket=" + this.f6758a + ")";
    }
}
