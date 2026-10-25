package app.chalo.productpurchase.productselection.data.models.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductValidDurationInfoApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UnknownProductValidDurationInfoApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8627a;
    public final Boolean b;
    public final Boolean c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductValidDurationInfoApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/UnknownProductValidDurationInfoApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnknownProductValidDurationInfoApiResponseModel> serializer() {
            return UnknownProductValidDurationInfoApiResponseModel$$serializer.f8628a;
        }
    }

    public /* synthetic */ UnknownProductValidDurationInfoApiResponseModel(int i, String str, Boolean bool, Boolean bool2, String str2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(UnknownProductValidDurationInfoApiResponseModel$$serializer.f8628a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8627a = str;
        this.b = bool;
        this.c = bool2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownProductValidDurationInfoApiResponseModel)) {
            return false;
        }
        UnknownProductValidDurationInfoApiResponseModel unknownProductValidDurationInfoApiResponseModel = (UnknownProductValidDurationInfoApiResponseModel) obj;
        return Intrinsics.d(this.f8627a, unknownProductValidDurationInfoApiResponseModel.f8627a) && Intrinsics.d(this.b, unknownProductValidDurationInfoApiResponseModel.b) && Intrinsics.d(this.c, unknownProductValidDurationInfoApiResponseModel.c) && Intrinsics.d(this.d, unknownProductValidDurationInfoApiResponseModel.d);
    }

    public final int hashCode() {
        String str = this.f8627a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "UnknownProductValidDurationInfoApiResponseModel(displayName=" + this.f8627a + ", isActive=" + this.b + ", isVisible=" + this.c + ", inactiveReason=" + this.d + ")";
    }
}
