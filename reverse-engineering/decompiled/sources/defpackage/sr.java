package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt;
import app.chalo.config.ChaloPhoneNumberCountry;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.home.data.model.api.response.CorridorResponseApiModel;
import app.chalo.home.data.model.api.response.CorridorRouteResponseApiModel$$serializer;
import app.chalo.home.data.model.app.response.CorridorAppModel;
import app.chalo.home.data.model.app.response.CorridorRouteInfoAppModel$$serializer;
import app.chalo.livetracking.frameworklivetracking.data.model.api.response.ConnectionDataApiModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.ConnectionDataAppModel;
import app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingPassengerDetails$$serializer;
import app.chalo.metro.ui.confirmbooking.ConfirmationBookingScreenData;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.plotline.data.model.ActionType;
import app.chalo.plotline.data.model.CustomActionValue;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection$$serializer;
import app.chalo.productpurchase.passpurchase.data.models.api.request.CreateSuperPassOrderRequestApiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.routeselection.ui.compose.ComposableSingletons$RouteSelectionBottomSheetKt;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import app.chalo.validationsdk.blevalidation.data.models.api.DataOverBleApiModel;
import app.chalo.validationsdk.blevalidation.data.models.api.PremiumBusPunchDataOverBleApiModel;
import app.chalo.validationsdk.blevalidation.data.models.api.PremiumBusPunchDataOverBleApiModel$$serializer;
import app.chalo.validationsdk.blevalidation.data.models.api.TITOTapDataOverBleApiModel;
import app.chalo.validationsdk.blevalidation.data.models.api.TITOTapDataOverBleApiModel$$serializer;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import io.github.alexzhirkevich.compottie.internal.helpers.CompoundTrimPathKt;
import io.github.alexzhirkevich.compottie.internal.platform.PlatformPath_androidKt;
import io.ktor.http.Cookie;
import io.ktor.http.CookieEncoding;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19596a;

    public /* synthetic */ sr(int i) {
        this.f19596a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19596a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                ComposableLambda composableLambda = ComposableSingletons$RouteSelectionBottomSheetKt.f9206a;
                return unit;
            case 1:
                ComposableLambda composableLambda2 = ComposableSingletons$TooltipPopupComposableKt.f1839a;
                return unit;
            case 2:
                ComposableLambda composableLambda3 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                return Float.valueOf(0.0f);
            case 3:
                return CompositionErrorContextKt.LocalCompositionErrorContext$lambda$0();
            case 4:
                Lazy lazy = CompoundTrimPathKt.f16224a;
                return PlatformPath_androidKt.a();
            case 5:
                return ComputedProvidableCompositionLocal._init_$lambda$0();
            case 6:
                ConfirmationBookingScreenData.Companion companion = ConfirmationBookingScreenData.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 7:
                ConfirmationBookingScreenData.Companion companion2 = ConfirmationBookingScreenData.INSTANCE;
                return EnumsKt.b("app.chalo.models.productbooking.ChaloTicketBookingMode", ChaloTicketBookingMode.values());
            case 8:
                ConfirmationBookingScreenData.Companion companion3 = ConfirmationBookingScreenData.INSTANCE;
                return new ArrayListSerializer(ConfirmBookingPassengerDetails$$serializer.f5462a);
            case 9:
                ConfirmationBookingScreenData.Companion companion4 = ConfirmationBookingScreenData.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                ConnectionDataApiModel.Companion companion5 = ConnectionDataApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 11:
                ConnectionDataAppModel.Companion companion6 = ConnectionDataAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 12:
                return Unit.f17538a;
            case 13:
                Cookie.Companion companion7 = Cookie.INSTANCE;
                return EnumsKt.b("io.ktor.http.CookieEncoding", CookieEncoding.values());
            case 14:
                Cookie.Companion companion8 = Cookie.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.c(stringSerializer));
            case 15:
                CorridorAppModel.Companion companion9 = CorridorAppModel.INSTANCE;
                return new ArrayListSerializer(CorridorRouteInfoAppModel$$serializer.f2962a);
            case 16:
                CorridorResponseApiModel.Companion companion10 = CorridorResponseApiModel.INSTANCE;
                return new ArrayListSerializer(CorridorRouteResponseApiModel$$serializer.f2929a);
            case 17:
                CountryPhoneNumberConfig.Companion companion11 = CountryPhoneNumberConfig.INSTANCE;
                return EnumsKt.b("app.chalo.config.ChaloPhoneNumberCountry", ChaloPhoneNumberCountry.values());
            case 18:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            case 19:
                return CrashlyticsWorkers.Companion.checkNotMainThread$lambda$0();
            case 20:
                return CrashlyticsWorkers.Companion.checkBlockingThread$lambda$1();
            case 21:
                CreateOrderResponseAppModel.Companion companion12 = CreateOrderResponseAppModel.INSTANCE;
                return OrderPaymentProviderInfoAppModel.INSTANCE.serializer();
            case 22:
                CreateSuperPassOrderRequestApiModel.Companion companion13 = CreateSuperPassOrderRequestApiModel.INSTANCE;
                StringSerializer stringSerializer2 = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer2, stringSerializer2);
            case 23:
                CreateSuperPassOrderRequestApiModel.Companion companion14 = CreateSuperPassOrderRequestApiModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 24:
                CustomActionValue.Companion companion15 = CustomActionValue.INSTANCE;
                return EnumsKt.b("app.chalo.plotline.data.model.ActionType", ActionType.values());
            case 25:
                DataOverBleApiModel.Companion companion16 = DataOverBleApiModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.validationsdk.blevalidation.data.models.api.DataOverBleApiModel", Reflection.a(DataOverBleApiModel.class), new KClass[]{Reflection.a(PremiumBusPunchDataOverBleApiModel.class), Reflection.a(TITOTapDataOverBleApiModel.class)}, new KSerializer[]{PremiumBusPunchDataOverBleApiModel$$serializer.f10487a, TITOTapDataOverBleApiModel$$serializer.f10492a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 26:
                DateAndSlotSelectedForBulkBooking.Companion companion17 = DateAndSlotSelectedForBulkBooking.INSTANCE;
                return EnumsKt.b("app.chalo.uistate.dialog.DateAvailabilityStatus", DateAvailabilityStatus.values());
            case 27:
                DateAndSlotSelectedForBulkBooking.Companion companion18 = DateAndSlotSelectedForBulkBooking.INSTANCE;
                return new ArrayListSerializer(SlotsAvailableForSelection$$serializer.f7903a);
            case 28:
                DateBasedDateTimeUnitSerializer dateBasedDateTimeUnitSerializer = DateBasedDateTimeUnitSerializer.f18048a;
                return new SealedClassSerializer("kotlinx.datetime.DateTimeUnit.DateBased", Reflection.a(DateTimeUnit.DateBased.class), new KClass[]{Reflection.a(DateTimeUnit.DayBased.class), Reflection.a(DateTimeUnit.MonthBased.class)}, new KSerializer[]{DayBasedDateTimeUnitSerializer.f18056a, MonthBasedDateTimeUnitSerializer.f18072a});
            default:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$5$lambda$4();
        }
    }
}
