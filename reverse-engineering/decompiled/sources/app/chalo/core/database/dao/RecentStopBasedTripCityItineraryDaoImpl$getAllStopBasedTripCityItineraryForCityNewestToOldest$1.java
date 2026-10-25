package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopBasedTripCityItineraryMappers;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCityNewestToOldest$1 extends FunctionReferenceImpl implements Function7<String, String, RecentStopInfoEntity, RecentStopInfoEntity, ChaloTransitMode, Long, Long, RecentStopBasedTripEntity> {
    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        String str = (String) obj;
        String str2 = (String) obj2;
        RecentStopInfoEntity p2 = (RecentStopInfoEntity) obj3;
        RecentStopInfoEntity p3 = (RecentStopInfoEntity) obj4;
        ChaloTransitMode p4 = (ChaloTransitMode) obj5;
        long jLongValue = ((Number) obj6).longValue();
        long jB = hq0.b((Number) obj7, str, "p0", str2, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        ((RecentStopBasedTripCityItineraryMappers) this.receiver).getClass();
        return RecentStopBasedTripCityItineraryMappers.a(str, str2, p2, p3, p4, jLongValue, jB);
    }
}
