package defpackage;

import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter;
import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter$journeyOverviewAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcMetroTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$fareBreakupAdapter$2$1;
import app.chalo.core.database.tableadapters.OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel;
import app.chalo.instantticket.data.model.api.response.FareBreakupApiModel$$serializer;
import app.chalo.models.CheckoutPaymentProvider;
import app.chalo.models.ondc.OndcTicketReceiptApiModel;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import app.chalo.models.ondc.OndcTicketReceiptPassengerDetailsApiResponseModel$$serializer;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer;
import app.chalo.ondc.model.api.MetroJourneyOverviewApiModel$$serializer;
import app.chalo.ondc.model.api.OndcMetroTicketApiModel;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.ondc.model.api.TicketValidationEntityApiModel$$serializer;
import app.chalo.ondc.model.api.response.OndcBookingResponseApiModel;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchApiModel;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchApiModel$$serializer;
import app.chalo.ondc.model.api.response.OndcMetroRouteSearchResponseApiModel;
import app.chalo.ondc.model.api.response.OndcRouteSearchResultApiModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.ondc.model.app.OndcTicketValidationReceiptData;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketPassengerDetailsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel$$serializer;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAdditionalRouteInfoAppModel;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20126a;

    public /* synthetic */ yn0(int i) {
        this.f20126a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20126a) {
            case 0:
                OndcBookingResponseApiModel.Companion companion = OndcBookingResponseApiModel.Companion;
                return new ArrayListSerializer(FareBreakupApiModel$$serializer.f3862a);
            case 1:
                OndcBookingResponseApiModel.Companion companion2 = OndcBookingResponseApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 2:
                OndcMetroRouteSearchApiModel.Companion companion3 = OndcMetroRouteSearchApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 3:
                OndcMetroRouteSearchAppModel.Companion companion4 = OndcMetroRouteSearchAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 4:
                OndcMetroRouteSearchAppModel.Companion companion5 = OndcMetroRouteSearchAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 5:
                OndcMetroRouteSearchAppModel.Companion companion6 = OndcMetroRouteSearchAppModel.INSTANCE;
                return ChaloTransitMode.INSTANCE.serializer();
            case 6:
                OndcMetroRouteSearchAppModel.Companion companion7 = OndcMetroRouteSearchAppModel.INSTANCE;
                return OriginDestinationAdditionalRouteInfoAppModel.INSTANCE.serializer();
            case 7:
                OndcMetroRouteSearchResponseApiModel.Companion companion8 = OndcMetroRouteSearchResponseApiModel.Companion;
                return new ArrayListSerializer(OndcMetroRouteSearchApiModel$$serializer.f6753a);
            case 8:
                OndcMetroTicketApiModel.Companion companion9 = OndcMetroTicketApiModel.INSTANCE;
                return new ArrayListSerializer(TicketValidationEntityApiModel$$serializer.f6733a);
            case 9:
                OndcMetroTicketApiModel.Companion companion10 = OndcMetroTicketApiModel.INSTANCE;
                return new ArrayListSerializer(GenericMobileTicketPassengerDetailsApiResponseModel$$serializer.f8123a);
            case 10:
                OndcMetroTicketApiModel.Companion companion11 = OndcMetroTicketApiModel.INSTANCE;
                return new ArrayListSerializer(MetroJourneyOverviewApiModel$$serializer.f6723a);
            case 11:
                Lazy lazy = OndcMetroTicketTableAdapter.f2119a;
                return new OndcMetroTicketTableAdapter$validationInfoEntityListAdapter$2$1();
            case 12:
                Lazy lazy2 = OndcMetroTicketTableAdapter.f2119a;
                return new OndcMetroTicketTableAdapter$journeyOverviewAdapter$2$1();
            case 13:
                OndcRouteSearchResultApiModel.Companion companion12 = OndcRouteSearchResultApiModel.Companion;
                return new ArrayListSerializer(OriginDestinationApiModel$$serializer.f8137a);
            case 14:
                OndcTicketConfiguration.Companion companion13 = OndcTicketConfiguration.INSTANCE;
                return EnumsKt.b("app.chalo.productbooking.common.data.models.app.ProductValidationType", ProductValidationType.values());
            case 15:
                OndcTicketReceiptApiModel.Companion companion14 = OndcTicketReceiptApiModel.INSTANCE;
                return new ArrayListSerializer(OndcTicketReceiptPassengerDetailsApiResponseModel$$serializer.f5634a);
            case 16:
                OndcTicketReceiptEntity.Companion companion15 = OndcTicketReceiptEntity.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 17:
                Lazy lazy3 = OndcTicketTableAdapter.f2120a;
                return new OndcTicketTableAdapter$fareBreakupAdapter$2$1();
            case 18:
                Lazy lazy4 = OndcTicketTableAdapter.f2120a;
                return new OndcTicketTableAdapter$validationInfoEntityListAdapter$2$1();
            case 19:
                OndcTicketValidationReceiptData.Companion companion16 = OndcTicketValidationReceiptData.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 20:
                OneTimeOfferConfigAppModel.Companion companion17 = OneTimeOfferConfigAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 21:
                OrderPaymentProviderInfoAppModel.Companion companion18 = OrderPaymentProviderInfoAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            case 22:
                OrderPaymentProviderInfoAppModel.Companion companion19 = OrderPaymentProviderInfoAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel", Reflection.a(OrderPaymentProviderInfoAppModel.class), new KClass[]{Reflection.a(OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.class), Reflection.a(OrderPaymentProviderInfoAppModel.NoPaymentRequired.class), Reflection.a(OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.class), Reflection.a(OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.class)}, new KSerializer[]{OrderPaymentProviderInfoAppModel$MerchantUPIConfigAppModel$$serializer.f5658a, new ObjectSerializer("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel.NoPaymentRequired", OrderPaymentProviderInfoAppModel.NoPaymentRequired.INSTANCE, new Annotation[0]), OrderPaymentProviderInfoAppModel$ProviderConfigAppModel$$serializer.f5659a, OrderPaymentProviderInfoAppModel$ProviderPaymentUrl$$serializer.f5660a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 23:
                OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.Companion companion20 = OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            case 24:
                OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.Companion companion21 = OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            case 25:
                return new ObjectSerializer("app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel.NoPaymentRequired", OrderPaymentProviderInfoAppModel.NoPaymentRequired.INSTANCE, new Annotation[0]);
            case 26:
                OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.Companion companion22 = OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            case 27:
                OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.Companion companion23 = OrderPaymentProviderInfoAppModel.ProviderConfigAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            case 28:
                OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.Companion companion24 = OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
            default:
                OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.Companion companion25 = OrderPaymentProviderInfoAppModel.ProviderPaymentUrl.INSTANCE;
                return EnumsKt.b("app.chalo.models.CheckoutPaymentProvider", CheckoutPaymentProvider.values());
        }
    }
}
