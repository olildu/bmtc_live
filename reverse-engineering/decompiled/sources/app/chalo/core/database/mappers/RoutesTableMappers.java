package app.chalo.core.database.mappers;

import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.core.Routes_table;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/RoutesTableMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoutesTableMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoutesTableMappers f2107a = new RoutesTableMappers();

    public static RouteEntity a(long j, String cityId, String routeId, String routeName, String startStopName, String endStopName, String agencyName, List specialFeature, long j2, long j3, RouteEntityLiveDataDetails routeLiveData, RouteEntityDetailedData detailedData, String str, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(specialFeature, "specialFeature");
        Intrinsics.i(routeLiveData, "routeLiveData");
        Intrinsics.i(detailedData, "detailedData");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        return new RouteEntity((int) j, cityId, routeId, routeName, startStopName, endStopName, agencyName, specialFeature, j2, j3, routeLiveData, detailedData, str, routeNamingScheme);
    }

    public static Routes_table b(RouteEntity routeEntity) {
        Intrinsics.i(routeEntity, "<this>");
        return new Routes_table(routeEntity.f1783a, routeEntity.b, routeEntity.c, routeEntity.d, routeEntity.e, routeEntity.f, routeEntity.g, routeEntity.h, routeEntity.i, routeEntity.j, routeEntity.k, routeEntity.l, routeEntity.m, routeEntity.n);
    }
}
