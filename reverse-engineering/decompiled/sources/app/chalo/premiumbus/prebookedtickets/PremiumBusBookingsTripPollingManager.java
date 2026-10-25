package app.chalo.premiumbus.prebookedtickets;

import app.chalo.contract.BasicInfoContract;
import app.chalo.data.PremiumBusCityWisePollingConfigAppModel;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/PremiumBusBookingsTripPollingManager;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBookingsTripPollingManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchPremiumBusBookingsTripDetailsUseCase f7282a;
    public final BasicInfoContract b;
    public final GetPremiumBusCurrentCityConfigUseCase c;
    public final ContextScope d;
    public final MutexImpl e;
    public PremiumBusCityWisePollingConfigAppModel f;
    public final MutableStateFlow g;
    public final StateFlow h;

    /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lapp/chalo/premiumbus/prebookedtickets/PremiumBusBookingsTripPollingDetails;", "it", "Lapp/chalo/premiumbus/prebookedtickets/PremiumBusTripDetailsPollingRequestWrapper;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$2", f = "PremiumBusBookingsTripPollingManager.kt", l = {220, 66, 67, EACTags.DISPLAY_IMAGE, EACTags.DISPLAY_IMAGE}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends PremiumBusBookingsTripPollingDetails>>, PremiumBusTripDetailsPollingRequestWrapper, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = PremiumBusBookingsTripPollingManager.this.new AnonymousClass2((Continuation) obj3);
            anonymousClass2.L$0 = (FlowCollector) obj;
            return anonymousClass2.invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007d  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:23:0x008e, B:26:0x00aa), top: B:45:0x008e }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00be A[PHI: r8 r9 r12
          0x00be: PHI (r8v4 kotlinx.coroutines.flow.FlowCollector) = (r8v5 kotlinx.coroutines.flow.FlowCollector), (r8v13 kotlinx.coroutines.flow.FlowCollector) binds: [B:28:0x00bb, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00be: PHI (r9v3 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager) = 
          (r9v4 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
          (r9v9 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
         binds: [B:28:0x00bb, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]
          0x00be: PHI (r12v8 java.lang.Object) = (r12v19 java.lang.Object), (r12v0 java.lang.Object) binds: [B:28:0x00bb, B:15:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00d0 A[PHI: r1 r8 r9
          0x00d0: PHI (r1v3 java.util.List) = (r1v6 java.util.List), (r1v15 java.util.List) binds: [B:31:0x00cd, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x00d0: PHI (r8v2 kotlinx.coroutines.flow.FlowCollector) = (r8v4 kotlinx.coroutines.flow.FlowCollector), (r8v15 kotlinx.coroutines.flow.FlowCollector) binds: [B:31:0x00cd, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x00d0: PHI (r9v2 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager) = 
          (r9v3 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
          (r9v11 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
         binds: [B:31:0x00cd, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00df  */
        /* JADX WARN: Code duplicated, block: B:45:0x008e A[EXC_TOP_SPLITTER, PHI: r1 r8 r9
          0x008e: PHI (r1v7 kotlinx.coroutines.sync.Mutex) = (r1v8 kotlinx.coroutines.sync.Mutex), (r1v11 kotlinx.coroutines.sync.Mutex) binds: [B:21:0x008b, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x008e: PHI (r8v5 kotlinx.coroutines.flow.FlowCollector) = (r8v6 kotlinx.coroutines.flow.FlowCollector), (r8v10 kotlinx.coroutines.flow.FlowCollector) binds: [B:21:0x008b, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]
          0x008e: PHI (r9v4 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager) = 
          (r9v5 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
          (r9v8 app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager)
         binds: [B:21:0x008b, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
        
            if (kotlinx.coroutines.DelayKt.b(r9, r11) == r0) goto L39;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:10:0x0021). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7283a;

        static {
            int[] iArr = new int[PremiumBusTripStatus.values().length];
            try {
                iArr[PremiumBusTripStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusTripStatus.PLANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusTripStatus.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusTripStatus.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7283a = iArr;
        }
    }

    public PremiumBusBookingsTripPollingManager(CoroutineContextProvider coroutineContextProvider, FetchPremiumBusBookingsTripDetailsUseCase fetchPremiumBusBookingsTripDetailsUseCase, BasicInfoContract basicInfoContract, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase) {
        this.f7282a = fetchPremiumBusBookingsTripDetailsUseCase;
        this.b = basicInfoContract;
        this.c = getPremiumBusCurrentCityConfigUseCase;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.a());
        this.d = contextScopeA;
        this.e = MutexKt.a();
        final MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PremiumBusTripDetailsPollingRequestWrapper(EmptySet.f17559a, true));
        this.g = mutableStateFlowA;
        this.h = FlowKt.G(FlowKt.z(FlowKt.H(FlowKt.l(new Flow<PremiumBusTripDetailsPollingRequestWrapper>() { // from class: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$special$$inlined$filter$1

            /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f7285a;

                /* JADX INFO: renamed from: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$special$$inlined$filter$1$2", f = "PremiumBusBookingsTripPollingManager.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f7285a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        if (((PremiumBusTripDetailsPollingRequestWrapper) obj).b) {
                            anonymousClass1.label = 1;
                            if (this.f7285a.emit(obj, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, 500L), new AnonymousClass2(null)), coroutineContextProvider.getDefault()), contextScopeA, SharingStarted.Companion.a(), EmptyList.f17557a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(PremiumBusBookingsTripPollingManager premiumBusBookingsTripPollingManager, List list, ContinuationImpl continuationImpl) {
        PremiumBusBookingsTripPollingManager$calculatePollingFrequency$1 premiumBusBookingsTripPollingManager$calculatePollingFrequency$1;
        Long l;
        long jLongValue;
        premiumBusBookingsTripPollingManager.getClass();
        if (continuationImpl instanceof PremiumBusBookingsTripPollingManager$calculatePollingFrequency$1) {
            premiumBusBookingsTripPollingManager$calculatePollingFrequency$1 = (PremiumBusBookingsTripPollingManager$calculatePollingFrequency$1) continuationImpl;
            int i = premiumBusBookingsTripPollingManager$calculatePollingFrequency$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBookingsTripPollingManager$calculatePollingFrequency$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBookingsTripPollingManager$calculatePollingFrequency$1 = new PremiumBusBookingsTripPollingManager$calculatePollingFrequency$1(premiumBusBookingsTripPollingManager, continuationImpl);
            }
        } else {
            premiumBusBookingsTripPollingManager$calculatePollingFrequency$1 = new PremiumBusBookingsTripPollingManager$calculatePollingFrequency$1(premiumBusBookingsTripPollingManager, continuationImpl);
        }
        Object objF = premiumBusBookingsTripPollingManager$calculatePollingFrequency$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBookingsTripPollingManager$calculatePollingFrequency$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Long l2 = new Long(((PremiumBusBookingsTripPollingDetails) it.next()).d);
                while (it.hasNext()) {
                    Long l3 = new Long(((PremiumBusBookingsTripPollingDetails) it.next()).d);
                    if (l2.compareTo(l3) > 0) {
                        l2 = l3;
                    }
                }
                l = l2;
            } else {
                l = null;
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                premiumBusBookingsTripPollingManager$calculatePollingFrequency$1.label = 1;
                objF = premiumBusBookingsTripPollingManager.f(premiumBusBookingsTripPollingManager$calculatePollingFrequency$1);
                if (objF == obj) {
                    return obj;
                }
            }
            return new Long(jLongValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objF);
        jLongValue = ((PremiumBusCityWisePollingConfigAppModel) objF).b;
        return new Long(jLongValue);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014a -> B:19:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b1 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager r21, java.util.List r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager.b(app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        BuildersKt.d(this.d, null, null, new PremiumBusBookingsTripPollingManager$addRequest$1(this, bookingId, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ChaloUseCaseResult.Success success, ContinuationImpl continuationImpl) {
        PremiumBusBookingsTripPollingManager$calculatePollingDelay$1 premiumBusBookingsTripPollingManager$calculatePollingDelay$1;
        float fLongValue;
        long j;
        Object objF;
        long j2;
        if (continuationImpl instanceof PremiumBusBookingsTripPollingManager$calculatePollingDelay$1) {
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1 = (PremiumBusBookingsTripPollingManager$calculatePollingDelay$1) continuationImpl;
            int i = premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBookingsTripPollingManager$calculatePollingDelay$1 = new PremiumBusBookingsTripPollingManager$calculatePollingDelay$1(this, continuationImpl);
            }
        } else {
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1 = new PremiumBusBookingsTripPollingManager$calculatePollingDelay$1(this, continuationImpl);
        }
        Object objC = premiumBusBookingsTripPollingManager$calculatePollingDelay$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1.L$0 = success;
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label = 1;
            objC = this.b.c(premiumBusBookingsTripPollingManager$calculatePollingDelay$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            success = (ChaloUseCaseResult.Success) premiumBusBookingsTripPollingManager$calculatePollingDelay$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                fLongValue = premiumBusBookingsTripPollingManager$calculatePollingDelay$1.F$0;
                ResultKt.b(objC);
                j = (long) (fLongValue * ((PremiumBusCityWisePollingConfigAppModel) objC).f2376a);
                premiumBusBookingsTripPollingManager$calculatePollingDelay$1.J$0 = j;
                premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label = 3;
                objF = f(premiumBusBookingsTripPollingManager$calculatePollingDelay$1);
                if (objF != obj) {
                    objC = objF;
                    j2 = j;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = premiumBusBookingsTripPollingManager$calculatePollingDelay$1.J$0;
            ResultKt.b(objC);
        }
        return new Long(Math.max(((PremiumBusCityWisePollingConfigAppModel) objC).b, j2));
        fLongValue = ((PremiumBusTripPollingResponseAppModel) success.f10419a).i - ((Number) objC).longValue();
        premiumBusBookingsTripPollingManager$calculatePollingDelay$1.L$0 = null;
        premiumBusBookingsTripPollingManager$calculatePollingDelay$1.F$0 = fLongValue;
        premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label = 2;
        objC = f(premiumBusBookingsTripPollingManager$calculatePollingDelay$1);
        if (objC != obj) {
            j = (long) (fLongValue * ((PremiumBusCityWisePollingConfigAppModel) objC).f2376a);
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1.J$0 = j;
            premiumBusBookingsTripPollingManager$calculatePollingDelay$1.label = 3;
            objF = f(premiumBusBookingsTripPollingManager$calculatePollingDelay$1);
            if (objF != obj) {
                objC = objF;
                j2 = j;
                return new Long(Math.max(((PremiumBusCityWisePollingConfigAppModel) objC).b, j2));
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        if (r10 == r1) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.utils.ChaloUseCaseResult r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$calculatePollingFrequencyForIndividualRequest$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$calculatePollingFrequencyForIndividualRequest$1 r0 = (app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$calculatePollingFrequencyForIndividualRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$calculatePollingFrequencyForIndividualRequest$1 r0 = new app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager$calculatePollingFrequencyForIndividualRequest$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.ResultKt.b(r10)
            goto La5
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.ResultKt.b(r10)
            return r10
        L3d:
            kotlin.ResultKt.b(r10)
            goto L89
        L41:
            kotlin.ResultKt.b(r10)
            return r10
        L45:
            kotlin.ResultKt.b(r10)
            boolean r10 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r10 == 0) goto L98
            app.chalo.utils.ChaloUseCaseResult$Success r9 = (app.chalo.utils.ChaloUseCaseResult.Success) r9
            java.lang.Object r10 = r9.f10419a
            app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel r10 = (app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel) r10
            app.chalo.premiumbus.data.models.app.PremiumBusTripStatus r2 = r10.e
            int[] r7 = app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager.WhenMappings.f7283a
            int r2 = r2.ordinal()
            r2 = r7[r2]
            if (r2 == r6) goto L75
            if (r2 == r5) goto L6b
            if (r2 == r4) goto L6b
            if (r2 != r3) goto L65
            goto L6b
        L65:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L6b:
            r0.label = r4
            java.lang.Object r9 = r8.d(r9, r0)
            if (r9 != r1) goto L74
            goto La4
        L74:
            return r9
        L75:
            java.lang.String r10 = r10.c
            if (r10 == 0) goto L8e
            int r10 = r10.length()
            if (r10 != 0) goto L80
            goto L8e
        L80:
            r0.label = r5
            java.lang.Object r10 = r8.f(r0)
            if (r10 != r1) goto L89
            goto La4
        L89:
            app.chalo.data.PremiumBusCityWisePollingConfigAppModel r10 = (app.chalo.data.PremiumBusCityWisePollingConfigAppModel) r10
            long r9 = r10.b
            goto La9
        L8e:
            r0.label = r6
            java.lang.Object r9 = r8.d(r9, r0)
            if (r9 != r1) goto L97
            goto La4
        L97:
            return r9
        L98:
            boolean r9 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r9 == 0) goto Laf
            r0.label = r3
            java.lang.Object r10 = r8.f(r0)
            if (r10 != r1) goto La5
        La4:
            return r1
        La5:
            app.chalo.data.PremiumBusCityWisePollingConfigAppModel r10 = (app.chalo.data.PremiumBusCityWisePollingConfigAppModel) r10
            long r9 = r10.b
        La9:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            return r0
        Laf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.PremiumBusBookingsTripPollingManager.e(app.chalo.utils.ChaloUseCaseResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        PremiumBusBookingsTripPollingManager$pollingConfig$1 premiumBusBookingsTripPollingManager$pollingConfig$1;
        if (continuationImpl instanceof PremiumBusBookingsTripPollingManager$pollingConfig$1) {
            premiumBusBookingsTripPollingManager$pollingConfig$1 = (PremiumBusBookingsTripPollingManager$pollingConfig$1) continuationImpl;
            int i = premiumBusBookingsTripPollingManager$pollingConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusBookingsTripPollingManager$pollingConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusBookingsTripPollingManager$pollingConfig$1 = new PremiumBusBookingsTripPollingManager$pollingConfig$1(this, continuationImpl);
            }
        } else {
            premiumBusBookingsTripPollingManager$pollingConfig$1 = new PremiumBusBookingsTripPollingManager$pollingConfig$1(this, continuationImpl);
        }
        Object objA = premiumBusBookingsTripPollingManager$pollingConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusBookingsTripPollingManager$pollingConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel = this.f;
            if (premiumBusCityWisePollingConfigAppModel != null) {
                return premiumBusCityWisePollingConfigAppModel;
            }
            premiumBusBookingsTripPollingManager$pollingConfig$1.label = 1;
            objA = this.c.a(premiumBusBookingsTripPollingManager$pollingConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PremiumBusCityWisePollingConfigAppModel premiumBusCityWisePollingConfigAppModel2 = ((PremiumBusNativeCityWiseConfigAppModel) objA).e;
        this.f = premiumBusCityWisePollingConfigAppModel2;
        return premiumBusCityWisePollingConfigAppModel2;
    }

    public final void g(String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        BuildersKt.d(this.d, null, null, new PremiumBusBookingsTripPollingManager$removeRequest$1(this, bookingId, null), 3);
    }
}
