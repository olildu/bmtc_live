package app.chalo.features.chaloconfig.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/chaloconfig/data/model/ChaloConfigApiResponseModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloConfigApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2636a;
    public final ChaloConfigResponse b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/chaloconfig/data/model/ChaloConfigApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/chaloconfig/data/model/ChaloConfigApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloConfigApiResponseModel> serializer() {
            return ChaloConfigApiResponseModel$$serializer.f2637a;
        }
    }

    public /* synthetic */ ChaloConfigApiResponseModel(int i, Boolean bool, ChaloConfigResponse chaloConfigResponse) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ChaloConfigApiResponseModel$$serializer.f2637a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2636a = bool;
        this.b = chaloConfigResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloConfigApiResponseModel)) {
            return false;
        }
        ChaloConfigApiResponseModel chaloConfigApiResponseModel = (ChaloConfigApiResponseModel) obj;
        return Intrinsics.d(this.f2636a, chaloConfigApiResponseModel.f2636a) && Intrinsics.d(this.b, chaloConfigApiResponseModel.b);
    }

    public final int hashCode() {
        Boolean bool = this.f2636a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ChaloConfigResponse chaloConfigResponse = this.b;
        return iHashCode + (chaloConfigResponse != null ? chaloConfigResponse.hashCode() : 0);
    }

    public final String toString() {
        return "ChaloConfigApiResponseModel(status=" + this.f2636a + ", response=" + this.b + ")";
    }
}
