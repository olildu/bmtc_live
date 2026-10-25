package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentPlaceEntityMappers;
import app.chalo.location.LatLng;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RecentPlacesCityItineraryDaoImpl$getAllPlacesCityItineraryForCitySortedDesc$1 extends FunctionReferenceImpl implements Function10<String, String, String, String, String, LatLng, RecentsSpecialEntityStatus, Long, Long, String, RecentPlaceEntity> {
    @Override // kotlin.jvm.functions.Function10
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p4 = (String) obj5;
        LatLng p5 = (LatLng) obj6;
        RecentsSpecialEntityStatus p6 = (RecentsSpecialEntityStatus) obj7;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        ((RecentPlaceEntityMappers) this.receiver).getClass();
        return RecentPlaceEntityMappers.a(p0, p1, p2, (String) obj4, p4, p5, p6, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10);
    }
}
