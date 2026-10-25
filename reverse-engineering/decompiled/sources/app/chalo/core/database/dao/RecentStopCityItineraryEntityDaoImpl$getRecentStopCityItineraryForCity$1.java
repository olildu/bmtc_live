package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopCityItineraryMappers;
import app.chalo.recent.database.entities.RecentStopEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItineraryForCity$1 extends FunctionReferenceImpl implements Function7<String, String, RecentStopInfoEntity, RecentsSpecialEntityStatus, Long, Long, String, RecentStopEntity> {
    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        RecentStopInfoEntity p2 = (RecentStopInfoEntity) obj3;
        RecentsSpecialEntityStatus p3 = (RecentsSpecialEntityStatus) obj4;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        ((RecentStopCityItineraryMappers) this.receiver).getClass();
        return RecentStopCityItineraryMappers.a(p0, p1, p2, p3, ((Number) obj5).longValue(), ((Number) obj6).longValue(), (String) obj7);
    }
}
