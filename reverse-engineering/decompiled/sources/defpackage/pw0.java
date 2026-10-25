package defpackage;

import app.chalo.checkout.data.model.app.ConfigWiseEventTokens$$serializer;
import app.chalo.checkout.data.model.app.ProductAdjustEventTokenRemoteConfig;
import app.chalo.checkout.data.model.app.ProductBasedAdjustEventTokenConfig;
import app.chalo.checkout.data.model.app.ProductBasedAdjustEventTokenConfig$$serializer;
import app.chalo.constants.Source;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1;
import app.chalo.data.ProductBookingBranding;
import app.chalo.data.ProductBookingBranding$AgencyBranding$$serializer;
import app.chalo.data.ProductBookingBranding$AgencyBrandingResource$$serializer;
import app.chalo.data.ProductBookingBranding$AgencyBrandingText$$serializer;
import app.chalo.data.ProductBookingBranding$AppResource$$serializer;
import app.chalo.data.ProductBookingBranding$Ondc$$serializer;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.premiumbus.ProductBookingNavigation$InstantTicket$FreshPurchase$$serializer;
import app.chalo.premiumbus.ProductBookingNavigation$ONDCTicket$$serializer;
import app.chalo.premiumbus.ProductBookingNavigation$StopBasedPassFreshPurchase$$serializer;
import app.chalo.premiumbus.data.models.api.request.PremiumProductRescheduleApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.PremiumReserveTicketReceiptApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.PremiumReserveTicketReceiptPassengerDetailsApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.premiumbus.data.models.entity.PremiumCategoryFareBreakup$$serializer;
import app.chalo.premiumbus.data.models.entity.PremiumPassengerCategoryDetailsInfo;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationReceiptData;
import app.chalo.productbooking.common.ProductBookingFlowType;
import app.chalo.productbooking.common.ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$FreshPurchase$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$PremiumBusProduct$StopDetails$$serializer;
import app.chalo.productbooking.common.ProductBookingFlowType$StopBasedPassFreshPurchase$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.ProductActivationArgs;
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
public final /* synthetic */ class pw0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19074a;

    public /* synthetic */ pw0(int i) {
        this.f19074a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19074a) {
            case 0:
                PremiumPassengerCategoryDetailsInfo.Companion companion = PremiumPassengerCategoryDetailsInfo.Companion;
                return new ArrayListSerializer(PremiumCategoryFareBreakup$$serializer.f7131a);
            case 1:
                PremiumProductRescheduleApiRequestModel.Companion companion2 = PremiumProductRescheduleApiRequestModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 2:
                PremiumReserveTicketReceiptApiResponseModel.Companion companion3 = PremiumReserveTicketReceiptApiResponseModel.Companion;
                return new ArrayListSerializer(PremiumReserveTicketReceiptPassengerDetailsApiResponseModel$$serializer.f7061a);
            case 3:
                Lazy lazy = PremiumReserveTicketTableAdapter.f2121a;
                return new PremiumReserveTicketTableAdapter$premiumStopDetailsColumnAdapter$2$1();
            case 4:
                Lazy lazy2 = PremiumReserveTicketTableAdapter.f2121a;
                return new PremiumReserveTicketTableAdapter$passengerCategoryListColumnAdapter$2$1();
            case 5:
                Lazy lazy3 = PremiumReserveTicketTableAdapter.f2121a;
                return new PremiumReserveTicketTableAdapter$refundInfoAdapter$2$1();
            case 6:
                Lazy lazy4 = PremiumReserveTicketTableAdapter.f2121a;
                return new PremiumReserveTicketTableAdapter$firstBookingAdapter$2$1();
            case 7:
                Lazy lazy5 = PremiumReserveTicketTableAdapter.f2121a;
                return new PremiumReserveTicketTableAdapter$seatInfoAdapter$2$1();
            case 8:
                PremiumReserveTicketValidationReceiptData.Companion companion4 = PremiumReserveTicketValidationReceiptData.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            case 9:
                PremiumReserveTicketValidationReceiptData.Companion companion5 = PremiumReserveTicketValidationReceiptData.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 10:
                ProductActivationArgs.Companion companion6 = ProductActivationArgs.Companion;
                return Source.INSTANCE.serializer();
            case 11:
                ProductAdjustEventTokenRemoteConfig.Companion companion7 = ProductAdjustEventTokenRemoteConfig.INSTANCE;
                return new ArrayListSerializer(ProductBasedAdjustEventTokenConfig$$serializer.f1325a);
            case 12:
                ProductBasedAdjustEventTokenConfig.Companion companion8 = ProductBasedAdjustEventTokenConfig.INSTANCE;
                return new ArrayListSerializer(ConfigWiseEventTokens$$serializer.f1281a);
            case 13:
                ProductBookingBranding.Companion companion9 = ProductBookingBranding.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.data.ProductBookingBranding", Reflection.a(ProductBookingBranding.class), new KClass[]{Reflection.a(ProductBookingBranding.AgencyBranding.class), Reflection.a(ProductBookingBranding.AgencyBrandingResource.class), Reflection.a(ProductBookingBranding.AgencyBrandingText.class), Reflection.a(ProductBookingBranding.AppResource.class), Reflection.a(ProductBookingBranding.None.class), Reflection.a(ProductBookingBranding.Ondc.class)}, new KSerializer[]{ProductBookingBranding$AgencyBranding$$serializer.f2389a, ProductBookingBranding$AgencyBrandingResource$$serializer.f2390a, ProductBookingBranding$AgencyBrandingText$$serializer.f2391a, ProductBookingBranding$AppResource$$serializer.f2392a, new ObjectSerializer("app.chalo.data.ProductBookingBranding.None", ProductBookingBranding.None.INSTANCE, new Annotation[0]), ProductBookingBranding$Ondc$$serializer.f2393a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 14:
                ProductBookingBranding.AgencyBrandingResource.Companion companion10 = ProductBookingBranding.AgencyBrandingResource.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 15:
                ProductBookingBranding.AppResource.Companion companion11 = ProductBookingBranding.AppResource.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 16:
                return new ObjectSerializer("app.chalo.data.ProductBookingBranding.None", ProductBookingBranding.None.INSTANCE, new Annotation[0]);
            case 17:
                ProductBookingBranding.Ondc.Companion companion12 = ProductBookingBranding.Ondc.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 18:
                ProductBookingFlowType.Companion companion13 = ProductBookingFlowType.Companion;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.productbooking.common.ProductBookingFlowType", Reflection.a(ProductBookingFlowType.class), new KClass[]{Reflection.a(ProductBookingFlowType.InstantTicket.FreshPurchase.class), Reflection.a(ProductBookingFlowType.ONDCTicket.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.FreshPurchase.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PBAllRoutes.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PassPurchaseFromAllProducts.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.RepurchaseTicket.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.RescheduleTicket.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.SelectSlot.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.StopDetails.class), Reflection.a(ProductBookingFlowType.StopBasedPassFreshPurchase.class)}, new KSerializer[]{ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer.f8087a, new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.ONDCTicket", ProductBookingFlowType.ONDCTicket.INSTANCE, new Annotation[0]), ProductBookingFlowType$PremiumBusProduct$FreshPurchase$$serializer.f8088a, ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer.f8089a, new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PBAllRoutes", ProductBookingFlowType.PremiumBusProduct.PBAllRoutes.INSTANCE, new Annotation[0]), ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$$serializer.f8090a, new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen", ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen.INSTANCE, new Annotation[0]), ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$$serializer.f8091a, ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer.f8092a, ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer.f8093a, ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer.f8094a, ProductBookingFlowType$PremiumBusProduct$StopDetails$$serializer.f8095a, ProductBookingFlowType$StopBasedPassFreshPurchase$$serializer.f8096a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 19:
                ProductBookingFlowType.InstantTicket.Companion companion14 = ProductBookingFlowType.InstantTicket.Companion;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.productbooking.common.ProductBookingFlowType.InstantTicket", Reflection.a(ProductBookingFlowType.InstantTicket.class), new KClass[]{Reflection.a(ProductBookingFlowType.InstantTicket.FreshPurchase.class)}, new KSerializer[]{ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer.f8087a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 20:
                ProductBookingFlowType.InstantTicket.FreshPurchase.Companion companion15 = ProductBookingFlowType.InstantTicket.FreshPurchase.Companion;
                return StopBasedRouteSelectionFlowType.INSTANCE.serializer();
            case 21:
                return new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.ONDCTicket", ProductBookingFlowType.ONDCTicket.INSTANCE, new Annotation[0]);
            case 22:
                ProductBookingFlowType.PremiumBusProduct.Companion companion16 = ProductBookingFlowType.PremiumBusProduct.Companion;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct", Reflection.a(ProductBookingFlowType.PremiumBusProduct.class), new KClass[]{Reflection.a(ProductBookingFlowType.PremiumBusProduct.FreshPurchase.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PBAllRoutes.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PassPurchaseFromAllProducts.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.RepurchaseTicket.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.RescheduleTicket.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.ReserveSeatThroughPass.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.SelectSlot.class), Reflection.a(ProductBookingFlowType.PremiumBusProduct.StopDetails.class)}, new KSerializer[]{ProductBookingFlowType$PremiumBusProduct$FreshPurchase$$serializer.f8088a, ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer.f8089a, new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PBAllRoutes", ProductBookingFlowType.PremiumBusProduct.PBAllRoutes.INSTANCE, new Annotation[0]), ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$$serializer.f8090a, new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen", ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen.INSTANCE, new Annotation[0]), ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$$serializer.f8091a, ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer.f8092a, ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer.f8093a, ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer.f8094a, ProductBookingFlowType$PremiumBusProduct$StopDetails$$serializer.f8095a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 23:
                ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.Companion companion17 = ProductBookingFlowType.PremiumBusProduct.FreshPurchaseThroughTripPlanner.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 24:
                return new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PBAllRoutes", ProductBookingFlowType.PremiumBusProduct.PBAllRoutes.INSTANCE, new Annotation[0]);
            case 25:
                return new ObjectSerializer("app.chalo.productbooking.common.ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen", ProductBookingFlowType.PremiumBusProduct.PassPurchaseThroughAllRoutesScreen.INSTANCE, new Annotation[0]);
            case 26:
                ProductBookingNavigation.Companion companion18 = ProductBookingNavigation.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.premiumbus.ProductBookingNavigation", Reflection.a(ProductBookingNavigation.class), new KClass[]{Reflection.a(ProductBookingNavigation.InstantTicket.FreshPurchase.class), Reflection.a(ProductBookingNavigation.ONDCTicket.class), Reflection.a(ProductBookingNavigation.OndcMetroBooking.class), Reflection.a(ProductBookingNavigation.StopBasedPassFreshPurchase.class)}, new KSerializer[]{ProductBookingNavigation$InstantTicket$FreshPurchase$$serializer.f6869a, ProductBookingNavigation$ONDCTicket$$serializer.f6870a, new ObjectSerializer("app.chalo.premiumbus.ProductBookingNavigation.OndcMetroBooking", ProductBookingNavigation.OndcMetroBooking.INSTANCE, new Annotation[0]), ProductBookingNavigation$StopBasedPassFreshPurchase$$serializer.f6871a});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            case 27:
                ProductBookingNavigation.InstantTicket.Companion companion19 = ProductBookingNavigation.InstantTicket.INSTANCE;
                SealedClassSerializer sealedClassSerializer6 = new SealedClassSerializer("app.chalo.premiumbus.ProductBookingNavigation.InstantTicket", Reflection.a(ProductBookingNavigation.InstantTicket.class), new KClass[]{Reflection.a(ProductBookingNavigation.InstantTicket.FreshPurchase.class)}, new KSerializer[]{ProductBookingNavigation$InstantTicket$FreshPurchase$$serializer.f6869a});
                sealedClassSerializer6.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer6;
            case 28:
                ProductBookingNavigation.InstantTicket.FreshPurchase.Companion companion20 = ProductBookingNavigation.InstantTicket.FreshPurchase.INSTANCE;
                return StopBasedRouteSelectionFlowType.INSTANCE.serializer();
            default:
                return new ObjectSerializer("app.chalo.premiumbus.ProductBookingNavigation.OndcMetroBooking", ProductBookingNavigation.OndcMetroBooking.INSTANCE, new Annotation[0]);
        }
    }
}
