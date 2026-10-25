package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.ProductBookingBranding;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.helper.BookingHelpConfigHelper;
import app.chalo.livetracking.tripplanner.domain.MakeTripPlannerCallUseCase;
import app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase;
import app.chalo.models.validation.QrFirstBleEntryPolicy;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.notification.core.GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1;
import app.chalo.notification.models.AppNotification;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.resultstatemanager.booking.BookingHelpResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.branding.AgencyBrandingImageUISpecs;
import app.chalo.uistate.branding.AgencyBrandingTextUISpecs;
import app.chalo.uistate.branding.ImageResourceBrandingUISpecs;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import app.chalo.validationsdk.legacy.Product;
import app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ek0;
import defpackage.kz0;
import defpackage.lu0;
import defpackage.mz0;
import defpackage.py;
import defpackage.vw0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationIntent;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationDataState;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationUIState;", "Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationEffect;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QRValidationComponent extends ChaloBaseStateMviComponent<QRValidationIntent, QRValidationDataState, QRValidationUIState, QRValidationEffect> {
    public final GetProductCapabilitiesUseCase A;
    public final KotlinToastManager B;
    public final PermissionHandlerProvider C;
    public final GCMReceiver D;
    public final IsBluetoothFeatureAvailableUseCase E;
    public final GetRegularBusProductValidationMethodUseCase F;
    public final Lazy G;
    public ProductValidationData H;
    public Job I;
    public final Lazy J;
    public Job K;
    public Job L;
    public final MutexImpl M;
    public final MutexImpl N;
    public final ValidationArgs.QrValidationScreenArgs k;
    public final ComponentContext l;
    public final BasicInfoContract m;
    public final CrashlyticsLogger n;
    public final ProductValidationConfigProvider o;
    public final QRValidationLifecycleDelegate p;
    public final IReportProblemFeature q;
    public final ChaloNavigationManager r;
    public final StringProvider s;
    public final TimeUtilsContract t;
    public final IsNotificationPermissionGrantedUseCase u;
    public final BookingHelpResultStateManager v;
    public final MakeTripPlannerCallUseCase w;
    public final ProcessTripPlannerItineraryForUiUseCase x;
    public final BookingHelpConfigHelper y;
    public final ProductsSyncContract z;

    /* JADX INFO: renamed from: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$1", f = "QRValidationComponent.kt", l = {157}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QRValidationComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1 gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C = QRValidationComponent.this.D.c(Reflection.a(AppNotification.PunchNotification.class));
                final QRValidationComponent qRValidationComponent = QRValidationComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        qRValidationComponent.Y0(new QRValidationIntent.PunchEventReceivedIntent((AppNotification.PunchNotification) obj2));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRValidationComponent$Companion;", "", "", "DUMMY_QR_CODE", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10633a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[QRValidationScreenType.values().length];
            try {
                iArr[QRValidationScreenType.ZOOMED_QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QRValidationScreenType.QR_AND_PRODUCT_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10633a = iArr;
            int[] iArr2 = new int[QrScreenBottomSheetType.values().length];
            try {
                iArr2[QrScreenBottomSheetType.VALIDATION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[QrScreenBottomSheetType.JOURNEY_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QrScreenBottomSheetType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public QRValidationComponent(ValidationArgs.QrValidationScreenArgs qrValidationScreenArgs, ComponentContext componentContext, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ProductValidationConfigProvider productValidationConfigProvider, QRValidationLifecycleDelegate qRValidationLifecycleDelegate, IReportProblemFeature iReportProblemFeature, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, BookingHelpResultStateManager bookingHelpResultStateManager, MakeTripPlannerCallUseCase makeTripPlannerCallUseCase, ProcessTripPlannerItineraryForUiUseCase processTripPlannerItineraryForUiUseCase, BookingHelpConfigHelper bookingHelpConfigHelper, ProductsSyncContract productsSyncContract, GetProductCapabilitiesUseCase getProductCapabilitiesUseCase, KotlinToastManager kotlinToastManager, PermissionHandlerProvider permissionHandlerProvider, GCMReceiver gCMReceiver, IsBluetoothFeatureAvailableUseCase isBluetoothFeatureAvailableUseCase, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase) {
        super(componentContext);
        this.k = qrValidationScreenArgs;
        this.l = componentContext;
        this.m = basicInfoContract;
        this.n = crashlyticsLogger;
        this.o = productValidationConfigProvider;
        this.p = qRValidationLifecycleDelegate;
        this.q = iReportProblemFeature;
        this.r = chaloNavigationManager;
        this.s = stringProvider;
        this.t = timeUtilsContract;
        this.u = isNotificationPermissionGrantedUseCase;
        this.v = bookingHelpResultStateManager;
        this.w = makeTripPlannerCallUseCase;
        this.x = processTripPlannerItineraryForUiUseCase;
        this.y = bookingHelpConfigHelper;
        this.z = productsSyncContract;
        this.A = getProductCapabilitiesUseCase;
        this.B = kotlinToastManager;
        this.C = permissionHandlerProvider;
        this.D = gCMReceiver;
        this.E = isBluetoothFeatureAvailableUseCase;
        this.F = getRegularBusProductValidationMethodUseCase;
        this.G = LazyKt.b(new mz0(this, 18));
        this.J = LazyKt.b(new mz0(this, 0));
        this.M = MutexKt.a();
        this.N = MutexKt.a();
        Y0(new QRValidationIntent.InitializationIntent(Source.SIMPLE_QR_VALIDATION_SCREEN));
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(QRValidationComponent qRValidationComponent, ContinuationImpl continuationImpl) {
        QRValidationComponent$checkBLEEligibility$1 qRValidationComponent$checkBLEEligibility$1;
        boolean z;
        List list;
        int i;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$checkBLEEligibility$1) {
            qRValidationComponent$checkBLEEligibility$1 = (QRValidationComponent$checkBLEEligibility$1) continuationImpl;
            int i2 = qRValidationComponent$checkBLEEligibility$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$checkBLEEligibility$1.label = i2 - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$checkBLEEligibility$1 = new QRValidationComponent$checkBLEEligibility$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$checkBLEEligibility$1 = new QRValidationComponent$checkBLEEligibility$1(qRValidationComponent, continuationImpl);
        }
        Object objB = qRValidationComponent$checkBLEEligibility$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = qRValidationComponent$checkBLEEligibility$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase = qRValidationComponent.F;
            ValidationProduct validationProductW0 = qRValidationComponent.W0();
            qRValidationComponent$checkBLEEligibility$1.label = 1;
            objB = getRegularBusProductValidationMethodUseCase.b(validationProductW0, qRValidationComponent$checkBLEEligibility$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        RegularBusSlBleConfig regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) objB).b;
        if (regularBusSlBleConfig != null) {
            int iH = qRValidationComponent.m.h();
            QrFirstBleEntryPolicy qrFirstBleEntryPolicy = regularBusSlBleConfig.b;
            if (qrFirstBleEntryPolicy != null) {
                int i4 = qrFirstBleEntryPolicy.b;
                float f = PlatformFeature.f10436a;
                z = qrFirstBleEntryPolicy.f5694a && ((list = qrFirstBleEntryPolicy.d) == null || !list.contains(Integer.valueOf(iH))) && ((i = qrFirstBleEntryPolicy.c) != -1 ? !(iH > i || i4 > iH) : iH >= i4) && qRValidationComponent.E.a();
            }
        }
        if (z) {
            AnalyticsContract.DefaultImpls.a(qRValidationComponent.P0(), "qr screen can trigger ble flow", Source.QR_VALIDATION_FRAGMENT.getSourceName(), null, null, false, 28);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(QRValidationComponent qRValidationComponent, ContinuationImpl continuationImpl) {
        QRValidationComponent$handleInvalidPunchState$1 qRValidationComponent$handleInvalidPunchState$1;
        QRValidationComponent qRValidationComponent2;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$handleInvalidPunchState$1) {
            qRValidationComponent$handleInvalidPunchState$1 = (QRValidationComponent$handleInvalidPunchState$1) continuationImpl;
            int i = qRValidationComponent$handleInvalidPunchState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$handleInvalidPunchState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$handleInvalidPunchState$1 = new QRValidationComponent$handleInvalidPunchState$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$handleInvalidPunchState$1 = new QRValidationComponent$handleInvalidPunchState$1(qRValidationComponent, continuationImpl);
        }
        Object objB = qRValidationComponent$handleInvalidPunchState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$handleInvalidPunchState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Job job = qRValidationComponent.K;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            qRValidationComponent$handleInvalidPunchState$1.L$0 = qRValidationComponent;
            qRValidationComponent$handleInvalidPunchState$1.label = 1;
            objB = qRValidationComponent.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], qRValidationComponent$handleInvalidPunchState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            qRValidationComponent2 = qRValidationComponent;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qRValidationComponent2 = (QRValidationComponent) qRValidationComponent$handleInvalidPunchState$1.L$0;
            ResultKt.b(objB);
        }
        X0(qRValidationComponent2, (String) objB);
        qRValidationComponent.q0(new mz0(qRValidationComponent, 12));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r5.b1(r6, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r5.b1(r6, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent r5, app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult r6, boolean r7, boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleRetryableEmptyQrResult$1
            if (r0 == 0) goto L16
            r0 = r9
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleRetryableEmptyQrResult$1 r0 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleRetryableEmptyQrResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleRetryableEmptyQrResult$1 r0 = new app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$handleRetryableEmptyQrResult$1
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r9)
            goto L9b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            boolean r8 = r0.Z$0
            kotlin.ResultKt.b(r9)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r9)
            if (r7 != 0) goto L51
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r5 = r5.b1(r6, r0)
            if (r5 != r1) goto L4c
            goto L9a
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            return r5
        L51:
            if (r8 == 0) goto L92
            app.chalo.crashlytics.CrashlyticsLogger r6 = r5.n
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9 = r5.H
            r0 = 0
            if (r9 == 0) goto L61
            java.lang.String r9 = r9.getId()
            goto L62
        L61:
            r9 = r0
        L62:
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r1 = r5.H
            if (r1 == 0) goto L6b
            java.lang.String r1 = r1.b()
            goto L6c
        L6b:
            r1 = r0
        L6c:
            java.lang.String r2 = "QR validation retry limit exhausted for product "
            java.lang.String r3 = "; "
            java.lang.String r9 = defpackage.z40.g(r2, r9, r3, r1)
            r7.<init>(r9)
            r6.i(r7)
            kotlinx.coroutines.Job r6 = r5.K
            if (r6 == 0) goto L83
            kotlinx.coroutines.JobSupport r6 = (kotlinx.coroutines.JobSupport) r6
            r6.cancel(r0)
        L83:
            mz0 r6 = new mz0
            r7 = 11
            r6.<init>(r5, r7)
            r5.q0(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            return r5
        L92:
            r0.label = r3
            java.lang.Object r5 = r5.b1(r6, r0)
            if (r5 != r1) goto L9b
        L9a:
            return r1
        L9b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.H0(app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent, app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object I0(QRValidationComponent qRValidationComponent, ProductValidationConfig productValidationConfig, ContinuationImpl continuationImpl) {
        QRValidationComponent$refreshProductAfterPunch$1 qRValidationComponent$refreshProductAfterPunch$1;
        ProductValidationData productValidationData;
        Mutex mutex;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$refreshProductAfterPunch$1) {
            qRValidationComponent$refreshProductAfterPunch$1 = (QRValidationComponent$refreshProductAfterPunch$1) continuationImpl;
            int i = qRValidationComponent$refreshProductAfterPunch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$refreshProductAfterPunch$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$refreshProductAfterPunch$1 = new QRValidationComponent$refreshProductAfterPunch$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$refreshProductAfterPunch$1 = new QRValidationComponent$refreshProductAfterPunch$1(qRValidationComponent, continuationImpl);
        }
        Object objL = qRValidationComponent$refreshProductAfterPunch$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$refreshProductAfterPunch$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            Job job = qRValidationComponent.K;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            Product product = (Product) qRValidationComponent.G.getValue();
            qRValidationComponent$refreshProductAfterPunch$1.label = 1;
            objL = productValidationConfig.l(product, qRValidationComponent$refreshProductAfterPunch$1);
            if (objL != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objL);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) qRValidationComponent$refreshProductAfterPunch$1.L$1;
            productValidationData = (ProductValidationData) qRValidationComponent$refreshProductAfterPunch$1.L$0;
            ResultKt.b(objL);
        }
        try {
            qRValidationComponent.E0(new ek0(productValidationData, 1));
            return productValidationData;
        } finally {
            mutex.e(null);
        }
        ProductValidationData productValidationData2 = (ProductValidationData) objL;
        if (productValidationData2 == null) {
            return null;
        }
        qRValidationComponent.H = productValidationData2;
        MutexImpl mutexImpl = qRValidationComponent.M;
        qRValidationComponent$refreshProductAfterPunch$1.L$0 = productValidationData2;
        qRValidationComponent$refreshProductAfterPunch$1.L$1 = mutexImpl;
        qRValidationComponent$refreshProductAfterPunch$1.label = 2;
        if (mutexImpl.a(qRValidationComponent$refreshProductAfterPunch$1) != obj) {
            productValidationData = productValidationData2;
            mutex = mutexImpl;
            qRValidationComponent.E0(new ek0(productValidationData, 1));
            return productValidationData;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(QRValidationComponent qRValidationComponent, ContinuationImpl continuationImpl) {
        QRValidationComponent$requestNotificationPermissionIfRequired$1 qRValidationComponent$requestNotificationPermissionIfRequired$1;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$requestNotificationPermissionIfRequired$1) {
            qRValidationComponent$requestNotificationPermissionIfRequired$1 = (QRValidationComponent$requestNotificationPermissionIfRequired$1) continuationImpl;
            int i = qRValidationComponent$requestNotificationPermissionIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$requestNotificationPermissionIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$requestNotificationPermissionIfRequired$1 = new QRValidationComponent$requestNotificationPermissionIfRequired$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$requestNotificationPermissionIfRequired$1 = new QRValidationComponent$requestNotificationPermissionIfRequired$1(qRValidationComponent, continuationImpl);
        }
        Object objA = qRValidationComponent$requestNotificationPermissionIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$requestNotificationPermissionIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase = qRValidationComponent.u;
            qRValidationComponent$requestNotificationPermissionIfRequired$1.label = 1;
            objA = isNotificationPermissionGrantedUseCase.a(qRValidationComponent$requestNotificationPermissionIfRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        Unit unit = Unit.f17538a;
        if (zBooleanValue) {
            return unit;
        }
        Job job = qRValidationComponent.L;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        qRValidationComponent.L = BuildersKt.d(qRValidationComponent.j, null, null, new QRValidationComponent$requestNotificationPermissionIfRequired$2(qRValidationComponent, null), 3);
        return unit;
    }

    public static final ArrayList K0(QRValidationComponent qRValidationComponent, List list, int i) {
        qRValidationComponent.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            QrCodeData qrCodeData = (QrCodeData) obj;
            boolean z = i2 == i;
            String str = qrCodeData.f10654a;
            String str2 = qrCodeData.b;
            QRValidationType qrValidationType = qrCodeData.d;
            Intrinsics.i(qrValidationType, "qrValidationType");
            arrayList.add(new QrCodeData(str, str2, z, qrValidationType));
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:35:0x00cb, B:37:0x00cf, B:38:0x00d4), top: B:44:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(QRValidationComponent qRValidationComponent, AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ProductValidationConfig productValidationConfig, ContinuationImpl continuationImpl) {
        QRValidationComponent$showValidationSuccess$1 qRValidationComponent$showValidationSuccess$1;
        Mutex mutex;
        ProductValidationData productValidationData2;
        ProductReceiptData productReceiptData;
        Job job;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$showValidationSuccess$1) {
            qRValidationComponent$showValidationSuccess$1 = (QRValidationComponent$showValidationSuccess$1) continuationImpl;
            int i = qRValidationComponent$showValidationSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$showValidationSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$showValidationSuccess$1 = new QRValidationComponent$showValidationSuccess$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$showValidationSuccess$1 = new QRValidationComponent$showValidationSuccess$1(qRValidationComponent, continuationImpl);
        }
        Object objF = qRValidationComponent$showValidationSuccess$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$showValidationSuccess$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objF);
            qRValidationComponent$showValidationSuccess$1.L$0 = punchNotification;
            qRValidationComponent$showValidationSuccess$1.L$1 = productValidationData;
            qRValidationComponent$showValidationSuccess$1.label = 1;
            objF = productValidationConfig.f(punchNotification, productValidationData, qRValidationComponent$showValidationSuccess$1);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            productValidationData = (ProductValidationData) qRValidationComponent$showValidationSuccess$1.L$1;
            punchNotification = (AppNotification.PunchNotification) qRValidationComponent$showValidationSuccess$1.L$0;
            ResultKt.b(objF);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) qRValidationComponent$showValidationSuccess$1.L$2;
            productReceiptData = (ProductReceiptData) qRValidationComponent$showValidationSuccess$1.L$1;
            productValidationData2 = (ProductValidationData) qRValidationComponent$showValidationSuccess$1.L$0;
            ResultKt.b(objF);
        }
        try {
            job = qRValidationComponent.K;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            qRValidationComponent.E0(new lu0(20, productValidationData2, productReceiptData));
            return unit;
        } finally {
            mutex.e(null);
        }
        ProductReceiptData productReceiptData2 = (ProductReceiptData) objF;
        if (productReceiptData2 == null) {
            qRValidationComponent.P0().D(punchNotification, Source.QR_VALIDATION_FRAGMENT.getSourceName());
            Job job2 = qRValidationComponent.K;
            if (job2 != null && ((AbstractCoroutine) job2).isActive()) {
                return unit;
            }
            Job job3 = qRValidationComponent.K;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
            }
            qRValidationComponent.K = qRValidationComponent.D0(new QRValidationComponent$startQrLifecycle$1(productValidationData, qRValidationComponent, null));
            return unit;
        }
        qRValidationComponent.P0().r(productReceiptData2, Source.QR_VALIDATION_FRAGMENT.getSourceName());
        String message = "receipt data " + productReceiptData2;
        Intrinsics.i(message, "message");
        mutex = qRValidationComponent.M;
        qRValidationComponent$showValidationSuccess$1.L$0 = productValidationData;
        qRValidationComponent$showValidationSuccess$1.L$1 = productReceiptData2;
        qRValidationComponent$showValidationSuccess$1.L$2 = mutex;
        qRValidationComponent$showValidationSuccess$1.label = 2;
        if (mutex.a(qRValidationComponent$showValidationSuccess$1) != obj) {
            productValidationData2 = productValidationData;
            productReceiptData = productReceiptData2;
            job = qRValidationComponent.K;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            qRValidationComponent.E0(new lu0(20, productValidationData2, productReceiptData));
            return unit;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object M0(QRValidationComponent qRValidationComponent, QRValidationLifecycleResult qRValidationLifecycleResult, ContinuationImpl continuationImpl) {
        QRValidationComponent$updateQrState$1 qRValidationComponent$updateQrState$1;
        Mutex mutex;
        qRValidationComponent.getClass();
        if (continuationImpl instanceof QRValidationComponent$updateQrState$1) {
            qRValidationComponent$updateQrState$1 = (QRValidationComponent$updateQrState$1) continuationImpl;
            int i = qRValidationComponent$updateQrState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$updateQrState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$updateQrState$1 = new QRValidationComponent$updateQrState$1(qRValidationComponent, continuationImpl);
            }
        } else {
            qRValidationComponent$updateQrState$1 = new QRValidationComponent$updateQrState$1(qRValidationComponent, continuationImpl);
        }
        Object obj = qRValidationComponent$updateQrState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$updateQrState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mutex = qRValidationComponent.M;
            qRValidationComponent$updateQrState$1.L$0 = qRValidationLifecycleResult;
            qRValidationComponent$updateQrState$1.L$1 = mutex;
            qRValidationComponent$updateQrState$1.label = 1;
            if (mutex.a(qRValidationComponent$updateQrState$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) qRValidationComponent$updateQrState$1.L$1;
            QRValidationLifecycleResult qRValidationLifecycleResult2 = (QRValidationLifecycleResult) qRValidationComponent$updateQrState$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            qRValidationLifecycleResult = qRValidationLifecycleResult2;
        }
        try {
            qRValidationComponent.E0(new lu0(19, qRValidationLifecycleResult, qRValidationComponent));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    public static void X0(QRValidationComponent qRValidationComponent, String str) {
        KotlinToastManagerKt.a(qRValidationComponent.B, str, ToastLength.SHORT);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N0(ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        QRValidationComponent$additionalInfo$1 qRValidationComponent$additionalInfo$1;
        List list;
        List list2;
        String str;
        List list3;
        if (continuationImpl instanceof QRValidationComponent$additionalInfo$1) {
            qRValidationComponent$additionalInfo$1 = (QRValidationComponent$additionalInfo$1) continuationImpl;
            int i = qRValidationComponent$additionalInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$additionalInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$additionalInfo$1 = new QRValidationComponent$additionalInfo$1(this, continuationImpl);
            }
        } else {
            qRValidationComponent$additionalInfo$1 = new QRValidationComponent$additionalInfo$1(this, continuationImpl);
        }
        Object obj = qRValidationComponent$additionalInfo$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$additionalInfo$1.label;
        if (i2 == 0) {
            ArrayList arrayListL = py.l(obj);
            qRValidationComponent$additionalInfo$1.L$0 = arrayListL;
            qRValidationComponent$additionalInfo$1.L$1 = arrayListL;
            qRValidationComponent$additionalInfo$1.label = 1;
            Object objT = productValidationData.t(qRValidationComponent$additionalInfo$1);
            if (objT != obj2) {
                list = arrayListL;
                obj = objT;
                list2 = list;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) qRValidationComponent$additionalInfo$1.L$1;
            list = (List) qRValidationComponent$additionalInfo$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) qRValidationComponent$additionalInfo$1.L$2;
            str = (String) qRValidationComponent$additionalInfo$1.L$1;
            list3 = (List) qRValidationComponent$additionalInfo$1.L$0;
            ResultKt.b(obj);
        }
        list2.add(QRValidationContractKt.a((String) obj, str));
        return list3;
        ProductDetailsDisplayData productDetailsDisplayData = (ProductDetailsDisplayData) obj;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData = productDetailsDisplayData.c;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData2 = productDetailsDisplayData.d;
        if (productDetailsDisplayFieldData != null && productDetailsDisplayFieldData.b.length() > 0) {
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData3 = productDetailsDisplayData.c;
            list2.add(QRValidationContractKt.a(productDetailsDisplayFieldData3.f10617a, productDetailsDisplayFieldData3.b));
        }
        if (productDetailsDisplayFieldData2 != null) {
            String str2 = productDetailsDisplayFieldData2.b;
            if (str2.length() > 0) {
                list2.add(QRValidationContractKt.a(productDetailsDisplayFieldData2.f10617a, str2));
            }
        }
        Map map = productDetailsDisplayData.g;
        if (map == null || map.entrySet().isEmpty()) {
            return list;
        }
        String strO = CollectionsKt.O(map.entrySet(), ", ", null, null, new kz0(4), 30);
        qRValidationComponent$additionalInfo$1.L$0 = list;
        qRValidationComponent$additionalInfo$1.L$1 = strO;
        qRValidationComponent$additionalInfo$1.L$2 = list2;
        qRValidationComponent$additionalInfo$1.label = 2;
        Object objB = this.s.b(StringEnum.TOTAL_TICKETS, new Object[0], qRValidationComponent$additionalInfo$1);
        if (objB != obj2) {
            str = strO;
            obj = objB;
            list3 = list;
            list2.add(QRValidationContractKt.a((String) obj, str));
            return list3;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0822  */
    /* JADX WARN: Code duplicated, block: B:112:0x0836  */
    /* JADX WARN: Code duplicated, block: B:114:0x083c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0860  */
    /* JADX WARN: Code duplicated, block: B:117:0x0862  */
    /* JADX WARN: Code duplicated, block: B:123:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x091c A[PHI: r1 r4 r5 r6 r7 r8 r9 r10 r11 r12 r13 r14 r35 r36 r37 r38
      0x091c: PHI (r1v55 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r1v35 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r1v56 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r4v19 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) = 
      (r4v16 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
      (r4v20 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r5v46 app.chalo.uistate.text.TextUIState) = (r5v41 app.chalo.uistate.text.TextUIState), (r5v48 app.chalo.uistate.text.TextUIState) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r6v18 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r6v14 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r6v19 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r7v12 app.chalo.providers.stringprovider.StringProvider) = (r7v9 app.chalo.providers.stringprovider.StringProvider), (r7v13 app.chalo.providers.stringprovider.StringProvider) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r8v37 app.chalo.uistate.branding.ProductBookingBrandingUIState) = 
      (r8v32 app.chalo.uistate.branding.ProductBookingBrandingUIState)
      (r8v39 app.chalo.uistate.branding.ProductBookingBrandingUIState)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r9v38 app.chalo.uistate.branding.ProductBookingBrandingUIState) = 
      (r9v33 app.chalo.uistate.branding.ProductBookingBrandingUIState)
      (r9v40 app.chalo.uistate.branding.ProductBookingBrandingUIState)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r10v20 java.util.List) = (r10v16 java.util.List), (r10v22 java.util.List) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r11v17 java.util.List) = (r11v12 java.util.List), (r11v18 java.util.List) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r12v34 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r12v29 kotlin.coroutines.intrinsics.CoroutineSingletons), (r12v35 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r13v24 app.chalo.uistate.base.ChaloColorToken$White) = (r13v19 app.chalo.uistate.base.ChaloColorToken$White), (r13v25 app.chalo.uistate.base.ChaloColorToken$White) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r14v33 app.chalo.uistate.toolbar.ToolbarUIState) = (r14v28 app.chalo.uistate.toolbar.ToolbarUIState), (r14v34 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r35v13 java.lang.String) = (r35v11 java.lang.String), (r35v14 java.lang.String) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r36v15 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor) = 
      (r36v12 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
      (r36v16 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r37v9 app.chalo.uistate.base.ChaloColorToken$OrangePrimary) = 
      (r37v6 app.chalo.uistate.base.ChaloColorToken$OrangePrimary)
      (r37v10 app.chalo.uistate.base.ChaloColorToken$OrangePrimary)
     binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]
      0x091c: PHI (r38v10 app.chalo.uistate.button.ButtonUIStateFactory) = (r38v7 app.chalo.uistate.button.ButtonUIStateFactory), (r38v11 app.chalo.uistate.button.ButtonUIStateFactory) binds: [B:125:0x08f7, B:130:0x091a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x0950  */
    /* JADX WARN: Code duplicated, block: B:138:0x0977  */
    /* JADX WARN: Code duplicated, block: B:141:0x097e  */
    /* JADX WARN: Code duplicated, block: B:142:0x099f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0a13  */
    /* JADX WARN: Code duplicated, block: B:160:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:163:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:166:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:172:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:173:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:177:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:180:0x0b67  */
    /* JADX WARN: Code duplicated, block: B:182:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:183:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:185:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:188:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:196:0x0cdc  */
    /* JADX WARN: Code duplicated, block: B:197:0x0cdf  */
    /* JADX WARN: Code duplicated, block: B:200:0x0d92  */
    /* JADX WARN: Code duplicated, block: B:201:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:204:0x0e38  */
    /* JADX WARN: Code duplicated, block: B:207:0x0e73  */
    /* JADX WARN: Code duplicated, block: B:209:0x0e7a  */
    /* JADX WARN: Code duplicated, block: B:212:0x0e92  */
    /* JADX WARN: Code duplicated, block: B:218:0x0ea3  */
    /* JADX WARN: Code duplicated, block: B:222:0x0eae  */
    /* JADX WARN: Code duplicated, block: B:225:0x0eec  */
    /* JADX WARN: Code duplicated, block: B:232:0x0f3b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0f69  */
    /* JADX WARN: Code duplicated, block: B:238:0x0f8f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0f9d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0fa0  */
    /* JADX WARN: Code duplicated, block: B:245:0x0fa3  */
    /* JADX WARN: Code duplicated, block: B:246:0x0fb0  */
    /* JADX WARN: Code duplicated, block: B:248:0x0fb6  */
    /* JADX WARN: Code duplicated, block: B:250:0x0fba  */
    /* JADX WARN: Code duplicated, block: B:251:0x0fd9  */
    /* JADX WARN: Code duplicated, block: B:253:0x0fe8  */
    /* JADX WARN: Code duplicated, block: B:255:0x0fec  */
    /* JADX WARN: Code duplicated, block: B:258:0x1037  */
    /* JADX WARN: Code duplicated, block: B:262:0x1084  */
    /* JADX WARN: Code duplicated, block: B:266:0x10cd  */
    /* JADX WARN: Code duplicated, block: B:270:0x1113  */
    /* JADX WARN: Code duplicated, block: B:272:0x1158  */
    /* JADX WARN: Code duplicated, block: B:276:0x0e9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x066b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0690 A[PHI: r1 r2 r5 r8
      0x0690: PHI (r1v1 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) = 
      (r1v0 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
      (r1v4 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
     binds: [B:54:0x066e, B:59:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0690: PHI (r2v8 boolean) = (r2v4 boolean), (r2v12 boolean) binds: [B:54:0x066e, B:59:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0690: PHI (r5v11 app.chalo.uistate.base.ChaloColorToken$White) = (r5v2 app.chalo.uistate.base.ChaloColorToken$White), (r5v14 app.chalo.uistate.base.ChaloColorToken$White) binds: [B:54:0x066e, B:59:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0690: PHI (r8v1 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r8v0 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r8v4 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:54:0x066e, B:59:0x0686] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0695  */
    /* JADX WARN: Code duplicated, block: B:71:0x06b1 A[PHI: r1 r5 r8 r9 r12
      0x06b1: PHI (r1v7 boolean) = (r1v3 boolean), (r1v10 boolean) binds: [B:63:0x0693, B:68:0x06ab] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r5v17 app.chalo.data.ProductBookingBranding) = (r5v13 app.chalo.data.ProductBookingBranding), (r5v20 app.chalo.data.ProductBookingBranding) binds: [B:63:0x0693, B:68:0x06ab] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r8v7 app.chalo.uistate.base.ChaloColorToken$White) = (r8v3 app.chalo.uistate.base.ChaloColorToken$White), (r8v10 app.chalo.uistate.base.ChaloColorToken$White) binds: [B:63:0x0693, B:68:0x06ab] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r9v11 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r9v5 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r9v14 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:63:0x0693, B:68:0x06ab] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r12v2 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState) = 
      (r12v1 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
      (r12v5 app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState)
     binds: [B:63:0x0693, B:68:0x06ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0714  */
    /* JADX WARN: Code duplicated, block: B:78:0x074e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0751  */
    /* JADX WARN: Code duplicated, block: B:83:0x076b  */
    /* JADX WARN: Code duplicated, block: B:87:0x078e  */
    /* JADX WARN: Code duplicated, block: B:91:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x07c6  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Iterative traversal limit reached: limit: 1345, visitor: jadx.core.dex.visitors.regions.IfRegionVisitor$RemoveRedundantElseVisitor, blocks count: 269
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:51)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:46)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object p0(app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState r79, kotlin.coroutines.jvm.internal.ContinuationImpl r80) {
        /*
            Method dump skipped, instruction units count: 4516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.p0(app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ProductValidationAnalyticManager P0() {
        return Q0().getB();
    }

    public final ProductValidationConfig Q0() {
        return (ProductValidationConfig) this.J.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r11 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$getProductValidityTimeString$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$getProductValidityTimeString$1 r0 = (app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$getProductValidityTimeString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$getProductValidityTimeString$1 r0 = new app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent$getProductValidityTimeString$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            app.chalo.providers.stringprovider.StringProvider r4 = r8.s
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L44
            if (r2 == r7) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L30
            kotlin.ResultKt.b(r11)
            return r11
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r11)
            goto L8a
        L3c:
            java.lang.Object r9 = r0.L$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9 = (app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) r9
            kotlin.ResultKt.b(r11)
            goto L58
        L44:
            kotlin.ResultKt.b(r11)
            if (r10 == 0) goto L81
            app.chalo.providers.stringprovider.StringEnum r10 = app.chalo.providers.stringprovider.StringEnum.MTICKET_BOOKING_VALID_TILL
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r0.L$0 = r9
            r0.label = r7
            java.lang.Object r11 = r4.b(r10, r11, r0)
            if (r11 != r1) goto L58
            goto L9c
        L58:
            long r9 = r9.p()
            r0 = 0
            r1 = 6
            app.chalo.utils.timeutil.TimeUtilsContract r2 = r8.t
            java.lang.String r9 = app.chalo.utils.timeutil.TimeUtilsContract.DefaultImpls.a(r2, r9, r0, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r11 = " "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = ","
            java.lang.String r11 = " on"
            java.lang.String r9 = kotlin.text.StringsKt.R(r9, r10, r11)
            return r9
        L81:
            r0.label = r6
            java.lang.Object r11 = r9.t(r0)
            if (r11 != r1) goto L8a
            goto L9c
        L8a:
            app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData r11 = (app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData) r11
            java.lang.String r9 = r11.f10616a
            app.chalo.providers.stringprovider.StringEnum r10 = app.chalo.providers.stringprovider.StringEnum.MTICKET_BANNER_VALID_TILL_X
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r3] = r9
            r0.label = r5
            java.lang.Object r9 = r4.b(r10, r11, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.R0(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0094 -> B:23:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object S0(java.util.List r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.S0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ae -> B:25:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:27:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object T0(java.util.List r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.T0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object U0(ProductBookingBranding productBookingBranding, ContinuationImpl continuationImpl) {
        QRValidationComponent$getTopProductBookingBrandingUIState$1 qRValidationComponent$getTopProductBookingBrandingUIState$1;
        AgencyBrandingImageUISpecs agencyBrandingImageUISpecs;
        ImageUrlUIState imageUrlUIState;
        if (continuationImpl instanceof QRValidationComponent$getTopProductBookingBrandingUIState$1) {
            qRValidationComponent$getTopProductBookingBrandingUIState$1 = (QRValidationComponent$getTopProductBookingBrandingUIState$1) continuationImpl;
            int i = qRValidationComponent$getTopProductBookingBrandingUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$getTopProductBookingBrandingUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$getTopProductBookingBrandingUIState$1 = new QRValidationComponent$getTopProductBookingBrandingUIState$1(this, continuationImpl);
            }
        } else {
            qRValidationComponent$getTopProductBookingBrandingUIState$1 = new QRValidationComponent$getTopProductBookingBrandingUIState$1(this, continuationImpl);
        }
        Object objB = qRValidationComponent$getTopProductBookingBrandingUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$getTopProductBookingBrandingUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (Intrinsics.d(productBookingBranding, ProductBookingBranding.None.INSTANCE) || (productBookingBranding instanceof ProductBookingBranding.AgencyBrandingText) || (productBookingBranding instanceof ProductBookingBranding.Ondc)) {
                return null;
            }
            if (!(productBookingBranding instanceof ProductBookingBranding.AgencyBranding)) {
                if (productBookingBranding instanceof ProductBookingBranding.AgencyBrandingResource) {
                    return new ProductBookingBrandingUIState.ImageResourceBrandingUIState(new ImageResourceBrandingUISpecs(new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14), null, 2), new ImageUIState(((ProductBookingBranding.AgencyBrandingResource) productBookingBranding).b, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                if (productBookingBranding instanceof ProductBookingBranding.AppResource) {
                    return new ProductBookingBrandingUIState.ImageResourceBrandingUIState(new ImageResourceBrandingUISpecs(new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14), null, 2), new ImageUIState(((ProductBookingBranding.AppResource) productBookingBranding).b, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                throw new NoWhenBranchMatchedException();
            }
            ImageUrlUIState imageUrlUIState2 = new ImageUrlUIState(((ProductBookingBranding.AgencyBranding) productBookingBranding).b, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().k), Dp.m7276boximpl(ChaloThemeHelper.a().u)), UIContentScale.Fit, null, 102);
            agencyBrandingImageUISpecs = new AgencyBrandingImageUISpecs(3);
            qRValidationComponent$getTopProductBookingBrandingUIState$1.L$0 = imageUrlUIState2;
            qRValidationComponent$getTopProductBookingBrandingUIState$1.L$1 = agencyBrandingImageUISpecs;
            qRValidationComponent$getTopProductBookingBrandingUIState$1.label = 1;
            objB = this.s.b(StringEnum.TICKET_ISSUED_BY, new Object[0], qRValidationComponent$getTopProductBookingBrandingUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUrlUIState = imageUrlUIState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            agencyBrandingImageUISpecs = (AgencyBrandingImageUISpecs) qRValidationComponent$getTopProductBookingBrandingUIState$1.L$1;
            imageUrlUIState = (ImageUrlUIState) qRValidationComponent$getTopProductBookingBrandingUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new ProductBookingBrandingUIState.AgencyBrandingUIState(agencyBrandingImageUISpecs, imageUrlUIState, new AgencyBrandingTextUISpecs(), new TextUIState.ChaloTextUIState((String) objB, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
    }

    public final ProductValidationUIManager V0() {
        return Q0().getD();
    }

    public final ValidationProduct W0() {
        return this.k.b.b;
    }

    public final void Y0(QRValidationIntent qRValidationIntent) {
        C0(qRValidationIntent);
        boolean z = qRValidationIntent instanceof QRValidationIntent.InitializationIntent;
        int i = 3;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleInitializationIntent$1(this, (QRValidationIntent.InitializationIntent) qRValidationIntent, null), 3);
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.ReportProblemIntent.f10645a)) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleReportProblemIntent$1(this, null), 3);
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.ViewTripReceipt.f10649a)) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleViewTripReceiptIntent$1(this, null), 3);
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.QRClickedIntent.f10644a)) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleQRClickedIntent$1(this, null), 3);
            return;
        }
        int i2 = 6;
        int i3 = 1;
        if (qRValidationIntent.equals(QRValidationIntent.SwitchToBLEBtnClickedIntent.f10646a)) {
            AnalyticsContract.DefaultImpls.a(P0(), "qr screen switch to BLE btn clicked", Source.QR_VALIDATION_FRAGMENT.getSourceName(), null, null, false, 28);
            ChaloNavigationManagerKt.e(this.r, new ValidationArgs.BleValidationScreenArgs(this.k.b, true), null, 6);
            return;
        }
        if (qRValidationIntent instanceof QRValidationIntent.OnQrSwiped) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleQrCodeSwiped$1(this, (QRValidationIntent.OnQrSwiped) qRValidationIntent, null), 3);
            return;
        }
        if (qRValidationIntent instanceof QRValidationIntent.OnTicketNumberClicked) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleOnTicketNumberClicked$1(this, (QRValidationIntent.OnTicketNumberClicked) qRValidationIntent, null), 3);
            return;
        }
        boolean z2 = false;
        int i4 = 2;
        if (qRValidationIntent.equals(QRValidationIntent.BackPressedIntent.f10636a)) {
            int i5 = WhenMappings.f10633a[((QRValidationDataState) this.f.getValue()).c.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = true;
            }
            E0(new kz0(5));
            if (z2) {
                q0(new mz0(this, i3));
                return;
            }
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.BottomSheetDismissIntent.f10637a)) {
            E0(new kz0(i));
            return;
        }
        if (qRValidationIntent instanceof QRValidationIntent.PunchEventReceivedIntent) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handlePunchEventReceivedIntent$1(this, (QRValidationIntent.PunchEventReceivedIntent) qRValidationIntent, null), 3);
            return;
        }
        if (qRValidationIntent instanceof QRValidationIntent.ValidationSuccessBottomSheetNegativeBtnClicked) {
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleValidationSuccessBottomSheetNegativeBtnClicked$1(this, (QRValidationIntent.ValidationSuccessBottomSheetNegativeBtnClicked) qRValidationIntent, null), 3);
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.ValidationSuccessBottomSheetPositiveBtnClicked.f10648a)) {
            E0(new kz0(i4));
            q0(new mz0(this, i2));
            return;
        }
        if (qRValidationIntent.equals(QRValidationIntent.OnBookingSupportClicked.f10639a)) {
            ProductValidationAnalyticManager productValidationAnalyticManagerP0 = P0();
            Source source = Source.STATIC_QR_SCREEN;
            ProductValidationData productValidationData = this.H;
            Pair pair = new Pair("productType", String.valueOf(productValidationData != null ? productValidationData.a() : null));
            ProductValidationData productValidationData2 = this.H;
            AnalyticsContractImplKt.b(productValidationAnalyticManagerP0, "qr validation screen help button clicked", source, MapsKt.i(pair, new Pair("productSubType", String.valueOf(productValidationData2 != null ? productValidationData2.b() : null))), false, 24);
            BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleOnBookingSupportClicked$1(this, null), 3);
            return;
        }
        if (!qRValidationIntent.equals(QRValidationIntent.OnViewJourneyClicked.f10642a)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductValidationAnalyticManager productValidationAnalyticManagerP1 = P0();
        Source source2 = Source.STATIC_QR_SCREEN;
        ProductValidationData productValidationData3 = this.H;
        Pair pair2 = new Pair("productType", String.valueOf(productValidationData3 != null ? productValidationData3.a() : null));
        ProductValidationData productValidationData4 = this.H;
        AnalyticsContractImplKt.b(productValidationAnalyticManagerP1, "qr validation screen view journey button clicked", source2, MapsKt.i(pair2, new Pair("productSubType", String.valueOf(productValidationData4 != null ? productValidationData4.b() : null))), false, 24);
        BuildersKt.d(contextScope, null, null, new QRValidationComponent$handleOnViewJourneyClicked$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object Z0(ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        QRValidationComponent$qrValidationTripDetails$1 qRValidationComponent$qrValidationTripDetails$1;
        RouteDetailsFieldData routeDetailsFieldData;
        ProductValidationData productValidationData2;
        boolean z;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState textUIState;
        TextUIState textUIState2;
        ImageUIState imageUIState2;
        TextUIState textUIState3;
        ProductValidationData productValidationData3 = productValidationData;
        if (continuationImpl instanceof QRValidationComponent$qrValidationTripDetails$1) {
            qRValidationComponent$qrValidationTripDetails$1 = (QRValidationComponent$qrValidationTripDetails$1) continuationImpl;
            int i = qRValidationComponent$qrValidationTripDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$qrValidationTripDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$qrValidationTripDetails$1 = new QRValidationComponent$qrValidationTripDetails$1(this, continuationImpl);
            }
        } else {
            qRValidationComponent$qrValidationTripDetails$1 = new QRValidationComponent$qrValidationTripDetails$1(this, continuationImpl);
        }
        Object objT = qRValidationComponent$qrValidationTripDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$qrValidationTripDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            qRValidationComponent$qrValidationTripDetails$1.L$0 = productValidationData3;
            qRValidationComponent$qrValidationTripDetails$1.label = 1;
            objT = productValidationData3.t(qRValidationComponent$qrValidationTripDetails$1);
            if (objT != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            productValidationData3 = (ProductValidationData) qRValidationComponent$qrValidationTripDetails$1.L$0;
            ResultKt.b(objT);
        } else {
            if (i2 == 2) {
                z = qRValidationComponent$qrValidationTripDetails$1.Z$0;
                routeDetailsFieldData = (RouteDetailsFieldData) qRValidationComponent$qrValidationTripDetails$1.L$1;
                productValidationData2 = (ProductValidationData) qRValidationComponent$qrValidationTripDetails$1.L$0;
                ResultKt.b(objT);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objT, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
                if (z) {
                    imageUIState = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                } else {
                    imageUIState = null;
                }
                ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
                chaloTextUIState2 = z ? new TextUIState.ChaloTextUIState(routeDetailsFieldData.e, UITextStyle.DisplaySmall, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
                String str = routeDetailsFieldData.f10621a;
                UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(str, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                chaloTextUIState4 = new TextUIState.ChaloTextUIState(routeDetailsFieldData.b, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                ProductValidationUIManager productValidationUIManagerV0 = V0();
                qRValidationComponent$qrValidationTripDetails$1.L$0 = imageUIState;
                qRValidationComponent$qrValidationTripDetails$1.L$1 = chaloTextUIState;
                qRValidationComponent$qrValidationTripDetails$1.L$2 = chaloTextUIState2;
                qRValidationComponent$qrValidationTripDetails$1.L$3 = chaloTextUIState4;
                qRValidationComponent$qrValidationTripDetails$1.L$4 = chaloTextUIState3;
                qRValidationComponent$qrValidationTripDetails$1.label = 3;
                objT = productValidationUIManagerV0.b(productValidationData2, qRValidationComponent$qrValidationTripDetails$1);
                if (objT != coroutineSingletons) {
                    textUIState = chaloTextUIState2;
                    textUIState2 = chaloTextUIState;
                    imageUIState2 = imageUIState;
                    textUIState3 = chaloTextUIState4;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState3 = (TextUIState) qRValidationComponent$qrValidationTripDetails$1.L$4;
            TextUIState textUIState4 = (TextUIState) qRValidationComponent$qrValidationTripDetails$1.L$3;
            TextUIState textUIState5 = (TextUIState) qRValidationComponent$qrValidationTripDetails$1.L$2;
            TextUIState textUIState6 = (TextUIState) qRValidationComponent$qrValidationTripDetails$1.L$1;
            ImageUIState imageUIState3 = (ImageUIState) qRValidationComponent$qrValidationTripDetails$1.L$0;
            ResultKt.b(objT);
            imageUIState2 = imageUIState3;
            textUIState3 = textUIState4;
            textUIState = textUIState5;
            textUIState2 = textUIState6;
        }
        return new ValidationTripDetailsUIState(textUIState2, imageUIState2, textUIState, chaloTextUIState3, textUIState3, (ValidationTicketStatusUIState) objT);
        routeDetailsFieldData = ((ProductDetailsDisplayData) objT).e;
        boolean zC = V0().c();
        if (routeDetailsFieldData == null) {
            return null;
        }
        qRValidationComponent$qrValidationTripDetails$1.L$0 = productValidationData3;
        qRValidationComponent$qrValidationTripDetails$1.L$1 = routeDetailsFieldData;
        qRValidationComponent$qrValidationTripDetails$1.Z$0 = zC;
        qRValidationComponent$qrValidationTripDetails$1.label = 2;
        Object objB = this.s.b(StringEnum.TITLE_TRIP_DETAILS, new Object[0], qRValidationComponent$qrValidationTripDetails$1);
        if (objB != coroutineSingletons) {
            productValidationData2 = productValidationData3;
            z = zC;
            objT = objB;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objT, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
            if (z) {
                imageUIState = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            } else {
                imageUIState = null;
            }
            ChaloColorToken.Black_87 black_88 = ChaloColorToken.Black_87.f9768a;
            if (z) {
            }
            String str2 = routeDetailsFieldData.f10621a;
            UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
            chaloTextUIState3 = new TextUIState.ChaloTextUIState(str2, uITextStyle2, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            chaloTextUIState4 = new TextUIState.ChaloTextUIState(routeDetailsFieldData.b, uITextStyle2, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            ProductValidationUIManager productValidationUIManagerV1 = V0();
            qRValidationComponent$qrValidationTripDetails$1.L$0 = imageUIState;
            qRValidationComponent$qrValidationTripDetails$1.L$1 = chaloTextUIState;
            qRValidationComponent$qrValidationTripDetails$1.L$2 = chaloTextUIState2;
            qRValidationComponent$qrValidationTripDetails$1.L$3 = chaloTextUIState4;
            qRValidationComponent$qrValidationTripDetails$1.L$4 = chaloTextUIState3;
            qRValidationComponent$qrValidationTripDetails$1.label = 3;
            objT = productValidationUIManagerV1.b(productValidationData2, qRValidationComponent$qrValidationTripDetails$1);
            if (objT != coroutineSingletons) {
                textUIState = chaloTextUIState2;
                textUIState2 = chaloTextUIState;
                imageUIState2 = imageUIState;
                textUIState3 = chaloTextUIState4;
                return new ValidationTripDetailsUIState(textUIState2, imageUIState2, textUIState, chaloTextUIState3, textUIState3, (ValidationTicketStatusUIState) objT);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r1 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(boolean r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent.a1(boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b1(QRValidationLifecycleResult qRValidationLifecycleResult, ContinuationImpl continuationImpl) {
        QRValidationComponent$updateStateForEmptyQrResult$1 qRValidationComponent$updateStateForEmptyQrResult$1;
        Mutex mutex;
        if (continuationImpl instanceof QRValidationComponent$updateStateForEmptyQrResult$1) {
            qRValidationComponent$updateStateForEmptyQrResult$1 = (QRValidationComponent$updateStateForEmptyQrResult$1) continuationImpl;
            int i = qRValidationComponent$updateStateForEmptyQrResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRValidationComponent$updateStateForEmptyQrResult$1.label = i - Integer.MIN_VALUE;
            } else {
                qRValidationComponent$updateStateForEmptyQrResult$1 = new QRValidationComponent$updateStateForEmptyQrResult$1(this, continuationImpl);
            }
        } else {
            qRValidationComponent$updateStateForEmptyQrResult$1 = new QRValidationComponent$updateStateForEmptyQrResult$1(this, continuationImpl);
        }
        Object obj = qRValidationComponent$updateStateForEmptyQrResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRValidationComponent$updateStateForEmptyQrResult$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            qRValidationComponent$updateStateForEmptyQrResult$1.L$0 = qRValidationLifecycleResult;
            mutex = this.M;
            qRValidationComponent$updateStateForEmptyQrResult$1.L$1 = mutex;
            qRValidationComponent$updateStateForEmptyQrResult$1.label = 1;
            if (mutex.a(qRValidationComponent$updateStateForEmptyQrResult$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) qRValidationComponent$updateStateForEmptyQrResult$1.L$1;
            QRValidationLifecycleResult qRValidationLifecycleResult2 = (QRValidationLifecycleResult) qRValidationComponent$updateStateForEmptyQrResult$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            qRValidationLifecycleResult = qRValidationLifecycleResult2;
        }
        try {
            E0(new vw0(qRValidationLifecycleResult, 11));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new QRValidationDataState(null, false, QRValidationScreenType.ZOOMED_QR, null, 0L, 0L, EmptyList.f17557a, null, null, null, false, false, null, QrScreenBottomSheetType.NONE, null, false, false);
    }
}
