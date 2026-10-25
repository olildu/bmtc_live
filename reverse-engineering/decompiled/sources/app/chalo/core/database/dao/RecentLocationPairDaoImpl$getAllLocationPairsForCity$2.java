package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentLocationPairEntityMapper;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class RecentLocationPairDaoImpl$getAllLocationPairsForCity$2 extends FunctionReferenceImpl implements Function6<String, String, RecentLocationPairEndpointEntity, RecentLocationPairEndpointEntity, Long, Long, RecentLocationPairEntity> {
    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String str = (String) obj;
        String str2 = (String) obj2;
        RecentLocationPairEndpointEntity p2 = (RecentLocationPairEndpointEntity) obj3;
        RecentLocationPairEndpointEntity p3 = (RecentLocationPairEndpointEntity) obj4;
        long jLongValue = ((Number) obj5).longValue();
        long jB = hq0.b((Number) obj6, str, "p0", str2, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p3, "p3");
        ((RecentLocationPairEntityMapper) this.receiver).getClass();
        return RecentLocationPairEntityMapper.a(str, str2, p2, p3, jLongValue, jB);
    }
}
