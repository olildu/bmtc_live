package app.chalo.recent.model;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.recent.database.entities.ChaloDescriptiveLocationEntityModel;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentCityItineraryEntitiesKt;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentRouteEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentTripEntity;
import app.chalo.recent.model.app.RecentAdditionalRouteInfoModel;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-city-data_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConvertToAppModelKt {
    public static final RecentLocationPairAppModel a(RecentLocationPairEntity recentLocationPairEntity) {
        Intrinsics.i(recentLocationPairEntity, "<this>");
        return new RecentLocationPairAppModel(recentLocationPairEntity.f8939a, recentLocationPairEntity.b, b(recentLocationPairEntity.c), b(recentLocationPairEntity.d), recentLocationPairEntity.e, recentLocationPairEntity.f);
    }

    public static final RecentLocationPairEndpointAppModel b(RecentLocationPairEndpointEntity recentLocationPairEndpointEntity) {
        if (recentLocationPairEndpointEntity instanceof RecentLocationPairEndpointEntity.StopEndpoint) {
            return new RecentLocationPairEndpointAppModel.Stop(f(((RecentLocationPairEndpointEntity.StopEndpoint) recentLocationPairEndpointEntity).b));
        }
        if (recentLocationPairEndpointEntity instanceof RecentLocationPairEndpointEntity.PlaceEndpoint) {
            RecentPlaceEntity recentPlaceEntity = ((RecentLocationPairEndpointEntity.PlaceEndpoint) recentLocationPairEndpointEntity).b;
            String str = recentPlaceEntity.c;
            String str2 = recentPlaceEntity.d;
            return new RecentLocationPairEndpointAppModel.Place(new RecentPlaceAppModel(recentPlaceEntity.f8940a, recentPlaceEntity.b, recentPlaceEntity.e, str, str2, recentPlaceEntity.f, RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g), 0L, (String) null, 896));
        }
        if (!(recentLocationPairEndpointEntity instanceof RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint)) {
            throw new NoWhenBranchMatchedException();
        }
        RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint nearbyStopToPlaceEndpoint = (RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint) recentLocationPairEndpointEntity;
        StopAppModel stopAppModelF = f(nearbyStopToPlaceEndpoint.b);
        RecentPlaceEntity recentPlaceEntity2 = nearbyStopToPlaceEndpoint.c;
        String str3 = recentPlaceEntity2.c;
        String str4 = recentPlaceEntity2.d;
        return new RecentLocationPairEndpointAppModel.NearbyStopToPlace(stopAppModelF, new RecentPlaceAppModel(recentPlaceEntity2.f8940a, recentPlaceEntity2.b, recentPlaceEntity2.e, str3, str4, recentPlaceEntity2.f, RecentCityItineraryEntitiesKt.a(recentPlaceEntity2.g), 0L, (String) null, 896), nearbyStopToPlaceEndpoint.d);
    }

    public static final RecentStopAndRouteBasedAppModel c(RecentStopAndRouteBasedTripEntity recentStopAndRouteBasedTripEntity) {
        RecentAdditionalRouteInfoModel metro;
        Intrinsics.i(recentStopAndRouteBasedTripEntity, "<this>");
        String str = recentStopAndRouteBasedTripEntity.f8943a;
        String str2 = recentStopAndRouteBasedTripEntity.b;
        String str3 = recentStopAndRouteBasedTripEntity.c;
        String str4 = recentStopAndRouteBasedTripEntity.d;
        RecentAdditionalRouteInfoEntity recentAdditionalRouteInfoEntity = recentStopAndRouteBasedTripEntity.e;
        Intrinsics.i(recentAdditionalRouteInfoEntity, "<this>");
        if (recentAdditionalRouteInfoEntity instanceof RecentAdditionalRouteInfoEntity.Metro) {
            metro = new RecentAdditionalRouteInfoModel.Metro(((RecentAdditionalRouteInfoEntity.Metro) recentAdditionalRouteInfoEntity).f8932a);
        } else {
            if (!recentAdditionalRouteInfoEntity.equals(RecentAdditionalRouteInfoEntity.Bus.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            metro = RecentAdditionalRouteInfoModel.Bus.f8995a;
        }
        return new RecentStopAndRouteBasedAppModel(str, str2, str3, str4, metro, f(recentStopAndRouteBasedTripEntity.f), f(recentStopAndRouteBasedTripEntity.g), recentStopAndRouteBasedTripEntity.h, recentStopAndRouteBasedTripEntity.i, recentStopAndRouteBasedTripEntity.j);
    }

    public static final RecentPlaceAppModel d(RecentPlaceEntity recentPlaceEntity) {
        Intrinsics.i(recentPlaceEntity, "<this>");
        return new RecentPlaceAppModel(recentPlaceEntity.f8940a, recentPlaceEntity.b, recentPlaceEntity.e, recentPlaceEntity.c, recentPlaceEntity.d, recentPlaceEntity.f, RecentCityItineraryEntitiesKt.a(recentPlaceEntity.g), recentPlaceEntity.h, recentPlaceEntity.i, recentPlaceEntity.j);
    }

    public static final RecentRouteAppModel e(RecentRouteEntity recentRouteEntity) {
        Intrinsics.i(recentRouteEntity, "<this>");
        return new RecentRouteAppModel(recentRouteEntity.f8942a, recentRouteEntity.b, recentRouteEntity.c, recentRouteEntity.d, recentRouteEntity.e, recentRouteEntity.f, recentRouteEntity.g, recentRouteEntity.h, recentRouteEntity.i, recentRouteEntity.j, RecentCityItineraryEntitiesKt.a(recentRouteEntity.k), recentRouteEntity.l, recentRouteEntity.m, recentRouteEntity.n, recentRouteEntity.o);
    }

    public static final StopAppModel f(RecentStopInfoEntity recentStopInfoEntity) {
        Intrinsics.i(recentStopInfoEntity, "<this>");
        return new StopAppModel(recentStopInfoEntity.f8947a, recentStopInfoEntity.b, recentStopInfoEntity.c, recentStopInfoEntity.d, recentStopInfoEntity.e, recentStopInfoEntity.f);
    }

    public static final RecentStopBasedTripAppModel g(RecentStopBasedTripEntity recentStopBasedTripEntity) {
        Intrinsics.i(recentStopBasedTripEntity, "<this>");
        return new RecentStopBasedTripAppModel(recentStopBasedTripEntity.f8945a, recentStopBasedTripEntity.b, f(recentStopBasedTripEntity.c), f(recentStopBasedTripEntity.d), recentStopBasedTripEntity.e, recentStopBasedTripEntity.f, recentStopBasedTripEntity.g);
    }

    public static final RecentStopAppModel h(RecentStopEntity recentStopEntity) {
        Intrinsics.i(recentStopEntity, "<this>");
        return new RecentStopAppModel(recentStopEntity.f8946a, recentStopEntity.b, f(recentStopEntity.c), RecentCityItineraryEntitiesKt.a(recentStopEntity.d), recentStopEntity.e, recentStopEntity.f, recentStopEntity.g);
    }

    public static final RecentTripAppModel i(RecentTripEntity recentTripEntity) {
        Intrinsics.i(recentTripEntity, "<this>");
        String str = recentTripEntity.f8949a;
        String str2 = recentTripEntity.b;
        ChaloDescriptiveLocationEntityModel chaloDescriptiveLocationEntityModel = recentTripEntity.c;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(chaloDescriptiveLocationEntityModel.f8929a, chaloDescriptiveLocationEntityModel.b, chaloDescriptiveLocationEntityModel.c, chaloDescriptiveLocationEntityModel.d, chaloDescriptiveLocationEntityModel.e);
        ChaloDescriptiveLocationEntityModel chaloDescriptiveLocationEntityModel2 = recentTripEntity.d;
        return new RecentTripAppModel(str, str2, universalSearchDescriptiveLocationAppModel, new UniversalSearchDescriptiveLocationAppModel(chaloDescriptiveLocationEntityModel2.f8929a, chaloDescriptiveLocationEntityModel2.b, chaloDescriptiveLocationEntityModel2.c, chaloDescriptiveLocationEntityModel2.d, chaloDescriptiveLocationEntityModel2.e), recentTripEntity.e, recentTripEntity.f, recentTripEntity.g);
    }
}
