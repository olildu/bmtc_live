package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/FreeRideCountResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FreeRideCountResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f8565a;
    public final FreeRideCountDataApiModel b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/FreeRideCountResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/FreeRideCountResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FreeRideCountResponseApiModel> serializer() {
            return FreeRideCountResponseApiModel$$serializer.f8566a;
        }
    }

    public /* synthetic */ FreeRideCountResponseApiModel(int i, Boolean bool, FreeRideCountDataApiModel freeRideCountDataApiModel, String str) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FreeRideCountResponseApiModel$$serializer.f8566a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8565a = bool;
        this.b = freeRideCountDataApiModel;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeRideCountResponseApiModel)) {
            return false;
        }
        FreeRideCountResponseApiModel freeRideCountResponseApiModel = (FreeRideCountResponseApiModel) obj;
        return Intrinsics.d(this.f8565a, freeRideCountResponseApiModel.f8565a) && Intrinsics.d(this.b, freeRideCountResponseApiModel.b) && Intrinsics.d(this.c, freeRideCountResponseApiModel.c);
    }

    public final int hashCode() {
        Boolean bool = this.f8565a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        FreeRideCountDataApiModel freeRideCountDataApiModel = this.b;
        int iHashCode2 = (iHashCode + (freeRideCountDataApiModel == null ? 0 : freeRideCountDataApiModel.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeRideCountResponseApiModel(status=");
        sb.append(this.f8565a);
        sb.append(", responseData=");
        sb.append(this.b);
        sb.append(", errorMsg=");
        return vo1.p(sb, this.c, ")");
    }
}
