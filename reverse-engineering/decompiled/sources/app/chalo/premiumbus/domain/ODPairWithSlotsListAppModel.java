package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairWithSlotsListAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ODPairWithSlotsListAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBOriginDestinationAppModel f7215a;
    public final PBAvailableSlotsInfoAppModel b;
    public final PBAvailableSlotsInfoAppModel c;

    public ODPairWithSlotsListAppModel(PBOriginDestinationAppModel pBOriginDestinationAppModel, PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel, PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2) {
        this.f7215a = pBOriginDestinationAppModel;
        this.b = pBAvailableSlotsInfoAppModel;
        this.c = pBAvailableSlotsInfoAppModel2;
    }

    public final PBAvailableSlotsTripAppModel a() {
        List list;
        Object obj = null;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel = this.c;
        if (pBAvailableSlotsInfoAppModel == null || (list = pBAvailableSlotsInfoAppModel.c) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((PBAvailableSlotsTripAppModel) obj2).d()) {
                obj = obj2;
                break;
            }
        }
        return (PBAvailableSlotsTripAppModel) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ODPairWithSlotsListAppModel)) {
            return false;
        }
        ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel = (ODPairWithSlotsListAppModel) obj;
        return Intrinsics.d(this.f7215a, oDPairWithSlotsListAppModel.f7215a) && Intrinsics.d(this.b, oDPairWithSlotsListAppModel.b) && Intrinsics.d(this.c, oDPairWithSlotsListAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7215a.hashCode() * 31;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel = this.b;
        int iHashCode2 = (iHashCode + (pBAvailableSlotsInfoAppModel == null ? 0 : pBAvailableSlotsInfoAppModel.hashCode())) * 31;
        PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel2 = this.c;
        return iHashCode2 + (pBAvailableSlotsInfoAppModel2 != null ? pBAvailableSlotsInfoAppModel2.hashCode() : 0);
    }

    public final String toString() {
        return "ODPairWithSlotsListAppModel(odPairInfo=" + this.f7215a + ", availableSlotsInfo=" + this.b + ", highlightedSlotsInfo=" + this.c + ")";
    }
}
