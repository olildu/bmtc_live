package app.chalo.premiumbus.data.models.api.response;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PbTripCommunicationMessageApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PbTripCommunicationMessageApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7036a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PbTripCommunicationMessageApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PbTripCommunicationMessageApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PbTripCommunicationMessageApiResponseModel> serializer() {
            return PbTripCommunicationMessageApiResponseModel$$serializer.f7037a;
        }
    }

    public /* synthetic */ PbTripCommunicationMessageApiResponseModel(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(PbTripCommunicationMessageApiResponseModel$$serializer.f7037a.getDescriptor(), i, 3);
            throw null;
        }
        this.f7036a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbTripCommunicationMessageApiResponseModel)) {
            return false;
        }
        PbTripCommunicationMessageApiResponseModel pbTripCommunicationMessageApiResponseModel = (PbTripCommunicationMessageApiResponseModel) obj;
        return Intrinsics.d(this.f7036a, pbTripCommunicationMessageApiResponseModel.f7036a) && Intrinsics.d(this.b, pbTripCommunicationMessageApiResponseModel.b);
    }

    public final int hashCode() {
        String str = this.f7036a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vo1.o("PbTripCommunicationMessageApiResponseModel(text=", this.f7036a, ", icon=", this.b, ")");
    }
}
