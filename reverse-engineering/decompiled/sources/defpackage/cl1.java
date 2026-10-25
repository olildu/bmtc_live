package defpackage;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerIntermediateStopInfoApiResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerItineraryApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegApiResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegFareInfoApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegFareInfoApiResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerLegFareTupleApiResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerCityConfigModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerIntermediateStopInfoAppResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Auto$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Bus$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Metro$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Railway$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Taxi$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel$Walk$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegFareTupleAppResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerRequestAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabTypeConfigModel$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.scenes.args.TripPlannerArgs$DetailsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$ResultsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$StopFocusedResultsScreen$$serializer;
import app.chalo.scenes.args.TripPlannerArgs$StopFocusedSearchScreen$$serializer;
import app.chalo.stoptripdetails.data.model.api.TripApiModel;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cl1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11342a;

    public /* synthetic */ cl1(int i) {
        this.f11342a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11342a) {
            case 0:
                TripApiModel.Companion companion = TripApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 1:
                TripPlannerArgs.Companion companion2 = TripPlannerArgs.Companion;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.TripPlannerArgs", Reflection.a(TripPlannerArgs.class), new KClass[]{Reflection.a(TripPlannerArgs.DetailsScreen.class), Reflection.a(TripPlannerArgs.ResultsScreen.class), Reflection.a(TripPlannerArgs.StopFocusedResultsScreen.class), Reflection.a(TripPlannerArgs.StopFocusedSearchScreen.class)}, new KSerializer[]{TripPlannerArgs$DetailsScreen$$serializer.f9330a, TripPlannerArgs$ResultsScreen$$serializer.f9331a, TripPlannerArgs$StopFocusedResultsScreen$$serializer.f9332a, TripPlannerArgs$StopFocusedSearchScreen$$serializer.f9333a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 2:
                TripPlannerCityConfigModel.Companion companion3 = TripPlannerCityConfigModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerTabTypeConfigModel$$serializer.f4688a);
            case 3:
                TripPlannerConfigModel.Companion companion4 = TripPlannerConfigModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerCityConfigModel$$serializer.f4658a);
            case 4:
                TripPlannerItineraryApiResponseModel.Companion companion5 = TripPlannerItineraryApiResponseModel.Companion;
                return new ArrayListSerializer(TripPlannerLegApiResponseModel$$serializer.f4637a);
            case 5:
                TripPlannerItineraryApiResponseModel.Companion companion6 = TripPlannerItineraryApiResponseModel.Companion;
                return new ArrayListSerializer(TripPlannerLegFareInfoApiResponseModel$$serializer.f4639a);
            case 6:
                TripPlannerItineraryApiResponseModel.Companion companion7 = TripPlannerItineraryApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 7:
                TripPlannerItineraryAppResponseModel.Companion companion8 = TripPlannerItineraryAppResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerLegAppModel.INSTANCE.serializer());
            case 8:
                TripPlannerItineraryAppResponseModel.Companion companion9 = TripPlannerItineraryAppResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 9:
                TripPlannerLegApiResponseModel.Companion companion10 = TripPlannerLegApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                TripPlannerLegApiResponseModel.Companion companion11 = TripPlannerLegApiResponseModel.Companion;
                return new ArrayListSerializer(TripPlannerIntermediateStopInfoApiResponseModel$$serializer.f4633a);
            case 11:
                TripPlannerLegAppModel.Companion companion12 = TripPlannerLegAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel", Reflection.a(TripPlannerLegAppModel.class), new KClass[]{Reflection.a(TripPlannerLegAppModel.Auto.class), Reflection.a(TripPlannerLegAppModel.Bus.class), Reflection.a(TripPlannerLegAppModel.Ferry.class), Reflection.a(TripPlannerLegAppModel.Metro.class), Reflection.a(TripPlannerLegAppModel.MonoRail.class), Reflection.a(TripPlannerLegAppModel.Railway.class), Reflection.a(TripPlannerLegAppModel.Taxi.class), Reflection.a(TripPlannerLegAppModel.Walk.class)}, new KSerializer[]{TripPlannerLegAppModel$Auto$$serializer.f4666a, TripPlannerLegAppModel$Bus$$serializer.f4667a, new ObjectSerializer("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Ferry", TripPlannerLegAppModel.Ferry.INSTANCE, new Annotation[0]), TripPlannerLegAppModel$Metro$$serializer.f4668a, new ObjectSerializer("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.MonoRail", TripPlannerLegAppModel.MonoRail.INSTANCE, new Annotation[0]), TripPlannerLegAppModel$Railway$$serializer.f4669a, TripPlannerLegAppModel$Taxi$$serializer.f4670a, TripPlannerLegAppModel$Walk$$serializer.f4671a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 12:
                TripPlannerLegAppModel.Bus.Companion companion13 = TripPlannerLegAppModel.Bus.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.TimeTableStatus", TimeTableStatus.values());
            case 13:
                TripPlannerLegAppModel.Bus.Companion companion14 = TripPlannerLegAppModel.Bus.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 14:
                TripPlannerLegAppModel.Bus.Companion companion15 = TripPlannerLegAppModel.Bus.INSTANCE;
                return new ArrayListSerializer(TripPlannerIntermediateStopInfoAppResponseModel$$serializer.f4662a);
            case 15:
                TripPlannerLegAppModel.Bus.Companion companion16 = TripPlannerLegAppModel.Bus.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 16:
                TripPlannerLegAppModel.Bus.Companion companion17 = TripPlannerLegAppModel.Bus.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.RouteServiceType", RouteServiceType.values());
            case 17:
                return new ObjectSerializer("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Ferry", TripPlannerLegAppModel.Ferry.INSTANCE, new Annotation[0]);
            case 18:
                TripPlannerLegAppModel.Metro.Companion companion18 = TripPlannerLegAppModel.Metro.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.TimeTableStatus", TimeTableStatus.values());
            case 19:
                TripPlannerLegAppModel.Metro.Companion companion19 = TripPlannerLegAppModel.Metro.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                TripPlannerLegAppModel.Metro.Companion companion20 = TripPlannerLegAppModel.Metro.INSTANCE;
                return new ArrayListSerializer(TripPlannerIntermediateStopInfoAppResponseModel$$serializer.f4662a);
            case 21:
                TripPlannerLegAppModel.Metro.Companion companion21 = TripPlannerLegAppModel.Metro.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 22:
                TripPlannerLegAppModel.Metro.Companion companion22 = TripPlannerLegAppModel.Metro.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.RouteServiceType", RouteServiceType.values());
            case 23:
                return new ObjectSerializer("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.MonoRail", TripPlannerLegAppModel.MonoRail.INSTANCE, new Annotation[0]);
            case 24:
                TripPlannerLegFareInfoApiResponseModel.Companion companion23 = TripPlannerLegFareInfoApiResponseModel.Companion;
                return new ArrayListSerializer(TripPlannerLegFareTupleApiResponseModel$$serializer.f4641a);
            case 25:
                TripPlannerLegFareInfoApiResponseModel.Companion companion24 = TripPlannerLegFareInfoApiResponseModel.Companion;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 26:
                TripPlannerLegFareInfoAppResponseModel.Companion companion25 = TripPlannerLegFareInfoAppResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerLegFareTupleAppResponseModel$$serializer.f4675a);
            case 27:
                TripPlannerRequestAppModel.Companion companion26 = TripPlannerRequestAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 28:
                TripPlannerResultAppResponseModel.Companion companion27 = TripPlannerResultAppResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerItineraryAppResponseModel$$serializer.f4664a);
            default:
                TripPlannerResultAppResponseModel.Companion companion28 = TripPlannerResultAppResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerItineraryAppResponseModel$$serializer.f4664a);
        }
    }
}
