package app.chalo.home.data.model.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/response/CheckAppUpdateResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckAppUpdateResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f2924a;
    public final Boolean b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/response/CheckAppUpdateResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/response/CheckAppUpdateResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckAppUpdateResponseApiModel> serializer() {
            return CheckAppUpdateResponseApiModel$$serializer.f2925a;
        }
    }

    public /* synthetic */ CheckAppUpdateResponseApiModel(Boolean bool, Boolean bool2, int i) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CheckAppUpdateResponseApiModel$$serializer.f2925a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2924a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAppUpdateResponseApiModel)) {
            return false;
        }
        CheckAppUpdateResponseApiModel checkAppUpdateResponseApiModel = (CheckAppUpdateResponseApiModel) obj;
        return Intrinsics.d(this.f2924a, checkAppUpdateResponseApiModel.f2924a) && Intrinsics.d(this.b, checkAppUpdateResponseApiModel.b);
    }

    public final int hashCode() {
        Boolean bool = this.f2924a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "CheckAppUpdateResponseApiModel(forceUpdate=" + this.f2924a + ", recommendedUpdate=" + this.b + ")";
    }
}
