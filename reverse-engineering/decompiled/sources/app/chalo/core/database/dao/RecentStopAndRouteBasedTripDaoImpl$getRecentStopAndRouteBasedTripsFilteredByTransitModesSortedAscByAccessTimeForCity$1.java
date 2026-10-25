package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopAndRouteBasedTripMappers;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RecentStopAndRouteBasedTripDaoImpl$getRecentStopAndRouteBasedTripsFilteredByTransitModesSortedAscByAccessTimeForCity$1 extends FunctionReferenceImpl implements Function10<String, String, String, String, RecentAdditionalRouteInfoEntity, RecentStopInfoEntity, RecentStopInfoEntity, ChaloTransitMode, Long, Long, RecentStopAndRouteBasedTripEntity> {
    @Override // kotlin.jvm.functions.Function10
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String p2 = (String) obj3;
        String p3 = (String) obj4;
        RecentAdditionalRouteInfoEntity p4 = (RecentAdditionalRouteInfoEntity) obj5;
        RecentStopInfoEntity p5 = (RecentStopInfoEntity) obj6;
        RecentStopInfoEntity p6 = (RecentStopInfoEntity) obj7;
        ChaloTransitMode p7 = (ChaloTransitMode) obj8;
        long jLongValue = ((Number) obj9).longValue();
        long jB = hq0.b((Number) obj10, str, "p0", str2, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p7, "p7");
        ((RecentStopAndRouteBasedTripMappers) this.receiver).getClass();
        return RecentStopAndRouteBasedTripMappers.a(str, str2, p2, p3, p4, p5, p6, p7, jLongValue, jB);
    }
}
