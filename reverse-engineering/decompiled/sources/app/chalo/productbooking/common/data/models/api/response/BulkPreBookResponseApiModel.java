package app.chalo.productbooking.common.data.models.api.response;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/BulkPreBookResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BulkPreBookResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8116a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/BulkPreBookResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/BulkPreBookResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BulkPreBookResponseApiModel> serializer() {
            return BulkPreBookResponseApiModel$$serializer.f8117a;
        }
    }

    public /* synthetic */ BulkPreBookResponseApiModel(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BulkPreBookResponseApiModel$$serializer.f8117a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8116a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkPreBookResponseApiModel)) {
            return false;
        }
        BulkPreBookResponseApiModel bulkPreBookResponseApiModel = (BulkPreBookResponseApiModel) obj;
        return Intrinsics.d(this.f8116a, bulkPreBookResponseApiModel.f8116a) && Intrinsics.d(this.b, bulkPreBookResponseApiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8116a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("BulkPreBookResponseApiModel(bulkPrebookingRequestId=", this.f8116a, ", status=", this.b, ")");
    }
}
