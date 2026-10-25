package app.chalo.premiumbus.data.models.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBStopPlaceSelectedAppModelKt {
    public static final PBStopPlaceSelectedAppModel a(StopAppModel stopAppModel) {
        Intrinsics.i(stopAppModel, "<this>");
        return new PBStopPlaceSelectedAppModel(stopAppModel.f1727a, "searchPartnerChaloStop", stopAppModel.b, stopAppModel.e, stopAppModel.c, PremiumBusSelectedLocationType.STOP);
    }

    public static final PBStopPlaceSelectedAppModel b(RecentPlaceAppModel recentPlaceAppModel) {
        String str = recentPlaceAppModel.e;
        String str2 = recentPlaceAppModel.f;
        return new PBStopPlaceSelectedAppModel(str, str2, recentPlaceAppModel.g, recentPlaceAppModel.i, recentPlaceAppModel.j, Intrinsics.d(str2, "userLocation") ? PremiumBusSelectedLocationType.LOCATION : PremiumBusSelectedLocationType.PLACE);
    }
}
