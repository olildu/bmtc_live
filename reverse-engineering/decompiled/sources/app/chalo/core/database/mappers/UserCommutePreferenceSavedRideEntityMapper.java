package app.chalo.core.database.mappers;

import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/UserCommutePreferenceSavedRideEntityMapper;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceSavedRideEntityMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserCommutePreferenceSavedRideEntityMapper f2113a = new UserCommutePreferenceSavedRideEntityMapper();

    public static UserCommutePreferenceSavedRideEntity a(long j, String id, String userId, String cityId, String origin, String destination) {
        Intrinsics.i(id, "id");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(origin, "origin");
        Intrinsics.i(destination, "destination");
        return new UserCommutePreferenceSavedRideEntity(j, id, userId, cityId, origin, destination);
    }
}
