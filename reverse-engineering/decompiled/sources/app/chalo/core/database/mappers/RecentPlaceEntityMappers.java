package app.chalo.core.database.mappers;

import app.chalo.location.LatLng;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/mappers/RecentPlaceEntityMappers;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentPlaceEntityMappers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentPlaceEntityMappers f2099a = new RecentPlaceEntityMappers();

    public static RecentPlaceEntity a(String placeId, String searchPartner, String cityId, String str, String locationTitle, LatLng latLng, RecentsSpecialEntityStatus recentsSpecialEntityStatus, long j, long j2, String str2) {
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(locationTitle, "locationTitle");
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(recentsSpecialEntityStatus, "recentsSpecialEntityStatus");
        return new RecentPlaceEntity(placeId, searchPartner, cityId, str, locationTitle, latLng, recentsSpecialEntityStatus, j, (int) j2, str2);
    }
}
