package app.chalo.instantticket.data.model.api.response;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/ValidateInstantTicketFareResponseAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ValidateInstantTicketFareResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3879a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/ValidateInstantTicketFareResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/ValidateInstantTicketFareResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ValidateInstantTicketFareResponseAppModel> serializer() {
            return ValidateInstantTicketFareResponseAppModel$$serializer.f3880a;
        }
    }

    public /* synthetic */ ValidateInstantTicketFareResponseAppModel(int i, boolean z, int i2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ValidateInstantTicketFareResponseAppModel$$serializer.f3880a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3879a = z;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateInstantTicketFareResponseAppModel)) {
            return false;
        }
        ValidateInstantTicketFareResponseAppModel validateInstantTicketFareResponseAppModel = (ValidateInstantTicketFareResponseAppModel) obj;
        return this.f3879a == validateInstantTicketFareResponseAppModel.f3879a && this.b == validateInstantTicketFareResponseAppModel.b;
    }

    public final int hashCode() {
        return ((this.f3879a ? 1231 : 1237) * 31) + this.b;
    }

    public final String toString() {
        return "ValidateInstantTicketFareResponseAppModel(isValidFare=" + this.f3879a + ", finalFare=" + this.b + ")";
    }

    public ValidateInstantTicketFareResponseAppModel(boolean z, int i) {
        this.f3879a = z;
        this.b = i;
    }
}
