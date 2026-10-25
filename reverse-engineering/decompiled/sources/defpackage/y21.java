package defpackage;

import androidx.compose.material.ripple.DebugRippleTheme;
import androidx.compose.material3.RippleKt;
import app.chalo.citydata.data.model.api.response.RouteDetailOldApiModel;
import app.chalo.citydata.data.model.api.response.RouteDetailsResponseOldApiModel;
import app.chalo.citydata.data.model.api.response.RouteTimeTableOldApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.ShortTripOldApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.StopApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.TrafficSignalApiModel$$serializer;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel$$serializer;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.data.model.app.TrafficSignalAppModel$$serializer;
import app.chalo.citydata.repository.local.room.RouteEntityColumnAdapters;
import app.chalo.citydata.repository.local.room.RouteEntityColumnAdapters$detailedDataAdapter$2$1;
import app.chalo.citydata.repository.local.room.RouteEntityColumnAdapters$routeLiveDataAdapter$2$1;
import app.chalo.citydata.repository.local.room.entity.RoutEntityTimingModel$$serializer;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityShortTripTimingModel;
import app.chalo.citydata.repository.local.room.entity.RouteEntityShortTripTimingModel$$serializer;
import app.chalo.citydata.repository.local.room.entity.RouteEntityTripTimingTableModel;
import app.chalo.citydata.repository.local.room.entity.RouteStopEntityModel$$serializer;
import app.chalo.citydata.repository.local.room.entity.TrafficSignalEntityModel$$serializer;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopMarkerInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsCustomStopTagInfo;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsUIStateFactory$animationEventHandler$2$1;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs$Auto$$serializer;
import app.chalo.scenes.args.RideUserFeedbackScreenArgs$Default$$serializer;
import app.chalo.superpass.data.models.entities.RideRollOverBannerCtaActionType;
import app.chalo.superpass.data.models.entities.RideRollOverMeta;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y21 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20070a;

    public /* synthetic */ y21(int i) {
        this.f20070a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20070a) {
            case 0:
                return RideRollOverBannerCtaActionType._init_$_anonymous_();
            case 1:
                RideRollOverMeta.Companion companion = RideRollOverMeta.INSTANCE;
                return BannerStatus.INSTANCE.serializer();
            case 2:
                RideUserFeedbackScreenArgs.Companion companion2 = RideUserFeedbackScreenArgs.Companion;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.RideUserFeedbackScreenArgs", Reflection.a(RideUserFeedbackScreenArgs.class), new KClass[]{Reflection.a(RideUserFeedbackScreenArgs.Auto.class), Reflection.a(RideUserFeedbackScreenArgs.Default.class)}, new KSerializer[]{RideUserFeedbackScreenArgs$Auto$$serializer.f9301a, RideUserFeedbackScreenArgs$Default$$serializer.f9302a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 3:
                return RippleKt.LocalRippleConfiguration$lambda$0();
            case 4:
                return DebugRippleTheme.INSTANCE;
            case 5:
                RouteAppModel.Companion companion3 = RouteAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 6:
                RouteAppModel.Companion companion4 = RouteAppModel.INSTANCE;
                return new ArrayListSerializer(StopAppModel$$serializer.f1728a);
            case 7:
                RouteAppModel.Companion companion5 = RouteAppModel.INSTANCE;
                return new ArrayListSerializer(RouteSpecialFeatureAppModel$$serializer.f1716a);
            case 8:
                RouteAppModel.Companion companion6 = RouteAppModel.INSTANCE;
                return LiveSeatAvailabilityApplicable.INSTANCE.serializer();
            case 9:
                RouteAppModel.Companion companion7 = RouteAppModel.INSTANCE;
                return new ArrayListSerializer(TrafficSignalAppModel$$serializer.f1730a);
            case 10:
                RouteAppModel.Companion companion8 = RouteAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 11:
                RouteDetailOldApiModel.Companion companion9 = RouteDetailOldApiModel.Companion;
                return new ArrayListSerializer(RouteLegacySpecialFeature.INSTANCE.serializer());
            case 12:
                RouteDetailOldApiModel.Companion companion10 = RouteDetailOldApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 13:
                RouteDetailOldApiModel.Companion companion11 = RouteDetailOldApiModel.Companion;
                return new ArrayListSerializer(StopApiModel$$serializer.f1694a);
            case 14:
                RouteDetailOldApiModel.Companion companion12 = RouteDetailOldApiModel.Companion;
                return new ArrayListSerializer(TrafficSignalApiModel$$serializer.f1702a);
            case 15:
                RouteDetailsCustomStopMarkerInfo.Companion companion13 = RouteDetailsCustomStopMarkerInfo.Companion;
                return EnumsKt.b("app.chalo.livetracking.routedetails.data.model.ui.MarkerStopType", MarkerStopType.values());
            case 16:
                RouteDetailsCustomStopTagInfo.Companion companion14 = RouteDetailsCustomStopTagInfo.Companion;
                return EnumsKt.b("app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopHelpTag", RouteDetailsStopHelpTag.values());
            case 17:
                RouteDetailsResponseOldApiModel.Companion companion15 = RouteDetailsResponseOldApiModel.Companion;
                return new ArrayListSerializer(RouteTimeTableOldApiModel$$serializer.f1685a);
            case 18:
                RouteDetailsResponseOldApiModel.Companion companion16 = RouteDetailsResponseOldApiModel.Companion;
                return new ArrayListSerializer(ShortTripOldApiModel$$serializer.f1692a);
            case 19:
                return new RouteDetailsUIStateFactory$animationEventHandler$2$1();
            case 20:
                Lazy lazy = RouteEntityColumnAdapters.f1780a;
                return new RouteEntityColumnAdapters$routeLiveDataAdapter$2$1();
            case 21:
                Lazy lazy2 = RouteEntityColumnAdapters.f1780a;
                return new RouteEntityColumnAdapters$detailedDataAdapter$2$1();
            case 22:
                RouteEntityDetailedData.Companion companion17 = RouteEntityDetailedData.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 23:
                RouteEntityDetailedData.Companion companion18 = RouteEntityDetailedData.INSTANCE;
                return new ArrayListSerializer(RouteStopEntityModel$$serializer.f1795a);
            case 24:
                RouteEntityDetailedData.Companion companion19 = RouteEntityDetailedData.INSTANCE;
                return new ArrayListSerializer(TrafficSignalEntityModel$$serializer.f1797a);
            case 25:
                RouteEntityShortTripTimingModel.Companion companion20 = RouteEntityShortTripTimingModel.Companion;
                return new ArrayListSerializer(RoutEntityTimingModel$$serializer.f1782a);
            case 26:
                RouteEntityTripTimingTableModel.Companion companion21 = RouteEntityTripTimingTableModel.Companion;
                return EnumsKt.b("app.chalo.citydata.data.model.app.TimeTableStatus", TimeTableStatus.values());
            case 27:
                RouteEntityTripTimingTableModel.Companion companion22 = RouteEntityTripTimingTableModel.Companion;
                return new ArrayListSerializer(RouteEntityShortTripTimingModel$$serializer.f1789a);
            case 28:
                RouteEntityTripTimingTableModel.Companion companion23 = RouteEntityTripTimingTableModel.Companion;
                return new ArrayListSerializer(RoutEntityTimingModel$$serializer.f1782a);
            default:
                return RouteLegacySpecialFeature._init_$_anonymous_();
        }
    }
}
