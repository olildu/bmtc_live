package defpackage;

import androidx.compose.material3.TypographyKt;
import app.chalo.ble_communication.model.BLEOperationsToLogConfig$$serializer;
import app.chalo.ble_communication.model.TwoWayBleCommLoggingConfigForCity;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.data.model.api.BottomTabApiModel$$serializer;
import app.chalo.home.data.model.api.ProfilePageItemApiModel$$serializer;
import app.chalo.home.data.model.api.UiConfigApiModel;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerItineraryApiResponseModel$$serializer;
import app.chalo.livetracking.tripplanner.data.models.api.TripPlannerResultPayloadApiResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.models.validation.TwoWayBLECommPilotConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductFareMappingApiResponseModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.scenes.args.TripSummaryArgs$PassSummaryScreen$$serializer;
import app.chalo.scenes.args.TripSummaryArgs$RideReceiptScreen$$serializer;
import app.chalo.scenes.args.TripSummaryArgs$TicketSummaryScreen$$serializer;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.tripreceipt.data.TripReceiptDataAppModel;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult$CityNotServiceable$$serializer;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult$CitySelected$$serializer;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOption$PLACES$$serializer;
import app.chalo.universalsearch.data.UniversalSearchOption$ROUTES$$serializer;
import app.chalo.universalsearch.data.UniversalSearchOption$STOPS$$serializer;
import app.chalo.universalsearch.data.UniversalSearchOption$TRIPS$$serializer;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.userprofile.Gender;
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
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ll1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18325a;

    public /* synthetic */ ll1(int i) {
        this.f18325a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18325a) {
            case 0:
                TripPlannerResultPayloadApiResponseModel.Companion companion = TripPlannerResultPayloadApiResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerItineraryApiResponseModel$$serializer.f4635a);
            case 1:
                TripPlannerResultPayloadApiResponseModel.Companion companion2 = TripPlannerResultPayloadApiResponseModel.INSTANCE;
                return new ArrayListSerializer(TripPlannerItineraryApiResponseModel$$serializer.f4635a);
            case 2:
                TripPlannerTabType.Companion companion3 = TripPlannerTabType.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 3:
                TripPlannerTabType.Companion companion4 = TripPlannerTabType.INSTANCE;
                return EnumsKt.b("app.chalo.citydata.data.model.app.RouteServiceType", RouteServiceType.values());
            case 4:
                TripReceiptDataAppModel.Companion companion5 = TripReceiptDataAppModel.Companion;
                return ValidationProduct.INSTANCE.serializer();
            case 5:
                TripReceiptDataAppModel.Companion companion6 = TripReceiptDataAppModel.Companion;
                return Gender.INSTANCE.serializer();
            case 6:
                TripReceiptDataAppModel.Companion companion7 = TripReceiptDataAppModel.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 7:
                TripReceiptDataAppModel.Companion companion8 = TripReceiptDataAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 8:
                TripSummaryArgs.Companion companion9 = TripSummaryArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.TripSummaryArgs", Reflection.a(TripSummaryArgs.class), new KClass[]{Reflection.a(TripSummaryArgs.PassSummaryScreen.class), Reflection.a(TripSummaryArgs.RideReceiptScreen.class), Reflection.a(TripSummaryArgs.TicketSummaryScreen.class)}, new KSerializer[]{TripSummaryArgs$PassSummaryScreen$$serializer.f9334a, TripSummaryArgs$RideReceiptScreen$$serializer.f9335a, TripSummaryArgs$TicketSummaryScreen$$serializer.f9336a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 9:
                TripSummaryArgs.PassSummaryScreen.Companion companion10 = TripSummaryArgs.PassSummaryScreen.INSTANCE;
                return BookingsRequestType.INSTANCE.serializer();
            case 10:
                TripSummaryArgs.PassSummaryScreen.Companion companion11 = TripSummaryArgs.PassSummaryScreen.INSTANCE;
                return Source.INSTANCE.serializer();
            case 11:
                TripSummaryArgs.RideReceiptScreen.Companion companion12 = TripSummaryArgs.RideReceiptScreen.INSTANCE;
                return Source.INSTANCE.serializer();
            case 12:
                TripSummaryArgs.TicketSummaryScreen.Companion companion13 = TripSummaryArgs.TicketSummaryScreen.INSTANCE;
                return BookingsRequestType.INSTANCE.serializer();
            case 13:
                TripSummaryArgs.TicketSummaryScreen.Companion companion14 = TripSummaryArgs.TicketSummaryScreen.INSTANCE;
                return Source.INSTANCE.serializer();
            case 14:
                TwoWayBLECommPilotConfig.Companion companion15 = TwoWayBLECommPilotConfig.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 15:
                TwoWayBleCommLoggingConfigForCity.Companion companion16 = TwoWayBleCommLoggingConfigForCity.INSTANCE;
                return new ArrayListSerializer(BLEOperationsToLogConfig$$serializer.f1131a);
            case 16:
                return TypographyKt.LocalTypography$lambda$0();
            case 17:
                UiConfigApiModel.Companion companion17 = UiConfigApiModel.INSTANCE;
                return new ArrayListSerializer(BottomTabApiModel$$serializer.f2879a);
            case 18:
                UiConfigApiModel.Companion companion18 = UiConfigApiModel.INSTANCE;
                return new ArrayListSerializer(ProfilePageItemApiModel$$serializer.f2899a);
            case 19:
                UniversalPickerArgs.Companion companion19 = UniversalPickerArgs.Companion;
                return Source.INSTANCE.serializer();
            case 20:
                UniversalPickerArgs.Companion companion20 = UniversalPickerArgs.Companion;
                return ChaloTransitMode.INSTANCE.serializer();
            case 21:
                UniversalPickerArgs.Companion companion21 = UniversalPickerArgs.Companion;
                return UniversalPickerHeaderIcon.INSTANCE.serializer();
            case 22:
                return UniversalPickerHeaderIcon._init_$_anonymous_();
            case 23:
                UniversalSearchCitySelectionResult.Companion companion22 = UniversalSearchCitySelectionResult.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.universalsearch.data.UniversalSearchCitySelectionResult", Reflection.a(UniversalSearchCitySelectionResult.class), new KClass[]{Reflection.a(UniversalSearchCitySelectionResult.CityNotServiceable.class), Reflection.a(UniversalSearchCitySelectionResult.CitySelected.class)}, new KSerializer[]{UniversalSearchCitySelectionResult$CityNotServiceable$$serializer.f10133a, UniversalSearchCitySelectionResult$CitySelected$$serializer.f10134a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 24:
                return UniversalSearchFlowSource._init_$_anonymous_();
            case 25:
                UniversalSearchOption.Companion companion23 = UniversalSearchOption.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.universalsearch.data.UniversalSearchOption", Reflection.a(UniversalSearchOption.class), new KClass[]{Reflection.a(UniversalSearchOption.ALL.class), Reflection.a(UniversalSearchOption.PLACES.class), Reflection.a(UniversalSearchOption.ROUTES.class), Reflection.a(UniversalSearchOption.STOPS.class), Reflection.a(UniversalSearchOption.TRIPS.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.universalsearch.data.UniversalSearchOption.ALL", UniversalSearchOption.ALL.INSTANCE, new Annotation[0]), UniversalSearchOption$PLACES$$serializer.f10137a, UniversalSearchOption$ROUTES$$serializer.f10138a, UniversalSearchOption$STOPS$$serializer.f10139a, UniversalSearchOption$TRIPS$$serializer.f10140a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 26:
                return new ObjectSerializer("app.chalo.universalsearch.data.UniversalSearchOption.ALL", UniversalSearchOption.ALL.INSTANCE, new Annotation[0]);
            case 27:
                UniversalSearchOptions.Companion companion24 = UniversalSearchOptions.INSTANCE;
                return new LinkedHashSetSerializer(UniversalSearchOption.INSTANCE.serializer());
            case 28:
                UnknownProductCategoryApiResponseModel.Companion companion25 = UnknownProductCategoryApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            default:
                UnknownProductFareMappingApiResponseModel.Companion companion26 = UnknownProductFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
        }
    }
}
