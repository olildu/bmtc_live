package defpackage;

import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import app.chalo.ble_communication.model.BLEOperationsToLogConfig;
import app.chalo.data.BackgroundAppModel;
import app.chalo.data.BackgroundShape;
import app.chalo.data.BackgroundStyle;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.mappers.BannerUiImageType;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.data.model.app.response.BannerRequestType;
import app.chalo.home.data.model.app.response.BannerType;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel;
import app.chalo.livetracking.universalsearch.domain.AutoCompleteTimeoutRemoteConfig;
import app.chalo.livetracking.universalsearch.domain.AutoCompleteTimeoutRemoteConfigForCity$$serializer;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.productbooking.common.data.models.api.request.AvailableSlotsRequestForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsApiModel;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.AvailableSlotsResponseForPBPreBookingApiModel;
import app.chalo.productbooking.common.data.models.api.response.PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.response.AvailableSlotsResponseForPBPreBookingAppModel;
import app.chalo.productbooking.common.data.models.app.response.SlotAvailableOnDateInfo$$serializer;
import app.chalo.validationsdk.legacy.ios.BLEValidationInitializationOptions;
import app.chalo.validationsdk.legacy.ios.ViewProductType;
import chalo_app_kmm.shared.chalo_base.generated.resources.Array0_commonMainKt;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffectsState;
import io.github.alexzhirkevich.compottie.internal.platform.PlatformPath_androidKt;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.compose.resources.ResourceItem;
import org.jetbrains.compose.resources.StringArrayResource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19009a;

    public /* synthetic */ p7(int i) {
        this.f19009a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19009a) {
            case 0:
                Lazy lazy = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:gen_instructions_arr_aictsl", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 10L, 646L)));
            case 1:
                Lazy lazy2 = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:gen_instructions_ebill_payment_arr", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 1027L, 366L)));
            case 2:
                Lazy lazy3 = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:gen_instructions_ncmc_recharge_arr", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 1394L, 406L)));
            case 3:
                Lazy lazy4 = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:gen_instructions_wallet_load_balance_arr", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 1801L, 92L)));
            case 4:
                Lazy lazy5 = Array0_commonMainKt.f11288a;
                return new StringArrayResource("string-array:kochi_beta_instructions", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/values/arrays.commonMain.cvr", 1894L, 143L)));
            case 5:
                AutoCompleteResultApiRequestModel.Companion companion = AutoCompleteResultApiRequestModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel", Reflection.a(AutoCompleteResultApiRequestModel.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 6:
                AutoCompleteTimeoutRemoteConfig.Companion companion2 = AutoCompleteTimeoutRemoteConfig.INSTANCE;
                return new ArrayListSerializer(AutoCompleteTimeoutRemoteConfigForCity$$serializer.f5012a);
            case 7:
                return AutofillHighlightKt.LocalAutofillHighlightBrush$lambda$0();
            case 8:
                AvailableSlotsApiModel.Companion companion3 = AvailableSlotsApiModel.Companion;
                return new ArrayListSerializer(PBBulkBookingAvailableSlotsTripApiResponseModel$$serializer.f8144a);
            case 9:
                AvailableSlotsRequestForPBPreBookingApiModel.Companion companion4 = AvailableSlotsRequestForPBPreBookingApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                AvailableSlotsResponseForPBPreBookingApiModel.Companion companion5 = AvailableSlotsResponseForPBPreBookingApiModel.Companion;
                return new ArrayListSerializer(AvailableSlotsApiModel$$serializer.f8113a);
            case 11:
                AvailableSlotsResponseForPBPreBookingAppModel.Companion companion6 = AvailableSlotsResponseForPBPreBookingAppModel.INSTANCE;
                return new ArrayListSerializer(SlotAvailableOnDateInfo$$serializer.f8239a);
            case 12:
                BLEOperationsToLogConfig.Companion companion7 = BLEOperationsToLogConfig.Companion;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 13:
                BLEValidationInitializationOptions.Companion companion8 = BLEValidationInitializationOptions.Companion;
                return ViewProductType.INSTANCE.serializer();
            case 14:
                BackgroundAppModel.Companion companion9 = BackgroundAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.data.BackgroundStyle", BackgroundStyle.values());
            case 15:
                BackgroundShape.Companion companion10 = BackgroundShape.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.data.BackgroundShape", Reflection.a(BackgroundShape.class), new KClass[0], new KSerializer[0]);
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 16:
                BannerDataResponseAppModel.Companion companion11 = BannerDataResponseAppModel.INSTANCE;
                return BannerType.INSTANCE.serializer();
            case 17:
                BannerMetaAppModel.Companion companion12 = BannerMetaAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.premiumbus.data.models.app.PassTierType", PassTierType.values());
            case 18:
                return BannerRequestType._init_$_anonymous_();
            case 19:
                return BannerStatus._init_$_anonymous_();
            case 20:
                return BannerType._init_$_anonymous_();
            case 21:
                BannerUiDataAppModel.Companion companion13 = BannerUiDataAppModel.INSTANCE;
                return BannerStatus.INSTANCE.serializer();
            case 22:
                return BannerUiImageType._init_$_anonymous_();
            case 23:
                return "Invalid keyframe";
            case 24:
                Paint Paint = AndroidPaint_androidKt.Paint();
                Paint.setAntiAlias(true);
                Paint.mo4486setBlendModes9anfk8(BlendMode.INSTANCE.m4524getClear0nO6VwU());
                return Paint;
            case 25:
                Paint Paint2 = AndroidPaint_androidKt.Paint();
                Paint2.mo4486setBlendModes9anfk8(BlendMode.INSTANCE.m4532getDstIn0nO6VwU());
                Paint2.setAntiAlias(true);
                return Paint2;
            case 26:
                Paint Paint3 = AndroidPaint_androidKt.Paint();
                Paint3.mo4486setBlendModes9anfk8(BlendMode.INSTANCE.m4533getDstOut0nO6VwU());
                Paint3.setAntiAlias(true);
                return Paint3;
            case 27:
                Paint Paint4 = AndroidPaint_androidKt.Paint();
                Paint4.mo4487setColor8_81llA(Color.INSTANCE.m4642getWhite0d7_KjU());
                return Paint4;
            case 28:
                return PlatformPath_androidKt.a();
            default:
                return new LayerEffectsState();
        }
    }
}
