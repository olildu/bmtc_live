package app.chalo.routeselection.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class StopBasedRouteSearchForProductPurchaseComponent$handleRoutesFetchedSuccessFully$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str;
        OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) obj;
        RouteNamingSchemeType routeNamingSchemeType = originDestinationAppModel.j;
        int[] iArr = StopBasedRouteSearchForProductPurchaseComponent.WhenMappings.f9191a;
        int i = iArr[routeNamingSchemeType.ordinal()];
        String str2 = null;
        if (i == 1) {
            StopAppModel stopAppModel = originDestinationAppModel.f;
            str = stopAppModel != null ? stopAppModel.b : null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = originDestinationAppModel.b;
        }
        OriginDestinationAppModel originDestinationAppModel2 = (OriginDestinationAppModel) obj2;
        int i2 = iArr[originDestinationAppModel2.j.ordinal()];
        if (i2 == 1) {
            StopAppModel stopAppModel2 = originDestinationAppModel2.f;
            if (stopAppModel2 != null) {
                str2 = stopAppModel2.b;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = originDestinationAppModel2.b;
        }
        return ComparisonsKt.a(str, str2);
    }
}
