package app.chalo.productbooking.common.data.models.app.response;

import defpackage.wb;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/BulkPreBookResponseAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BulkPreBookResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8234a;
    public final BulkPreBookStatus b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/BulkPreBookResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/response/BulkPreBookResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BulkPreBookResponseAppModel> serializer() {
            return BulkPreBookResponseAppModel$$serializer.f8235a;
        }
    }

    public /* synthetic */ BulkPreBookResponseAppModel(int i, String str, BulkPreBookStatus bulkPreBookStatus) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BulkPreBookResponseAppModel$$serializer.f8235a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8234a = str;
        this.b = bulkPreBookStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkPreBookResponseAppModel)) {
            return false;
        }
        BulkPreBookResponseAppModel bulkPreBookResponseAppModel = (BulkPreBookResponseAppModel) obj;
        return Intrinsics.d(this.f8234a, bulkPreBookResponseAppModel.f8234a) && this.b == bulkPreBookResponseAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8234a.hashCode() * 31);
    }

    public final String toString() {
        return "BulkPreBookResponseAppModel(bulkBookingRequestId=" + this.f8234a + ", status=" + this.b + ")";
    }

    public BulkPreBookResponseAppModel(String bulkBookingRequestId, BulkPreBookStatus status) {
        Intrinsics.i(bulkBookingRequestId, "bulkBookingRequestId");
        Intrinsics.i(status, "status");
        this.f8234a = bulkBookingRequestId;
        this.b = status;
    }
}
