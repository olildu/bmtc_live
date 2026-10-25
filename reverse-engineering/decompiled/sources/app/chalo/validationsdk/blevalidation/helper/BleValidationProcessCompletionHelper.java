package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.notification.models.AppNotification;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchProductPunchDataForOngoingValidationOnlineUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchTitoTapinInfoForActivationUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetProductValidationDataFromDataReceivedOverBleConnectionUseCase;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessCompletionHelper;", "", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BleValidationProcessCompletionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f10539a;
    public final ProductValidationConfigProvider b;
    public final GetRegularBusProductValidationMethodUseCase c;
    public final FetchTitoTapinInfoForActivationUseCase d;
    public final FetchProductPunchDataForOngoingValidationOnlineUseCase e;
    public final GetProductValidationDataFromDataReceivedOverBleConnectionUseCase f;
    public final GetWalletSetupConfigurationUseCase g;
    public final TITOUnifiedFlowValidationDataManager h;
    public final BasicInfoContract i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public Job l;
    public ProductValidationAnalyticManager m;
    public ProductValidationData n;
    public ValidationProcessFlowDetails o;
    public ValidationProduct p;
    public final MutexImpl q;
    public ProductValidationConfig r;
    public final MutexImpl s;
    public CoroutineScope t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BleValidationProcessCompletionHelper$Companion;", "", "", "DEFAULT_TITO_TAP_IN_POLLING_DELAY", "J", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BleValidationProcessCompletionHelper(CoroutineContextProvider coroutineContextProvider, ProductValidationConfigProvider productValidationConfigProvider, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, FetchTitoTapinInfoForActivationUseCase fetchTitoTapinInfoForActivationUseCase, FetchProductPunchDataForOngoingValidationOnlineUseCase fetchProductPunchDataForOngoingValidationOnlineUseCase, GetProductValidationDataFromDataReceivedOverBleConnectionUseCase getProductValidationDataFromDataReceivedOverBleConnectionUseCase, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, TITOUnifiedFlowValidationDataManager tITOUnifiedFlowValidationDataManager, BasicInfoContract basicInfoContract) {
        this.f10539a = coroutineContextProvider;
        this.b = productValidationConfigProvider;
        this.c = getRegularBusProductValidationMethodUseCase;
        this.d = fetchTitoTapinInfoForActivationUseCase;
        this.e = fetchProductPunchDataForOngoingValidationOnlineUseCase;
        this.f = getProductValidationDataFromDataReceivedOverBleConnectionUseCase;
        this.g = getWalletSetupConfigurationUseCase;
        this.h = tITOUnifiedFlowValidationDataManager;
        this.i = basicInfoContract;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(BleValidationProcessStatus.Initialized.f10542a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.c(mutableStateFlowA);
        this.q = MutexKt.a();
        this.s = MutexKt.a();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static final Object a(BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, ProductValidationData productValidationData, ProductValidationConfig productValidationConfig, AppNotification.PunchNotification punchNotification, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1 bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1;
        MutableStateFlow mutableStateFlow;
        ProductValidationData productValidationData2 = productValidationData;
        ProductValidationConfig productValidationConfig2 = productValidationConfig;
        AppNotification.PunchNotification punchNotification2 = punchNotification;
        bleValidationProcessCompletionHelper.getClass();
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1) {
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1 = (BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1 = new BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1(bleValidationProcessCompletionHelper, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1 = new BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1(bleValidationProcessCompletionHelper, continuationImpl);
        }
        BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1 bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2 = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$1;
        Object objF = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objF);
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = productValidationData2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = productValidationConfig2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = punchNotification2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 1;
            objF = productValidationConfig2.f(punchNotification2, productValidationData2, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            AppNotification.PunchNotification punchNotification3 = (AppNotification.PunchNotification) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2;
            productValidationConfig2 = (ProductValidationConfig) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1;
            ProductValidationData productValidationData3 = (ProductValidationData) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0;
            ResultKt.b(objF);
            punchNotification2 = punchNotification3;
            productValidationData2 = productValidationData3;
        } else {
            if (i2 == 2) {
                ResultKt.b(objF);
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objF);
                return unit;
            }
            ResultKt.b(objF);
        }
        mutableStateFlow = bleValidationProcessCompletionHelper.j;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 4;
        if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2) == obj) {
            return obj;
        }
        return unit;
        ProductReceiptData productReceiptData = (ProductReceiptData) objF;
        if (productReceiptData != null) {
            BleValidationAckData conductorValidationReceiptData = new BleValidationAckData.ConductorValidationReceiptData(punchNotification2.toString(), productReceiptData.getF10462a(), productReceiptData.getC(), productReceiptData);
            ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 2;
            if (bleValidationProcessCompletionHelper.g(productValidationData2, productValidationConfig2, conductorValidationReceiptData, validationNotificationDeliveryMedium, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2) != obj) {
                return unit;
            }
        } else {
            ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationProcessCompletionHelper.m;
            if (productValidationAnalyticManager != null) {
                BleValidationAckData.InvalidData invalidData = new BleValidationAckData.InvalidData(punchNotification2.toString(), "null receipt data received");
                ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                Source source = Source.BLE_VALIDATION_ACTIVITY;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 3;
                if (productValidationAnalyticManager.E(invalidData, productValidationData2, validationNotificationDeliveryMedium2, source, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2) != obj) {
                    mutableStateFlow = bleValidationProcessCompletionHelper.j;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 4;
                    if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2) == obj) {
                        return unit;
                    }
                }
            } else {
                mutableStateFlow = bleValidationProcessCompletionHelper.j;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$0 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$1 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.L$2 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2.label = 4;
                if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedByNotificationEvent$2) == obj) {
                    return unit;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static final Object b(BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, ProductValidationData productValidationData, ProductValidationConfig productValidationConfig, ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1 bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1;
        MutableStateFlow mutableStateFlow;
        ProductValidationData productValidationData2 = productValidationData;
        ProductValidationConfig productValidationConfig2 = productValidationConfig;
        ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData2 = conductorValidationPunchData;
        bleValidationProcessCompletionHelper.getClass();
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1) {
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1 = (BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1 = new BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1(bleValidationProcessCompletionHelper, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1 = new BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1(bleValidationProcessCompletionHelper, continuationImpl);
        }
        BleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1 bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2 = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$1;
        Object objD = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            productValidationData2.getId();
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = productValidationData2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = productValidationConfig2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = conductorValidationPunchData2;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 1;
            objD = productValidationConfig2.d(conductorValidationPunchData2, productValidationData2, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData3 = (ProductValidationDataReceivedOverBle.ConductorValidationPunchData) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2;
            productValidationConfig2 = (ProductValidationConfig) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1;
            ProductValidationData productValidationData3 = (ProductValidationData) bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0;
            ResultKt.b(objD);
            conductorValidationPunchData2 = conductorValidationPunchData3;
            productValidationData2 = productValidationData3;
        } else {
            if (i2 == 2) {
                ResultKt.b(objD);
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objD);
                return unit;
            }
            ResultKt.b(objD);
        }
        mutableStateFlow = bleValidationProcessCompletionHelper.j;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = null;
        bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 4;
        if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2) == obj) {
            return obj;
        }
        return unit;
        ProductReceiptData productReceiptData = (ProductReceiptData) objD;
        if (productReceiptData != null) {
            BleValidationAckData conductorValidationReceiptData = new BleValidationAckData.ConductorValidationReceiptData(conductorValidationPunchData2.f10502a, productReceiptData.getF10462a(), productReceiptData.getC(), productReceiptData);
            ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium = ValidationNotificationDeliveryMedium.BLE;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = null;
            bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 2;
            if (bleValidationProcessCompletionHelper.g(productValidationData2, productValidationConfig2, conductorValidationReceiptData, validationNotificationDeliveryMedium, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2) != obj) {
                return unit;
            }
        } else {
            ProductValidationAnalyticManager productValidationAnalyticManager = bleValidationProcessCompletionHelper.m;
            if (productValidationAnalyticManager != null) {
                BleValidationAckData.InvalidData invalidData = new BleValidationAckData.InvalidData(conductorValidationPunchData2.f10502a, "null receipt data received");
                ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2 = ValidationNotificationDeliveryMedium.BLE;
                Source source = Source.BLE_VALIDATION_ACTIVITY;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 3;
                if (productValidationAnalyticManager.E(invalidData, productValidationData2, validationNotificationDeliveryMedium2, source, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2) != obj) {
                    mutableStateFlow = bleValidationProcessCompletionHelper.j;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = null;
                    bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 4;
                    if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2) == obj) {
                        return unit;
                    }
                }
            } else {
                mutableStateFlow = bleValidationProcessCompletionHelper.j;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$0 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$1 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.L$2 = null;
                bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2.label = 4;
                if (mutableStateFlow.emit(BleValidationProcessStatus.ReceiptDataParsingFailedForConductorValidation.f10543a, bleValidationProcessCompletionHelper$handleConductorValidationPunchReceivedOverBle$2) == obj) {
                    return unit;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011c, code lost:
    
        if (r15.g(r2, r3, r8, r1, r5) == r6) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper r15, app.chalo.utils.ChaloUseCaseResult r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.c(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper, app.chalo.utils.ChaloUseCaseResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r2 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r33.g(r1, r2, r3, r4, r5) == r6) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper r33, app.chalo.utils.ChaloUseCaseResult r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.d(app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper, app.chalo.utils.ChaloUseCaseResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1 bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1;
        ProductValidationData productValidationData;
        ValidationProduct validationProduct;
        BleValidationProcessCompletionHelper bleValidationProcessCompletionHelper2;
        bleValidationProcessCompletionHelper.getClass();
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1) {
            bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1 = (BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1 = new BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1(bleValidationProcessCompletionHelper, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1 = new BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1(bleValidationProcessCompletionHelper, continuationImpl);
        }
        Object obj = bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.label;
        Unit unit = Unit.f17538a;
        Job jobD = null;
        if (i2 == 0) {
            ResultKt.b(obj);
            Job job = bleValidationProcessCompletionHelper.l;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            ProductValidationData productValidationData2 = bleValidationProcessCompletionHelper.n;
            ValidationProduct validationProduct2 = bleValidationProcessCompletionHelper.p;
            if (productValidationData2 != null && validationProduct2 != null) {
                GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase = bleValidationProcessCompletionHelper.c;
                bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.L$0 = validationProduct2;
                bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.L$1 = productValidationData2;
                bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.label = 1;
                Object objB = getRegularBusProductValidationMethodUseCase.b(validationProduct2, bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productValidationData = productValidationData2;
                obj = objB;
                validationProduct = validationProduct2;
            }
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ProductValidationData productValidationData3 = (ProductValidationData) bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.L$1;
        ValidationProduct validationProduct3 = (ValidationProduct) bleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$1.L$0;
        ResultKt.b(obj);
        validationProduct = validationProduct3;
        productValidationData = productValidationData3;
        RegularBusSlBleConfig regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) obj).b;
        if (regularBusSlBleConfig != null && regularBusSlBleConfig.n) {
            long j = regularBusSlBleConfig.m;
            CoroutineScope coroutineScope = bleValidationProcessCompletionHelper.t;
            if (coroutineScope != null) {
                bleValidationProcessCompletionHelper2 = bleValidationProcessCompletionHelper;
                jobD = BuildersKt.d(coroutineScope, bleValidationProcessCompletionHelper.f10539a.b(), null, new BleValidationProcessCompletionHelper$startTitoTapInPollingJobIfEnabled$2$1(productValidationData, j, validationProduct, bleValidationProcessCompletionHelper2, null), 2);
            } else {
                bleValidationProcessCompletionHelper2 = bleValidationProcessCompletionHelper;
            }
            bleValidationProcessCompletionHelper2.l = jobD;
        }
        return unit;
    }

    public static ValidationProduct f(BleValidationAckData bleValidationAckData) {
        if ((bleValidationAckData instanceof BleValidationAckData.ConductorValidationReceiptData) || (bleValidationAckData instanceof BleValidationAckData.InvalidData)) {
            return null;
        }
        if (bleValidationAckData instanceof BleValidationAckData.TITOTapInData) {
            ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
            BleValidationAckData.TITOTapInData tITOTapInData = (BleValidationAckData.TITOTapInData) bleValidationAckData;
            Long l = tITOTapInData.n;
            String str = tITOTapInData.m;
            String str2 = tITOTapInData.c;
            String str3 = tITOTapInData.d;
            String strA = (str == null || str.length() <= 0 || l == null) ? tITOTapInData.b : ChaloWalletOrderIdUtils.a(l.longValue(), str);
            companion.getClass();
            return ValidationProduct.Companion.a(str2, str3, strA, str, l);
        }
        if (!(bleValidationAckData instanceof BleValidationAckData.TITOTapOutData)) {
            throw new NoWhenBranchMatchedException();
        }
        ValidationProduct.Companion companion2 = ValidationProduct.INSTANCE;
        BleValidationAckData.TITOTapOutData tITOTapOutData = (BleValidationAckData.TITOTapOutData) bleValidationAckData;
        Long l2 = tITOTapOutData.p;
        String str4 = tITOTapOutData.o;
        String str5 = tITOTapOutData.c;
        String str6 = tITOTapOutData.d;
        String strA2 = (str4 == null || str4.length() <= 0) ? tITOTapOutData.b : ChaloWalletOrderIdUtils.a(l2.longValue(), str4);
        companion2.getClass();
        return ValidationProduct.Companion.a(str5, str6, strA2, str4, l2);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x011d A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0121 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x016e A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x019a A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x019e A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d7 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0217  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x023b  */
    /* JADX WARN: Code duplicated, block: B:78:0x023f  */
    /* JADX WARN: Code duplicated, block: B:80:0x025d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0263  */
    /* JADX WARN: Code duplicated, block: B:84:0x0282  */
    /* JADX WARN: Code duplicated, block: B:86:0x0286  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x02ac A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #0 {all -> 0x0163, blocks: (B:44:0x010b, B:48:0x011d, B:50:0x0121, B:57:0x0167, B:59:0x016e, B:60:0x019a, B:62:0x019e, B:65:0x01d3, B:67:0x01d7, B:91:0x02ac, B:92:0x02b1), top: B:95:0x010b }] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r7.E(r22, r20, r23, r8, r12) == r13) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0209, code lost:
    
        if (n(r11, (app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData.TITOTapOutData) r9, r5, r12) == r13) goto L69;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x016e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x019e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01d7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x021b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x023f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r20, app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig r21, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData r22, app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.g(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData, app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContextScope contextScope, ProductValidationData productValidationData, ProductValidationAnalyticManager productValidationAnalyticManager, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct, boolean z, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$initialize$1 bleValidationProcessCompletionHelper$initialize$1;
        Mutex mutex;
        CoroutineScope coroutineScope;
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$initialize$1) {
            bleValidationProcessCompletionHelper$initialize$1 = (BleValidationProcessCompletionHelper$initialize$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$initialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$initialize$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$initialize$1 = new BleValidationProcessCompletionHelper$initialize$1(this, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$initialize$1 = new BleValidationProcessCompletionHelper$initialize$1(this, continuationImpl);
        }
        Object obj = bleValidationProcessCompletionHelper$initialize$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$initialize$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            bleValidationProcessCompletionHelper$initialize$1.L$0 = contextScope;
            bleValidationProcessCompletionHelper$initialize$1.L$1 = productValidationData;
            bleValidationProcessCompletionHelper$initialize$1.L$2 = productValidationAnalyticManager;
            bleValidationProcessCompletionHelper$initialize$1.L$3 = validationProcessFlowDetails;
            bleValidationProcessCompletionHelper$initialize$1.L$4 = validationProduct;
            mutex = this.q;
            bleValidationProcessCompletionHelper$initialize$1.L$5 = mutex;
            bleValidationProcessCompletionHelper$initialize$1.Z$0 = z;
            bleValidationProcessCompletionHelper$initialize$1.label = 1;
            if (mutex.a(bleValidationProcessCompletionHelper$initialize$1) == coroutineSingletons) {
                coroutineScope = contextScope;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = bleValidationProcessCompletionHelper$initialize$1.Z$0;
            Mutex mutex2 = (Mutex) bleValidationProcessCompletionHelper$initialize$1.L$5;
            validationProduct = (ValidationProduct) bleValidationProcessCompletionHelper$initialize$1.L$4;
            validationProcessFlowDetails = (ValidationProcessFlowDetails) bleValidationProcessCompletionHelper$initialize$1.L$3;
            productValidationAnalyticManager = (ProductValidationAnalyticManager) bleValidationProcessCompletionHelper$initialize$1.L$2;
            productValidationData = (ProductValidationData) bleValidationProcessCompletionHelper$initialize$1.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) bleValidationProcessCompletionHelper$initialize$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            coroutineScope = coroutineScope2;
        }
        coroutineScope = contextScope;
        try {
            this.n = productValidationData;
            this.m = productValidationAnalyticManager;
            this.o = validationProcessFlowDetails;
            this.p = validationProduct;
            this.r = this.b.a(validationProduct);
            CoroutineScope coroutineScope3 = this.t;
            Unit unit = Unit.f17538a;
            if (coroutineScope3 != null && CoroutineScopeKt.e(coroutineScope3)) {
                return unit;
            }
            this.t = coroutineScope;
            if (coroutineScope != null) {
                BuildersKt.d(coroutineScope, null, null, new BleValidationProcessCompletionHelper$initialize$2$1(this, z, validationProcessFlowDetails, null), 3);
            }
            return unit;
        } finally {
            mutex.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ProductValidationData productValidationData, BleValidationAckData.TITOTapInData tITOTapInData, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1 bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1;
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1) {
            bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1 = (BleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1 = new BleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1(this, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1 = new BleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1(this, continuationImpl);
        }
        Object objX = bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
            String strA = productValidationData.a();
            String strB = productValidationData.b();
            String id = productValidationData.getId();
            companion.getClass();
            ValidationProduct validationProductA = ValidationProduct.Companion.a(strA, strB, id, null, null);
            if (validationProductA == null) {
                return Boolean.FALSE;
            }
            if (!validationProductA.equals(f(tITOTapInData))) {
                return Boolean.FALSE;
            }
            if ((validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation)) {
                return Boolean.FALSE;
            }
            if (validationProductA instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation) {
                return Boolean.FALSE;
            }
            if (validationProductA instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) {
                return Boolean.FALSE;
            }
            if (validationProductA instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) {
                return Boolean.TRUE;
            }
            if (validationProductA instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) {
                return Boolean.TRUE;
            }
            if (!(validationProductA instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) && !(validationProductA instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
                throw new NoWhenBranchMatchedException();
            }
            bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.L$0 = tITOTapInData;
            bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.label = 1;
            objX = productValidationData.x(bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tITOTapInData = (BleValidationAckData.TITOTapInData) bleValidationProcessCompletionHelper$isTITOTapInNotificationCorrespondingToCurrentProductValidation$1.L$0;
            ResultKt.b(objX);
        }
        return Boolean.valueOf(((Number) objX).longValue() / ((long) 1000) == tITOTapInData.f);
    }

    public final void j(byte[] data) {
        Intrinsics.i(data, "data");
        CoroutineScope coroutineScope = this.t;
        if (coroutineScope != null) {
            BuildersKt.d(coroutineScope, this.f10539a.getDefault(), null, new BleValidationProcessCompletionHelper$onValidationDataReceivedOnBleConnection$1(data, this, null), 2);
        }
    }

    public final void k(AppNotification.PunchNotification notification, ValidationProduct validationProduct) {
        Intrinsics.i(notification, "notification");
        Intrinsics.i(validationProduct, "validationProduct");
        CoroutineScope coroutineScope = this.t;
        if (coroutineScope != null) {
            BuildersKt.d(coroutineScope, this.f10539a.getDefault(), null, new BleValidationProcessCompletionHelper$onValidationNotificationReceived$1(this, notification, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object l(ProductValidationConfig productValidationConfig, ProductValidationData productValidationData, BleValidationAckData.ConductorValidationReceiptData conductorValidationReceiptData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1 bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1;
        ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2;
        ProductValidationData productValidationData2 = productValidationData;
        BleValidationAckData.ConductorValidationReceiptData conductorValidationReceiptData2 = conductorValidationReceiptData;
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1) {
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1 = (BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1 = new BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1(this, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1 = new BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1(this, continuationImpl);
        }
        BleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1 bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2 = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$1;
        Object objN = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label;
        Unit unit = Unit.f17538a;
        MutableStateFlow mutableStateFlow = this.j;
        if (i2 == 0) {
            ResultKt.b(objN);
            ProductReceiptData productReceiptData = conductorValidationReceiptData2.d;
            String id = productValidationData2.getId();
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = productValidationData2;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = conductorValidationReceiptData2;
            validationNotificationDeliveryMedium2 = validationNotificationDeliveryMedium;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = validationNotificationDeliveryMedium2;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 1;
            objN = productValidationConfig.n(productReceiptData, productValidationData2, id, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2);
            if (objN != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium3 = (ValidationNotificationDeliveryMedium) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2;
            conductorValidationReceiptData2 = (BleValidationAckData.ConductorValidationReceiptData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1;
            ProductValidationData productValidationData3 = (ProductValidationData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0;
            ResultKt.b(objN);
            validationNotificationDeliveryMedium2 = validationNotificationDeliveryMedium3;
            productValidationData2 = productValidationData3;
        } else {
            if (i2 == 2) {
                ResultKt.b(objN);
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objN);
                return unit;
            }
            ResultKt.b(objN);
        }
        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = null;
        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = null;
        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = null;
        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 4;
        if (mutableStateFlow.emit(BleValidationProcessStatus.ConductorValidationPunchReceivedForSomeOtherProduct.f10541a, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2) == obj) {
            return obj;
        }
        return unit;
        if (((Boolean) objN).booleanValue()) {
            BleValidationProcessStatus.ConductorBasedValidationComplete conductorBasedValidationComplete = new BleValidationProcessStatus.ConductorBasedValidationComplete(conductorValidationReceiptData2, validationNotificationDeliveryMedium2);
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = null;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = null;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = null;
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 2;
            if (mutableStateFlow.emit(conductorBasedValidationComplete, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2) != obj) {
                return unit;
            }
        } else {
            ProductValidationAnalyticManager productValidationAnalyticManager = this.m;
            if (productValidationAnalyticManager != null) {
                BleValidationAckData.InvalidData invalidData = new BleValidationAckData.InvalidData(conductorValidationReceiptData2.f10497a, "invalid conductor punch data received");
                ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium4 = ValidationNotificationDeliveryMedium.PUSH_NOTIFICATION;
                Source source = Source.BLE_VALIDATION_ACTIVITY;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 3;
                if (productValidationAnalyticManager.E(invalidData, productValidationData2, validationNotificationDeliveryMedium4, source, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2) != obj) {
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = null;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = null;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = null;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 4;
                    if (mutableStateFlow.emit(BleValidationProcessStatus.ConductorValidationPunchReceivedForSomeOtherProduct.f10541a, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2) == obj) {
                        return unit;
                    }
                }
            } else {
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$0 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$1 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.L$2 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2.label = 4;
                if (mutableStateFlow.emit(BleValidationProcessStatus.ConductorValidationPunchReceivedForSomeOtherProduct.f10541a, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnConductorValidationReceiptData$2) == obj) {
                    return unit;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[PHI: r1 r2 r3
      0x00f8: PHI (r1v15 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium) = 
      (r1v14 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium)
      (r1v30 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium)
     binds: [B:43:0x00f5, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r2v8 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapInData) = 
      (r2v7 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapInData)
      (r2v16 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapInData)
     binds: [B:43:0x00f5, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v1 java.lang.Object) binds: [B:43:0x00f5, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        if (r17.j.emit(r6, r4) == r5) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r18, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData.TITOTapInData r19, app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper.m(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapInData, app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:129:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175 A[PHI: r12 r13 r14
      0x0175: PHI (r12v15 app.chalo.models.validation.ValidationProduct) = (r12v11 app.chalo.models.validation.ValidationProduct), (r12v17 app.chalo.models.validation.ValidationProduct) binds: [B:83:0x0171, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r13v7 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData) = 
      (r13v1 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
      (r13v10 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
     binds: [B:83:0x0171, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0175: PHI (r14v5 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium) = 
      (r14v1 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium)
      (r14v10 app.chalo.validationsdk.blevalidation.helper.ValidationNotificationDeliveryMedium)
     binds: [B:83:0x0171, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x018b A[PHI: r12 r13
      0x018b: PHI (r12v18 app.chalo.models.validation.ValidationProduct) = (r12v15 app.chalo.models.validation.ValidationProduct), (r12v20 app.chalo.models.validation.ValidationProduct) binds: [B:86:0x0187, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r13v11 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData) = 
      (r13v7 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
      (r13v13 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
     binds: [B:86:0x0187, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0199 A[PHI: r12 r13
      0x0199: PHI (r12v21 app.chalo.models.validation.ValidationProduct) = (r12v18 app.chalo.models.validation.ValidationProduct), (r12v27 app.chalo.models.validation.ValidationProduct) binds: [B:89:0x0196, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r13v14 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData) = 
      (r13v11 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
      (r13v16 app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData)
     binds: [B:89:0x0196, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    public final Object n(ProductValidationData productValidationData, BleValidationAckData.TITOTapOutData tITOTapOutData, ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium, ContinuationImpl continuationImpl) {
        BleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1 bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1;
        String str;
        Object objC;
        ValidationProduct validationProductA;
        BleValidationProcessStatus.ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt;
        String str2;
        BleValidationAckData.TITOTapOutData tITOTapOutData2;
        BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone tITOTapOutCompleteAndActivationSyncDone;
        if (continuationImpl instanceof BleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) {
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1 = (BleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) continuationImpl;
            int i = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1 = new BleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1(this, continuationImpl);
            }
        } else {
            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1 = new BleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1(this, continuationImpl);
        }
        Object objD = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label;
        MutableStateFlow mutableStateFlow = this.j;
        Unit unit = Unit.f17538a;
        TITOUnifiedFlowValidationDataManager tITOUnifiedFlowValidationDataManager = this.h;
        switch (i2) {
            case 0:
                ResultKt.b(objD);
                ValidationProcessFlowDetails validationProcessFlowDetails = this.o;
                ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow conductorOrTapInUnifiedFlow = ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE;
                if (!Intrinsics.d(validationProcessFlowDetails, conductorOrTapInUnifiedFlow)) {
                    ValidationProcessFlowDetails.ConductorValidation conductorValidation = ValidationProcessFlowDetails.ConductorValidation.INSTANCE;
                    if (!Intrinsics.d(validationProcessFlowDetails, conductorValidation)) {
                        ValidationProcessFlowDetails.VehicleBasedValidation vehicleBasedValidation = ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE;
                        if (!Intrinsics.d(validationProcessFlowDetails, vehicleBasedValidation) && validationProcessFlowDetails != null) {
                            if (!(validationProcessFlowDetails instanceof ValidationProcessFlowDetails.TapOutValidation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((ValidationProcessFlowDetails.TapOutValidation) validationProcessFlowDetails).b;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = productValidationData;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = tITOTapOutData;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = validationNotificationDeliveryMedium;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$3 = str;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 1;
                            ValidationProcessFlowDetails validationProcessFlowDetails2 = this.o;
                            if (Intrinsics.d(validationProcessFlowDetails2, conductorOrTapInUnifiedFlow) || Intrinsics.d(validationProcessFlowDetails2, vehicleBasedValidation) || Intrinsics.d(validationProcessFlowDetails2, conductorValidation) || validationProcessFlowDetails2 == null) {
                                objC = Boolean.FALSE;
                            } else {
                                if (!(validationProcessFlowDetails2 instanceof ValidationProcessFlowDetails.TapOutValidation)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
                                String strA = productValidationData.a();
                                String strB = productValidationData.b();
                                String id = productValidationData.getId();
                                companion.getClass();
                                ValidationProduct validationProductA2 = ValidationProduct.Companion.a(strA, strB, id, null, null);
                                if (validationProductA2 == null || !validationProductA2.equals(f(tITOTapOutData)) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProductA2 instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                                    objC = Boolean.FALSE;
                                } else {
                                    if (!(validationProductA2 instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) && !(validationProductA2 instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) && !(validationProductA2 instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) && !(validationProductA2 instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objC = tITOUnifiedFlowValidationDataManager.c(str, tITOTapOutData, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1);
                                }
                            }
                            if (objC != coroutineSingletons) {
                                if (((Boolean) objC).booleanValue()) {
                                    ValidationProduct.Companion companion2 = ValidationProduct.INSTANCE;
                                    String strA2 = productValidationData.a();
                                    String strB2 = productValidationData.b();
                                    String id2 = productValidationData.getId();
                                    companion2.getClass();
                                    validationProductA = ValidationProduct.Companion.a(strA2, strB2, id2, null, null);
                                    if (validationProductA != null) {
                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationNotificationDeliveryMedium;
                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = validationProductA;
                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$3 = null;
                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 2;
                                        if (tITOUnifiedFlowValidationDataManager.b(str, tITOTapOutData, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                                            validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt = new BleValidationProcessStatus.ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt(tITOTapOutData, validationNotificationDeliveryMedium);
                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = null;
                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 3;
                                            if (mutableStateFlow.emit(validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 4;
                                                if (tITOUnifiedFlowValidationDataManager.f(validationProductA, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                                                    if (!(validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProductA instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) || (validationProductA instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProductA instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                                                        str2 = null;
                                                        tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                                                        if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                                                        }
                                                    } else {
                                                        if (!(validationProductA instanceof ValidationProduct.QuickpayProduct.QuickpayValidation)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        String str3 = ((ValidationProduct.QuickpayProduct.QuickpayValidation) validationProductA).c;
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                                                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 5;
                                                        objD = tITOUnifiedFlowValidationDataManager.d(str3, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1);
                                                        if (objD != coroutineSingletons) {
                                                            tITOTapOutData2 = tITOTapOutData;
                                                            str2 = (String) objD;
                                                            tITOTapOutData = tITOTapOutData2;
                                                            tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                                                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                                                            if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (this.i.f()) {
                                    String str4 = tITOTapOutData.b;
                                    String str5 = tITOTapOutData.c;
                                    long j = tITOTapOutData.f;
                                    StringBuilder sbE = dd.e("tapOutPunchReceived for some other validation \n bookingId = ", str4, " productType = ", str5, " activationTS = ");
                                    sbE.append(j);
                                    String message = sbE.toString();
                                    Intrinsics.i(message, "message");
                                    return unit;
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                }
                return unit;
            case 1:
                String str6 = (String) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$3;
                validationNotificationDeliveryMedium = (ValidationNotificationDeliveryMedium) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2;
                tITOTapOutData = (BleValidationAckData.TITOTapOutData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1;
                ProductValidationData productValidationData2 = (ProductValidationData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0;
                ResultKt.b(objD);
                str = str6;
                productValidationData = productValidationData2;
                objC = objD;
                if (((Boolean) objC).booleanValue()) {
                    ValidationProduct.Companion companion3 = ValidationProduct.INSTANCE;
                    String strA3 = productValidationData.a();
                    String strB3 = productValidationData.b();
                    String id3 = productValidationData.getId();
                    companion3.getClass();
                    validationProductA = ValidationProduct.Companion.a(strA3, strB3, id3, null, null);
                    if (validationProductA != null) {
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationNotificationDeliveryMedium;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = validationProductA;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$3 = null;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 2;
                        if (tITOUnifiedFlowValidationDataManager.b(str, tITOTapOutData, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                            validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt = new BleValidationProcessStatus.ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt(tITOTapOutData, validationNotificationDeliveryMedium);
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = null;
                            bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 3;
                            if (mutableStateFlow.emit(validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 4;
                                if (tITOUnifiedFlowValidationDataManager.f(validationProductA, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                                    if (validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
                                    }
                                    str2 = null;
                                    tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                                    if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                                    }
                                }
                            }
                            break;
                        }
                        return coroutineSingletons;
                    }
                } else if (this.i.f()) {
                    String str7 = tITOTapOutData.b;
                    String str8 = tITOTapOutData.c;
                    long j2 = tITOTapOutData.f;
                    StringBuilder sbE2 = dd.e("tapOutPunchReceived for some other validation \n bookingId = ", str7, " productType = ", str8, " activationTS = ");
                    sbE2.append(j2);
                    String message2 = sbE2.toString();
                    Intrinsics.i(message2, "message");
                    return unit;
                }
                return unit;
            case 2:
                validationProductA = (ValidationProduct) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2;
                ValidationNotificationDeliveryMedium validationNotificationDeliveryMedium2 = (ValidationNotificationDeliveryMedium) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1;
                BleValidationAckData.TITOTapOutData tITOTapOutData3 = (BleValidationAckData.TITOTapOutData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0;
                ResultKt.b(objD);
                validationNotificationDeliveryMedium = validationNotificationDeliveryMedium2;
                tITOTapOutData = tITOTapOutData3;
                validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt = new BleValidationProcessStatus.ValidTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt(tITOTapOutData, validationNotificationDeliveryMedium);
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$2 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 3;
                if (mutableStateFlow.emit(validTITOTapOutDataReceivedAndNowSyncingActivationsWithBackendForReceipt, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 4;
                    if (tITOUnifiedFlowValidationDataManager.f(validationProductA, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                        if (validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
                        }
                        str2 = null;
                        tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                        bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                        if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                            return unit;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                validationProductA = (ValidationProduct) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1;
                tITOTapOutData = (BleValidationAckData.TITOTapOutData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0;
                ResultKt.b(objD);
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = tITOTapOutData;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = validationProductA;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 4;
                if (tITOUnifiedFlowValidationDataManager.f(validationProductA, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) != coroutineSingletons) {
                    if (validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
                    }
                    str2 = null;
                    tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                    bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                    if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                        return unit;
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                validationProductA = (ValidationProduct) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1;
                tITOTapOutData = (BleValidationAckData.TITOTapOutData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0;
                ResultKt.b(objD);
                if (validationProductA instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) {
                    break;
                }
                str2 = null;
                tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 5:
                tITOTapOutData2 = (BleValidationAckData.TITOTapOutData) bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0;
                ResultKt.b(objD);
                str2 = (String) objD;
                tITOTapOutData = tITOTapOutData2;
                tITOTapOutCompleteAndActivationSyncDone = new BleValidationProcessStatus.TITOTapOutCompleteAndActivationSyncDone(tITOTapOutData, str2);
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$0 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.L$1 = null;
                bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1.label = 6;
                if (mutableStateFlow.emit(tITOTapOutCompleteAndActivationSyncDone, bleValidationProcessCompletionHelper$updateValidationProcessStatusOnTitoTapOutDataReceived$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 6:
                ResultKt.b(objD);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
