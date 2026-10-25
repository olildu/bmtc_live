package defpackage;

import android.os.StatFs;
import androidx.lifecycle.viewmodel.CreationExtras;
import app.chalo.data.ClosedLoopWalletSetupConfig$$serializer;
import app.chalo.data.WalletEnableConfig;
import app.chalo.instantticket.data.model.api.request.ValidateFareRequestPassengerDetail$$serializer;
import app.chalo.instantticket.data.model.api.request.ValidateInstantTicketFareRequestApiModel;
import app.chalo.models.productbooking.productcapability.ValidationSupportApiModel;
import app.chalo.models.productbooking.productcapability.ValidationSupportApiModel$QR$$serializer;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProcessFlowDetails$TapOutValidation$$serializer;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$InstantTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$MetroTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$OndcTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$QuickpayProduct$QuickpayValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$SuperPassProduct$MagicPassValidation$$serializer;
import app.chalo.models.validation.ValidationProduct$SuperPassProduct$RideBasedPassValidation$$serializer;
import app.chalo.ncmc.uvik.UvikSdkManagerProviderImpl$defaultManager$2$1;
import app.chalo.premiumbus.data.models.api.response.UpcomingTripsApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.VehicleBreakdownApiResponseModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.VehicleBreakDownUpcomingTripUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.scenes.args.ValidationArgs$BleValidationScreenArgs$$serializer;
import app.chalo.scenes.args.ValidationArgs$MultiProductValidation$$serializer;
import app.chalo.scenes.args.ValidationArgs$QrScannerValidationArgs$$serializer;
import app.chalo.scenes.args.ValidationArgs$QrValidationScreenArgs$$serializer;
import app.chalo.validationsdk.legacy.ios.ViewProductType;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigBaseApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigurationApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigurationApiResponseModel$$serializer;
import coil3.disk.DiskCache;
import coil3.disk.RealDiskCache;
import coil3.disk.UtilsKt;
import io.github.alexzhirkevich.compottie.internal.animation.ValueKeyframe;
import io.github.alexzhirkevich.compottie.internal.animation.VectorKeyframe;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.ktor.util.date.DateJvmKt;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yn1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20127a;

    public /* synthetic */ yn1(int i) {
        this.f20127a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jG;
        switch (this.f20127a) {
            case 0:
                Lazy lazy = UtilsKt.f11530a;
                DiskCache.Builder builder = new DiskCache.Builder();
                builder.f11521a = FileSystem.SYSTEM;
                builder.b = 10485760L;
                builder.c = EmptyCoroutineContext.f17583a;
                Path pathH = FileSystem.SYSTEM_TEMPORARY_DIRECTORY.h("coil3_disk_cache");
                try {
                    File file = pathH.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jG = RangesKt.g((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                    jG = builder.b;
                }
                return new RealDiskCache(jG, builder.c, builder.f11521a, pathH);
            case 1:
                TimeZone timeZone = DateJvmKt.f16905a;
                return Long.valueOf(System.currentTimeMillis());
            case 2:
                return new UvikSdkManagerProviderImpl$defaultManager$2$1();
            case 3:
                ValidateInstantTicketFareRequestApiModel.Companion companion = ValidateInstantTicketFareRequestApiModel.INSTANCE;
                return new ArrayListSerializer(ValidateFareRequestPassengerDetail$$serializer.f3858a);
            case 4:
                ValidationArgs.Companion companion2 = ValidationArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.ValidationArgs", Reflection.a(ValidationArgs.class), new KClass[]{Reflection.a(ValidationArgs.BleValidationScreenArgs.class), Reflection.a(ValidationArgs.MultiProductValidation.class), Reflection.a(ValidationArgs.QrScannerValidationArgs.class), Reflection.a(ValidationArgs.QrValidationScreenArgs.class)}, new KSerializer[]{ValidationArgs$BleValidationScreenArgs$$serializer.f9340a, ValidationArgs$MultiProductValidation$$serializer.f9341a, ValidationArgs$QrScannerValidationArgs$$serializer.f9342a, ValidationArgs$QrValidationScreenArgs$$serializer.f9343a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 5:
                ValidationProcessFlowDetails.Companion companion3 = ValidationProcessFlowDetails.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.models.validation.ValidationProcessFlowDetails", Reflection.a(ValidationProcessFlowDetails.class), new KClass[]{Reflection.a(ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.class), Reflection.a(ValidationProcessFlowDetails.ConductorValidation.class), Reflection.a(ValidationProcessFlowDetails.TapOutValidation.class), Reflection.a(ValidationProcessFlowDetails.VehicleBasedValidation.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow", ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.ConductorValidation", ValidationProcessFlowDetails.ConductorValidation.INSTANCE, new Annotation[0]), ValidationProcessFlowDetails$TapOutValidation$$serializer.f5709a, new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.VehicleBasedValidation", ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE, new Annotation[0])});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 6:
                return new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow", ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE, new Annotation[0]);
            case 7:
                return new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.ConductorValidation", ValidationProcessFlowDetails.ConductorValidation.INSTANCE, new Annotation[0]);
            case 8:
                return new ObjectSerializer("app.chalo.models.validation.ValidationProcessFlowDetails.VehicleBasedValidation", ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE, new Annotation[0]);
            case 9:
                ValidationProduct.Companion companion4 = ValidationProduct.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.models.validation.ValidationProduct", Reflection.a(ValidationProduct.class), new KClass[]{Reflection.a(ValidationProduct.MobileTicketProduct.InstantTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.MetroTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.OndcTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation.class), Reflection.a(ValidationProduct.QuickpayProduct.QuickpayValidation.class), Reflection.a(ValidationProduct.SuperPassProduct.MagicPassValidation.class), Reflection.a(ValidationProduct.SuperPassProduct.RideBasedPassValidation.class)}, new KSerializer[]{ValidationProduct$MobileTicketProduct$InstantTicketValidation$$serializer.f5711a, ValidationProduct$MobileTicketProduct$MetroTicketValidation$$serializer.f5712a, ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$$serializer.f5713a, ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$$serializer.f5714a, ValidationProduct$MobileTicketProduct$OndcTicketValidation$$serializer.f5715a, ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$$serializer.f5716a, ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$$serializer.f5717a, ValidationProduct$QuickpayProduct$QuickpayValidation$$serializer.f5718a, ValidationProduct$SuperPassProduct$MagicPassValidation$$serializer.f5719a, ValidationProduct$SuperPassProduct$RideBasedPassValidation$$serializer.f5720a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 10:
                ValidationProduct.MobileTicketProduct.Companion companion5 = ValidationProduct.MobileTicketProduct.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.models.validation.ValidationProduct.MobileTicketProduct", Reflection.a(ValidationProduct.MobileTicketProduct.class), new KClass[]{Reflection.a(ValidationProduct.MobileTicketProduct.InstantTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.MetroTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.OndcTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation.class), Reflection.a(ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation.class)}, new KSerializer[]{ValidationProduct$MobileTicketProduct$InstantTicketValidation$$serializer.f5711a, ValidationProduct$MobileTicketProduct$MetroTicketValidation$$serializer.f5712a, ValidationProduct$MobileTicketProduct$MultiModalGroupTicketValidation$$serializer.f5713a, ValidationProduct$MobileTicketProduct$OndcMetroTicketValidation$$serializer.f5714a, ValidationProduct$MobileTicketProduct$OndcTicketValidation$$serializer.f5715a, ValidationProduct$MobileTicketProduct$PremiumReserveTicketValidation$$serializer.f5716a, ValidationProduct$MobileTicketProduct$SingleJourneyTicketValidation$$serializer.f5717a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 11:
                ValidationProduct.QuickpayProduct.Companion companion6 = ValidationProduct.QuickpayProduct.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.models.validation.ValidationProduct.QuickpayProduct", Reflection.a(ValidationProduct.QuickpayProduct.class), new KClass[]{Reflection.a(ValidationProduct.QuickpayProduct.QuickpayValidation.class)}, new KSerializer[]{ValidationProduct$QuickpayProduct$QuickpayValidation$$serializer.f5718a});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            case 12:
                ValidationProduct.SuperPassProduct.Companion companion7 = ValidationProduct.SuperPassProduct.INSTANCE;
                SealedClassSerializer sealedClassSerializer6 = new SealedClassSerializer("app.chalo.models.validation.ValidationProduct.SuperPassProduct", Reflection.a(ValidationProduct.SuperPassProduct.class), new KClass[]{Reflection.a(ValidationProduct.SuperPassProduct.MagicPassValidation.class), Reflection.a(ValidationProduct.SuperPassProduct.RideBasedPassValidation.class)}, new KSerializer[]{ValidationProduct$SuperPassProduct$MagicPassValidation$$serializer.f5719a, ValidationProduct$SuperPassProduct$RideBasedPassValidation$$serializer.f5720a});
                sealedClassSerializer6.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer6;
            case 13:
                ValidationSupportApiModel.Companion companion8 = ValidationSupportApiModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer7 = new SealedClassSerializer("app.chalo.models.productbooking.productcapability.ValidationSupportApiModel", Reflection.a(ValidationSupportApiModel.class), new KClass[]{Reflection.a(ValidationSupportApiModel.QR.class)}, new KSerializer[]{ValidationSupportApiModel$QR$$serializer.f5680a});
                sealedClassSerializer7.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer7;
            case 14:
                ValueKeyframe.Companion companion9 = ValueKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 15:
                ValueKeyframe.Companion companion10 = ValueKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 16:
                ValueKeyframe.Companion companion11 = ValueKeyframe.INSTANCE;
                return new BooleanIntSerializer();
            case 17:
                VectorKeyframe.Companion companion12 = VectorKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 18:
                VectorKeyframe.Companion companion13 = VectorKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 19:
                VectorKeyframe.Companion companion14 = VectorKeyframe.INSTANCE;
                return new BooleanIntSerializer();
            case 20:
                VectorKeyframe.Companion companion15 = VectorKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 21:
                VectorKeyframe.Companion companion16 = VectorKeyframe.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 22:
                VehicleBreakDownUpcomingTripUiModel.Companion companion17 = VehicleBreakDownUpcomingTripUiModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 23:
                VehicleBreakdownApiResponseModel.Companion companion18 = VehicleBreakdownApiResponseModel.Companion;
                return new ArrayListSerializer(UpcomingTripsApiResponseModel$$serializer.f7067a);
            case 24:
                return CreationExtras.Empty.INSTANCE;
            case 25:
                return ViewProductType._init_$_anonymous_();
            case 26:
                WalletEnableConfig.Companion companion19 = WalletEnableConfig.INSTANCE;
                return new ArrayListSerializer(ClosedLoopWalletSetupConfig$$serializer.f2345a);
            case 27:
                WalletLoadBalanceConfigBaseApiResponseModel.Companion companion20 = WalletLoadBalanceConfigBaseApiResponseModel.Companion;
                return new ArrayListSerializer(WalletLoadBalanceConfigurationApiResponseModel$$serializer.f10992a);
            case 28:
                WalletLoadBalanceConfigBaseApiResponseModel.Companion companion21 = WalletLoadBalanceConfigBaseApiResponseModel.Companion;
                return new ArrayListSerializer(WalletLoadBalanceConfigurationApiResponseModel$$serializer.f10992a);
            default:
                WalletLoadBalanceConfigurationApiResponseModel.Companion companion22 = WalletLoadBalanceConfigurationApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
        }
    }
}
