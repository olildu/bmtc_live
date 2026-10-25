package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.constants.Source;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PostBookingHandlerConfig;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.productactivation.domain.ShouldCheckBLEPermissionForActivationUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.components.map.TrafficLayerConfig;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.im0;
import defpackage.k4;
import defpackage.vo1;
import defpackage.za0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationState;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationDataState;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NewPremiumBusReserveTicketActivationComponent extends ChaloBaseStateMviComponent<NewPremiumBusReserveTicketActivationIntent, NewPremiumBusReserveTicketActivationState, NewPremiumBusReserveTicketActivationState, NewPremiumBusReserveTicketActivationEffect> {
    public final IReportProblemFeature A;
    public final TimeUtilsContract B;
    public long C;
    public boolean D;
    public Job E;
    public final PremiumBusActivationArgs k;
    public final ComponentContext l;
    public final PremiumReserveTicketPostBookingActionHandler m;
    public final CityProvider n;
    public final UserProfileDetailsProvider o;
    public final AnalyticsContract p;
    public final ChaloNavigationManager q;
    public final IUserPreferencesDataStore r;
    public final StringProvider s;
    public final ValidationSceneResolverUseCase t;
    public final KotlinToastManager u;
    public final SystemHelper v;
    public final ShouldCheckBLEPermissionForActivationUseCase w;
    public final CheckBluetoothPermissionHelper x;
    public final PermissionHandlerProvider y;
    public final AdjustManager z;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$1", f = "NewPremiumBusReserveTicketActivationComponent.kt", l = {120}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class C01351<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NewPremiumBusReserveTicketActivationComponent f7360a;

            public C01351(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent) {
                this.f7360a = newPremiumBusReserveTicketActivationComponent;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState, Continuation continuation) {
                NewPremiumBusReserveTicketActivationComponent$1$1$emit$1 newPremiumBusReserveTicketActivationComponent$1$1$emit$1;
                String strName;
                PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState2 = premiumReserveTicketPostBookingActionState;
                if (continuation instanceof NewPremiumBusReserveTicketActivationComponent$1$1$emit$1) {
                    newPremiumBusReserveTicketActivationComponent$1$1$emit$1 = (NewPremiumBusReserveTicketActivationComponent$1$1$emit$1) continuation;
                    int i = newPremiumBusReserveTicketActivationComponent$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        newPremiumBusReserveTicketActivationComponent$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        newPremiumBusReserveTicketActivationComponent$1$1$emit$1 = new NewPremiumBusReserveTicketActivationComponent$1$1$emit$1(this, continuation);
                    }
                } else {
                    newPremiumBusReserveTicketActivationComponent$1$1$emit$1 = new NewPremiumBusReserveTicketActivationComponent$1$1$emit$1(this, continuation);
                }
                Object objF0 = newPremiumBusReserveTicketActivationComponent$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = newPremiumBusReserveTicketActivationComponent$1$1$emit$1.label;
                NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent = this.f7360a;
                if (i2 == 0) {
                    ResultKt.b(objF0);
                    PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = premiumReserveTicketPostBookingActionState2.k;
                    if (premiumBusBookingTripTimeInfoState != null) {
                        PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketPostBookingActionState2.c;
                        String str = premiumReserveTicketPostBookingActionState2.f7473a;
                        if (!(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta)) {
                            newPremiumBusReserveTicketActivationComponent.getClass();
                            if (!premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b) && !(premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) && !premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b) && !premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!newPremiumBusReserveTicketActivationComponent.D) {
                            newPremiumBusReserveTicketActivationComponent.D = true;
                            long j = newPremiumBusReserveTicketActivationComponent.v.j();
                            AnalyticsContract analyticsContract = newPremiumBusReserveTicketActivationComponent.p;
                            String sourceName = Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName();
                            if (premiumReserveTicketStatus == null || (strName = premiumReserveTicketStatus.name()) == null) {
                                strName = "";
                            }
                            Pair pair = new Pair("ticketStatus", strName);
                            if (str == null) {
                                str = "";
                            }
                            AnalyticsContract.DefaultImpls.a(analyticsContract, "pb first time eta rendered on activation screen", sourceName, MapsKt.i(pair, new Pair("bookingId", str), new Pair("delayInFetchingEta", Long.valueOf(j - newPremiumBusReserveTicketActivationComponent.C)), new Pair("timeWhenScreenOpened", Long.valueOf(newPremiumBusReserveTicketActivationComponent.C)), new Pair("timeWhenEtaRenderedFirstTime", Long.valueOf(j))), null, false, 24);
                        }
                    }
                    newPremiumBusReserveTicketActivationComponent$1$1$emit$1.L$0 = premiumReserveTicketPostBookingActionState2;
                    newPremiumBusReserveTicketActivationComponent$1$1$emit$1.label = 1;
                    objF0 = NewPremiumBusReserveTicketActivationComponent.F0(newPremiumBusReserveTicketActivationComponent, premiumReserveTicketPostBookingActionState2, newPremiumBusReserveTicketActivationComponent$1$1$emit$1);
                    if (objF0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    premiumReserveTicketPostBookingActionState2 = (PremiumReserveTicketPostBookingActionState) newPremiumBusReserveTicketActivationComponent$1$1$emit$1.L$0;
                    ResultKt.b(objF0);
                }
                newPremiumBusReserveTicketActivationComponent.E0(new za0(16, premiumReserveTicketPostBookingActionState2, newPremiumBusReserveTicketActivationComponent, (List) objF0));
                return Unit.f17538a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return NewPremiumBusReserveTicketActivationComponent.this.new AnonymousClass1(continuation);
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
                StateFlow state = NewPremiumBusReserveTicketActivationComponent.this.m.getState();
                C01351 c01351 = new C01351(NewPremiumBusReserveTicketActivationComponent.this);
                this.label = 1;
                if (state.collect(c01351, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$2", f = "NewPremiumBusReserveTicketActivationComponent.kt", l = {210}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ NewPremiumBusReserveTicketActivationComponent f7361a;
            public final /* synthetic */ CoroutineScope b;

            public AnonymousClass1(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, CoroutineScope coroutineScope) {
                this.f7361a = newPremiumBusReserveTicketActivationComponent;
                this.b = coroutineScope;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
            
                if (r1.g(r15, r3) == r4) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x0201, code lost:
            
                if (r2 == r4) goto L97;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionEffect r24, kotlin.coroutines.Continuation r25) {
                /*
                    Method dump skipped, instruction units count: 943
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent.AnonymousClass2.AnonymousClass1.emit(app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionEffect, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = NewPremiumBusReserveTicketActivationComponent.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowB = NewPremiumBusReserveTicketActivationComponent.this.m.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewPremiumBusReserveTicketActivationComponent.this, coroutineScope);
                this.label = 1;
                if (flowB.collect(anonymousClass1, this) == coroutineSingletons) {
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
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7362a;

        static {
            int[] iArr = new int[NewPremiumReserveTicketDetailsScreenType.values().length];
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7362a = iArr;
        }
    }

    public NewPremiumBusReserveTicketActivationComponent(PremiumBusActivationArgs premiumBusActivationArgs, ComponentContext componentContext, PremiumReserveTicketPostBookingActionHandler premiumReserveTicketPostBookingActionHandler, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, IUserPreferencesDataStore iUserPreferencesDataStore, StringProvider stringProvider, ValidationSceneResolverUseCase validationSceneResolverUseCase, KotlinToastManager kotlinToastManager, SystemHelper systemHelper, ShouldCheckBLEPermissionForActivationUseCase shouldCheckBLEPermissionForActivationUseCase, CheckBluetoothPermissionHelper checkBluetoothPermissionHelper, PermissionHandlerProvider permissionHandlerProvider, AdjustManager adjustManager, IReportProblemFeature iReportProblemFeature, TimeUtilsContract timeUtilsContract) {
        super(componentContext);
        this.k = premiumBusActivationArgs;
        this.l = componentContext;
        this.m = premiumReserveTicketPostBookingActionHandler;
        this.n = cityProvider;
        this.o = userProfileDetailsProvider;
        this.p = analyticsContract;
        this.q = chaloNavigationManager;
        this.r = iUserPreferencesDataStore;
        this.s = stringProvider;
        this.t = validationSceneResolverUseCase;
        this.u = kotlinToastManager;
        this.v = systemHelper;
        this.w = shouldCheckBLEPermissionForActivationUseCase;
        this.x = checkBluetoothPermissionHelper;
        this.y = permissionHandlerProvider;
        this.z = adjustManager;
        this.A = iReportProblemFeature;
        this.B = timeUtilsContract;
        H0(NewPremiumBusReserveTicketActivationIntent.InitializationIntent.f7373a);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e5 -> B:39:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object F0(app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent r18, app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent.F0(app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent, app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation premiumReserveTicketValidation, ContinuationImpl continuationImpl) {
        NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1 newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1;
        newPremiumBusReserveTicketActivationComponent.getClass();
        if (continuationImpl instanceof NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1) {
            newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1 = (NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1) continuationImpl;
            int i = newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1 = new NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1(newPremiumBusReserveTicketActivationComponent, continuationImpl);
            }
        } else {
            newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1 = new NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1(newPremiumBusReserveTicketActivationComponent, continuationImpl);
        }
        Object objA = newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ShouldCheckBLEPermissionForActivationUseCase shouldCheckBLEPermissionForActivationUseCase = newPremiumBusReserveTicketActivationComponent.w;
            newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1.label = 1;
            objA = shouldCheckBLEPermissionForActivationUseCase.a(premiumReserveTicketValidation, newPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            Job job = newPremiumBusReserveTicketActivationComponent.E;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            newPremiumBusReserveTicketActivationComponent.E = BuildersKt.d(newPremiumBusReserveTicketActivationComponent.j, null, null, new NewPremiumBusReserveTicketActivationComponent$requestBLEPermissionIfNotGranted$2(newPremiumBusReserveTicketActivationComponent, null), 3);
        }
        return Unit.f17538a;
    }

    public final void H0(final NewPremiumBusReserveTicketActivationIntent intent) {
        List list;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof NewPremiumBusReserveTicketActivationIntent.InitializationIntent;
        PremiumBusActivationArgs premiumBusActivationArgs = this.k;
        PremiumReserveTicketPostBookingActionHandler premiumReserveTicketPostBookingActionHandler = this.m;
        if (z) {
            this.C = this.v.j();
            AnalyticsContract.DefaultImpls.a(this.p, "pb activation screen opened", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("bookingId", premiumBusActivationArgs.b), null, false, 24);
            this.z.b("yah3g2");
            premiumReserveTicketPostBookingActionHandler.f(premiumBusActivationArgs.b, new PostBookingHandlerConfig(true, true, true), premiumBusActivationArgs.h);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.FragmentStartIntent.f7370a)) {
            premiumReserveTicketPostBookingActionHandler.o(premiumBusActivationArgs.h);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.FragmentStopIntent.f7371a)) {
            premiumReserveTicketPostBookingActionHandler.m();
            return;
        }
        boolean zEquals = intent.equals(NewPremiumBusReserveTicketActivationIntent.VerifyTicketClickedIntent.f7395a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$processIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.MoreOptionsClickedIntent.f7377a)) {
            premiumReserveTicketPostBookingActionHandler.u();
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.MoreOptionsItemClickedIntent) {
            BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$processIntent$2(this, intent, null), 3);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent) {
            premiumReserveTicketPostBookingActionHandler.i(((NewPremiumBusReserveTicketActivationIntent.BookingCancelledBottomSheetDismissIntent) intent).f7367a);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.DismissPickAndDropOffStopsListDialogIntent.f7368a)) {
            premiumReserveTicketPostBookingActionHandler.k();
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.DismissWomenSeatRescheduleWarningBannerIntent.f7369a)) {
            BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$processIntent$3(this, null), 3);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.TicketExpiredDialogDismissIntent.f7389a)) {
            premiumReserveTicketPostBookingActionHandler.j();
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.ShowOnMapsClickedIntent.f7387a)) {
            AnalyticsContract.DefaultImpls.a(this.p, "pb navigate directions clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("bookingId", "null"), null, false, 24);
            BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$handleShowInMapsClickIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.ShowStopsBetweenPickUpAndDropIntent.f7388a)) {
            premiumReserveTicketPostBookingActionHandler.r();
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.MapLoaded.f7376a)) {
            premiumReserveTicketPostBookingActionHandler.n();
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.RouteDetailsFetchFailedSnackBarRetryClicked.f7385a)) {
            premiumReserveTicketPostBookingActionHandler.e();
            E0(new im0(21));
            return;
        }
        if (intent.equals(NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.AlignMap.f7374a)) {
            BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$processIntent$5(this, null), 3);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.MapCameraUpdateLoaded) {
            premiumReserveTicketPostBookingActionHandler.h(((NewPremiumBusReserveTicketActivationIntent.MapInteractionIntent.MapCameraUpdateLoaded) intent).f7375a);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.RouteStopListStopClickedIntent) {
            premiumReserveTicketPostBookingActionHandler.w(((NewPremiumBusReserveTicketActivationIntent.RouteStopListStopClickedIntent) intent).f7386a, true);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationCancelRideCtaClickIntent) {
            NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationCancelRideCtaClickIntent tripCancellationConfirmationCancelRideCtaClickIntent = (NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationCancelRideCtaClickIntent) intent;
            premiumReserveTicketPostBookingActionHandler.c(tripCancellationConfirmationCancelRideCtaClickIntent.f7392a, tripCancellationConfirmationCancelRideCtaClickIntent.b);
            return;
        }
        boolean z2 = intent instanceof NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationGoBackCtaClickIntent;
        NewPremiumBusReserveTicketActivationEffect.HideBottomSheet hideBottomSheet = NewPremiumBusReserveTicketActivationEffect.HideBottomSheet.f7365a;
        if (z2) {
            AnalyticsContract.DefaultImpls.a(this.p, "pb trip cancellation go back cta clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("cancellationEligibilityCopy", String.valueOf(((NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationGoBackCtaClickIntent) intent).f7393a.d)), null, false, 24);
            premiumReserveTicketPostBookingActionHandler.u();
            r0(hideBottomSheet);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.RescheduleConfirmationRescheduleRideClickIntent) {
            NewPremiumBusReserveTicketActivationIntent.RescheduleConfirmationRescheduleRideClickIntent rescheduleConfirmationRescheduleRideClickIntent = (NewPremiumBusReserveTicketActivationIntent.RescheduleConfirmationRescheduleRideClickIntent) intent;
            premiumReserveTicketPostBookingActionHandler.d(rescheduleConfirmationRescheduleRideClickIntent.f7384a, rescheduleConfirmationRescheduleRideClickIntent.b);
            return;
        }
        boolean z3 = intent instanceof NewPremiumBusReserveTicketActivationIntent.OnViewCancellationAndReschedulePolicyClickIntent;
        int i = 0;
        ChaloNavigationManager chaloNavigationManager = this.q;
        if (z3) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(((NewPremiumBusReserveTicketActivationIntent.OnViewCancellationAndReschedulePolicyClickIntent) intent).f7381a, "", false, false), null, null, 6));
            r0(hideBottomSheet);
            return;
        }
        if (intent instanceof NewPremiumBusReserveTicketActivationIntent.OpenPassengerAllocatedSeatsDialog) {
            premiumReserveTicketPostBookingActionHandler.t(((NewPremiumBusReserveTicketActivationIntent.OpenPassengerAllocatedSeatsDialog) intent).f7382a);
            return;
        }
        if (!(intent instanceof NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent)) {
            if (intent.equals(NewPremiumBusReserveTicketActivationIntent.OnImageDialogDismissed.f7380a)) {
                E0(new im0(22));
                return;
            }
            if (intent.equals(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a)) {
                r0(hideBottomSheet);
                return;
            }
            if (intent.equals(NewPremiumBusReserveTicketActivationIntent.OnBackPressedIntent.f7379a)) {
                gf.u(null, chaloNavigationManager);
                return;
            }
            if (intent instanceof NewPremiumBusReserveTicketActivationIntent.OnPostValidationScreenTabClickIntent) {
                final int i2 = 0;
                E0(new Function1() { // from class: dn0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        NewPremiumBusReserveTicketActivationState it = (NewPremiumBusReserveTicketActivationState) obj;
                        switch (i2) {
                            case 0:
                                Intrinsics.i(it, "it");
                                ((NewPremiumBusReserveTicketActivationIntent.OnPostValidationScreenTabClickIntent) intent).getClass();
                                return NewPremiumBusReserveTicketActivationState.a(it, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -1, 29);
                            default:
                                Intrinsics.i(it, "it");
                                ChaloMapUIState chaloMapUIState = it.p;
                                boolean z4 = ((NewPremiumBusReserveTicketActivationIntent.ToggleTrafficViewClicked) intent).f7390a;
                                return NewPremiumBusReserveTicketActivationState.a(it, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ChaloMapUIState.a(chaloMapUIState, null, false, null, null, new TrafficLayerConfig(z4, !z4), null, 191), null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
                        }
                    }
                });
                return;
            }
            if (intent instanceof NewPremiumBusReserveTicketActivationIntent.ToggleTrafficViewClicked) {
                AnalyticsContract.DefaultImpls.a(this.p, "pb activation screen traffic view toggled", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), MapsKt.h(new Pair("pb activation screen traffic view toggled", Boolean.valueOf(((NewPremiumBusReserveTicketActivationIntent.ToggleTrafficViewClicked) intent).f7390a))), null, false, 24);
                final int i3 = 1;
                E0(new Function1() { // from class: dn0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        NewPremiumBusReserveTicketActivationState it = (NewPremiumBusReserveTicketActivationState) obj;
                        switch (i3) {
                            case 0:
                                Intrinsics.i(it, "it");
                                ((NewPremiumBusReserveTicketActivationIntent.OnPostValidationScreenTabClickIntent) intent).getClass();
                                return NewPremiumBusReserveTicketActivationState.a(it, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -1, 29);
                            default:
                                Intrinsics.i(it, "it");
                                ChaloMapUIState chaloMapUIState = it.p;
                                boolean z4 = ((NewPremiumBusReserveTicketActivationIntent.ToggleTrafficViewClicked) intent).f7390a;
                                return NewPremiumBusReserveTicketActivationState.a(it, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ChaloMapUIState.a(chaloMapUIState, null, false, null, null, new TrafficLayerConfig(z4, !z4), null, 191), null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
                        }
                    }
                });
                return;
            }
            if (intent instanceof NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationAdditionalInfoClickIntent) {
                BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1((NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationAdditionalInfoClickIntent) intent, this, null), 3);
                return;
            } else {
                if (!(intent instanceof NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationRescheduleRideClickIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, null, null, new NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationRescheduleRideClickIntent$1(this, (NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationRescheduleRideClickIntent) intent, null), 3);
                return;
            }
        }
        NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent pBStopImageClickedIntent = (NewPremiumBusReserveTicketActivationIntent.PBStopImageClickedIntent) intent;
        int i4 = WhenMappings.f7362a[pBStopImageClickedIntent.b.ordinal()];
        StateFlow stateFlow = this.f;
        if (i4 == 1) {
            list = ((NewPremiumBusReserveTicketActivationState) stateFlow.getValue()).u;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = ((NewPremiumBusReserveTicketActivationState) stateFlow.getValue()).v;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PBStopImagesDetails) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (obj instanceof PBStopImageType.ImagesAvailable) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            CollectionsKt.i(((PBStopImageType.ImagesAvailable) obj2).f7400a, arrayList3);
        }
        int iK = CollectionsKt.K(arrayList3);
        int i7 = pBStopImageClickedIntent.f7383a;
        if (i7 >= 0 && i7 <= iK) {
            i = i7;
        }
        E0(new k4(arrayList3, i, 6));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (NewPremiumBusReserveTicketActivationState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new NewPremiumBusReserveTicketActivationState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new NewPremiumBusReserveTicketActivationState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        this.m.a();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        H0(NewPremiumBusReserveTicketActivationIntent.FragmentStartIntent.f7370a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        H0(NewPremiumBusReserveTicketActivationIntent.FragmentStopIntent.f7371a);
    }
}
