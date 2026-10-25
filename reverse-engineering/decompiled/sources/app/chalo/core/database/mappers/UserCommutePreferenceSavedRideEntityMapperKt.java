package app.chalo.core.database.mappers;

import app.chalo.core.User_commute_preference_saved_ride_table;
import app.chalo.usercommutepreference.data.dao.UserCommutePreferenceSavedRideEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserCommutePreferenceSavedRideEntityMapperKt {
    public static final User_commute_preference_saved_ride_table a(UserCommutePreferenceSavedRideEntity userCommutePreferenceSavedRideEntity, String userId, String cityId) {
        Intrinsics.i(userCommutePreferenceSavedRideEntity, "<this>");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        return new User_commute_preference_saved_ride_table(userCommutePreferenceSavedRideEntity.d, userCommutePreferenceSavedRideEntity.f10238a, userId, cityId, userCommutePreferenceSavedRideEntity.e, userCommutePreferenceSavedRideEntity.f);
    }
}
