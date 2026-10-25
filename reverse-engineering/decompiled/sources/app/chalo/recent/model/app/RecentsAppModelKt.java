package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecentsAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9005a;

        static {
            int[] iArr = new int[RecentsSpecialStatus.values().length];
            try {
                iArr[RecentsSpecialStatus.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecentsSpecialStatus.FAVOURITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9005a = iArr;
        }
    }

    public static final RecentLocationPairEndpointEntity a(RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel) {
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Stop) {
            return new RecentLocationPairEndpointEntity.StopEndpoint(e(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel).b));
        }
        if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Place) {
            return new RecentLocationPairEndpointEntity.PlaceEndpoint(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel).b.b());
        }
        if (!(recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace)) {
            throw new NoWhenBranchMatchedException();
        }
        RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel;
        return new RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint(e(nearbyStopToPlace.b), nearbyStopToPlace.c.b(), nearbyStopToPlace.d);
    }

    public static final void b(RecentsSpecialStatus recentsSpecialStatus, RecentsSpecialStatus updatedStatus) {
        Intrinsics.i(recentsSpecialStatus, "<this>");
        Intrinsics.i(updatedStatus, "updatedStatus");
        int[] iArr = WhenMappings.f9005a;
        int i = iArr[recentsSpecialStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = iArr[updatedStatus.ordinal()];
            if (i2 != 1 && i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final NearbyStopToLocationAppModel c(RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace) {
        Intrinsics.i(nearbyStopToPlace, "<this>");
        StopAppModel stopAppModel = nearbyStopToPlace.b;
        String str = stopAppModel.f1727a;
        String str2 = stopAppModel.b;
        LatLng latLng = stopAppModel.c;
        double d = latLng.f5134a;
        double d2 = latLng.b;
        String str3 = stopAppModel.e;
        if (str3 == null) {
            str3 = "";
        }
        return new NearbyStopToLocationAppModel(d2, str, d, str3, stopAppModel.d, str2, nearbyStopToPlace.d);
    }

    public static final RecentsSpecialEntityStatus d(RecentsSpecialStatus recentsSpecialStatus) {
        Intrinsics.i(recentsSpecialStatus, "<this>");
        int i = WhenMappings.f9005a[recentsSpecialStatus.ordinal()];
        if (i == 1) {
            return RecentsSpecialEntityStatus.NONE;
        }
        if (i == 2) {
            return RecentsSpecialEntityStatus.FAVOURITE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RecentStopInfoEntity e(StopAppModel stopAppModel) {
        Intrinsics.i(stopAppModel, "<this>");
        String str = stopAppModel.f1727a;
        String str2 = stopAppModel.b;
        LatLng latLng = stopAppModel.c;
        ChaloTransitMode chaloTransitMode = stopAppModel.d;
        String str3 = stopAppModel.e;
        if (str3 == null) {
            str3 = "";
        }
        return new RecentStopInfoEntity(str, str2, latLng, chaloTransitMode, str3, stopAppModel.f);
    }
}
