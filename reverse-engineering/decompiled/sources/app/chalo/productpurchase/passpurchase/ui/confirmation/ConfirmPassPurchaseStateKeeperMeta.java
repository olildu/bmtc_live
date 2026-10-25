package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmPassPurchaseStateKeeperMeta;", "Lapp/chalo/resultstatemanager/ResultStateKeeperMeta;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ConfirmPassPurchaseStateKeeperMeta extends ResultStateKeeperMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final CreateOrderResponseAppModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmPassPurchaseStateKeeperMeta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/ConfirmPassPurchaseStateKeeperMeta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ConfirmPassPurchaseStateKeeperMeta> serializer() {
            return ConfirmPassPurchaseStateKeeperMeta$$serializer.f8360a;
        }
    }

    static {
        CreateOrderResponseAppModel.Companion companion = CreateOrderResponseAppModel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPassPurchaseStateKeeperMeta(CreateOrderResponseAppModel order) {
        super(order.f);
        Intrinsics.i(order, "order");
        this.b = order;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmPassPurchaseStateKeeperMeta) && Intrinsics.d(this.b, ((ConfirmPassPurchaseStateKeeperMeta) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ConfirmPassPurchaseStateKeeperMeta(order=" + this.b + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmPassPurchaseStateKeeperMeta(int i, String str, CreateOrderResponseAppModel createOrderResponseAppModel) {
        super(i, str);
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ConfirmPassPurchaseStateKeeperMeta$$serializer.f8360a.getDescriptor(), i, 3);
            throw null;
        }
        this.b = createOrderResponseAppModel;
    }
}
