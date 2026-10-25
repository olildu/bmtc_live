package app.chalo.core.database.dao;

import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.core.database.mappers.RoutesTableMappers;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RouteDaoImpl$getRouteAsFlow$1 extends FunctionReferenceImpl implements Function14<Long, String, String, String, String, String, String, List<? extends String>, Long, Long, RouteEntityLiveDataDetails, RouteEntityDetailedData, String, RouteNamingSchemeType, RouteEntity> {
    @Override // kotlin.jvm.functions.Function14
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        String p3 = (String) obj4;
        String p4 = (String) obj5;
        String p5 = (String) obj6;
        String p6 = (String) obj7;
        List p7 = (List) obj8;
        RouteEntityLiveDataDetails p10 = (RouteEntityLiveDataDetails) obj11;
        RouteEntityDetailedData p11 = (RouteEntityDetailedData) obj12;
        RouteNamingSchemeType p13 = (RouteNamingSchemeType) obj14;
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        Intrinsics.i(p6, "p6");
        Intrinsics.i(p7, "p7");
        Intrinsics.i(p10, "p10");
        Intrinsics.i(p11, "p11");
        Intrinsics.i(p13, "p13");
        ((RoutesTableMappers) this.receiver).getClass();
        return RoutesTableMappers.a(((Number) obj).longValue(), p1, p2, p3, p4, p5, p6, p7, ((Number) obj9).longValue(), ((Number) obj10).longValue(), p10, p11, (String) obj13, p13);
    }
}
