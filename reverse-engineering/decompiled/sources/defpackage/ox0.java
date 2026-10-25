package defpackage;

import app.chalo.constants.Source;
import app.chalo.homescreen.data.model.app.PassCardDataAppModel$$serializer;
import app.chalo.homescreen.data.model.app.ProductPurchaseSectionAppModel;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.homescreen.data.model.app.ProfilePageItemAppModel;
import app.chalo.homescreen.data.model.app.ProfilePageItemAppModel$$serializer;
import app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType;
import app.chalo.homescreen.data.model.app.ProfileScreenAppModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.PassOfferTagApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareMappingApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigForUiApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigForUiApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductImageApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductsConfigListForUiApiResponseModel;
import app.chalo.productbooking.common.data.models.app.PassOfferTagAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareMappingAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetailsSerializable;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.walletframework.wallet.domain.model.PromotionCardRemoteConfigItem$$serializer;
import app.chalo.walletframework.wallet.domain.model.PromotionCardsForCity;
import app.chalo.walletframework.wallet.domain.model.PromotionCardsForCity$$serializer;
import app.chalo.walletframework.wallet.domain.model.PromotionCardsRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ox0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18985a;

    public /* synthetic */ ox0(int i) {
        this.f18985a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18985a) {
            case 0:
                ProductConfigFareMappingApiResponseModel.Companion companion = ProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 1:
                ProductConfigFareMappingApiResponseModel.Companion companion2 = ProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(PassOfferTagApiResponseModel$$serializer.f8146a);
            case 2:
                ProductConfigFareMappingApiResponseModel.Companion companion3 = ProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 3:
                ProductConfigFareMappingAppModel.Companion companion4 = ProductConfigFareMappingAppModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 4:
                ProductConfigFareMappingAppModel.Companion companion5 = ProductConfigFareMappingAppModel.Companion;
                return new ArrayListSerializer(PassOfferTagAppModel$$serializer.f8193a);
            case 5:
                ProductConfigFareMappingAppModel.Companion companion6 = ProductConfigFareMappingAppModel.Companion;
                return new ArrayListSerializer(ApplicableRuleAppModel$$serializer.f7071a);
            case 6:
                ProductConfigForUiApiResponseModel.Companion companion7 = ProductConfigForUiApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 7:
                ProductConfigForUiApiResponseModel.Companion companion8 = ProductConfigForUiApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 8:
                ProductConfigForUiApiResponseModel.Companion companion9 = ProductConfigForUiApiResponseModel.Companion;
                return new ArrayListSerializer(ProductImageApiResponseModel$$serializer.f8178a);
            case 9:
                ProductConfigForUiApiResponseModel.Companion companion10 = ProductConfigForUiApiResponseModel.Companion;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 10:
                return ProductConfigServiceType._init_$_anonymous_();
            case 11:
                ProductImageAppModel.Companion companion11 = ProductImageAppModel.INSTANCE;
                return ProductImageType.INSTANCE.serializer();
            case 12:
                return ProductImageType._init_$_anonymous_();
            case 13:
                ProductPurchaseSectionAppModel.Companion companion12 = ProductPurchaseSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.ChaloCtaDisplayType", ChaloCtaDisplayType.values());
            case 14:
                ProductPurchaseSectionAppModel.Companion companion13 = ProductPurchaseSectionAppModel.INSTANCE;
                return new ArrayListSerializer(PassCardDataAppModel$$serializer.f3773a);
            case 15:
                ProductPurchaseSectionAppModel.Companion companion14 = ProductPurchaseSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 16:
                ProductSelectionArgs.Companion companion15 = ProductSelectionArgs.Companion;
                return Source.INSTANCE.serializer();
            case 17:
                ProductSelectionArgs.Companion companion16 = ProductSelectionArgs.Companion;
                return Source.INSTANCE.serializer();
            case 18:
                return new ToolbarUIState(null, null, null, null, null, 0.0f, null, null, 255);
            case 19:
                ProductsConfigListForUiApiResponseModel.Companion companion17 = ProductsConfigListForUiApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigForUiApiResponseModel$$serializer.f8168a);
            case 20:
                ProfilePageItemAppModel.Companion companion18 = ProfilePageItemAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType", ProfilePageItemDisplayType.values());
            case 21:
                ProfilePageItemAppModel.Companion companion19 = ProfilePageItemAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ProfilePageFeature", ProfilePageFeature.values());
            case 22:
                ProfileRejectionReason.Companion companion20 = ProfileRejectionReason.INSTANCE;
                return RejectionStatus.INSTANCE.serializer();
            case 23:
                ProfileRejectionReason.Companion companion21 = ProfileRejectionReason.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 24:
                ProfileScreenAppModel.Companion companion22 = ProfileScreenAppModel.INSTANCE;
                return new ArrayListSerializer(ProfilePageItemAppModel$$serializer.f3781a);
            case 25:
                PromotionCardsForCity.Companion companion23 = PromotionCardsForCity.INSTANCE;
                return new ArrayListSerializer(PromotionCardRemoteConfigItem$$serializer.f11088a);
            case 26:
                PromotionCardsRemoteConfig.Companion companion24 = PromotionCardsRemoteConfig.INSTANCE;
                return new ArrayListSerializer(PromotionCardsForCity$$serializer.f11090a);
            case 27:
                ProofRejectionReason.Companion companion25 = ProofRejectionReason.INSTANCE;
                return RejectionStatus.INSTANCE.serializer();
            case 28:
                ProofRejectionReason.Companion companion26 = ProofRejectionReason.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            default:
                ProofUploadDetailsSerializable.Companion companion27 = ProofUploadDetailsSerializable.INSTANCE;
                return EnumsKt.b("app.chalo.productpurchase.passpurchase.data.ProofUploadStatus", ProofUploadStatus.values());
        }
    }
}
