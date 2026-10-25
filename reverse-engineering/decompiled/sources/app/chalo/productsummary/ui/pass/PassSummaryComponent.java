package app.chalo.productsummary.ui.pass;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCaseKt;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState;
import app.chalo.productsummary.domain.FetchProductInvoiceUseCase;
import app.chalo.productsummary.domain.GetRequestedBookedProductDataUseCase;
import app.chalo.productsummary.domain.PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.do0;
import defpackage.gf;
import defpackage.ym0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;", "Lapp/chalo/productsummary/ui/pass/PassSummaryDataState;", "Lapp/chalo/productsummary/ui/pass/PassSummaryViewState;", "Lapp/chalo/productsummary/ui/pass/PassSummarySideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassSummaryComponent extends ChaloBaseStateMviComponent<PassSummaryIntent, PassSummaryDataState, PassSummaryViewState, PassSummarySideEffect> {
    public final ComponentContext k;
    public final GetRequestedBookedProductDataUseCase l;
    public final StringProvider m;
    public final ActivateProductIfRequiredUseCase n;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase o;
    public final AnalyticsContract p;
    public final ValidationSceneResolverUseCase q;
    public final PassSummaryUIStateFactory r;
    public final KotlinToastManager s;
    public final ChaloNavigationManager t;
    public final FetchProductInvoiceUseCase u;
    public final SystemHelper v;
    public final PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase w;
    public Job x;

    public PassSummaryComponent(TripSummaryArgs.PassSummaryScreen passSummaryScreen, ComponentContext componentContext, GetRequestedBookedProductDataUseCase getRequestedBookedProductDataUseCase, StringProvider stringProvider, ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, AnalyticsContract analyticsContract, ValidationSceneResolverUseCase validationSceneResolverUseCase, PassSummaryUIStateFactory passSummaryUIStateFactory, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, FetchProductInvoiceUseCase fetchProductInvoiceUseCase, SystemHelper systemHelper, PremiumBusPassDownloadInvoiceOptionVisibilityStateUseCase premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase) {
        super(componentContext);
        this.k = componentContext;
        this.l = getRequestedBookedProductDataUseCase;
        this.m = stringProvider;
        this.n = activateProductIfRequiredUseCase;
        this.o = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.p = analyticsContract;
        this.q = validationSceneResolverUseCase;
        this.r = passSummaryUIStateFactory;
        this.s = kotlinToastManager;
        this.t = chaloNavigationManager;
        this.u = fetchProductInvoiceUseCase;
        this.v = systemHelper;
        this.w = premiumBusPassDownloadInvoiceOptionVisibilityStateUseCase;
        H0(new PassSummaryIntent.InitializationIntent(passSummaryScreen.d, passSummaryScreen.c));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0166, code lost:
    
        if (r3 == r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b0, code lost:
    
        if (r3 == r9) goto L71;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.productsummary.ui.pass.PassSummaryComponent r24, app.chalo.home.domain.ProductActivationFailureReason r25, app.chalo.home.domain.ChaloUserBookingType r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.pass.PassSummaryComponent.F0(app.chalo.productsummary.ui.pass.PassSummaryComponent, app.chalo.home.domain.ProductActivationFailureReason, app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object G0(PassSummaryComponent passSummaryComponent, ChaloUserBookingType chaloUserBookingType, ContinuationImpl continuationImpl) {
        PassSummaryComponent$startBleValidation$1 passSummaryComponent$startBleValidation$1;
        ValidationProduct validationProductD;
        char c;
        ChaloNavigationManager chaloNavigationManager;
        ChaloUserBookingType chaloUserBookingType2;
        String str;
        StateFlow stateFlow = passSummaryComponent.f;
        if (continuationImpl instanceof PassSummaryComponent$startBleValidation$1) {
            passSummaryComponent$startBleValidation$1 = (PassSummaryComponent$startBleValidation$1) continuationImpl;
            int i = passSummaryComponent$startBleValidation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSummaryComponent$startBleValidation$1.label = i - Integer.MIN_VALUE;
            } else {
                passSummaryComponent$startBleValidation$1 = new PassSummaryComponent$startBleValidation$1(passSummaryComponent, continuationImpl);
            }
        } else {
            passSummaryComponent$startBleValidation$1 = new PassSummaryComponent$startBleValidation$1(passSummaryComponent, continuationImpl);
        }
        Object objA = passSummaryComponent$startBleValidation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSummaryComponent$startBleValidation$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            passSummaryComponent.E0(new do0(15));
            validationProductD = GetAllRequestedBookedProductsUseCaseKt.d(chaloUserBookingType);
            if (validationProductD != null) {
                AnalyticsContract analyticsContract = passSummaryComponent.p;
                Source source = Source.PASS_SUMMARY_SCREEN;
                Pair pair = new Pair("bookingId", validationProductD.getC());
                ChaloUserBookingType chaloUserBookingType3 = ((PassSummaryDataState) stateFlow.getValue()).e;
                Pair pair2 = new Pair("productType", String.valueOf(chaloUserBookingType3 != null ? chaloUserBookingType3.b : null));
                ChaloUserBookingType chaloUserBookingType4 = ((PassSummaryDataState) stateFlow.getValue()).e;
                c = 0;
                AnalyticsContractImplKt.b(analyticsContract, "start product validation", source, MapsKt.i(pair, pair2, new Pair("productSubType", String.valueOf(chaloUserBookingType4 != null ? chaloUserBookingType4.c : null))), false, 24);
                GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase = passSummaryComponent.o;
                passSummaryComponent$startBleValidation$1.L$0 = validationProductD;
                passSummaryComponent$startBleValidation$1.label = 1;
                objA = getValidationProcessFlowDetailsForValidationProductUseCase.a(validationProductD, passSummaryComponent$startBleValidation$1);
                if (objA != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return Unit.f17538a;
        }
        if (i2 == 1) {
            validationProductD = (ValidationProduct) passSummaryComponent$startBleValidation$1.L$0;
            ResultKt.b(objA);
            c = 0;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloNavigationManager = (ChaloNavigationManager) passSummaryComponent$startBleValidation$1.L$0;
            ResultKt.b(objA);
            c = 0;
        }
        ChaloNavigationManagerKt.e(chaloNavigationManager, (SceneArgs) objA, null, 2);
        AnalyticsContract analyticsContract2 = passSummaryComponent.p;
        Source source2 = Source.PASS_SUMMARY_SCREEN;
        chaloUserBookingType2 = ((PassSummaryDataState) stateFlow.getValue()).e;
        if (chaloUserBookingType2 != null) {
            str = chaloUserBookingType2.b;
        } else {
            str = null;
        }
        Pair pair3 = new Pair("productType", String.valueOf(str));
        ChaloUserBookingType chaloUserBookingType5 = ((PassSummaryDataState) stateFlow.getValue()).e;
        Pair pair4 = new Pair("productSubType", String.valueOf(chaloUserBookingType5 != null ? chaloUserBookingType5.c : null));
        Pair[] pairArr = new Pair[2];
        pairArr[c] = pair3;
        pairArr[1] = pair4;
        AnalyticsContractImplKt.b(analyticsContract2, "validation product not found", source2, MapsKt.i(pairArr), false, 24);
        return Unit.f17538a;
        ChaloNavigationManager chaloNavigationManager2 = passSummaryComponent.t;
        ValidationSceneResolverUseCase validationSceneResolverUseCase = passSummaryComponent.q;
        BleValidationArgs bleValidationArgs = new BleValidationArgs(Source.PASS_SUMMARY_SCREEN, (ValidationProcessFlowDetails) objA, validationProductD);
        passSummaryComponent$startBleValidation$1.L$0 = chaloNavigationManager2;
        passSummaryComponent$startBleValidation$1.label = 2;
        validationSceneResolverUseCase.getClass();
        float f = PlatformFeature.f10436a;
        objA = validationSceneResolverUseCase.a(bleValidationArgs, passSummaryComponent$startBleValidation$1);
        if (objA != coroutineSingletons) {
            chaloNavigationManager = chaloNavigationManager2;
            ChaloNavigationManagerKt.e(chaloNavigationManager, (SceneArgs) objA, null, 2);
            AnalyticsContract analyticsContract3 = passSummaryComponent.p;
            Source source3 = Source.PASS_SUMMARY_SCREEN;
            chaloUserBookingType2 = ((PassSummaryDataState) stateFlow.getValue()).e;
            if (chaloUserBookingType2 != null) {
                str = chaloUserBookingType2.b;
            } else {
                str = null;
            }
            Pair pair5 = new Pair("productType", String.valueOf(str));
            ChaloUserBookingType chaloUserBookingType6 = ((PassSummaryDataState) stateFlow.getValue()).e;
            Pair pair6 = new Pair("productSubType", String.valueOf(chaloUserBookingType6 != null ? chaloUserBookingType6.c : null));
            Pair[] pairArr2 = new Pair[2];
            pairArr2[c] = pair5;
            pairArr2[1] = pair6;
            AnalyticsContractImplKt.b(analyticsContract3, "validation product not found", source3, MapsKt.i(pairArr2), false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    public final void H0(PassSummaryIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PassSummaryIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            PassSummaryIntent.InitializationIntent initializationIntent = (PassSummaryIntent.InitializationIntent) intent;
            Source source = initializationIntent.f8770a;
            BookingsRequestType bookingsRequestType = initializationIntent.b;
            AnalyticsContractImplKt.b(this.p, "pass summary screen opened", source, MapsKt.i(new Pair("passRequestType", bookingsRequestType.toString()), new Pair("passId", bookingsRequestType.f2317a)), false, 24);
            E0(new ym0(initializationIntent, 12));
            BuildersKt.d(contextScope, null, null, new PassSummaryComponent$createProductBookingTypeAndProceed$1(bookingsRequestType, this, null), 3);
            return;
        }
        if (intent instanceof PassSummaryIntent.OnBannerCtaClickIntent) {
            BuildersKt.d(contextScope, null, null, new PassSummaryComponent$handleOnBannerCtaClickIntent$1(this, (PassSummaryIntent.OnBannerCtaClickIntent) intent, null), 3);
            return;
        }
        PassSummaryIntent.OnFullScreenImageDismissBtnClickIntent onFullScreenImageDismissBtnClickIntent = PassSummaryIntent.OnFullScreenImageDismissBtnClickIntent.f8774a;
        if (intent.equals(onFullScreenImageDismissBtnClickIntent)) {
            AnalyticsContractImplKt.b(this.p, "full image cancel btn click", Source.PASS_SUMMARY_SCREEN, null, false, 28);
            E0(new do0(16));
            return;
        }
        if (intent instanceof PassSummaryIntent.OnImageClickIntent) {
            E0(new ym0((PassSummaryIntent.OnImageClickIntent) intent, 11));
            return;
        }
        if (intent.equals(PassSummaryIntent.OnErrorScreenActionBtnOnClick.f8773a)) {
            BuildersKt.d(contextScope, null, null, new PassSummaryComponent$createProductBookingTypeAndProceed$1(((PassSummaryDataState) this.f.getValue()).d, this, null), 3);
            return;
        }
        boolean z2 = intent instanceof PassSummaryIntent.OnViewTripHistoryClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.t;
        if (z2) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.RideReceiptScreen(Source.PASS_SUMMARY_SCREEN, ((PassSummaryIntent.OnViewTripHistoryClickedIntent) intent).f8776a), null, null, 6));
            return;
        }
        if (intent instanceof PassSummaryIntent.OnBackPressedIntent) {
            PassSummaryScreenType passSummaryScreenType = ((PassSummaryIntent.OnBackPressedIntent) intent).f8771a;
            if (!(passSummaryScreenType instanceof PassSummaryScreenType.Success) || ((PassSummaryScreenType.Success) passSummaryScreenType).b == null) {
                gf.u(null, chaloNavigationManager);
                return;
            } else {
                H0(onFullScreenImageDismissBtnClickIntent);
                return;
            }
        }
        if (!(intent instanceof PassSummaryIntent.DownloadInvoiceBtnClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        PassSummaryIntent.DownloadInvoiceBtnClicked downloadInvoiceBtnClicked = (PassSummaryIntent.DownloadInvoiceBtnClicked) intent;
        Job job = this.x;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            E0(new do0(14));
            this.x = BuildersKt.d(contextScope, null, null, new PassSummaryComponent$handleDownloadInvoiceBtnClicked$2(this, downloadInvoiceBtnClicked, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        PassSummaryComponent$convertToUiState$2 passSummaryComponent$convertToUiState$2 = new PassSummaryComponent$convertToUiState$2(1, this, PassSummaryComponent.class, "processIntent", "processIntent(Lapp/chalo/productsummary/ui/pass/PassSummaryIntent;)V", 0);
        return this.r.a((PassSummaryDataState) obj, passSummaryComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PassSummaryDataState(false, false, false, null, null, null, new DownloadInvoiceOptionVisibilityState(false, false), Source.UNKNOWN);
    }
}
