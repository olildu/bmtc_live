package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.chalo.core.User_commute_preference_place_tableQueries;
import app.chalo.core.database.mappers.UserCommutePreferenceStopPlaceEntityMapper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceDao;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/UserCommutePreferenceStopPlaceDaoImpl;", "Lapp/chalo/usercommutepreference/data/dao/UserCommutePreferenceStopPlaceDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceStopPlaceDaoImpl implements UserCommutePreferenceStopPlaceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final User_commute_preference_place_tableQueries f2086a;
    public final CoroutineContextProvider b;

    public UserCommutePreferenceStopPlaceDaoImpl(User_commute_preference_place_tableQueries userCommutePreferencePlaceTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(userCommutePreferencePlaceTableQueries, "userCommutePreferencePlaceTableQueries");
        this.f2086a = userCommutePreferencePlaceTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceDao
    public final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 b(String str, String str2) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(FlowQuery.a(FlowQuery.c(this.f2086a.Y(str, str2, new UserCommutePreferenceStopPlaceDaoImpl$getAllUserCommutePreferencePlacesAsFlow$1(12, UserCommutePreferenceStopPlaceEntityMapper.f2114a, UserCommutePreferenceStopPlaceEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)Lapp/chalo/usercommutepreference/data/dao/UserCommutePreferenceStopPlaceEntity;", 0))), this.b.b()), new UserCommutePreferenceStopPlaceDaoImpl$getAllUserCommutePreferencePlacesAsFlow$2(3, null));
    }

    @Override // app.chalo.usercommutepreference.data.dao.UserCommutePreferenceStopPlaceDao
    public final Object c(ArrayList arrayList, String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new UserCommutePreferenceStopPlaceDaoImpl$syncUserCommutePreferencePlaces$2(this, str, str2, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
