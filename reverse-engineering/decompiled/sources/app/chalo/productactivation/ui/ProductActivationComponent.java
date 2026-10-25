package app.chalo.productactivation.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.ActivationCheckSuccessRemarks;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.ProductActivationFailureReason;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator;
import app.chalo.metro.domain.GetMetroTicketByIdUseCase;
import app.chalo.models.LocationAppModel;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.GetOndcMetroTicketByIdUseCase;
import app.chalo.ondc.domain.GetOndcTicketByIdUseCase;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.productactivation.domain.GetActivationProductDataUseCase;
import app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase;
import app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import com.adjust.sdk.Constants;
import com.arkivanov.decompose.ComponentContext;
import defpackage.n8;
import defpackage.yw0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "Lapp/chalo/productactivation/ui/ProductActivationDataState;", "Lapp/chalo/productactivation/ui/ProductActivationUIState;", "Lapp/chalo/productactivation/ui/ProductActivationEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductActivationComponent extends ChaloBaseStateMviComponent<ProductActivationIntent, ProductActivationDataState, ProductActivationUIState, ProductActivationEffect> {
    public final CurrencyFeature A;
    public final ProductBookingDataStore B;
    public final InstantTicketConfigHelper C;
    public final GetOndcTicketByIdUseCase D;
    public final GetOndcMetroTicketByIdUseCase E;
    public final GetMetroTicketByIdUseCase F;
    public final ChaloTimeProvider G;
    public final SystemHelper H;
    public final ResolveQuickPayProductNameUseCase I;
    public final UserProfileDetailsProvider J;
    public final UserProfilingHooksOrchestrator K;
    public final GetPremiumReserveTicketByIdUseCase L;
    public Job M;
    public boolean N;
    public final GetActivationProductDataUseCase k;
    public final ChaloNavigationManager l;
    public final PermissionHandlerProvider m;
    public final CheckBluetoothPermissionHelper n;
    public final AnalyticsContract o;
    public final RunPreActivationChecksUseCase p;
    public final ActivateProductIfRequiredUseCase q;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase r;
    public final ValidationSceneResolverUseCase s;
    public final StringProvider t;
    public final GetActiveTitoTripsAndUpdateRestUseCase u;
    public final KotlinToastManager v;
    public final IReportProblemFeature w;
    public final ProductActivationUIStateBuilder x;
    public final ShouldCheckBLEPermissionForActivationUseCase y;
    public final ChaloLocationManager z;

    /* JADX INFO: renamed from: app.chalo.productactivation.ui.ProductActivationComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationComponent$1", f = "ProductActivationComponent.kt", l = {160, 161}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductActivationComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0049  */
        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            UserProfileAppModel userProfileAppModel;
            Gender gender;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                UserProfilingHooksOrchestrator userProfilingHooksOrchestrator = ProductActivationComponent.this.K;
                this.label = 1;
                obj = userProfilingHooksOrchestrator.a(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                ResultKt.b(obj);
            }
            userProfileAppModel = (UserProfileAppModel) obj;
            if (userProfileAppModel != null) {
                gender = userProfileAppModel.d;
            } else {
                gender = Gender.NULL;
            }
            ProductActivationComponent.this.E0(new n8(gender, z, 7));
            return Unit.f17538a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            UserProfileDetailsProvider userProfileDetailsProvider = ProductActivationComponent.this.J;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            Object objL = userProfileDetailsProvider.l(this);
            if (objL != coroutineSingletons) {
                z = zBooleanValue;
                obj = objL;
                userProfileAppModel = (UserProfileAppModel) obj;
                if (userProfileAppModel != null) {
                    gender = userProfileAppModel.d;
                } else {
                    gender = Gender.NULL;
                }
                ProductActivationComponent.this.E0(new n8(gender, z, 7));
                return Unit.f17538a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationComponent$Companion;", "", "", "PASS_ACTIVATION_SOURCE_NAME", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8025a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ActivationCheckSuccessRemarks.values().length];
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_POSSIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_ACTIVATION_ALREADY_DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivationCheckSuccessRemarks.PRODUCT_TAPPED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8025a = iArr;
            int[] iArr2 = new int[ProductValidationType.values().length];
            try {
                iArr2[ProductValidationType.VEHICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProductValidationType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProductValidationType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public ProductActivationComponent(ComponentContext componentContext, ProductActivationArgs productActivationArgs, GetActivationProductDataUseCase getActivationProductDataUseCase, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, CheckBluetoothPermissionHelper checkBluetoothPermissionHelper, AnalyticsContract analyticsContract, RunPreActivationChecksUseCase runPreActivationChecksUseCase, ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, ValidationSceneResolverUseCase validationSceneResolverUseCase, StringProvider stringProvider, GetActiveTitoTripsAndUpdateRestUseCase getActiveTitoTripsAndUpdateRestUseCase, KotlinToastManager kotlinToastManager, IReportProblemFeature iReportProblemFeature, ProductActivationUIStateBuilder productActivationUIStateBuilder, ShouldCheckBLEPermissionForActivationUseCase shouldCheckBLEPermissionForActivationUseCase, ChaloLocationManager chaloLocationManager, CurrencyFeature currencyFeature, ProductBookingDataStore productBookingDataStore, InstantTicketConfigHelper instantTicketConfigHelper, GetOndcTicketByIdUseCase getOndcTicketByIdUseCase, GetOndcMetroTicketByIdUseCase getOndcMetroTicketByIdUseCase, GetMetroTicketByIdUseCase getMetroTicketByIdUseCase, ChaloTimeProvider chaloTimeProvider, SystemHelper systemHelper, ResolveQuickPayProductNameUseCase resolveQuickPayProductNameUseCase, UserProfileDetailsProvider userProfileDetailsProvider, UserProfilingHooksOrchestrator userProfilingHooksOrchestrator, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase) {
        Object objB;
        BannerUiDataAppModel bannerUiDataAppModel;
        Object objB2;
        PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome;
        super(componentContext);
        this.k = getActivationProductDataUseCase;
        this.l = chaloNavigationManager;
        this.m = permissionHandlerProvider;
        this.n = checkBluetoothPermissionHelper;
        this.o = analyticsContract;
        this.p = runPreActivationChecksUseCase;
        this.q = activateProductIfRequiredUseCase;
        this.r = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.s = validationSceneResolverUseCase;
        this.t = stringProvider;
        this.u = getActiveTitoTripsAndUpdateRestUseCase;
        this.v = kotlinToastManager;
        this.w = iReportProblemFeature;
        this.x = productActivationUIStateBuilder;
        this.y = shouldCheckBLEPermissionForActivationUseCase;
        this.z = chaloLocationManager;
        this.A = currencyFeature;
        this.B = productBookingDataStore;
        this.C = instantTicketConfigHelper;
        this.D = getOndcTicketByIdUseCase;
        this.E = getOndcMetroTicketByIdUseCase;
        this.F = getMetroTicketByIdUseCase;
        this.G = chaloTimeProvider;
        this.H = systemHelper;
        this.I = resolveQuickPayProductNameUseCase;
        this.J = userProfileDetailsProvider;
        this.K = userProfilingHooksOrchestrator;
        this.L = getPremiumReserveTicketByIdUseCase;
        String str = productActivationArgs.i;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, BannerUiDataAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            bannerUiDataAppModel = (BannerUiDataAppModel) objB;
        } else {
            bannerUiDataAppModel = null;
        }
        String str2 = productActivationArgs.k;
        if (str2 != null) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str2, PremiumBusUpsellRideOutcome.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB2 = null;
            }
            premiumBusUpsellRideOutcome = (PremiumBusUpsellRideOutcome) objB2;
        } else {
            premiumBusUpsellRideOutcome = null;
        }
        R0(new ProductActivationIntent.InitializationIntent(productActivationArgs.b, productActivationArgs.c, productActivationArgs.d, productActivationArgs.f, productActivationArgs.g, productActivationArgs.h, productActivationArgs.e, bannerUiDataAppModel, productActivationArgs.j, premiumBusUpsellRideOutcome));
        D0(new AnonymousClass1(null));
    }

    public static final Object F0(ProductActivationComponent productActivationComponent, boolean z, ChaloUserBookingType.SuperPassBooking superPassBooking, SuperPassSubTypes superPassSubTypes, String str, int i, Continuation continuation) {
        BuildersKt.d(productActivationComponent.j, null, null, new ProductActivationComponent$completeRemainingMagicOrRideBasedPassActivationFlow$2(productActivationComponent, superPassBooking, null), 3);
        if (!z) {
            Object objV0 = productActivationComponent.V0(superPassBooking, (ContinuationImpl) continuation);
            if (objV0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objV0;
            }
        } else if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            MagicSuperPass magicSuperPass = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) superPassBooking).d;
            Object objO0 = productActivationComponent.O0(magicSuperPass.f9560a.f9566a, superPassSubTypes, str, i, magicSuperPass.f, (ContinuationImpl) continuation);
            if (objO0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objO0;
            }
        } else if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
            RideBasedSuperPass rideBasedSuperPass = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) superPassBooking).d;
            Object objO1 = productActivationComponent.O0(rideBasedSuperPass.f9560a.f9566a, superPassSubTypes, str, i, rideBasedSuperPass.i, (ContinuationImpl) continuation);
            if (objO1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objO1;
            }
        } else if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r11.U0(r13, r2) == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        if (r11.U0(r13, r2) == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
    
        if (r13 == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if (r13 == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ab, code lost:
    
        if (r13 == r3) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(final app.chalo.productactivation.ui.ProductActivationComponent r11, app.chalo.home.domain.ChaloUserBookingType r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationComponent.G0(app.chalo.productactivation.ui.ProductActivationComponent, app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(ProductActivationComponent productActivationComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        ProductActivationComponent$handleTappedInFlow$1 productActivationComponent$handleTappedInFlow$1;
        Object next;
        KotlinToastManager kotlinToastManager;
        productActivationComponent.getClass();
        if (continuationImpl instanceof ProductActivationComponent$handleTappedInFlow$1) {
            productActivationComponent$handleTappedInFlow$1 = (ProductActivationComponent$handleTappedInFlow$1) continuationImpl;
            int i = productActivationComponent$handleTappedInFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$handleTappedInFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$handleTappedInFlow$1 = new ProductActivationComponent$handleTappedInFlow$1(productActivationComponent, continuationImpl);
            }
        } else {
            productActivationComponent$handleTappedInFlow$1 = new ProductActivationComponent$handleTappedInFlow$1(productActivationComponent, continuationImpl);
        }
        Object objA = productActivationComponent$handleTappedInFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$handleTappedInFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetActiveTitoTripsAndUpdateRestUseCase getActiveTitoTripsAndUpdateRestUseCase = productActivationComponent.u;
            productActivationComponent$handleTappedInFlow$1.L$0 = chaloUserBookingType;
            productActivationComponent$handleTappedInFlow$1.label = 1;
            objA = getActiveTitoTripsAndUpdateRestUseCase.a(productActivationComponent$handleTappedInFlow$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            chaloUserBookingType = (ChaloUserBookingType) productActivationComponent$handleTappedInFlow$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) productActivationComponent$handleTappedInFlow$1.L$0;
            ResultKt.b(objA);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
        return Unit.f17538a;
        Iterator it = ((Iterable) objA).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((TITOValidationAppModel) next).c.f9668a, chaloUserBookingType.f2987a));
        TITOValidationAppModel tITOValidationAppModel = (TITOValidationAppModel) next;
        if (tITOValidationAppModel == null) {
            KotlinToastManager kotlinToastManager2 = productActivationComponent.v;
            productActivationComponent$handleTappedInFlow$1.L$0 = kotlinToastManager2;
            productActivationComponent$handleTappedInFlow$1.label = 2;
            objA = productActivationComponent.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], productActivationComponent$handleTappedInFlow$1);
            if (objA != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
            }
            return coroutineSingletons;
        }
        ChaloNavigationManagerKt.e(productActivationComponent.l, new TitoRideDetailsArgs(Source.PRODUCT_ACTIVATION_SCREEN, tITOValidationAppModel.f9672a.f9673a), null, 6);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object I0(ProductActivationComponent productActivationComponent, ChaloUserBookingType.SuperPassBooking superPassBooking, ContinuationImpl continuationImpl) {
        ProductActivationComponent$raisePassActivateClickedEvent$1 productActivationComponent$raisePassActivateClickedEvent$1;
        SuperPass superPass;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        productActivationComponent.getClass();
        if (continuationImpl instanceof ProductActivationComponent$raisePassActivateClickedEvent$1) {
            productActivationComponent$raisePassActivateClickedEvent$1 = (ProductActivationComponent$raisePassActivateClickedEvent$1) continuationImpl;
            int i = productActivationComponent$raisePassActivateClickedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$raisePassActivateClickedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$raisePassActivateClickedEvent$1 = new ProductActivationComponent$raisePassActivateClickedEvent$1(productActivationComponent, continuationImpl);
            }
        } else {
            productActivationComponent$raisePassActivateClickedEvent$1 = new ProductActivationComponent$raisePassActivateClickedEvent$1(productActivationComponent, continuationImpl);
        }
        Object objA = productActivationComponent$raisePassActivateClickedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$raisePassActivateClickedEvent$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) {
                superPass = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) superPassBooking).d;
            } else {
                if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking)) {
                    if ((superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
                        return unit;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                superPass = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) superPassBooking).d;
            }
            ChaloLocationManager chaloLocationManager = productActivationComponent.z;
            productActivationComponent$raisePassActivateClickedEvent$1.L$0 = superPass;
            productActivationComponent$raisePassActivateClickedEvent$1.label = 1;
            objA = chaloLocationManager.a(productActivationComponent$raisePassActivateClickedEvent$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            superPass = (SuperPass) productActivationComponent$raisePassActivateClickedEvent$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) productActivationComponent$raisePassActivateClickedEvent$1.L$3;
            String str4 = (String) productActivationComponent$raisePassActivateClickedEvent$1.L$2;
            AnalyticsContract analyticsContract2 = (AnalyticsContract) productActivationComponent$raisePassActivateClickedEvent$1.L$1;
            Map map2 = (Map) productActivationComponent$raisePassActivateClickedEvent$1.L$0;
            ResultKt.b(objA);
            str2 = str3;
            str = str4;
            map = map2;
            analyticsContract = analyticsContract2;
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return unit;
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        AnalyticsContract analyticsContract3 = productActivationComponent.o;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("passId", superPass.f9560a.f9566a));
        if (locationAppModelA != null) {
            linkedHashMapK.put("lat", String.valueOf(locationAppModelA.f5586a));
            linkedHashMapK.put(Constants.LONG, String.valueOf(locationAppModelA.b));
        }
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        productActivationComponent$raisePassActivateClickedEvent$1.L$0 = linkedHashMapK;
        productActivationComponent$raisePassActivateClickedEvent$1.L$1 = analyticsContract3;
        productActivationComponent$raisePassActivateClickedEvent$1.L$2 = "activation button clicked";
        productActivationComponent$raisePassActivateClickedEvent$1.L$3 = "Activate Super pass Screen";
        productActivationComponent$raisePassActivateClickedEvent$1.label = 2;
        if (mixpanelUtil.c(linkedHashMapK, superPass, productActivationComponent$raisePassActivateClickedEvent$1) != coroutineSingletons) {
            analyticsContract = analyticsContract3;
            map = linkedHashMapK;
            str = "activation button clicked";
            str2 = "Activate Super pass Screen";
            AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
            return unit;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c9  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r3 == r5) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.productactivation.ui.ProductActivationComponent r30, java.lang.String r31, app.chalo.models.validation.ValidationProduct r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationComponent.J0(app.chalo.productactivation.ui.ProductActivationComponent, java.lang.String, app.chalo.models.validation.ValidationProduct, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object K0(ProductActivationComponent productActivationComponent, ActivationProductData activationProductData, ContinuationImpl continuationImpl) {
        ProductActivationComponent$raiseScreenOpenEvent$1 productActivationComponent$raiseScreenOpenEvent$1;
        String sourceName;
        String str;
        ProductActivationComponent productActivationComponent2;
        long j;
        String str2;
        String str3;
        String str4;
        StateFlow stateFlow = productActivationComponent.f;
        CurrencyFeature currencyFeature = productActivationComponent.A;
        if (continuationImpl instanceof ProductActivationComponent$raiseScreenOpenEvent$1) {
            productActivationComponent$raiseScreenOpenEvent$1 = (ProductActivationComponent$raiseScreenOpenEvent$1) continuationImpl;
            int i = productActivationComponent$raiseScreenOpenEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$raiseScreenOpenEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$raiseScreenOpenEvent$1 = new ProductActivationComponent$raiseScreenOpenEvent$1(productActivationComponent, continuationImpl);
            }
        } else {
            productActivationComponent$raiseScreenOpenEvent$1 = new ProductActivationComponent$raiseScreenOpenEvent$1(productActivationComponent, continuationImpl);
        }
        Object obj = productActivationComponent$raiseScreenOpenEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$raiseScreenOpenEvent$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (productActivationComponent.N) {
                return unit;
            }
            productActivationComponent.N = true;
            if ((activationProductData instanceof ActivationProductData.PassActivation.Magic) || (activationProductData instanceof ActivationProductData.PassActivation.RideBased)) {
                return unit;
            }
            if (activationProductData instanceof ActivationProductData.InstantTicketActivation) {
                InstantTicketAppModel instantTicketAppModel = ((ActivationProductData.InstantTicketActivation) activationProductData).f7993a;
                String str5 = instantTicketAppModel.f3881a;
                Long l = instantTicketAppModel.k;
                productActivationComponent.S0(l != null ? l.longValue() : 0L, "mobileTicket", "instantTicket", str5, currencyFeature.a(instantTicketAppModel.e, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), instantTicketAppModel.c);
                return unit;
            }
            if (!(activationProductData instanceof ActivationProductData.QuickPayActivation)) {
                if (activationProductData instanceof ActivationProductData.MobileTicketActivation) {
                    AnalyticsContract analyticsContract = productActivationComponent.o;
                    Source source = ((ProductActivationDataState) stateFlow.getValue()).f;
                    if (source == null || (sourceName = source.getSourceName()) == null) {
                        sourceName = Source.ACTIVATE_MTICKET_SCREEN.getSourceName();
                    }
                    AnalyticsContract.DefaultImpls.a(analyticsContract, "mticket activate screen opened", sourceName, null, null, false, 28);
                    return unit;
                }
                if (!(activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation)) {
                    if ((activationProductData instanceof ActivationProductData.MetroTicketActivation) || (activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) || (activationProductData instanceof ActivationProductData.ONDCTicketActivation) || (activationProductData instanceof ActivationProductData.PremiumTicketActivation)) {
                        return unit;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = ((ActivationProductData.MultiModalGroupTicketActivation) activationProductData).f7996a;
                AnalyticsContract analyticsContract2 = productActivationComponent.o;
                Source source2 = ((ProductActivationDataState) stateFlow.getValue()).f;
                if (source2 == null) {
                    source2 = Source.PRODUCT_ACTIVATION_SCREEN;
                }
                Source source3 = source2;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("groupId", multiModalGroupTicketAppModel.f5874a);
                mapBuilder.put("fromStopId", multiModalGroupTicketAppModel.l.f5798a);
                mapBuilder.put("endStopId", multiModalGroupTicketAppModel.m.f5798a);
                mapBuilder.put("legsListSize", Integer.valueOf(multiModalGroupTicketAppModel.p.size()));
                AnalyticsContractImplKt.b(analyticsContract2, "group ticket activate screen opened", source3, mapBuilder.h(), false, 24);
                return unit;
            }
            QuickPayAppModel quickPayAppModel = ((ActivationProductData.QuickPayActivation) activationProductData).f8001a;
            str = quickPayAppModel.i;
            long j2 = quickPayAppModel.f;
            String strA = currencyFeature.a(quickPayAppModel.h, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            ResolveQuickPayProductNameUseCase resolveQuickPayProductNameUseCase = productActivationComponent.I;
            productActivationComponent$raiseScreenOpenEvent$1.L$0 = strA;
            productActivationComponent$raiseScreenOpenEvent$1.L$1 = str;
            productActivationComponent$raiseScreenOpenEvent$1.L$2 = "quickpay";
            productActivationComponent$raiseScreenOpenEvent$1.L$3 = "quickpay";
            productActivationComponent$raiseScreenOpenEvent$1.L$4 = productActivationComponent;
            productActivationComponent$raiseScreenOpenEvent$1.J$0 = j2;
            productActivationComponent$raiseScreenOpenEvent$1.label = 1;
            Object objA = resolveQuickPayProductNameUseCase.a(quickPayAppModel, productActivationComponent$raiseScreenOpenEvent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            productActivationComponent2 = productActivationComponent;
            j = j2;
            str2 = strA;
            str3 = "quickpay";
            str4 = str3;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = productActivationComponent$raiseScreenOpenEvent$1.J$0;
            ProductActivationComponent productActivationComponent3 = (ProductActivationComponent) productActivationComponent$raiseScreenOpenEvent$1.L$4;
            String str6 = (String) productActivationComponent$raiseScreenOpenEvent$1.L$3;
            String str7 = (String) productActivationComponent$raiseScreenOpenEvent$1.L$2;
            str = (String) productActivationComponent$raiseScreenOpenEvent$1.L$1;
            String str8 = (String) productActivationComponent$raiseScreenOpenEvent$1.L$0;
            ResultKt.b(obj);
            j = j3;
            productActivationComponent2 = productActivationComponent3;
            str3 = str6;
            str2 = str8;
            str4 = str7;
        }
        productActivationComponent2.S0(j, str3, str4, str, str2, (String) obj);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(ProductActivationComponent productActivationComponent, ActivationProductData activationProductData, ContinuationImpl continuationImpl) {
        ProductActivationComponent$raiseViewSummaryClicked$1 productActivationComponent$raiseViewSummaryClicked$1;
        AnalyticsContract analyticsContract;
        Map map;
        String str;
        String str2;
        productActivationComponent.getClass();
        if (continuationImpl instanceof ProductActivationComponent$raiseViewSummaryClicked$1) {
            productActivationComponent$raiseViewSummaryClicked$1 = (ProductActivationComponent$raiseViewSummaryClicked$1) continuationImpl;
            int i = productActivationComponent$raiseViewSummaryClicked$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$raiseViewSummaryClicked$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$raiseViewSummaryClicked$1 = new ProductActivationComponent$raiseViewSummaryClicked$1(productActivationComponent, continuationImpl);
            }
        } else {
            productActivationComponent$raiseViewSummaryClicked$1 = new ProductActivationComponent$raiseViewSummaryClicked$1(productActivationComponent, continuationImpl);
        }
        Object obj = productActivationComponent$raiseViewSummaryClicked$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$raiseViewSummaryClicked$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (activationProductData instanceof ActivationProductData.PassActivation) {
                AnalyticsContract analyticsContract2 = productActivationComponent.o;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
                SuperPass superPass = ((ActivationProductData.PassActivation) activationProductData).f7999a;
                productActivationComponent$raiseViewSummaryClicked$1.L$0 = linkedHashMap;
                productActivationComponent$raiseViewSummaryClicked$1.L$1 = analyticsContract2;
                productActivationComponent$raiseViewSummaryClicked$1.L$2 = "super pass menu view summary clicked";
                productActivationComponent$raiseViewSummaryClicked$1.L$3 = "Activate Super pass Screen";
                productActivationComponent$raiseViewSummaryClicked$1.label = 1;
                if (mixpanelUtil.c(linkedHashMap, superPass, productActivationComponent$raiseViewSummaryClicked$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                analyticsContract = analyticsContract2;
                map = linkedHashMap;
                str = "super pass menu view summary clicked";
                str2 = "Activate Super pass Screen";
            } else if (!(activationProductData instanceof ActivationProductData.InstantTicketActivation) && !(activationProductData instanceof ActivationProductData.QuickPayActivation) && !(activationProductData instanceof ActivationProductData.MobileTicketActivation) && !(activationProductData instanceof ActivationProductData.MetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCMetroTicketActivation) && !(activationProductData instanceof ActivationProductData.ONDCTicketActivation) && !(activationProductData instanceof ActivationProductData.MultiModalGroupTicketActivation) && !(activationProductData instanceof ActivationProductData.PremiumTicketActivation)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) productActivationComponent$raiseViewSummaryClicked$1.L$3;
        String str4 = (String) productActivationComponent$raiseViewSummaryClicked$1.L$2;
        AnalyticsContract analyticsContract3 = (AnalyticsContract) productActivationComponent$raiseViewSummaryClicked$1.L$1;
        Map map2 = (Map) productActivationComponent$raiseViewSummaryClicked$1.L$0;
        ResultKt.b(obj);
        str2 = str3;
        str = str4;
        map = map2;
        analyticsContract = analyticsContract3;
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, map, null, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object M0(ProductActivationComponent productActivationComponent, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        ProductActivationComponent$requestBlePermissionIfRequired$1 productActivationComponent$requestBlePermissionIfRequired$1;
        productActivationComponent.getClass();
        if (continuationImpl instanceof ProductActivationComponent$requestBlePermissionIfRequired$1) {
            productActivationComponent$requestBlePermissionIfRequired$1 = (ProductActivationComponent$requestBlePermissionIfRequired$1) continuationImpl;
            int i = productActivationComponent$requestBlePermissionIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$requestBlePermissionIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$requestBlePermissionIfRequired$1 = new ProductActivationComponent$requestBlePermissionIfRequired$1(productActivationComponent, continuationImpl);
            }
        } else {
            productActivationComponent$requestBlePermissionIfRequired$1 = new ProductActivationComponent$requestBlePermissionIfRequired$1(productActivationComponent, continuationImpl);
        }
        Object objA = productActivationComponent$requestBlePermissionIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$requestBlePermissionIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ShouldCheckBLEPermissionForActivationUseCase shouldCheckBLEPermissionForActivationUseCase = productActivationComponent.y;
            productActivationComponent$requestBlePermissionIfRequired$1.L$0 = validationProduct;
            productActivationComponent$requestBlePermissionIfRequired$1.label = 1;
            objA = shouldCheckBLEPermissionForActivationUseCase.a(validationProduct, productActivationComponent$requestBlePermissionIfRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            validationProduct = (ValidationProduct) productActivationComponent$requestBlePermissionIfRequired$1.L$0;
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            Job job = productActivationComponent.M;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            productActivationComponent.M = BuildersKt.d(productActivationComponent.j, null, null, new ProductActivationComponent$requestBlePermissionIfRequired$2(validationProduct, productActivationComponent, null), 3);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r10 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(app.chalo.productactivation.ui.ProductActivationComponent r7, app.chalo.home.domain.ChaloUserBookingType r8, app.chalo.constants.Source r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof app.chalo.productactivation.ui.ProductActivationComponent$startBleValidation$1
            if (r0 == 0) goto L16
            r0 = r10
            app.chalo.productactivation.ui.ProductActivationComponent$startBleValidation$1 r0 = (app.chalo.productactivation.ui.ProductActivationComponent$startBleValidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.productactivation.ui.ProductActivationComponent$startBleValidation$1 r0 = new app.chalo.productactivation.ui.ProductActivationComponent$startBleValidation$1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.b(r10)
            goto L75
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r8 = r0.L$1
            app.chalo.models.validation.ValidationProduct r8 = (app.chalo.models.validation.ValidationProduct) r8
            java.lang.Object r9 = r0.L$0
            app.chalo.constants.Source r9 = (app.chalo.constants.Source) r9
            kotlin.ResultKt.b(r10)
            goto L5a
        L42:
            kotlin.ResultKt.b(r10)
            app.chalo.models.validation.ValidationProduct r8 = app.chalo.home.domain.GetAllRequestedBookedProductsUseCaseKt.d(r8)
            if (r8 == 0) goto L93
            app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase r10 = r7.r
            r0.L$0 = r9
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L5a
            goto L74
        L5a:
            app.chalo.models.validation.ValidationProcessFlowDetails r10 = (app.chalo.models.validation.ValidationProcessFlowDetails) r10
            app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase r2 = r7.s
            app.chalo.models.validation.BleValidationArgs r6 = new app.chalo.models.validation.BleValidationArgs
            r6.<init>(r9, r10, r8)
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            r2.getClass()
            float r8 = app.chalo.utils.PlatformFeature.f10436a
            java.lang.Object r10 = r2.a(r6, r0)
            if (r10 != r1) goto L75
        L74:
            return r1
        L75:
            app.chalo.scenes.args.ValidationArgs r10 = (app.chalo.scenes.args.ValidationArgs) r10
            app.chalo.scenes.ChaloNavigationManager r8 = r7.l
            app.chalo.scenes.args.HomeArgs r9 = new app.chalo.scenes.args.HomeArgs
            r0 = 7
            r9.<init>(r3, r3, r0)
            app.chalo.scenes.args.SceneArgs[] r0 = new app.chalo.scenes.args.SceneArgs[r4]
            r1 = 0
            r0[r1] = r9
            r0[r5] = r10
            app.chalo.scenes.ChaloNavigationManagerKt.b(r8, r0)
            yw0 r8 = new yw0
            r9 = 9
            r8.<init>(r9)
            r7.E0(r8)
        L93:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationComponent.N0(app.chalo.productactivation.ui.ProductActivationComponent, app.chalo.home.domain.ChaloUserBookingType, app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object O0(String str, SuperPassSubTypes superPassSubTypes, String str2, int i, SuperPassTripPreferences superPassTripPreferences, ContinuationImpl continuationImpl) {
        ProductActivationComponent$handleNavigationForPremiumBusPass$1 productActivationComponent$handleNavigationForPremiumBusPass$1;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        String str3 = str;
        if (continuationImpl instanceof ProductActivationComponent$handleNavigationForPremiumBusPass$1) {
            productActivationComponent$handleNavigationForPremiumBusPass$1 = (ProductActivationComponent$handleNavigationForPremiumBusPass$1) continuationImpl;
            int i2 = productActivationComponent$handleNavigationForPremiumBusPass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productActivationComponent$handleNavigationForPremiumBusPass$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productActivationComponent$handleNavigationForPremiumBusPass$1 = new ProductActivationComponent$handleNavigationForPremiumBusPass$1(this, continuationImpl);
            }
        } else {
            productActivationComponent$handleNavigationForPremiumBusPass$1 = new ProductActivationComponent$handleNavigationForPremiumBusPass$1(this, continuationImpl);
        }
        Object objB = productActivationComponent$handleNavigationForPremiumBusPass$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productActivationComponent$handleNavigationForPremiumBusPass$1.label;
        ChaloNavigationManager chaloNavigationManager = this.l;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(objB);
            String str4 = superPassTripPreferences.b;
            String str5 = superPassTripPreferences.d;
            String str6 = superPassTripPreferences.c;
            String str7 = superPassTripPreferences.e;
            if (str4 == null || str4.length() == 0 || str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PbBulkBookingRideDetailsArgs(i, superPassSubTypes, str3, str2), null, 6);
                return unit;
            }
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = new PBStopPlaceSelectedAppModel(str4, "searchPartnerChaloStop", str6, null, null, premiumBusSelectedLocationType);
            pBStopPlaceSelectedAppModel = new PBStopPlaceSelectedAppModel(str5, "searchPartnerChaloStop", str7, null, null, premiumBusSelectedLocationType);
            productActivationComponent$handleNavigationForPremiumBusPass$1.L$0 = str3;
            productActivationComponent$handleNavigationForPremiumBusPass$1.L$1 = pBStopPlaceSelectedAppModel3;
            productActivationComponent$handleNavigationForPremiumBusPass$1.L$2 = pBStopPlaceSelectedAppModel;
            productActivationComponent$handleNavigationForPremiumBusPass$1.label = 1;
            objB = this.G.b(productActivationComponent$handleNavigationForPremiumBusPass$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = (PBStopPlaceSelectedAppModel) productActivationComponent$handleNavigationForPremiumBusPass$1.L$2;
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) productActivationComponent$handleNavigationForPremiumBusPass$1.L$1;
            String str8 = (String) productActivationComponent$handleNavigationForPremiumBusPass$1.L$0;
            ResultKt.b(objB);
            pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel4;
            str3 = str8;
        }
        Long l = (Long) objB;
        PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass ticketPurchaseThroughPass = new PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass(str3, pBStopPlaceSelectedAppModel2, pBStopPlaceSelectedAppModel, l != null ? l.longValue() : this.H.j());
        Source source = Source.PRODUCT_ACTIVATION_SCREEN;
        Json json = ChaloJson.b;
        json.getClass();
        ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.SlotSelectionArgs(source, json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), ticketPurchaseThroughPass), null), null, 6);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01df, code lost:
    
        if (r9 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        if (r9 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r9 == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        if (r9 == r1) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(app.chalo.home.domain.ProductActivationFailureReason r7, app.chalo.home.domain.ChaloUserBookingType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationComponent.P0(app.chalo.home.domain.ProductActivationFailureReason, app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void Q0(String str) {
        this.l.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.StopSelectionArgs(str, false, false, Source.CHALO_BUS_SCREEN_TAB, (String) null, 18), null, null, 6));
    }

    public final void R0(ProductActivationIntent intent) {
        BookingsRequestType rideBasedPassType;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ProductActivationIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleInitializationIntent$1(this, (ProductActivationIntent.InitializationIntent) intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(ProductActivationIntent.ActivateClickedIntent.f8031a);
        ChaloNavigationManager chaloNavigationManager = this.l;
        StateFlow stateFlow = this.f;
        if (zEquals) {
            ProductActivationDataState productActivationDataState = (ProductActivationDataState) stateFlow.getValue();
            ValidationProduct validationProduct = productActivationDataState.f8029a;
            ActivationProductData activationProductData = productActivationDataState.b;
            if (validationProduct == null || activationProductData == null) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            } else {
                BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleActivateClickedIntent$1(activationProductData, this, null), 3);
                return;
            }
        }
        if (intent instanceof ProductActivationIntent.ConfirmActivationIntent) {
            E0(new yw0(13));
            BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleConfirmActivationIntent$2(this, (ProductActivationIntent.ConfirmActivationIntent) intent, null), 3);
            return;
        }
        if (intent instanceof ProductActivationIntent.BackToHomeScreenIntent) {
            ChaloNavigationManagerKt.e(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
            return;
        }
        if (intent.equals(ProductActivationIntent.DismissDialogIntent.f8035a)) {
            E0(new yw0(14));
            return;
        }
        if (intent.equals(ProductActivationIntent.BottomSheetNegativeButtonClickedIntent.f8033a)) {
            E0(new yw0(10));
            return;
        }
        if (intent instanceof ProductActivationIntent.ReportProblemClickedIntent) {
            BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleReportProblemClickedIntent$1(this, (ProductActivationIntent.ReportProblemClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(ProductActivationIntent.ViewSummaryIntent.f8043a)) {
            BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleViewSummaryIntent$1(this, null), 3);
            return;
        }
        if (!intent.equals(ProductActivationIntent.ViewRideReceiptIntent.f8042a)) {
            if (intent.equals(ProductActivationIntent.TrackUpsellRideClickedIntent.f8040a)) {
                PremiumReserveTicketAppModel premiumReserveTicketAppModel = ((ProductActivationDataState) stateFlow.getValue()).l;
                if (premiumReserveTicketAppModel == null) {
                    return;
                }
                PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = premiumReserveTicketAppModel.f7113a;
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusActivationArgs(Source.PRODUCT_ACTIVATION_SCREEN, premiumReserveTicketBookingPropertiesAppModel.f7114a, premiumReserveTicketBookingPropertiesAppModel.d, premiumReserveTicketBookingPropertiesAppModel.e, false), null, 6);
                return;
            }
            if (intent.equals(ProductActivationIntent.SetUpProfileBtnClickedIntent.f8039a)) {
                AnalyticsContract.DefaultImpls.a(this.o, "product activation setup profile click", "PRODUCT_ACTIVATION_SCREEN", null, null, false, 28);
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UserProfileFormArgs(Source.PRODUCT_ACTIVATION_SCREEN), null, null, 6));
                return;
            } else if (intent.equals(ProductActivationIntent.UserProfileBannerShownIntent.f8041a)) {
                AnalyticsContract.DefaultImpls.a(this.o, "product activation profile nudge shown", "PRODUCT_ACTIVATION_SCREEN", null, null, false, 28);
                return;
            } else {
                if (!intent.equals(ProductActivationIntent.RouteDetailsToggleClickedIntent.f8038a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new yw0(12));
                return;
            }
        }
        ActivationProductData activationProductData2 = ((ProductActivationDataState) stateFlow.getValue()).b;
        if (activationProductData2 == null) {
            return;
        }
        BuildersKt.d(contextScope, null, null, new ProductActivationComponent$raiseViewReceiptClicked$1(activationProductData2, this, null), 3);
        if (activationProductData2 instanceof ActivationProductData.PassActivation.Magic) {
            rideBasedPassType = new BookingsRequestType.MagicPassType(((ActivationProductData.PassActivation.Magic) activationProductData2).b.f9560a.f9566a);
        } else if (activationProductData2 instanceof ActivationProductData.PassActivation.RideBased) {
            rideBasedPassType = new BookingsRequestType.RideBasedPassType(((ActivationProductData.PassActivation.RideBased) activationProductData2).b.f9560a.f9566a);
        } else {
            if (!(activationProductData2 instanceof ActivationProductData.InstantTicketActivation) && !(activationProductData2 instanceof ActivationProductData.QuickPayActivation) && !(activationProductData2 instanceof ActivationProductData.MobileTicketActivation) && !(activationProductData2 instanceof ActivationProductData.MetroTicketActivation) && !(activationProductData2 instanceof ActivationProductData.ONDCMetroTicketActivation) && !(activationProductData2 instanceof ActivationProductData.ONDCTicketActivation) && !(activationProductData2 instanceof ActivationProductData.MultiModalGroupTicketActivation) && !(activationProductData2 instanceof ActivationProductData.PremiumTicketActivation)) {
                throw new NoWhenBranchMatchedException();
            }
            rideBasedPassType = null;
        }
        if (rideBasedPassType != null) {
            ChaloNavigationManagerKt.e(chaloNavigationManager, new TripSummaryArgs.RideReceiptScreen(Source.ACTIVATE_SUPER_PASS_FRAGMENT, rideBasedPassType.f2317a), null, 6);
        }
    }

    public final void S0(long j, String str, String str2, String str3, String str4, String str5) {
        AnalyticsContract.DefaultImpls.a(this.o, "activate merged flow screen opened", Source.ACTIVATE_MERGE_FLOW_FRAGMENT.getSourceName(), MapsKt.i(new Pair("productType", str), new Pair("productSubType", str2), new Pair("bookingId", str3), new Pair("expiry time", Long.valueOf(j)), new Pair("amount paid", str4), new Pair("productName", str5)), null, false, 24);
    }

    public final void T0(String str, String str2, ChaloUserBookingType chaloUserBookingType) {
        AnalyticsContract.DefaultImpls.a(this.o, "product activation failed", Source.PRODUCT_ACTIVATION_SCREEN.getSourceName(), MapsKt.k(new Pair("errorTitle", str), new Pair("attribute error reason", str2), new Pair("productType", chaloUserBookingType.b), new Pair("productSubType", chaloUserBookingType.c), new Pair("bookingId", chaloUserBookingType.f2987a)), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U0(SuperPass superPass, ContinuationImpl continuationImpl) {
        ProductActivationComponent$raiseSuperPassUpdatedEvent$1 productActivationComponent$raiseSuperPassUpdatedEvent$1;
        Source source;
        Map map;
        AnalyticsContract analyticsContract;
        String str;
        if (continuationImpl instanceof ProductActivationComponent$raiseSuperPassUpdatedEvent$1) {
            productActivationComponent$raiseSuperPassUpdatedEvent$1 = (ProductActivationComponent$raiseSuperPassUpdatedEvent$1) continuationImpl;
            int i = productActivationComponent$raiseSuperPassUpdatedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$raiseSuperPassUpdatedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$raiseSuperPassUpdatedEvent$1 = new ProductActivationComponent$raiseSuperPassUpdatedEvent$1(this, continuationImpl);
            }
        } else {
            productActivationComponent$raiseSuperPassUpdatedEvent$1 = new ProductActivationComponent$raiseSuperPassUpdatedEvent$1(this, continuationImpl);
        }
        Object obj = productActivationComponent$raiseSuperPassUpdatedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$raiseSuperPassUpdatedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Source source2 = Source.ACTIVATE_SUPER_PASS_FRAGMENT;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            productActivationComponent$raiseSuperPassUpdatedEvent$1.L$0 = linkedHashMap;
            AnalyticsContract analyticsContract2 = this.o;
            productActivationComponent$raiseSuperPassUpdatedEvent$1.L$1 = analyticsContract2;
            productActivationComponent$raiseSuperPassUpdatedEvent$1.L$2 = "super pass updated";
            productActivationComponent$raiseSuperPassUpdatedEvent$1.L$3 = source2;
            productActivationComponent$raiseSuperPassUpdatedEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMap, superPass, productActivationComponent$raiseSuperPassUpdatedEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            source = source2;
            map = linkedHashMap;
            analyticsContract = analyticsContract2;
            str = "super pass updated";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) productActivationComponent$raiseSuperPassUpdatedEvent$1.L$3;
            String str2 = (String) productActivationComponent$raiseSuperPassUpdatedEvent$1.L$2;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) productActivationComponent$raiseSuperPassUpdatedEvent$1.L$1;
            Map map2 = (Map) productActivationComponent$raiseSuperPassUpdatedEvent$1.L$0;
            ResultKt.b(obj);
            source = source3;
            map = map2;
            str = str2;
            analyticsContract = analyticsContract3;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object V0(ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        ProductActivationComponent$runPreActivationCheckAndProceed$1 productActivationComponent$runPreActivationCheckAndProceed$1;
        if (continuationImpl instanceof ProductActivationComponent$runPreActivationCheckAndProceed$1) {
            productActivationComponent$runPreActivationCheckAndProceed$1 = (ProductActivationComponent$runPreActivationCheckAndProceed$1) continuationImpl;
            int i = productActivationComponent$runPreActivationCheckAndProceed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationComponent$runPreActivationCheckAndProceed$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationComponent$runPreActivationCheckAndProceed$1 = new ProductActivationComponent$runPreActivationCheckAndProceed$1(this, continuationImpl);
            }
        } else {
            productActivationComponent$runPreActivationCheckAndProceed$1 = new ProductActivationComponent$runPreActivationCheckAndProceed$1(this, continuationImpl);
        }
        Object objC = productActivationComponent$runPreActivationCheckAndProceed$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationComponent$runPreActivationCheckAndProceed$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            productActivationComponent$runPreActivationCheckAndProceed$1.L$0 = chaloUserBookingType;
            productActivationComponent$runPreActivationCheckAndProceed$1.label = 1;
            objC = this.p.c(chaloUserBookingType, productActivationComponent$runPreActivationCheckAndProceed$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        chaloUserBookingType = (ChaloUserBookingType) productActivationComponent$runPreActivationCheckAndProceed$1.L$0;
        ResultKt.b(objC);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            ProductActivationFailureReason productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            productActivationComponent$runPreActivationCheckAndProceed$1.L$0 = null;
            productActivationComponent$runPreActivationCheckAndProceed$1.label = 2;
            if (P0(productActivationFailureReason, chaloUserBookingType, productActivationComponent$runPreActivationCheckAndProceed$1) == obj) {
                return obj;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.f8025a[((ActivationCheckSuccessRemarks) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
            ContextScope contextScope = this.j;
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    BuildersKt.d(contextScope, null, null, new ProductActivationComponent$runPreActivationCheckAndProceed$2(this, chaloUserBookingType, null), 3);
                    return unit;
                }
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, null, null, new ProductActivationComponent$runPreActivationCheckAndProceed$3(this, chaloUserBookingType, null), 3);
                return unit;
            }
            if ((chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking)) {
                E0(new yw0(11));
                return unit;
            }
            if ((chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking)) {
                BuildersKt.d(contextScope, null, null, new ProductActivationComponent$handleActivationFlow$2(this, chaloUserBookingType, null), 3);
                return unit;
            }
            if (!(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return unit;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        ProductActivationComponent$convertToUiState$2 productActivationComponent$convertToUiState$2 = new ProductActivationComponent$convertToUiState$2(1, this, ProductActivationComponent.class, "processIntent", "processIntent(Lapp/chalo/productactivation/ui/ProductActivationIntent;)V", 0);
        return this.x.a((ProductActivationDataState) obj, productActivationComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ProductActivationDataState(null, null, null, ProductBookingBranding.None.INSTANCE, false, null, null, null, Gender.NULL, false, null, null, false, false);
    }
}
