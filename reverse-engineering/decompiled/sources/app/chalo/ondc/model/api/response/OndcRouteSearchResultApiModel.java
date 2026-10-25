package app.chalo.ondc.model.api.response;

import defpackage.yn0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcRouteSearchResultApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcRouteSearchResultApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn0(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6760a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/response/OndcRouteSearchResultApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/response/OndcRouteSearchResultApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcRouteSearchResultApiModel> serializer() {
            return OndcRouteSearchResultApiModel$$serializer.f6761a;
        }
    }

    public /* synthetic */ OndcRouteSearchResultApiModel(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(OndcRouteSearchResultApiModel$$serializer.f6761a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6760a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcRouteSearchResultApiModel)) {
            return false;
        }
        OndcRouteSearchResultApiModel ondcRouteSearchResultApiModel = (OndcRouteSearchResultApiModel) obj;
        return Intrinsics.d(this.f6760a, ondcRouteSearchResultApiModel.f6760a) && Intrinsics.d(this.b, ondcRouteSearchResultApiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6760a.hashCode() * 31);
    }

    public final String toString() {
        return "OndcRouteSearchResultApiModel(routes=" + this.f6760a + ", transactionId=" + this.b + ")";
    }
}
