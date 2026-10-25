package app.chalo.premiumbus.managers;

import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import defpackage.nt0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusSharedRestoredState;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusSharedRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusPurchaseInfoState f7276a;
    public final PremiumBusProductPurchaseFlowType b;
    public final ProductConfigCompleteDetailsListAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusSharedRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/managers/PremiumBusSharedRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusSharedRestoredState> serializer() {
            return PremiumBusSharedRestoredState$$serializer.f7277a;
        }
    }

    public /* synthetic */ PremiumBusSharedRestoredState(int i, PremiumBusPurchaseInfoState premiumBusPurchaseInfoState, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PremiumBusSharedRestoredState$$serializer.f7277a.getDescriptor(), i, 7);
            throw null;
        }
        this.f7276a = premiumBusPurchaseInfoState;
        this.b = premiumBusProductPurchaseFlowType;
        this.c = productConfigCompleteDetailsListAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusSharedRestoredState)) {
            return false;
        }
        PremiumBusSharedRestoredState premiumBusSharedRestoredState = (PremiumBusSharedRestoredState) obj;
        return Intrinsics.d(this.f7276a, premiumBusSharedRestoredState.f7276a) && Intrinsics.d(this.b, premiumBusSharedRestoredState.b) && Intrinsics.d(this.c, premiumBusSharedRestoredState.c);
    }

    public final int hashCode() {
        PremiumBusPurchaseInfoState premiumBusPurchaseInfoState = this.f7276a;
        int iHashCode = (premiumBusPurchaseInfoState == null ? 0 : premiumBusPurchaseInfoState.hashCode()) * 31;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = this.b;
        int iHashCode2 = (iHashCode + (premiumBusProductPurchaseFlowType == null ? 0 : premiumBusProductPurchaseFlowType.hashCode())) * 31;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = this.c;
        return iHashCode2 + (productConfigCompleteDetailsListAppModel != null ? productConfigCompleteDetailsListAppModel.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusSharedRestoredState(premiumBusPurchaseInfoState=" + this.f7276a + ", premiumBusProductPurchaseFlowType=" + this.b + ", completeProductConfigSelected=" + this.c + ")";
    }

    public PremiumBusSharedRestoredState(PremiumBusPurchaseInfoState premiumBusPurchaseInfoState, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel) {
        this.f7276a = premiumBusPurchaseInfoState;
        this.b = premiumBusProductPurchaseFlowType;
        this.c = productConfigCompleteDetailsListAppModel;
    }
}
