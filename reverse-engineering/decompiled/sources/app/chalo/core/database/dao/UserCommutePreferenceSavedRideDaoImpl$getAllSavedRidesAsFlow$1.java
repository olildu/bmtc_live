package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.UserCommutePreferenceSavedRideEntityMapper;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class UserCommutePreferenceSavedRideDaoImpl$getAllSavedRidesAsFlow$1 extends FunctionReferenceImpl implements Function6<String, String, String, Long, String, String, UserCommutePreferenceSavedRideEntity> {
    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String p0 = (String) obj;
        String p1 = (String) obj2;
        String p2 = (String) obj3;
        long jLongValue = ((Number) obj4).longValue();
        String p4 = (String) obj5;
        String p5 = (String) obj6;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        Intrinsics.i(p2, "p2");
        Intrinsics.i(p4, "p4");
        Intrinsics.i(p5, "p5");
        ((UserCommutePreferenceSavedRideEntityMapper) this.receiver).getClass();
        return UserCommutePreferenceSavedRideEntityMapper.a(jLongValue, p0, p1, p2, p4, p5);
    }
}
