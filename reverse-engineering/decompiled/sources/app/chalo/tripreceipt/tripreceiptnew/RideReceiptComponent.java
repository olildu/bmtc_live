package app.chalo.tripreceipt.tripreceiptnew;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.home.domain.ActivateProductIfRequiredUseCase;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.GetCurrentCityAgencyNameUseCase;
import app.chalo.home.domain.ProductActivationFailureReason;
import app.chalo.home.domain.RunPreActivationChecksUseCase;
import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.features.DigitalTripReceiptFeature;
import app.chalo.tripreceipt.domain.FetchSuperPassBookingFromPassIdUseCase;
import app.chalo.tripreceipt.domain.FetchSuperPassTripHistoryDataUseCase;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.vw0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptIntent;", "Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptDataState;", "Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptViewState;", "Lapp/chalo/tripreceipt/tripreceiptnew/RideReceiptSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideReceiptComponent extends ChaloBaseStateMviComponent<RideReceiptIntent, RideReceiptDataState, RideReceiptViewState, RideReceiptSideEffect> {
    public final ComponentContext k;
    public final TimeUtilsContract l;
    public final StringProvider m;
    public final FetchSuperPassBookingFromPassIdUseCase n;
    public final FetchSuperPassTripHistoryDataUseCase o;
    public final RunPreActivationChecksUseCase p;
    public final ActivateProductIfRequiredUseCase q;
    public final GetValidationProcessFlowDetailsForValidationProductUseCase r;
    public final AnalyticsContract s;
    public final GetCurrentCityAgencyNameUseCase t;
    public final DigitalTripReceiptFeature u;
    public final ValidationSceneResolverUseCase v;
    public final SystemHelper w;
    public final KotlinToastManager x;
    public final ChaloNavigationManager y;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9737a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CtaClickedType.values().length];
            try {
                iArr[CtaClickedType.VIEW_SUMMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtaClickedType.USE_OR_TRACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtaClickedType.BOOK_AGAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CtaClickedType.USE_OR_TRACK_PREMIUM_BUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CtaClickedType.BANNER_CTA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9737a = iArr;
            int[] iArr2 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr2[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public RideReceiptComponent(TripSummaryArgs.RideReceiptScreen rideReceiptScreen, ComponentContext componentContext, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, FetchSuperPassBookingFromPassIdUseCase fetchSuperPassBookingFromPassIdUseCase, FetchSuperPassTripHistoryDataUseCase fetchSuperPassTripHistoryDataUseCase, RunPreActivationChecksUseCase runPreActivationChecksUseCase, ActivateProductIfRequiredUseCase activateProductIfRequiredUseCase, GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, AnalyticsContract analyticsContract, GetCurrentCityAgencyNameUseCase getCurrentCityAgencyNameUseCase, DigitalTripReceiptFeature digitalTripReceiptFeature, ValidationSceneResolverUseCase validationSceneResolverUseCase, SystemHelper systemHelper, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = componentContext;
        this.l = timeUtilsContract;
        this.m = stringProvider;
        this.n = fetchSuperPassBookingFromPassIdUseCase;
        this.o = fetchSuperPassTripHistoryDataUseCase;
        this.p = runPreActivationChecksUseCase;
        this.q = activateProductIfRequiredUseCase;
        this.r = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.s = analyticsContract;
        this.t = getCurrentCityAgencyNameUseCase;
        this.u = digitalTripReceiptFeature;
        this.v = validationSceneResolverUseCase;
        this.w = systemHelper;
        this.x = kotlinToastManager;
        this.y = chaloNavigationManager;
        String str = rideReceiptScreen.c;
        Source source = rideReceiptScreen.d;
        RideReceiptIntent.InitializationIntent initializationIntent = new RideReceiptIntent.InitializationIntent(source, str);
        C0(initializationIntent);
        AnalyticsContractImplKt.b(analyticsContract, "ride receipt screen opened", source, MapsKt.h(new Pair("passId", str)), false, 24);
        E0(new vw0(initializationIntent, 28));
        ContextScope contextScope = this.j;
        BuildersKt.d(contextScope, null, null, new RideReceiptComponent$handleInitializationIntent$2(this, initializationIntent, null), 3);
        BuildersKt.d(contextScope, null, null, new RideReceiptComponent$handleInitializationIntent$3(this, initializationIntent, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x0113  */
    /* JADX WARN: Code duplicated, block: B:30:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [app.chalo.tripreceipt.tripreceiptnew.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0143 -> B:31:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object p0(app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent.p0(app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:109:0x0563  */
    /* JADX WARN: Code duplicated, block: B:111:0x0594  */
    /* JADX WARN: Code duplicated, block: B:112:0x0598  */
    /* JADX WARN: Code duplicated, block: B:114:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x060f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0665  */
    /* JADX WARN: Code duplicated, block: B:122:0x066e  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x00cf A[PHI: r0 r1 r2 r4 r7 r9 r10 r11 r12 r14
      0x00cf: PHI (r0v26 java.lang.String) = (r0v17 java.lang.String), (r0v29 java.lang.String) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r1v28 java.lang.Object) = (r1v16 java.lang.Object), (r1v1 java.lang.Object) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r2v24 long) = (r2v16 long), (r2v29 long) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r4v33 java.lang.String) = (r4v25 java.lang.String), (r4v36 java.lang.String) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r7v18 long) = (r7v12 long), (r7v20 long) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r9v22 kotlin.jvm.functions.Function4) = (r9v11 kotlin.jvm.functions.Function4), (r9v25 kotlin.jvm.functions.Function4) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v10 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r10v2 kotlin.coroutines.intrinsics.CoroutineSingletons), (r10v16 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v22 app.chalo.tripreceipt.domain.SuperPassTripHistoryAppModel) = 
      (r11v11 app.chalo.tripreceipt.domain.SuperPassTripHistoryAppModel)
      (r11v25 app.chalo.tripreceipt.domain.SuperPassTripHistoryAppModel)
     binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r12v12 java.lang.String) = (r12v3 java.lang.String), (r12v15 java.lang.String) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r14v4 app.chalo.providers.stringprovider.StringProvider) = (r14v2 app.chalo.providers.stringprovider.StringProvider), (r14v0 app.chalo.providers.stringprovider.StringProvider) binds: [B:60:0x02f2, B:17:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0200  */
    /* JADX WARN: Code duplicated, block: B:45:0x020e  */
    /* JADX WARN: Code duplicated, block: B:48:0x022a  */
    /* JADX WARN: Code duplicated, block: B:52:0x023a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0242  */
    /* JADX WARN: Code duplicated, block: B:58:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x0379  */
    /* JADX WARN: Code duplicated, block: B:69:0x03de  */
    /* JADX WARN: Code duplicated, block: B:72:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0400  */
    /* JADX WARN: Code duplicated, block: B:81:0x0403  */
    /* JADX WARN: Code duplicated, block: B:82:0x0405  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:0x04ba A[PHI: r0 r4 r23 r47
      0x04ba: PHI (r0v36 long) = (r0v35 long), (r0v35 long), (r0v35 long), (r0v42 long) binds: [B:100:0x04cd, B:102:0x04d3, B:105:0x04d8, B:94:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r4v40 kotlin.coroutines.intrinsics.CoroutineSingletons) = 
      (r4v38 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r4v38 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r4v38 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r4v42 kotlin.coroutines.intrinsics.CoroutineSingletons)
     binds: [B:100:0x04cd, B:102:0x04d3, B:105:0x04d8, B:94:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r23v4 app.chalo.uistate.base.ChaloColorToken$ShadyGray) = 
      (r23v2 app.chalo.uistate.base.ChaloColorToken$ShadyGray)
      (r23v2 app.chalo.uistate.base.ChaloColorToken$ShadyGray)
      (r23v2 app.chalo.uistate.base.ChaloColorToken$ShadyGray)
      (r23v5 app.chalo.uistate.base.ChaloColorToken$ShadyGray)
     binds: [B:100:0x04cd, B:102:0x04d3, B:105:0x04d8, B:94:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x04ba: PHI (r47v2 java.lang.String) = (r47v1 java.lang.String), (r47v1 java.lang.String), (r47v1 java.lang.String), (r47v4 java.lang.String) binds: [B:100:0x04cd, B:102:0x04d3, B:105:0x04d8, B:94:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x04c7  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x025e, code lost:
    
        if (r1 == r6) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [app.chalo.uistate.base.ChaloColorToken, app.chalo.uistate.divider.DividerOrientation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(java.lang.String r46, app.chalo.tripreceipt.domain.SuperPassTripHistoryAppModel r47, java.lang.String r48, app.chalo.tripreceipt.tripreceiptnew.a r49, kotlin.coroutines.jvm.internal.ContinuationImpl r50) {
        /*
            Method dump skipped, instruction units count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent.G0(java.lang.String, app.chalo.tripreceipt.domain.SuperPassTripHistoryAppModel, java.lang.String, app.chalo.tripreceipt.tripreceiptnew.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(long j, long j2, ContinuationImpl continuationImpl) {
        RideReceiptComponent$getTicketStatusUiState$1 rideReceiptComponent$getTicketStatusUiState$1;
        BusTicketStatusSpec busTicketStatusSpec;
        BusTicketStatusSpec busTicketStatusSpec2;
        if (continuationImpl instanceof RideReceiptComponent$getTicketStatusUiState$1) {
            rideReceiptComponent$getTicketStatusUiState$1 = (RideReceiptComponent$getTicketStatusUiState$1) continuationImpl;
            int i = rideReceiptComponent$getTicketStatusUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideReceiptComponent$getTicketStatusUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                rideReceiptComponent$getTicketStatusUiState$1 = new RideReceiptComponent$getTicketStatusUiState$1(this, continuationImpl);
            }
        } else {
            rideReceiptComponent$getTicketStatusUiState$1 = new RideReceiptComponent$getTicketStatusUiState$1(this, continuationImpl);
        }
        Object obj = rideReceiptComponent$getTicketStatusUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideReceiptComponent$getTicketStatusUiState$1.label;
        ChaloColorToken.AmountAddedText amountAddedText = ChaloColorToken.AmountAddedText.f9758a;
        if (i2 != 0) {
            if (i2 == 1) {
                busTicketStatusSpec2 = (BusTicketStatusSpec) rideReceiptComponent$getTicketStatusUiState$1.L$0;
                ResultKt.b(obj);
                return new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            busTicketStatusSpec = (BusTicketStatusSpec) rideReceiptComponent$getTicketStatusUiState$1.L$0;
            ResultKt.b(obj);
            return new BusTicketStatusUiState(busTicketStatusSpec, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
        }
        ResultKt.b(obj);
        SystemHelper systemHelper = this.w;
        long j3 = systemHelper.j();
        StringProvider stringProvider = this.m;
        ChaloColorToken.GreenBase greenBase = ChaloColorToken.GreenBase.f9800a;
        if (j3 < j && j2 == -1) {
            BusTicketStatusSpec busTicketStatusSpec3 = new BusTicketStatusSpec(greenBase, 11);
            rideReceiptComponent$getTicketStatusUiState$1.L$0 = busTicketStatusSpec3;
            rideReceiptComponent$getTicketStatusUiState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.ACTIVE, new Object[0], rideReceiptComponent$getTicketStatusUiState$1);
            if (objB != coroutineSingletons) {
                busTicketStatusSpec2 = busTicketStatusSpec3;
                obj = objB;
                return new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
            }
        } else {
            if (systemHelper.j() <= j || j2 == -1) {
                return null;
            }
            BusTicketStatusSpec busTicketStatusSpec4 = new BusTicketStatusSpec(greenBase, 11);
            rideReceiptComponent$getTicketStatusUiState$1.L$0 = busTicketStatusSpec4;
            rideReceiptComponent$getTicketStatusUiState$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.COMPLETED, new Object[0], rideReceiptComponent$getTicketStatusUiState$1);
            if (objB2 != coroutineSingletons) {
                busTicketStatusSpec = busTicketStatusSpec4;
                obj = objB2;
                return new BusTicketStatusUiState(busTicketStatusSpec, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(ChaloUserBookingType.SuperPassBooking superPassBooking, ContinuationImpl continuationImpl) {
        RideReceiptComponent$handleProductActivation$1 rideReceiptComponent$handleProductActivation$1;
        ChaloUserBookingType chaloUserBookingType;
        if (continuationImpl instanceof RideReceiptComponent$handleProductActivation$1) {
            rideReceiptComponent$handleProductActivation$1 = (RideReceiptComponent$handleProductActivation$1) continuationImpl;
            int i = rideReceiptComponent$handleProductActivation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideReceiptComponent$handleProductActivation$1.label = i - Integer.MIN_VALUE;
            } else {
                rideReceiptComponent$handleProductActivation$1 = new RideReceiptComponent$handleProductActivation$1(this, continuationImpl);
            }
        } else {
            rideReceiptComponent$handleProductActivation$1 = new RideReceiptComponent$handleProductActivation$1(this, continuationImpl);
        }
        Object objD = rideReceiptComponent$handleProductActivation$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideReceiptComponent$handleProductActivation$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            rideReceiptComponent$handleProductActivation$1.L$0 = superPassBooking;
            rideReceiptComponent$handleProductActivation$1.label = 1;
            objD = this.q.d(superPassBooking, rideReceiptComponent$handleProductActivation$1);
            if (objD != obj) {
            }
            chaloUserBookingType = superPassBooking;
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objD);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return unit;
        }
        ChaloUserBookingType chaloUserBookingType2 = (ChaloUserBookingType) rideReceiptComponent$handleProductActivation$1.L$0;
        ResultKt.b(objD);
        chaloUserBookingType = chaloUserBookingType2;
        chaloUserBookingType = superPassBooking;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            ProductActivationFailureReason productActivationFailureReason = (ProductActivationFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
            rideReceiptComponent$handleProductActivation$1.L$0 = null;
            rideReceiptComponent$handleProductActivation$1.label = 2;
            if (J0(productActivationFailureReason, chaloUserBookingType, rideReceiptComponent$handleProductActivation$1) != obj) {
                return unit;
            }
            chaloUserBookingType = superPassBooking;
            return obj;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking)) {
            rideReceiptComponent$handleProductActivation$1.L$0 = null;
            rideReceiptComponent$handleProductActivation$1.label = 3;
            if (K0(chaloUserBookingType, rideReceiptComponent$handleProductActivation$1) == obj) {
                chaloUserBookingType = superPassBooking;
                return obj;
            }
        } else if (!(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.InstantTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MobileTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.QuickPayBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PremiumBusBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.OndcMetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MetroTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.PassRideBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking.MultiModalGroupTicketBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardRechargeBooking) && !(chaloUserBookingType instanceof ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking)) {
            throw new NoWhenBranchMatchedException();
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017e, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b2, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r3 == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01eb, code lost:
    
        if (r3 == r5) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(app.chalo.home.domain.ProductActivationFailureReason r18, app.chalo.home.domain.ChaloUserBookingType r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent.J0(app.chalo.home.domain.ProductActivationFailureReason, app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r14 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(app.chalo.home.domain.ChaloUserBookingType r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$startBleValidation$1
            if (r0 == 0) goto L13
            r0 = r14
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$startBleValidation$1 r0 = (app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$startBleValidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$startBleValidation$1 r0 = new app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent$startBleValidation$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r13 = r0.L$0
            app.chalo.scenes.ChaloNavigationManager r13 = (app.chalo.scenes.ChaloNavigationManager) r13
            kotlin.ResultKt.b(r14)
            goto Lb5
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            java.lang.Object r13 = r0.L$0
            app.chalo.models.validation.ValidationProduct r13 = (app.chalo.models.validation.ValidationProduct) r13
            kotlin.ResultKt.b(r14)
            goto L98
        L3f:
            kotlin.ResultKt.b(r14)
            x21 r14 = new x21
            r2 = 0
            r14.<init>(r2)
            r12.E0(r14)
            app.chalo.models.validation.ValidationProduct r14 = app.chalo.home.domain.GetAllRequestedBookedProductsUseCaseKt.d(r13)
            if (r14 == 0) goto Lbb
            app.chalo.constants.Source r7 = app.chalo.constants.Source.RIDE_RECEIPT_SCREEN
            java.lang.String r5 = r14.getC()
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r8 = "bookingId"
            r6.<init>(r8, r5)
            java.lang.String r5 = r13.b
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "productType"
            r8.<init>(r9, r5)
            java.lang.String r13 = r13.c
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r9 = "productSubType"
            r5.<init>(r9, r13)
            r13 = 3
            kotlin.Pair[] r13 = new kotlin.Pair[r13]
            r13[r2] = r6
            r13[r4] = r8
            r13[r3] = r5
            java.util.Map r8 = kotlin.collections.MapsKt.i(r13)
            r9 = 0
            r10 = 24
            app.chalo.analytics.contract.AnalyticsContract r5 = r12.s
            java.lang.String r6 = "start product validation"
            app.chalo.analytics.AnalyticsContractImplKt.b(r5, r6, r7, r8, r9, r10)
            r0.L$0 = r14
            r0.label = r4
            app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase r13 = r12.r
            java.lang.Object r13 = r13.a(r14, r0)
            if (r13 != r1) goto L95
            goto Lb4
        L95:
            r11 = r14
            r14 = r13
            r13 = r11
        L98:
            app.chalo.models.validation.ValidationProcessFlowDetails r14 = (app.chalo.models.validation.ValidationProcessFlowDetails) r14
            app.chalo.constants.Source r2 = app.chalo.constants.Source.RIDE_RECEIPT_SCREEN
            app.chalo.models.validation.BleValidationArgs r4 = new app.chalo.models.validation.BleValidationArgs
            r4.<init>(r2, r14, r13)
            app.chalo.scenes.ChaloNavigationManager r13 = r12.y
            r0.L$0 = r13
            r0.label = r3
            app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase r14 = r12.v
            r14.getClass()
            float r2 = app.chalo.utils.PlatformFeature.f10436a
            java.lang.Object r14 = r14.a(r4, r0)
            if (r14 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            app.chalo.scenes.args.SceneArgs r14 = (app.chalo.scenes.args.SceneArgs) r14
            r0 = 0
            app.chalo.scenes.ChaloNavigationManagerKt.e(r13, r14, r0, r3)
        Lbb:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tripreceipt.tripreceiptnew.RideReceiptComponent.K0(app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new RideReceiptDataState("", EmptyList.f17557a, false);
    }
}
