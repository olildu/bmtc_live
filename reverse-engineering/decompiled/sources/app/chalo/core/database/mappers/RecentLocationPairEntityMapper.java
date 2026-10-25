package app.chalo.core.database.mappers;

import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/RecentLocationPairEntityMapper;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentLocationPairEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentLocationPairEntityMapper f2098a = new RecentLocationPairEntityMapper();

    public static RecentLocationPairEntity a(String pairId, String cityId, RecentLocationPairEndpointEntity fromEndpoint, RecentLocationPairEndpointEntity toEndpoint, long j, long j2) {
        Intrinsics.i(pairId, "pairId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromEndpoint, "fromEndpoint");
        Intrinsics.i(toEndpoint, "toEndpoint");
        return new RecentLocationPairEntity(pairId, cityId, fromEndpoint, toEndpoint, j, (int) j2);
    }
}
