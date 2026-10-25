package app.chalo.superpass.data.models.pendingSuperPass;

import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPassTransactionDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class PendingSuperPassTransactionDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9585a;
    public final String b;
    public final String c;
    public final RefundInfoEntityModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPassTransactionDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPassTransactionDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PendingSuperPassTransactionDetails> serializer() {
            return PendingSuperPassTransactionDetails$$serializer.f9586a;
        }
    }

    static {
        RefundInfoEntityModel.Companion companion = RefundInfoEntityModel.INSTANCE;
    }

    public /* synthetic */ PendingSuperPassTransactionDetails(int i, String str, String str2, String str3, RefundInfoEntityModel refundInfoEntityModel) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.b(PendingSuperPassTransactionDetails$$serializer.f9586a.getDescriptor(), i, 11);
            throw null;
        }
        this.f9585a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = refundInfoEntityModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF9585a() {
        return this.f9585a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public PendingSuperPassTransactionDetails(String paymentMode, String transactionId, String str, RefundInfoEntityModel refundInfoEntityModel) {
        Intrinsics.i(paymentMode, "paymentMode");
        Intrinsics.i(transactionId, "transactionId");
        this.f9585a = paymentMode;
        this.b = transactionId;
        this.c = str;
        this.d = refundInfoEntityModel;
    }
}
