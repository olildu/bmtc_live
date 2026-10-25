package defpackage;

import androidx.window.embedding.SafeActivityEmbeddingComponentProvider;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestDataApiModel;
import app.chalo.citydata.data.model.api.response.RouteApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.RouteShortTripApiModel;
import app.chalo.citydata.data.model.api.response.RouteShortTripApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.RouteStaticDataApiModel;
import app.chalo.citydata.data.model.api.response.RouteTimeTableApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.RoutesDataResponseApiModel;
import app.chalo.citydata.data.model.api.response.StopApiModel$$serializer;
import app.chalo.citydata.data.model.api.response.TrafficSignalApiModel$$serializer;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.citydata.data.model.app.RouteTiming;
import app.chalo.citydata.data.model.app.RouteTiming$FixedTiming$$serializer;
import app.chalo.citydata.data.model.app.RouteTiming$FrequencyTiming$$serializer;
import app.chalo.citydata.data.model.app.RouteTripTimingAppModel;
import app.chalo.citydata.data.model.app.ShortTripTimingAppModel$$serializer;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.citydata.repository.local.room.entity.RouteStopEntityModel;
import app.chalo.home.data.model.api.response.RoutesResponseApiModel;
import app.chalo.home.data.model.api.response.ScheduleBlockResponseApiModel$$serializer;
import app.chalo.home.data.model.app.response.RoutesResponseAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockAppModel$$serializer;
import app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel;
import app.chalo.livetracking.universalsearch.data.model.api.StopsInfoApiModel$$serializer;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15428a;

    public /* synthetic */ d41(int i) {
        this.f15428a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15428a) {
            case 0:
                RouteShortTripApiModel.Companion companion = RouteShortTripApiModel.Companion;
                return new ArrayListSerializer(RouteTimeTableApiModel$$serializer.f1683a);
            case 1:
                RouteSpecialFeatureAppModel.Companion companion2 = RouteSpecialFeatureAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.RouteSpecialFeatureType", RouteSpecialFeatureType.values());
            case 2:
                RouteStaticDataApiModel.Companion companion3 = RouteStaticDataApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 3:
                RouteStaticDataApiModel.Companion companion4 = RouteStaticDataApiModel.INSTANCE;
                return new ArrayListSerializer(StopApiModel$$serializer.f1694a);
            case 4:
                RouteStaticDataApiModel.Companion companion5 = RouteStaticDataApiModel.INSTANCE;
                return new ArrayListSerializer(TrafficSignalApiModel$$serializer.f1702a);
            case 5:
                RouteStaticDataApiModel.Companion companion6 = RouteStaticDataApiModel.INSTANCE;
                return new ArrayListSerializer(RouteTimeTableApiModel$$serializer.f1683a);
            case 6:
                RouteStaticDataApiModel.Companion companion7 = RouteStaticDataApiModel.INSTANCE;
                return new ArrayListSerializer(RouteShortTripApiModel$$serializer.f1679a);
            case 7:
                RouteStopEntityModel.Companion companion8 = RouteStopEntityModel.Companion;
                return ChaloTransitMode.INSTANCE.serializer();
            case 8:
                RouteStopsInfo.Companion companion9 = RouteStopsInfo.INSTANCE;
                return new ArrayListSerializer(RouteLegacySpecialFeature.INSTANCE.serializer());
            case 9:
                RouteStopsInfo.Companion companion10 = RouteStopsInfo.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 10:
                RouteTiming.Companion companion11 = RouteTiming.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.citydata.data.model.app.RouteTiming", Reflection.a(RouteTiming.class), new KClass[]{Reflection.a(RouteTiming.FixedTiming.class), Reflection.a(RouteTiming.FrequencyTiming.class)}, new KSerializer[]{RouteTiming$FixedTiming$$serializer.f1720a, RouteTiming$FrequencyTiming$$serializer.f1721a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 11:
                RouteTripTimingAppModel.Companion companion12 = RouteTripTimingAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.TimeTableStatus", TimeTableStatus.values());
            case 12:
                RouteTripTimingAppModel.Companion companion13 = RouteTripTimingAppModel.INSTANCE;
                return new ArrayListSerializer(ShortTripTimingAppModel$$serializer.f1725a);
            case 13:
                RouteTripTimingAppModel.Companion companion14 = RouteTripTimingAppModel.INSTANCE;
                return new ArrayListSerializer(RouteTiming.INSTANCE.serializer());
            case 14:
                RoutesDataRequestDataApiModel.Companion companion15 = RoutesDataRequestDataApiModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 15:
                RoutesDataResponseApiModel.Companion companion16 = RoutesDataResponseApiModel.Companion;
                return new ArrayListSerializer(RouteApiModel$$serializer.f1669a);
            case 16:
                RoutesDetailApiModel.Companion companion17 = RoutesDetailApiModel.INSTANCE;
                return new ArrayListSerializer(RouteLegacySpecialFeature.INSTANCE.serializer());
            case 17:
                RoutesDetailApiModel.Companion companion18 = RoutesDetailApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 18:
                RoutesDetailApiModel.Companion companion19 = RoutesDetailApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                RoutesDetailApiModel.Companion companion20 = RoutesDetailApiModel.INSTANCE;
                return new ArrayListSerializer(StopsInfoApiModel$$serializer.f4990a);
            case 20:
                RoutesResponseApiModel.Companion companion21 = RoutesResponseApiModel.INSTANCE;
                return new ArrayListSerializer(ScheduleBlockResponseApiModel$$serializer.f2943a);
            case 21:
                RoutesResponseAppModel.Companion companion22 = RoutesResponseAppModel.INSTANCE;
                return new ArrayListSerializer(ScheduleBlockAppModel$$serializer.f2974a);
            case 22:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel2Valid$lambda$24());
            case 23:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityStackAttributesValid$lambda$60());
            case 24:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassSplitPairRuleBuilderLevel1Valid$lambda$10());
            case 25:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetSplitInfoTokenValid$lambda$34());
            case 26:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassEmbeddingRuleValid$lambda$20());
            case 27:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodSplitInfoGetTokenValid$lambda$28());
            case 28:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isClassActivityRuleValid$lambda$6());
            default:
                return Boolean.valueOf(SafeActivityEmbeddingComponentProvider.isMethodGetFinishPrimaryWithPlaceholderValid$lambda$17());
        }
    }
}
