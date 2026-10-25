package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import app.chalo.core.database.tableadapters.RecentLocationPairEndpointAdapter;
import app.chalo.core.database.tableadapters.RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionAppModel;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData$CardRecharge$$serializer;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData$ImageResource$$serializer;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData$Metro$$serializer;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData$Passes$$serializer;
import app.chalo.homescreen.data.model.app.QuickPaymentsSectionData$PayForTicket$$serializer;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import app.chalo.models.RealTimeRouteInfo;
import app.chalo.models.RealTimeRouteInfo$GeoRealTimeInfo$$serializer;
import app.chalo.models.validation.QrFirstBleEntryPolicy;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.quickpay.validation.QuickPayReceiptInfo;
import app.chalo.receipt.ReceiptFareBreakupApiResponseModel$$serializer;
import app.chalo.receipt.ReceiptFareBreakupAppModel$$serializer;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.recent.database.RecentCityItineraryColumnAdapters;
import app.chalo.recent.database.RecentCityItineraryColumnAdapters$additionalRouteInfoAdapter$2$1;
import app.chalo.recent.database.RecentCityItineraryColumnAdapters$descriptiveLocationEntityColumnAdapter$2$1;
import app.chalo.recent.database.RecentCityItineraryColumnAdapters$recentStopInfoEntityColumnAdapter$2$1;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity$PlaceEndpoint$$serializer;
import app.chalo.recent.database.entities.RecentLocationPairEndpointEntity$StopEndpoint$$serializer;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel$Place$$serializer;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel$Stop$$serializer;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$3$$inlined$sortedByDescending$1;
import coil3.RealImageLoaderKt$addServiceLoaderComponents$lambda$6$$inlined$sortedByDescending$1;
import coil3.util.DecoderServiceLoaderTarget;
import coil3.util.FetcherServiceLoaderTarget;
import coil3.util.ServiceLoaderComponentRegistry;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hz0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15870a;

    public /* synthetic */ hz0(int i) {
        this.f15870a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f15870a) {
            case 0:
                return PullToRefreshKt.rememberPullToRefreshState$lambda$3$lambda$2();
            case 1:
                QrFirstBleEntryPolicy.Companion companion = QrFirstBleEntryPolicy.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 2:
                QuickPayReceipt.Companion companion2 = QuickPayReceipt.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 3:
                QuickPayReceipt.Companion companion3 = QuickPayReceipt.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 4:
                QuickPayReceiptInfo.Companion companion4 = QuickPayReceiptInfo.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 5:
                QuickPayReceiptResponseModel.Companion companion5 = QuickPayReceiptResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 6:
                QuickPaymentsSectionAppModel.Companion companion6 = QuickPaymentsSectionAppModel.INSTANCE;
                return new ArrayListSerializer(QuickPaymentsSectionData.Companion.serializer());
            case 7:
                QuickPaymentsSectionData.Companion companion7 = QuickPaymentsSectionData.Companion;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.homescreen.data.model.app.QuickPaymentsSectionData", Reflection.a(QuickPaymentsSectionData.class), new KClass[]{Reflection.a(QuickPaymentsSectionData.CardRecharge.class), Reflection.a(QuickPaymentsSectionData.ImageResource.class), Reflection.a(QuickPaymentsSectionData.Metro.class), Reflection.a(QuickPaymentsSectionData.Passes.class), Reflection.a(QuickPaymentsSectionData.PayForTicket.class)}, new KSerializer[]{QuickPaymentsSectionData$CardRecharge$$serializer.f3788a, QuickPaymentsSectionData$ImageResource$$serializer.f3789a, QuickPaymentsSectionData$Metro$$serializer.f3790a, QuickPaymentsSectionData$Passes$$serializer.f3791a, QuickPaymentsSectionData$PayForTicket$$serializer.f3792a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 8:
                QuickPaymentsSectionData.ImageResource.Companion companion8 = QuickPaymentsSectionData.ImageResource.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageFeature", RegularBusPageFeature.values());
            case 9:
                QuickPaymentsSectionData.Passes.Companion companion9 = QuickPaymentsSectionData.Passes.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.RegularBusPageFeature", RegularBusPageFeature.values());
            case 10:
                List listV0 = CollectionsKt.v0(new RealImageLoaderKt$addServiceLoaderComponents$lambda$3$$inlined$sortedByDescending$1(), (List) ServiceLoaderComponentRegistry.f11620a.getValue());
                ArrayList arrayList = new ArrayList();
                int size = listV0.size();
                while (i < size) {
                    FetcherServiceLoaderTarget fetcherServiceLoaderTarget = (FetcherServiceLoaderTarget) listV0.get(i);
                    Intrinsics.g(fetcherServiceLoaderTarget, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    arrayList.add(new Pair(fetcherServiceLoaderTarget.a(), fetcherServiceLoaderTarget.type()));
                    i++;
                }
                return arrayList;
            case 11:
                List listV1 = CollectionsKt.v0(new RealImageLoaderKt$addServiceLoaderComponents$lambda$6$$inlined$sortedByDescending$1(), (List) ServiceLoaderComponentRegistry.b.getValue());
                ArrayList arrayList2 = new ArrayList();
                int size2 = listV1.size();
                while (i < size2) {
                    arrayList2.add(((DecoderServiceLoaderTarget) listV1.get(i)).factory());
                    i++;
                }
                return arrayList2;
            case 12:
                RealTimeRouteInfo.Companion companion10 = RealTimeRouteInfo.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.models.RealTimeRouteInfo", Reflection.a(RealTimeRouteInfo.class), new KClass[]{Reflection.a(RealTimeRouteInfo.GeoRealTimeInfo.class)}, new KSerializer[]{RealTimeRouteInfo$GeoRealTimeInfo$$serializer.f5595a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 13:
                ReceiptFareDataApiResponseModel.Companion companion11 = ReceiptFareDataApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ReceiptFareBreakupApiResponseModel$$serializer.f8918a);
            case 14:
                ReceiptFareDataAppModel.Companion companion12 = ReceiptFareDataAppModel.INSTANCE;
                return new ArrayListSerializer(ReceiptFareBreakupAppModel$$serializer.f8920a);
            case 15:
                return ReceiveContentConfigurationKt.ModifierLocalReceiveContent$lambda$0();
            case 16:
                return new ObjectSerializer("app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity.Bus", RecentAdditionalRouteInfoEntity.Bus.INSTANCE, new Annotation[0]);
            case 17:
                RecentAdditionalRouteInfoEntity.Metro.Companion companion13 = RecentAdditionalRouteInfoEntity.Metro.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 18:
                Lazy lazy = RecentCityItineraryColumnAdapters.f8928a;
                return new RecentCityItineraryColumnAdapters$recentStopInfoEntityColumnAdapter$2$1();
            case 19:
                Lazy lazy2 = RecentCityItineraryColumnAdapters.f8928a;
                return new RecentCityItineraryColumnAdapters$descriptiveLocationEntityColumnAdapter$2$1();
            case 20:
                Lazy lazy3 = RecentCityItineraryColumnAdapters.f8928a;
                return new RecentCityItineraryColumnAdapters$additionalRouteInfoAdapter$2$1();
            case 21:
                RecentLocationPairAppModel.Companion companion14 = RecentLocationPairAppModel.INSTANCE;
                return RecentLocationPairEndpointAppModel.INSTANCE.serializer();
            case 22:
                RecentLocationPairAppModel.Companion companion15 = RecentLocationPairAppModel.INSTANCE;
                return RecentLocationPairEndpointAppModel.INSTANCE.serializer();
            case 23:
                Lazy lazy4 = RecentLocationPairEndpointAdapter.f2122a;
                return new RecentLocationPairEndpointAdapter$endPointColumnAdapter$2$1();
            case 24:
                RecentLocationPairEndpointAppModel.Companion companion16 = RecentLocationPairEndpointAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.recent.model.app.RecentLocationPairEndpointAppModel", Reflection.a(RecentLocationPairEndpointAppModel.class), new KClass[]{Reflection.a(RecentLocationPairEndpointAppModel.NearbyStopToPlace.class), Reflection.a(RecentLocationPairEndpointAppModel.Place.class), Reflection.a(RecentLocationPairEndpointAppModel.Stop.class)}, new KSerializer[]{RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer.f8999a, RecentLocationPairEndpointAppModel$Place$$serializer.f9000a, RecentLocationPairEndpointAppModel$Stop$$serializer.f9001a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 25:
                RecentLocationPairEndpointEntity.Companion companion17 = RecentLocationPairEndpointEntity.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.recent.database.entities.RecentLocationPairEndpointEntity", Reflection.a(RecentLocationPairEndpointEntity.class), new KClass[]{Reflection.a(RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint.class), Reflection.a(RecentLocationPairEndpointEntity.PlaceEndpoint.class), Reflection.a(RecentLocationPairEndpointEntity.StopEndpoint.class)}, new KSerializer[]{RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer.f8936a, RecentLocationPairEndpointEntity$PlaceEndpoint$$serializer.f8937a, RecentLocationPairEndpointEntity$StopEndpoint$$serializer.f8938a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 26:
                RecentPlaceAppModel.Companion companion18 = RecentPlaceAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.recent.model.app.RecentsSpecialStatus", RecentsSpecialStatus.values());
            case 27:
                RecentPlaceEntity.Companion companion19 = RecentPlaceEntity.INSTANCE;
                return EnumsKt.b("app.chalo.recent.database.entities.RecentsSpecialEntityStatus", RecentsSpecialEntityStatus.values());
            case 28:
                RecentStopAndRouteBasedTripEntity.Companion companion20 = RecentStopAndRouteBasedTripEntity.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            default:
                RecentStopInfoEntity.Companion companion21 = RecentStopInfoEntity.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
        }
    }
}
