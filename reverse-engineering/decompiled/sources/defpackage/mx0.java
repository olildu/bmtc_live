package defpackage;

import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.productconfig.CategoryApiModel$$serializer;
import app.chalo.premiumbus.data.models.productconfig.ProductConfigApiModel;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.EligibleSubProductApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.ProductConfigApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigCategoryApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigFareMappingApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigSubCategoryApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductCategoryApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductFareMappingApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductSubCategoryApiResponseModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.api.UnknownProductValidDurationInfoApiResponseModel$$serializer;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mx0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18436a;

    public /* synthetic */ mx0(int i) {
        this.f18436a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18436a) {
            case 0:
                ProductBookingRouteDetails.Companion companion = ProductBookingRouteDetails.INSTANCE;
                return new ArrayListSerializer(ProductBookingSpecialFeature$$serializer.f8198a);
            case 1:
                ProductBookingRouteDetails.Companion companion2 = ProductBookingRouteDetails.INSTANCE;
                return new ArrayListSerializer(ProductBookingStopDetails$$serializer.f8200a);
            case 2:
                ProductBookingSpecialFeature.Companion companion3 = ProductBookingSpecialFeature.Companion;
                return EnumsKt.b("app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType", ProductBookingRouteSpecialFeatureTagType.values());
            case 3:
                ProductConfigApiModel.Companion companion4 = ProductConfigApiModel.Companion;
                return new ArrayListSerializer(CategoryApiModel$$serializer.f7147a);
            case 4:
                ProductConfigApiModel.Companion companion5 = ProductConfigApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 5:
                ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.Companion companion6 = ProductConfigApiResponseModel.CardRechargeConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 6:
                ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.Companion companion7 = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.INSTANCE;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 7:
                ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.Companion companion8 = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 8:
                ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.Companion companion9 = ProductConfigApiResponseModel.GroupTicketConfigurationApiModel.INSTANCE;
                return new ArrayListSerializer(EligibleSubProductApiResponseModel$$serializer.f8562a);
            case 9:
                ProductConfigApiResponseModel.InstantTicketConfigurationApiModel.Companion companion10 = ProductConfigApiResponseModel.InstantTicketConfigurationApiModel.INSTANCE;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 10:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion11 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(ProductImageApiResponseModel$$serializer.f8178a));
            case 11:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion12 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new ArrayListSerializer(UnknownProductSubCategoryApiResponseModel$$serializer.f8624a);
            case 12:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion13 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new ArrayListSerializer(UnknownProductCategoryApiResponseModel$$serializer.f8620a);
            case 13:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion14 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, UnknownProductValidDurationInfoApiResponseModel$$serializer.f8628a);
            case 14:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion15 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(UnknownProductFareMappingApiResponseModel$$serializer.f8622a));
            case 15:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion16 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 16:
                ProductConfigApiResponseModel.SingleJourneyTicketApiModel.Companion companion17 = ProductConfigApiResponseModel.SingleJourneyTicketApiModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 17:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion18 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(SuperPassProductConfigCategoryApiResponseModel$$serializer.f8612a);
            case 18:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion19 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(SuperPassProductConfigFareMappingApiResponseModel$$serializer.f8614a));
            case 19:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion20 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(SuperPassProductConfigSubCategoryApiResponseModel$$serializer.f8616a);
            case 20:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion21 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 21:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion22 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 22:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion23 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 23:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion24 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 24:
                ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.Companion companion25 = ProductConfigApiResponseModel.SuperPassConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 25:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion26 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(UnknownProductSubCategoryApiResponseModel$$serializer.f8624a);
            case 26:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion27 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(UnknownProductCategoryApiResponseModel$$serializer.f8620a);
            case 27:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion28 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, UnknownProductValidDurationInfoApiResponseModel$$serializer.f8628a);
            case 28:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion29 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, new ArrayListSerializer(UnknownProductFareMappingApiResponseModel$$serializer.f8622a));
            default:
                ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.Companion companion30 = ProductConfigApiResponseModel.UnknownProductConfigApiResponseModel.INSTANCE;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
        }
    }
}
