package defpackage;

import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import app.chalo.checkout.data.model.api.response.OrderStatus;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsTripApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PBAvailableSlotsTripApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.PBOriginDestinationApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.SlotSearchRequestApiModel$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsAppRequestModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSeatAssignmentType;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotArrivalStatus;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotStatusType;
import app.chalo.premiumbus.data.models.app.SlotSearchRequestAppModel$$serializer;
import app.chalo.premiumbus.data.models.productconfig.PBProductConfigResultApiResponseModel;
import app.chalo.premiumbus.data.models.productconfig.ProductConfigApiModel$$serializer;
import app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel;
import app.chalo.productbooking.common.data.models.api.response.PBBulkBookingAvailableSlotsTripApiResponseModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.lang.annotation.Annotation;
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
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15574a;

    public /* synthetic */ eo0(int i) {
        this.f15574a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15574a) {
            case 0:
                return OrderStatus._init_$_anonymous_();
            case 1:
                OriginDestinationAdditionalRouteInfoAppModel.Companion companion = OriginDestinationAdditionalRouteInfoAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel", Reflection.a(OriginDestinationAdditionalRouteInfoAppModel.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 2:
                OriginDestinationApiModel.Companion companion2 = OriginDestinationApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 3:
                OriginDestinationApiModel.Companion companion3 = OriginDestinationApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 4:
                OriginDestinationAppModel.Companion companion4 = OriginDestinationAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 5:
                OriginDestinationAppModel.Companion companion5 = OriginDestinationAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 6:
                OriginDestinationAppModel.Companion companion6 = OriginDestinationAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 7:
                OriginDestinationAppModel.Companion companion7 = OriginDestinationAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 8:
                OriginDestinationAppModel.Companion companion8 = OriginDestinationAppModel.INSTANCE;
                return OriginDestinationAdditionalRouteInfoAppModel.INSTANCE.serializer();
            case 9:
                return OverscrollConfiguration_androidKt.LocalOverscrollConfiguration$lambda$0();
            case 10:
                PBAvailableSlotsApiRequestModel.Companion companion9 = PBAvailableSlotsApiRequestModel.Companion;
                return new ArrayListSerializer(SlotSearchRequestApiModel$$serializer.f7065a);
            case 11:
                PBAvailableSlotsApiResponseModel.Companion companion10 = PBAvailableSlotsApiResponseModel.Companion;
                return new ArrayListSerializer(PBAvailableSlotsTripApiResponseModel$$serializer.f7027a);
            case 12:
                PBAvailableSlotsAppRequestModel.Companion companion11 = PBAvailableSlotsAppRequestModel.INSTANCE;
                return new ArrayListSerializer(SlotSearchRequestAppModel$$serializer.f7125a);
            case 13:
                PBAvailableSlotsInfoAppModel.Companion companion12 = PBAvailableSlotsInfoAppModel.INSTANCE;
                return new ArrayListSerializer(PBAvailableSlotsTripAppModel$$serializer.f7090a);
            case 14:
                PBAvailableSlotsTripApiResponseModel.Companion companion13 = PBAvailableSlotsTripApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 15:
                PBAvailableSlotsTripApiResponseModel.Companion companion14 = PBAvailableSlotsTripApiResponseModel.Companion;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 16:
                PBAvailableSlotsTripAppModel.Companion companion15 = PBAvailableSlotsTripAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 17:
                PBAvailableSlotsTripAppModel.Companion companion16 = PBAvailableSlotsTripAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PremiumBusSlotStatusType", PremiumBusSlotStatusType.values());
            case 18:
                PBAvailableSlotsTripAppModel.Companion companion17 = PBAvailableSlotsTripAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PremiumBusSlotArrivalStatus", PremiumBusSlotArrivalStatus.values());
            case 19:
                PBAvailableSlotsTripAppModel.Companion companion18 = PBAvailableSlotsTripAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PremiumBusSeatAssignmentType", PremiumBusSeatAssignmentType.values());
            case 20:
                PBAvailableSlotsTripAppModel.Companion companion19 = PBAvailableSlotsTripAppModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleAppModel$$serializer.f7071a);
            case 21:
                PBBulkBookingAvailableSlotsTripApiResponseModel.Companion companion20 = PBBulkBookingAvailableSlotsTripApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 22:
                PBBulkBookingAvailableSlotsTripAppResponseModel.Companion companion21 = PBBulkBookingAvailableSlotsTripAppResponseModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PremiumBusSeatAssignmentType", PremiumBusSeatAssignmentType.values());
            case 23:
                PBBulkBookingAvailableSlotsTripAppResponseModel.Companion companion22 = PBBulkBookingAvailableSlotsTripAppResponseModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 24:
                PBOriginDestinationApiResponseModel.Companion companion23 = PBOriginDestinationApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 25:
                PBOriginDestinationAppModel.Companion companion24 = PBOriginDestinationAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 26:
                PBOriginDestinationAppModel.Companion companion25 = PBOriginDestinationAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PBModeToReachStopType", PBModeToReachStopType.values());
            case 27:
                PBOriginDestinationAppModel.Companion companion26 = PBOriginDestinationAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PBModeToReachStopType", PBModeToReachStopType.values());
            case 28:
                PBProductConfigAppModel.Companion companion27 = PBProductConfigAppModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            default:
                PBProductConfigResultApiResponseModel.Companion companion28 = PBProductConfigResultApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigApiModel$$serializer.f7151a);
        }
    }
}
