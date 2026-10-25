package app.chalo.livetracking.universalsearch.data.model.ui;

import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRouteAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConvertToUiModelKt {
    public static final RecentRouteAppModel a(UniversalSearchRouteAppModel universalSearchRouteAppModel, String str, long j) {
        String str2 = universalSearchRouteAppModel.c;
        return new RecentRouteAppModel(universalSearchRouteAppModel.f4999a, str, universalSearchRouteAppModel.b, universalSearchRouteAppModel.d, universalSearchRouteAppModel.e, universalSearchRouteAppModel.f, universalSearchRouteAppModel.g.contains(RouteLegacySpecialFeature.AC), universalSearchRouteAppModel.h, universalSearchRouteAppModel.i, str2 != null ? ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, str2) : ChaloTransitMode.BUS, RecentsSpecialStatus.NONE, j, 1, universalSearchRouteAppModel.k, universalSearchRouteAppModel.l);
    }
}
