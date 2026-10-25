package app.chalo.checkout.data.model.api.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ClosedLoopWalletPaymentRequestApiModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClosedLoopWalletPaymentRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1246a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/api/request/ClosedLoopWalletPaymentRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/api/request/ClosedLoopWalletPaymentRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClosedLoopWalletPaymentRequestApiModel> serializer() {
            return ClosedLoopWalletPaymentRequestApiModel$$serializer.f1247a;
        }
    }

    public /* synthetic */ ClosedLoopWalletPaymentRequestApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(ClosedLoopWalletPaymentRequestApiModel$$serializer.f1247a.getDescriptor(), i, 63);
            throw null;
        }
        this.f1246a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClosedLoopWalletPaymentRequestApiModel)) {
            return false;
        }
        ClosedLoopWalletPaymentRequestApiModel closedLoopWalletPaymentRequestApiModel = (ClosedLoopWalletPaymentRequestApiModel) obj;
        return Intrinsics.d(this.f1246a, closedLoopWalletPaymentRequestApiModel.f1246a) && Intrinsics.d(this.b, closedLoopWalletPaymentRequestApiModel.b) && Intrinsics.d(this.c, closedLoopWalletPaymentRequestApiModel.c) && this.d == closedLoopWalletPaymentRequestApiModel.d && Intrinsics.d(this.e, closedLoopWalletPaymentRequestApiModel.e) && Intrinsics.d(this.f, closedLoopWalletPaymentRequestApiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e((nf1.e(nf1.e(this.f1246a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ClosedLoopWalletPaymentRequestApiModel(walletId=", this.f1246a, ", orderId=", this.b, ", userId=");
        cb0.o(this.d, this.c, ", amount=", ", agency=", sbE);
        return r30.i(sbE, this.e, ", city=", this.f, ")");
    }

    public ClosedLoopWalletPaymentRequestApiModel(int i, String walletId, String orderId, String userId, String str, String str2) {
        Intrinsics.i(walletId, "walletId");
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(userId, "userId");
        this.f1246a = walletId;
        this.b = orderId;
        this.c = userId;
        this.d = i;
        this.e = str;
        this.f = str2;
    }
}
