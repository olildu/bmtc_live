package app.chalo.premiumbus.managers;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusPurchaseInfoState;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusPurchaseInfoState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBProductConfigAppModel f7273a;
    public final PBOriginDestinationAppModel b;
    public final PBAvailableSlotsTripAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusPurchaseInfoState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/managers/PremiumBusPurchaseInfoState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusPurchaseInfoState> serializer() {
            return PremiumBusPurchaseInfoState$$serializer.f7274a;
        }
    }

    public /* synthetic */ PremiumBusPurchaseInfoState(int i, PBProductConfigAppModel pBProductConfigAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(PremiumBusPurchaseInfoState$$serializer.f7274a.getDescriptor(), i, 7);
            throw null;
        }
        this.f7273a = pBProductConfigAppModel;
        this.b = pBOriginDestinationAppModel;
        this.c = pBAvailableSlotsTripAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPurchaseInfoState)) {
            return false;
        }
        PremiumBusPurchaseInfoState premiumBusPurchaseInfoState = (PremiumBusPurchaseInfoState) obj;
        return Intrinsics.d(this.f7273a, premiumBusPurchaseInfoState.f7273a) && Intrinsics.d(this.b, premiumBusPurchaseInfoState.b) && Intrinsics.d(this.c, premiumBusPurchaseInfoState.c);
    }

    public final int hashCode() {
        PBProductConfigAppModel pBProductConfigAppModel = this.f7273a;
        int iHashCode = (pBProductConfigAppModel == null ? 0 : pBProductConfigAppModel.hashCode()) * 31;
        PBOriginDestinationAppModel pBOriginDestinationAppModel = this.b;
        int iHashCode2 = (iHashCode + (pBOriginDestinationAppModel == null ? 0 : pBOriginDestinationAppModel.hashCode())) * 31;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.c;
        return iHashCode2 + (pBAvailableSlotsTripAppModel != null ? pBAvailableSlotsTripAppModel.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusPurchaseInfoState(productConfigItemSelected=" + this.f7273a + ", originDestinationSelected=" + this.b + ", slotSelected=" + this.c + ")";
    }

    public PremiumBusPurchaseInfoState(PBProductConfigAppModel pBProductConfigAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel) {
        this.f7273a = pBProductConfigAppModel;
        this.b = pBOriginDestinationAppModel;
        this.c = pBAvailableSlotsTripAppModel;
    }
}
