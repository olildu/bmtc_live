package defpackage;

import app.chalo.juspay.JusPayAction;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JusPayErrorResultAppModel$$serializer;
import app.chalo.juspay.JusPayManagementStatus;
import app.chalo.juspay.JusPayRequestPayload;
import app.chalo.juspay.JusPayRequestPayload$GetUpiSessionToken$$serializer;
import app.chalo.juspay.JusPayRequestPayload$InitiateSDK$$serializer;
import app.chalo.juspay.JusPayRequestPayload$Management$$serializer;
import app.chalo.juspay.JusPayRequestPayload$OnBoardingAndPay$$serializer;
import app.chalo.juspay.JusPayRequestPayload$UpdateSessionToken$$serializer;
import app.chalo.juspay.JusPayRequestPayload$UpiUiScanPay$$serializer;
import app.chalo.juspay.JusPayResponsePayload;
import app.chalo.juspay.JusPayResponsePayload$GetUpiSessionToken$$serializer;
import app.chalo.juspay.JusPayResponsePayload$InitiateSDK$$serializer;
import app.chalo.juspay.JusPayResponsePayload$Management$$serializer;
import app.chalo.juspay.JusPayResponsePayload$OnBoardingAndPay$$serializer;
import app.chalo.juspay.JusPayResponsePayload$UpiUiScanPay$$serializer;
import app.chalo.juspay.JusPayResultAppModel;
import app.chalo.juspay.JusPayResultDataType;
import app.chalo.juspay.JusPayResultDataType$InitiateSDK$$serializer;
import app.chalo.juspay.JusPayResultDataType$Management$$serializer;
import app.chalo.juspay.JusPayResultDataType$OnBoardingAndPay$$serializer;
import app.chalo.juspay.JusPayResultDataType$UpiSessionToken$$serializer;
import app.chalo.juspay.JusPayResultDataType$UpiUiScanPay$$serializer;
import app.chalo.juspay.JusPaySDKInitiateStatus;
import app.chalo.juspay.JusPaySDKUpiAccountResponse$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel;
import app.chalo.juspay.JusPaySignatureRequestApiModel$GetUpiSessionToken$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel$InitiateSDK$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel$Management$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel$OnboardingAndPay$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel$UpdateSessionToken$$serializer;
import app.chalo.juspay.JusPaySignatureRequestApiModel$UpiUiScanPay$$serializer;
import app.chalo.juspay.JusPaySuccessResultAppModel;
import app.chalo.juspay.JusPaySuccessResultAppModel$$serializer;
import app.chalo.juspay.JusPayTransactionStatus;
import app.chalo.juspay.JusPayUnkonownResultAppModel;
import app.chalo.juspay.JusPayUpiSessionStatus;
import app.chalo.juspay.JuspayErrorResultType;
import app.chalo.juspay.JuspayErrorResultType$Other$$serializer;
import app.chalo.juspay.UserUpiAccount$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class uc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19733a;

    public /* synthetic */ uc0(int i) {
        this.f19733a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19733a) {
            case 0:
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
                return JsonNullSerializer.b;
            case 1:
                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.f18193a;
                return JsonObjectSerializer.b;
            case 2:
                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.f18193a;
                return JsonArraySerializer.b;
            case 3:
                JusPayErrorResultAppModel.Companion companion = JusPayErrorResultAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPayAction", JusPayAction.values());
            case 4:
                JusPayErrorResultAppModel.Companion companion2 = JusPayErrorResultAppModel.INSTANCE;
                return JuspayErrorResultType.INSTANCE.serializer();
            case 5:
                JusPayRequestPayload.Companion companion3 = JusPayRequestPayload.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.juspay.JusPayRequestPayload", Reflection.a(JusPayRequestPayload.class), new KClass[]{Reflection.a(JusPayRequestPayload.GetUpiSessionToken.class), Reflection.a(JusPayRequestPayload.InitiateSDK.class), Reflection.a(JusPayRequestPayload.Management.class), Reflection.a(JusPayRequestPayload.OnBoardingAndPay.class), Reflection.a(JusPayRequestPayload.UpdateSessionToken.class), Reflection.a(JusPayRequestPayload.UpiUiScanPay.class)}, new KSerializer[]{JusPayRequestPayload$GetUpiSessionToken$$serializer.f3983a, JusPayRequestPayload$InitiateSDK$$serializer.f3984a, JusPayRequestPayload$Management$$serializer.f3985a, JusPayRequestPayload$OnBoardingAndPay$$serializer.f3986a, JusPayRequestPayload$UpdateSessionToken$$serializer.f3987a, JusPayRequestPayload$UpiUiScanPay$$serializer.f3988a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 6:
                JusPayResponsePayload.Companion companion4 = JusPayResponsePayload.Companion;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.juspay.JusPayResponsePayload", Reflection.a(JusPayResponsePayload.class), new KClass[]{Reflection.a(JusPayResponsePayload.GetUpiSessionToken.class), Reflection.a(JusPayResponsePayload.InitiateSDK.class), Reflection.a(JusPayResponsePayload.Management.class), Reflection.a(JusPayResponsePayload.OnBoardingAndPay.class), Reflection.a(JusPayResponsePayload.Unknown.class), Reflection.a(JusPayResponsePayload.UpdateAuth.class), Reflection.a(JusPayResponsePayload.UpiUiScanPay.class)}, new KSerializer[]{JusPayResponsePayload$GetUpiSessionToken$$serializer.f3991a, JusPayResponsePayload$InitiateSDK$$serializer.f3992a, JusPayResponsePayload$Management$$serializer.f3993a, JusPayResponsePayload$OnBoardingAndPay$$serializer.f3994a, new ObjectSerializer("app.chalo.juspay.JusPayResponsePayload.Unknown", JusPayResponsePayload.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JusPayResponsePayload.UpdateAuth", JusPayResponsePayload.UpdateAuth.INSTANCE, new Annotation[0]), JusPayResponsePayload$UpiUiScanPay$$serializer.f3995a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 7:
                JusPayResponsePayload.GetUpiSessionToken.Companion companion5 = JusPayResponsePayload.GetUpiSessionToken.Companion;
                return new ArrayListSerializer(JusPaySDKUpiAccountResponse$$serializer.f4009a);
            case 8:
                return new ObjectSerializer("app.chalo.juspay.JusPayResponsePayload.Unknown", JusPayResponsePayload.Unknown.INSTANCE, new Annotation[0]);
            case 9:
                return new ObjectSerializer("app.chalo.juspay.JusPayResponsePayload.UpdateAuth", JusPayResponsePayload.UpdateAuth.INSTANCE, new Annotation[0]);
            case 10:
                JusPayResultAppModel.Companion companion6 = JusPayResultAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.juspay.JusPayResultAppModel", Reflection.a(JusPayResultAppModel.class), new KClass[]{Reflection.a(JusPayErrorResultAppModel.class), Reflection.a(JusPaySuccessResultAppModel.class), Reflection.a(JusPayUnkonownResultAppModel.class)}, new KSerializer[]{JusPayErrorResultAppModel$$serializer.f3981a, JusPaySuccessResultAppModel$$serializer.f4027a, new ObjectSerializer("app.chalo.juspay.JusPayUnkonownResultAppModel", JusPayUnkonownResultAppModel.INSTANCE, new Annotation[0])});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 11:
                JusPayResultDataType.Companion companion7 = JusPayResultDataType.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.juspay.JusPayResultDataType", Reflection.a(JusPayResultDataType.class), new KClass[]{Reflection.a(JusPayResultDataType.InitiateSDK.class), Reflection.a(JusPayResultDataType.Management.class), Reflection.a(JusPayResultDataType.OnBoardingAndPay.class), Reflection.a(JusPayResultDataType.Unknown.class), Reflection.a(JusPayResultDataType.UpdateAuth.class), Reflection.a(JusPayResultDataType.UpiSessionToken.class), Reflection.a(JusPayResultDataType.UpiUiScanPay.class)}, new KSerializer[]{JusPayResultDataType$InitiateSDK$$serializer.f3998a, JusPayResultDataType$Management$$serializer.f3999a, JusPayResultDataType$OnBoardingAndPay$$serializer.f4000a, new ObjectSerializer("app.chalo.juspay.JusPayResultDataType.Unknown", JusPayResultDataType.Unknown.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JusPayResultDataType.UpdateAuth", JusPayResultDataType.UpdateAuth.INSTANCE, new Annotation[0]), JusPayResultDataType$UpiSessionToken$$serializer.f4001a, JusPayResultDataType$UpiUiScanPay$$serializer.f4002a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 12:
                JusPayResultDataType.InitiateSDK.Companion companion8 = JusPayResultDataType.InitiateSDK.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPaySDKInitiateStatus", JusPaySDKInitiateStatus.values());
            case 13:
                JusPayResultDataType.Management.Companion companion9 = JusPayResultDataType.Management.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPayManagementStatus", JusPayManagementStatus.values());
            case 14:
                JusPayResultDataType.OnBoardingAndPay.Companion companion10 = JusPayResultDataType.OnBoardingAndPay.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPayTransactionStatus", JusPayTransactionStatus.values());
            case 15:
                return new ObjectSerializer("app.chalo.juspay.JusPayResultDataType.Unknown", JusPayResultDataType.Unknown.INSTANCE, new Annotation[0]);
            case 16:
                return new ObjectSerializer("app.chalo.juspay.JusPayResultDataType.UpdateAuth", JusPayResultDataType.UpdateAuth.INSTANCE, new Annotation[0]);
            case 17:
                JusPayResultDataType.UpiSessionToken.Companion companion11 = JusPayResultDataType.UpiSessionToken.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPayUpiSessionStatus", JusPayUpiSessionStatus.values());
            case 18:
                JusPayResultDataType.UpiSessionToken.Companion companion12 = JusPayResultDataType.UpiSessionToken.INSTANCE;
                return new ArrayListSerializer(UserUpiAccount$$serializer.f4095a);
            case 19:
                JusPaySignatureRequestApiModel.Companion companion13 = JusPaySignatureRequestApiModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer5 = new SealedClassSerializer("app.chalo.juspay.JusPaySignatureRequestApiModel", Reflection.a(JusPaySignatureRequestApiModel.class), new KClass[]{Reflection.a(JusPaySignatureRequestApiModel.GetUpiSessionToken.class), Reflection.a(JusPaySignatureRequestApiModel.InitiateSDK.class), Reflection.a(JusPaySignatureRequestApiModel.Management.class), Reflection.a(JusPaySignatureRequestApiModel.OnboardingAndPay.class), Reflection.a(JusPaySignatureRequestApiModel.UpdateSessionToken.class), Reflection.a(JusPaySignatureRequestApiModel.UpiUiScanPay.class)}, new KSerializer[]{JusPaySignatureRequestApiModel$GetUpiSessionToken$$serializer.f4018a, JusPaySignatureRequestApiModel$InitiateSDK$$serializer.f4019a, JusPaySignatureRequestApiModel$Management$$serializer.f4020a, JusPaySignatureRequestApiModel$OnboardingAndPay$$serializer.f4021a, JusPaySignatureRequestApiModel$UpdateSessionToken$$serializer.f4022a, JusPaySignatureRequestApiModel$UpiUiScanPay$$serializer.f4023a});
                sealedClassSerializer5.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer5;
            case 20:
                JusPaySuccessResultAppModel.Companion companion14 = JusPaySuccessResultAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.juspay.JusPayAction", JusPayAction.values());
            case 21:
                JusPaySuccessResultAppModel.Companion companion15 = JusPaySuccessResultAppModel.INSTANCE;
                return JusPayResultDataType.INSTANCE.serializer();
            case 22:
                return new ObjectSerializer("app.chalo.juspay.JusPayUnkonownResultAppModel", JusPayUnkonownResultAppModel.INSTANCE, new Annotation[0]);
            case 23:
                JuspayErrorResultType.Companion companion16 = JuspayErrorResultType.INSTANCE;
                SealedClassSerializer sealedClassSerializer6 = new SealedClassSerializer("app.chalo.juspay.JuspayErrorResultType", Reflection.a(JuspayErrorResultType.class), new KClass[]{Reflection.a(JuspayErrorResultType.IncorrectDashboardConfiguration.class), Reflection.a(JuspayErrorResultType.IntegrationError.class), Reflection.a(JuspayErrorResultType.MultipleInitiateBeforeSdkTermination.class), Reflection.a(JuspayErrorResultType.NoInternet.class), Reflection.a(JuspayErrorResultType.Other.class), Reflection.a(JuspayErrorResultType.OtpLimitReached.class), Reflection.a(JuspayErrorResultType.RequiredPermissionsNotAvailable.class), Reflection.a(JuspayErrorResultType.SdkURLRedirectionError.class), Reflection.a(JuspayErrorResultType.ServerError.class), Reflection.a(JuspayErrorResultType.TransactionFailedAtPg.class), Reflection.a(JuspayErrorResultType.TransactionStatusAwaiting.class), Reflection.a(JuspayErrorResultType.Unavailable.class), Reflection.a(JuspayErrorResultType.UnsupportedFeature.class), Reflection.a(JuspayErrorResultType.UserBackPress.class), Reflection.a(JuspayErrorResultType.UserBasedError.class), Reflection.a(JuspayErrorResultType.WrongBusinessLogic.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.IncorrectDashboardConfiguration", JuspayErrorResultType.IncorrectDashboardConfiguration.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.IntegrationError", JuspayErrorResultType.IntegrationError.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.MultipleInitiateBeforeSdkTermination", JuspayErrorResultType.MultipleInitiateBeforeSdkTermination.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.NoInternet", JuspayErrorResultType.NoInternet.INSTANCE, new Annotation[0]), JuspayErrorResultType$Other$$serializer.f4045a, new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.OtpLimitReached", JuspayErrorResultType.OtpLimitReached.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.RequiredPermissionsNotAvailable", JuspayErrorResultType.RequiredPermissionsNotAvailable.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.SdkURLRedirectionError", JuspayErrorResultType.SdkURLRedirectionError.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.ServerError", JuspayErrorResultType.ServerError.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.TransactionFailedAtPg", JuspayErrorResultType.TransactionFailedAtPg.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.TransactionStatusAwaiting", JuspayErrorResultType.TransactionStatusAwaiting.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.Unavailable", JuspayErrorResultType.Unavailable.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UnsupportedFeature", JuspayErrorResultType.UnsupportedFeature.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UserBackPress", JuspayErrorResultType.UserBackPress.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.UserBasedError", JuspayErrorResultType.UserBasedError.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.WrongBusinessLogic", JuspayErrorResultType.WrongBusinessLogic.INSTANCE, new Annotation[0])});
                sealedClassSerializer6.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer6;
            case 24:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.IncorrectDashboardConfiguration", JuspayErrorResultType.IncorrectDashboardConfiguration.INSTANCE, new Annotation[0]);
            case 25:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.IntegrationError", JuspayErrorResultType.IntegrationError.INSTANCE, new Annotation[0]);
            case 26:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.MultipleInitiateBeforeSdkTermination", JuspayErrorResultType.MultipleInitiateBeforeSdkTermination.INSTANCE, new Annotation[0]);
            case 27:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.NoInternet", JuspayErrorResultType.NoInternet.INSTANCE, new Annotation[0]);
            case 28:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.OtpLimitReached", JuspayErrorResultType.OtpLimitReached.INSTANCE, new Annotation[0]);
            default:
                return new ObjectSerializer("app.chalo.juspay.JuspayErrorResultType.RequiredPermissionsNotAvailable", JuspayErrorResultType.RequiredPermissionsNotAvailable.INSTANCE, new Annotation[0]);
        }
    }
}
