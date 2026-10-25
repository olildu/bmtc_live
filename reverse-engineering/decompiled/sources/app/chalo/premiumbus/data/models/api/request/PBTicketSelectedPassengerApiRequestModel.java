package app.chalo.premiumbus.data.models.api.request;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketSelectedPassengerApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBTicketSelectedPassengerApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6998a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBTicketSelectedPassengerApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PBTicketSelectedPassengerApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBTicketSelectedPassengerApiRequestModel> serializer() {
            return PBTicketSelectedPassengerApiRequestModel$$serializer.f6999a;
        }
    }

    public /* synthetic */ PBTicketSelectedPassengerApiRequestModel(int i, String str, int i2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PBTicketSelectedPassengerApiRequestModel$$serializer.f6999a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6998a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBTicketSelectedPassengerApiRequestModel)) {
            return false;
        }
        PBTicketSelectedPassengerApiRequestModel pBTicketSelectedPassengerApiRequestModel = (PBTicketSelectedPassengerApiRequestModel) obj;
        return Intrinsics.d(this.f6998a, pBTicketSelectedPassengerApiRequestModel.f6998a) && this.b == pBTicketSelectedPassengerApiRequestModel.b;
    }

    public final int hashCode() {
        return (this.f6998a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return xs.i(this.b, "PBTicketSelectedPassengerApiRequestModel(id=", this.f6998a, ", count=", ")");
    }

    public PBTicketSelectedPassengerApiRequestModel(String id, int i) {
        Intrinsics.i(id, "id");
        this.f6998a = id;
        this.b = i;
    }
}
