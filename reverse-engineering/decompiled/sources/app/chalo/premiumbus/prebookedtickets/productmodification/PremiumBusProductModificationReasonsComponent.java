package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.PremiumReserveTicketOptionAction;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotStatusType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.FetchPBAvailableSlotsUseCase;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase;
import app.chalo.premiumbus.managers.SeatSelectionResultStateManager;
import app.chalo.premiumbus.managers.SelectSeatsResult;
import app.chalo.premiumbus.prebookedtickets.domain.CancelPremiumReserveTicketUseCase;
import app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusProductsModificationReasonsListUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PremiumBusProductModificationArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.du0;
import defpackage.et0;
import defpackage.gt0;
import defpackage.ud;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsIntent;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsViewState;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsDataState;", "Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusProductModificationReasonsComponent extends ChaloBaseStateMviComponent<PremiumBusProductModificationReasonsIntent, PremiumBusProductModificationReasonsViewState, PremiumBusProductModificationReasonsViewState, PremiumBusProductModificationReasonsEffect> {
    public String A;
    public String B;
    public String C;
    public PremiumReserveTicketAppModel D;
    public PremiumBusProductModificationReasonAppModel E;
    public Job F;
    public Job G;
    public final CancelPremiumReserveTicketUseCase k;
    public final FetchPremiumBusProductsModificationReasonsListUseCase l;
    public final GetPremiumReserveTicketByIdUseCase m;
    public final AnalyticsContract n;
    public final StringProvider o;
    public final FetchPBAvailableSlotsUseCase p;
    public final FetchPBODPairsForGivenLocationsUseCase q;
    public final TimeUtilsContract r;
    public final CityProvider s;
    public final ReschedulePremiumReserveTicketUseCase t;
    public final KotlinToastManager u;
    public final ChaloNavigationManager v;
    public final GetTimeInMillisAfterXTimeUseCase w;
    public final SeatSelectionResultStateManager x;
    public final IUserPreferencesDataStore y;
    public final UserProfileDetailsProvider z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/productmodification/PremiumBusProductModificationReasonsComponent$Companion;", "", "", "PREMIUM_BUS_ROUTES_WEB_URL", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7335a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ProductModificationScreenType.values().length];
            try {
                iArr[ProductModificationScreenType.REASON_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7335a = iArr;
            int[] iArr2 = new int[PremiumBusSlotStatusType.values().length];
            try {
                iArr2[PremiumBusSlotStatusType.SOLD_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[PremiumBusSlotStatusType.FEW_SEATS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumBusSlotStatusType.CURRENTLY_BOOKED_SLOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public PremiumBusProductModificationReasonsComponent(PremiumBusProductModificationArgs premiumBusProductModificationArgs, ComponentContext componentContext, CancelPremiumReserveTicketUseCase cancelPremiumReserveTicketUseCase, FetchPremiumBusProductsModificationReasonsListUseCase fetchPremiumBusProductsModificationReasonsListUseCase, GetPremiumReserveTicketByIdUseCase getPremiumReserveTicketByIdUseCase, AnalyticsContract analyticsContract, StringProvider stringProvider, FetchPBAvailableSlotsUseCase fetchPBAvailableSlotsUseCase, FetchPBODPairsForGivenLocationsUseCase fetchPBODPairsForGivenLocationsUseCase, TimeUtilsContract timeUtilsContract, CityProvider cityProvider, ReschedulePremiumReserveTicketUseCase reschedulePremiumReserveTicketUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, SeatSelectionResultStateManager seatSelectionResultStateManager, IUserPreferencesDataStore iUserPreferencesDataStore, UserProfileDetailsProvider userProfileDetailsProvider) {
        super(componentContext);
        this.k = cancelPremiumReserveTicketUseCase;
        this.l = fetchPremiumBusProductsModificationReasonsListUseCase;
        this.m = getPremiumReserveTicketByIdUseCase;
        this.n = analyticsContract;
        this.o = stringProvider;
        this.p = fetchPBAvailableSlotsUseCase;
        this.q = fetchPBODPairsForGivenLocationsUseCase;
        this.r = timeUtilsContract;
        this.s = cityProvider;
        this.t = reschedulePremiumReserveTicketUseCase;
        this.u = kotlinToastManager;
        this.v = chaloNavigationManager;
        this.w = getTimeInMillisAfterXTimeUseCase;
        this.x = seatSelectionResultStateManager;
        this.y = iUserPreferencesDataStore;
        this.z = userProfileDetailsProvider;
        String str = premiumBusProductModificationArgs.b;
        String str2 = premiumBusProductModificationArgs.d;
        String str3 = premiumBusProductModificationArgs.e;
        N0(new PremiumBusProductModificationReasonsIntent.InitializationIntent(premiumBusProductModificationArgs.f, premiumBusProductModificationArgs.c, str, str2, str3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, String str, ContinuationImpl continuationImpl) {
        PremiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1 premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1;
        premiumBusProductModificationReasonsComponent.getClass();
        if (continuationImpl instanceof PremiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1) {
            premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1 = (PremiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1) continuationImpl;
            int i = premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1 = new PremiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1(premiumBusProductModificationReasonsComponent, continuationImpl);
            }
        } else {
            premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1 = new PremiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1(premiumBusProductModificationReasonsComponent, continuationImpl);
        }
        Object objV = premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = premiumBusProductModificationReasonsComponent.x.b(str);
            premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1.label = 1;
            objV = premiumBusProductModificationReasonsComponent.b.v(flowB, premiumBusProductModificationReasonsComponent$collectSeatSelectionResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((SelectSeatsResult) ((ResultStateData.Success) resultStateData).f9039a).f7278a;
        if (!list.isEmpty()) {
            premiumBusProductModificationReasonsComponent.E0(new ud(list, 17));
        }
        premiumBusProductModificationReasonsComponent.N0(PremiumBusProductModificationReasonsIntent.ConfirmSlotClickedIntent.f7342a);
        Job job = premiumBusProductModificationReasonsComponent.G;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        premiumBusProductModificationReasonsComponent.G = null;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r9 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r7, app.chalo.data.PremiumReserveTicketOptionAction r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchModificationReasons$1
            if (r0 == 0) goto L16
            r0 = r9
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchModificationReasons$1 r0 = (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchModificationReasons$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchModificationReasons$1 r0 = new app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchModificationReasons$1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.ResultKt.b(r9)
            goto L76
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r9)
            goto L50
        L3a:
            kotlin.ResultKt.b(r9)
            du0 r9 = new du0
            r9.<init>(r5)
            r7.E0(r9)
            app.chalo.premiumbus.prebookedtickets.domain.FetchPremiumBusProductsModificationReasonsListUseCase r9 = r7.l
            r0.label = r5
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L50
            goto L75
        L50:
            app.chalo.utils.ChaloUseCaseResult r9 = (app.chalo.utils.ChaloUseCaseResult) r9
            boolean r8 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r8 == 0) goto L81
            app.chalo.providers.stringprovider.StringProvider r8 = r7.o
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = (app.chalo.utils.ChaloUseCaseResult.Failure) r9
            java.lang.Object r9 = r9.f10418a
            app.chalo.premiumbus.prebookedtickets.domain.PremiumBusProductModificationReasonsFailureReason r9 = (app.chalo.premiumbus.prebookedtickets.domain.PremiumBusProductModificationReasonsFailureReason) r9
            int r9 = r9.getErrorCodes()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r3] = r6
            r0.label = r4
            java.lang.Object r9 = r8.b(r2, r9, r0)
            if (r9 != r1) goto L76
        L75:
            return r1
        L76:
            java.lang.String r9 = (java.lang.String) r9
            eu0 r8 = new eu0
            r8.<init>(r9, r3)
            r7.E0(r8)
            goto L91
        L81:
            boolean r8 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r8 == 0) goto L94
            yg r8 = new yg
            app.chalo.utils.ChaloUseCaseResult$Success r9 = (app.chalo.utils.ChaloUseCaseResult.Success) r9
            r0 = 17
            r8.<init>(r9, r0)
            r7.E0(r8)
        L91:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        L94:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.G0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent, app.chalo.data.PremiumReserveTicketOptionAction, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        if (r1 == r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0183, code lost:
    
        if (r1 == r5) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r33, app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel r34, app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.H0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent, app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel, app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r1 == r5) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01dd, code lost:
    
        if (r1 == r5) goto L88;
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
    public static final java.lang.Object I0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r16, java.lang.String r17, app.chalo.data.PremiumBusProductModificationReasonAppModel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.I0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent, java.lang.String, app.chalo.data.PremiumBusProductModificationReasonAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r5.M0(r6, r7, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent r5, java.lang.String r6, app.chalo.data.PremiumBusProductModificationReasonAppModel r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleRescheduleRideAction$1
            if (r0 == 0) goto L16
            r0 = r8
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleRescheduleRideAction$1 r0 = (app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleRescheduleRideAction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleRescheduleRideAction$1 r0 = new app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$handleRescheduleRideAction$1
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r6 = r0.L$0
            r7 = r6
            app.chalo.data.PremiumBusProductModificationReasonAppModel r7 = (app.chalo.data.PremiumBusProductModificationReasonAppModel) r7
            kotlin.ResultKt.b(r8)
            goto L52
        L3e:
            kotlin.ResultKt.b(r8)
            app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase r8 = r5.m
            kotlinx.coroutines.flow.Flow r6 = r8.a(r6)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.v(r6, r0)
            if (r8 != r1) goto L52
            goto L6f
        L52:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r8 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r8
            if (r8 == 0) goto L70
            gt0 r6 = new gt0
            r2 = 24
            r6.<init>(r2)
            r5.E0(r6)
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r6 = r8.f7113a
            java.lang.String r6 = r6.f7114a
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r5 = r5.M0(r6, r7, r0)
            if (r5 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.J0(app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent, java.lang.String, app.chalo.data.PremiumBusProductModificationReasonAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void K0(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, int i, boolean z) {
        premiumBusProductModificationReasonsComponent.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pbODPairListSize", Integer.valueOf(i));
        linkedHashMap.put("isRescheduledODFound", Boolean.valueOf(z));
        AnalyticsContract.DefaultImpls.a(premiumBusProductModificationReasonsComponent.n, "pb od pair fetch success", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), linkedHashMap, null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x052e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0531  */
    /* JADX WARN: Code duplicated, block: B:105:0x0538  */
    /* JADX WARN: Code duplicated, block: B:108:0x0541  */
    /* JADX WARN: Code duplicated, block: B:111:0x054f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0552  */
    /* JADX WARN: Code duplicated, block: B:115:0x0559  */
    /* JADX WARN: Code duplicated, block: B:118:0x0562  */
    /* JADX WARN: Code duplicated, block: B:121:0x0571  */
    /* JADX WARN: Code duplicated, block: B:122:0x0574  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:32:0x0201  */
    /* JADX WARN: Code duplicated, block: B:33:0x0214  */
    /* JADX WARN: Code duplicated, block: B:36:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x02af  */
    /* JADX WARN: Code duplicated, block: B:40:0x02be  */
    /* JADX WARN: Code duplicated, block: B:41:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x031d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0356  */
    /* JADX WARN: Code duplicated, block: B:50:0x0382  */
    /* JADX WARN: Code duplicated, block: B:52:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0387  */
    /* JADX WARN: Code duplicated, block: B:55:0x0399  */
    /* JADX WARN: Code duplicated, block: B:57:0x039f  */
    /* JADX WARN: Code duplicated, block: B:58:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x03df  */
    /* JADX WARN: Code duplicated, block: B:71:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x040e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0421 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0423  */
    /* JADX WARN: Code duplicated, block: B:79:0x042e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0439  */
    /* JADX WARN: Code duplicated, block: B:83:0x045c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0463  */
    /* JADX WARN: Code duplicated, block: B:88:0x0472  */
    /* JADX WARN: Code duplicated, block: B:89:0x0480  */
    /* JADX WARN: Code duplicated, block: B:92:0x048d  */
    /* JADX WARN: Code duplicated, block: B:94:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0518  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x04c4 -> B:96:0x04cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0518 -> B:97:0x050b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object L0(app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel r51, java.lang.String r52, app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel r53, kotlin.coroutines.jvm.internal.ContinuationImpl r54) {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent.L0(app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel, java.lang.String, app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object M0(String str, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel, ContinuationImpl continuationImpl) {
        PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1 premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1;
        KotlinToastManager kotlinToastManager;
        if (continuationImpl instanceof PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1) {
            premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1 = (PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1) continuationImpl;
            int i = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1 = new PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1(this, continuationImpl);
            }
        } else {
            premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1 = new PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1(this, continuationImpl);
        }
        Object objB = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            Job job = this.F;
            if (job != null && ((AbstractCoroutine) job).isActive()) {
                return unit;
            }
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = ((PremiumBusProductModificationReasonsViewState) this.f.getValue()).k;
            if (pBAvailableSlotsTripAppModel != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("selectedSlotTripId", pBAvailableSlotsTripAppModel.f);
                linkedHashMap.put("selectedSlotSeatAvailable", String.valueOf(pBAvailableSlotsTripAppModel.b()));
                linkedHashMap.put("selectedSlotTime", String.valueOf(pBAvailableSlotsTripAppModel.g));
                linkedHashMap.put("selectedSlotArrivalTime", String.valueOf(pBAvailableSlotsTripAppModel.h));
                linkedHashMap.put("selectedSlotRouteId", pBAvailableSlotsTripAppModel.b);
                AnalyticsContract.DefaultImpls.a(this.n, "pb slot selected by user", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), linkedHashMap, null, false, 24);
                E0(new du0(0));
                this.F = BuildersKt.d(this.j, null, null, new PremiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$3(this, str, pBAvailableSlotsTripAppModel, premiumBusProductModificationReasonAppModel, null), 3);
                return unit;
            }
            KotlinToastManager kotlinToastManager2 = this.u;
            premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.L$0 = kotlinToastManager2;
            premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.label = 1;
            objB = this.o.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) premiumBusProductModificationReasonsComponent$handleConfirmRescheduleIntent$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }

    public final void N0(PremiumBusProductModificationReasonsIntent intent) {
        String str;
        String str2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PremiumBusProductModificationReasonsIntent.CancellationScreenOkCtaClickIntent;
        ChaloNavigationManager chaloNavigationManager = this.v;
        String str3 = "";
        if (z) {
            PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel = this.E;
            if (premiumBusProductModificationReasonAppModel != null && (str2 = premiumBusProductModificationReasonAppModel.b) != null) {
                str3 = str2;
            }
            AnalyticsContract.DefaultImpls.a(this.n, "pb trip cancellation okay cta clicked", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("cancellationReason", str3), new Pair("cancellationReasonId", Integer.valueOf(premiumBusProductModificationReasonAppModel != null ? premiumBusProductModificationReasonAppModel.f2385a : -1))), null, false, 24);
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs(DestinationTabType.CHALO_BUS.getDestinationTabType(), (String) null, 6));
            return;
        }
        boolean z2 = intent instanceof PremiumBusProductModificationReasonsIntent.ConfirmActionIntent;
        StateFlow stateFlow = this.f;
        ContextScope contextScope = this.j;
        if (z2) {
            BuildersKt.d(contextScope, null, null, new PremiumBusProductModificationReasonsComponent$handleConfirmActionIntent$1(this.E, this.A, ((PremiumBusProductModificationReasonsViewState) stateFlow.getValue()).c, this, null), 3);
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.DismissConfirmationDialogIntent) {
            E0(new gt0(29));
            this.E = null;
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.InitializationIntent) {
            PremiumBusProductModificationReasonsIntent.InitializationIntent initializationIntent = (PremiumBusProductModificationReasonsIntent.InitializationIntent) intent;
            E0(new et0(initializationIntent, 9));
            this.A = initializationIntent.f7345a;
            this.B = initializationIntent.b;
            this.C = initializationIntent.c;
            BuildersKt.d(contextScope, null, null, new PremiumBusProductModificationReasonsComponent$handleInitializationIntent$2(this, initializationIntent, null), 3);
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.ReasonClickedIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusProductModificationReasonsComponent$handleReasonClickedIntent$1(this, (PremiumBusProductModificationReasonsIntent.ReasonClickedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.RetryReasonsFetchIntent) {
            PremiumReserveTicketOptionAction premiumReserveTicketOptionAction = ((PremiumBusProductModificationReasonsViewState) stateFlow.getValue()).c;
            if (this.A == null || this.B == null || this.C == null || premiumReserveTicketOptionAction == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusProductModificationReasonsComponent$handleRetryReasonsFetchIntent$1(this, premiumReserveTicketOptionAction, null), 3);
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.BookAnotherRideCtaClickIntent) {
            PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel2 = this.E;
            if (premiumBusProductModificationReasonAppModel2 != null && (str = premiumBusProductModificationReasonAppModel2.b) != null) {
                str3 = str;
            }
            AnalyticsContract.DefaultImpls.a(this.n, "pb trip cancellation book another ride cta clicked", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("cancellationReason", str3), new Pair("cancellationReasonId", Integer.valueOf(premiumBusProductModificationReasonAppModel2 != null ? premiumBusProductModificationReasonAppModel2.f2385a : -1))), null, false, 24);
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs(DestinationTabType.CHALO_BUS.getDestinationTabType(), (String) null, 6));
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.SlotClickedIntent) {
            BuildersKt.d(contextScope, null, null, new PremiumBusProductModificationReasonsComponent$handleSlotClickedIntent$1(this, (PremiumBusProductModificationReasonsIntent.SlotClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(PremiumBusProductModificationReasonsIntent.CloseBottomSheetBtnClickIntent.f7340a)) {
            E0(new gt0(23));
            return;
        }
        if (intent instanceof PremiumBusProductModificationReasonsIntent.ConfirmSlotClickedIntent) {
            E0(new gt0(21));
            return;
        }
        if (intent.equals(PremiumBusProductModificationReasonsIntent.ExploreAvailableRoutesClickIntent.f7344a)) {
            AnalyticsContract.DefaultImpls.a(this.n, "pb explore available routes clicked", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), null, null, false, 28);
            E0(new gt0(26));
            ChaloNavigationManagerKt.e(chaloNavigationManager, new WebViewArgs("https://chalo.com/mumbai/chalo-bus/routes", "", false, true), null, 6);
        } else {
            if (intent instanceof PremiumBusProductModificationReasonsIntent.HandleSeatSelectionResultIntent) {
                throw null;
            }
            if (!intent.equals(PremiumBusProductModificationReasonsIntent.OnBackPressedIntent.f7346a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (WhenMappings.f7335a[((PremiumBusProductModificationReasonsViewState) stateFlow.getValue()).m.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (((PremiumBusProductModificationReasonsViewState) stateFlow.getValue()).d) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new HomeArgs(DestinationTabType.HOME.getDestinationTabType(), (String) null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
            } else {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
            }
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusProductModificationReasonsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusProductModificationReasonsViewState(null, null, null, false, null, null, false, null, null, false, null, null, ProductModificationScreenType.REASON_SCREEN, null, null, EmptyList.f17557a);
    }
}
