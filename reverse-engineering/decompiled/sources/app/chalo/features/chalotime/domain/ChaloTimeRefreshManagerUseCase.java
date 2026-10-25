package app.chalo.features.chalotime.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.data.ChaloTimeRepository;
import app.chalo.features.chalotime.data.exception.ChaloTimeFetchFailedException;
import app.chalo.features.chalotime.data.model.app.ChaloTimeResponseAppModel;
import app.chalo.features.chalotime.data.model.config.ChaloTimeConfig;
import app.chalo.features.chalotime.data.model.config.ChaloTimeRequestConfig;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ElapsedRealTimeClock;
import app.chalo.utils.SystemHelper;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.w6;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/chalotime/domain/ChaloTimeRefreshManagerUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeRefreshManagerUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetChaloTimeFetchConfigUseCase f2679a;
    public final ChaloTimeRepository b;
    public final SystemHelper c;
    public final AnalyticsContract d;
    public final Lazy e;
    public Job f;
    public ChaloTimeConfig g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase$1", f = "ChaloTimeRefreshManagerUseCase.kt", l = {39}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloTimeRefreshManagerUseCase.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase2 = ChaloTimeRefreshManagerUseCase.this;
                GetChaloTimeFetchConfigUseCase getChaloTimeFetchConfigUseCase = chaloTimeRefreshManagerUseCase2.f2679a;
                this.L$0 = chaloTimeRefreshManagerUseCase2;
                this.label = 1;
                Object objA = getChaloTimeFetchConfigUseCase.a(this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTimeRefreshManagerUseCase = chaloTimeRefreshManagerUseCase2;
                obj = objA;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTimeRefreshManagerUseCase = (ChaloTimeRefreshManagerUseCase) this.L$0;
                ResultKt.b(obj);
            }
            chaloTimeRefreshManagerUseCase.g = (ChaloTimeConfig) obj;
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/features/chalotime/domain/ChaloTimeRefreshManagerUseCase$Companion;", "", "", "DEFAULT_CACHED_TIME", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChaloTimeRefreshManagerUseCase(CoroutineContextProvider coroutineContextProvider, GetChaloTimeFetchConfigUseCase getChaloTimeFetchConfigUseCase, ChaloTimeRepository chaloTimeRepository, SystemHelper systemHelper, AnalyticsContract analyticsContract) {
        this.f2679a = getChaloTimeFetchConfigUseCase;
        this.b = chaloTimeRepository;
        this.c = systemHelper;
        this.d = analyticsContract;
        Lazy lazyB = LazyKt.b(new w6(coroutineContextProvider, 1));
        this.e = lazyB;
        BuildersKt.d((CoroutineScope) lazyB.getValue(), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$chaloTimeConfig$1 chaloTimeRefreshManagerUseCase$chaloTimeConfig$1;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$chaloTimeConfig$1) {
            chaloTimeRefreshManagerUseCase$chaloTimeConfig$1 = (ChaloTimeRefreshManagerUseCase$chaloTimeConfig$1) continuationImpl;
            int i = chaloTimeRefreshManagerUseCase$chaloTimeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$chaloTimeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$chaloTimeConfig$1 = new ChaloTimeRefreshManagerUseCase$chaloTimeConfig$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$chaloTimeConfig$1 = new ChaloTimeRefreshManagerUseCase$chaloTimeConfig$1(this, continuationImpl);
        }
        Object objA = chaloTimeRefreshManagerUseCase$chaloTimeConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRefreshManagerUseCase$chaloTimeConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloTimeConfig chaloTimeConfig = this.g;
            if (chaloTimeConfig != null) {
                return chaloTimeConfig;
            }
            chaloTimeRefreshManagerUseCase$chaloTimeConfig$1.label = 1;
            objA = this.f2679a.a(chaloTimeRefreshManagerUseCase$chaloTimeConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloTimeConfig chaloTimeConfig2 = (ChaloTimeConfig) objA;
        this.g = chaloTimeConfig2;
        return chaloTimeConfig2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1 chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1) {
            chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1 = (ChaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1) continuationImpl;
            int i = chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1 = new ChaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1 = new ChaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1(this, continuationImpl);
        }
        Object objA = chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1.label = 1;
            objA = a(chaloTimeRefreshManagerUseCase$getChaloTimeRequestConfig$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloTimeConfig chaloTimeConfig = (ChaloTimeConfig) objA;
        return new ChaloTimeRequestConfig(chaloTimeConfig.f, chaloTimeConfig.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$getDelay$1 chaloTimeRefreshManagerUseCase$getDelay$1;
        long j;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$getDelay$1) {
            chaloTimeRefreshManagerUseCase$getDelay$1 = (ChaloTimeRefreshManagerUseCase$getDelay$1) continuationImpl;
            int i2 = chaloTimeRefreshManagerUseCase$getDelay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$getDelay$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$getDelay$1 = new ChaloTimeRefreshManagerUseCase$getDelay$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$getDelay$1 = new ChaloTimeRefreshManagerUseCase$getDelay$1(this, continuationImpl);
        }
        Object obj = chaloTimeRefreshManagerUseCase$getDelay$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chaloTimeRefreshManagerUseCase$getDelay$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            long j2 = i;
            chaloTimeRefreshManagerUseCase$getDelay$1.J$0 = j2;
            chaloTimeRefreshManagerUseCase$getDelay$1.label = 1;
            Object objA = a(chaloTimeRefreshManagerUseCase$getDelay$1);
            if (objA == obj2) {
                return obj2;
            }
            obj = objA;
            j = j2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = chaloTimeRefreshManagerUseCase$getDelay$1.J$0;
            ResultKt.b(obj);
        }
        return new Long(j * ((ChaloTimeConfig) obj).f2675a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(long j, ChaloTimeResponseAppModel chaloTimeResponseAppModel, Source source, int i, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$handleResponse$1 chaloTimeRefreshManagerUseCase$handleResponse$1;
        int i2;
        Object objF;
        long j2;
        Source source2;
        ChaloTimeResponseAppModel chaloTimeResponseAppModel2 = chaloTimeResponseAppModel;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$handleResponse$1) {
            chaloTimeRefreshManagerUseCase$handleResponse$1 = (ChaloTimeRefreshManagerUseCase$handleResponse$1) continuationImpl;
            int i3 = chaloTimeRefreshManagerUseCase$handleResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$handleResponse$1.label = i3 - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$handleResponse$1 = new ChaloTimeRefreshManagerUseCase$handleResponse$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$handleResponse$1 = new ChaloTimeRefreshManagerUseCase$handleResponse$1(this, continuationImpl);
        }
        ChaloTimeRefreshManagerUseCase$handleResponse$1 chaloTimeRefreshManagerUseCase$handleResponse$2 = chaloTimeRefreshManagerUseCase$handleResponse$1;
        Object obj = chaloTimeRefreshManagerUseCase$handleResponse$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chaloTimeRefreshManagerUseCase$handleResponse$2.label;
        Unit unit = Unit.f17538a;
        if (i4 == 0) {
            ResultKt.b(obj);
            this.i = false;
            long j3 = chaloTimeResponseAppModel2.f2674a;
            chaloTimeRefreshManagerUseCase$handleResponse$2.L$0 = chaloTimeResponseAppModel2;
            chaloTimeRefreshManagerUseCase$handleResponse$2.L$1 = source;
            chaloTimeRefreshManagerUseCase$handleResponse$2.J$0 = j;
            i2 = i;
            chaloTimeRefreshManagerUseCase$handleResponse$2.I$0 = i2;
            chaloTimeRefreshManagerUseCase$handleResponse$2.label = 1;
            objF = f(j3, j, source, chaloTimeRefreshManagerUseCase$handleResponse$2);
            if (objF != obj2) {
                j2 = j;
                source2 = source;
            }
            return obj2;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        int i5 = chaloTimeRefreshManagerUseCase$handleResponse$2.I$0;
        long j4 = chaloTimeRefreshManagerUseCase$handleResponse$2.J$0;
        Source source3 = (Source) chaloTimeRefreshManagerUseCase$handleResponse$2.L$1;
        ChaloTimeResponseAppModel chaloTimeResponseAppModel3 = (ChaloTimeResponseAppModel) chaloTimeRefreshManagerUseCase$handleResponse$2.L$0;
        ResultKt.b(obj);
        i2 = i5;
        chaloTimeResponseAppModel2 = chaloTimeResponseAppModel3;
        j2 = j4;
        objF = obj;
        source2 = source3;
        if (!((Boolean) objF).booleanValue()) {
            chaloTimeRefreshManagerUseCase$handleResponse$2.L$0 = null;
            chaloTimeRefreshManagerUseCase$handleResponse$2.L$1 = null;
            chaloTimeRefreshManagerUseCase$handleResponse$2.label = 3;
            if (i(source2, i2 + 1, chaloTimeRefreshManagerUseCase$handleResponse$2) == obj2) {
                return obj2;
            }
            return unit;
        }
        long j5 = chaloTimeResponseAppModel2.f2674a;
        chaloTimeRefreshManagerUseCase$handleResponse$2.L$0 = null;
        chaloTimeRefreshManagerUseCase$handleResponse$2.L$1 = null;
        chaloTimeRefreshManagerUseCase$handleResponse$2.label = 2;
        if (j(j5, j2, source2, chaloTimeRefreshManagerUseCase$handleResponse$2) == obj2) {
            return obj2;
        }
        return unit;
    }

    public final void e(Source source) {
        Intrinsics.i(source, "source");
        Job job = this.f;
        if ((job != null && ((AbstractCoroutine) job).isActive()) || this.h || this.i) {
            return;
        }
        this.f = BuildersKt.d((CoroutineScope) this.e.getValue(), null, null, new ChaloTimeRefreshManagerUseCase$invoke$1(this, source, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, long j2, Source source, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1 chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1;
        long jE;
        long j3;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1) {
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1 = (ChaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1) continuationImpl;
            int i = chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1 = new ChaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1 = new ChaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1(this, continuationImpl);
        }
        Object objA = chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (j == -1) {
                h("fetched chaloTime invalid", MapsKt.k(new Pair("event description", "invalid reason default time")), source);
                return Boolean.FALSE;
            }
            jE = this.c.e(ElapsedRealTimeClock.DEEP_SLEEP_AWARE) - j2;
            j3 = 2;
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.L$0 = source;
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.J$0 = jE;
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.J$1 = j3;
            chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.label = 1;
            objA = a(chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.J$1;
            jE = chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.J$0;
            source = (Source) chaloTimeRefreshManagerUseCase$isFetchedChaloTimeValid$1.L$0;
            ResultKt.b(objA);
        }
        if (jE <= j3 * ((ChaloTimeConfig) objA).d) {
            return Boolean.TRUE;
        }
        h("fetched chaloTime invalid", MapsKt.k(new Pair("event description", "request timed out")), source);
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(Source source, int i, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1 chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1;
        char c;
        Source source2;
        int i2;
        long jE;
        ChaloTimeRepository chaloTimeRepository;
        Source source3;
        int i3;
        long j;
        ChaloTimeResponseAppModel chaloTimeResponseAppModel;
        long j2;
        Object objI;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1) {
            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1 = (ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1) continuationImpl;
            int i4 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1.label = i4 - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1 = new ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1 = new ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1(this, continuationImpl);
        }
        ChaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1 chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$1;
        Object objB = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label;
        Object obj2 = Unit.f17538a;
        SystemHelper systemHelper = this.c;
        Object obj3 = null;
        int i6 = 1;
        if (i5 == 0) {
            c = 0;
            ResultKt.b(objB);
            this.i = true;
            try {
                jE = systemHelper.e(ElapsedRealTimeClock.DEEP_SLEEP_AWARE);
                try {
                    chaloTimeRepository = this.b;
                    source2 = source;
                    try {
                        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = source2;
                        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = chaloTimeRepository;
                        i2 = i;
                        try {
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0 = i2;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.J$0 = jE;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 1;
                            objB = b(chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2);
                            if (objB == obj) {
                            }
                        } catch (Exception e) {
                            e = e;
                            i6 = 1;
                            source3 = source2;
                            i3 = i2;
                            obj3 = null;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
                            boolean z = c;
                            this.i = z;
                            Pair[] pairArr = new Pair[i6];
                            pairArr[z ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
                            h("chaloTime server error response received", MapsKt.k(pairArr), source3);
                            if (e instanceof ChaloLocalException) {
                                objI = obj2;
                            } else {
                                if (e instanceof NetworkSuccessResponseParseException) {
                                    h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
                                } else if (e instanceof ChaloTimeFetchFailedException) {
                                }
                                objI = obj2;
                            }
                            if (objI == obj) {
                                return obj;
                            }
                            return obj2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i;
                        i6 = 1;
                        source3 = source2;
                        i3 = i2;
                        obj3 = null;
                        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
                        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
                        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
                        boolean z2 = c;
                        this.i = z2;
                        Pair[] pairArr2 = new Pair[i6];
                        pairArr2[z2 ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
                        h("chaloTime server error response received", MapsKt.k(pairArr2), source3);
                        if (e instanceof ChaloLocalException) {
                            objI = obj2;
                        } else {
                            if (e instanceof NetworkSuccessResponseParseException) {
                                h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
                            } else if (e instanceof ChaloTimeFetchFailedException) {
                            }
                            objI = obj2;
                        }
                        if (objI == obj) {
                            return obj;
                        }
                        return obj2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    source2 = source;
                }
            } catch (Exception e4) {
                e = e4;
                source2 = source;
                i2 = i;
            }
            return obj;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                long j3 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.J$0;
                int i7 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0;
                Source source4 = (Source) chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0;
                try {
                    ResultKt.b(objB);
                    source3 = source4;
                    j = j3;
                    i3 = i7;
                    c = 0;
                    try {
                        chaloTimeResponseAppModel = (ChaloTimeResponseAppModel) objB;
                        i6 = 1;
                        j2 = j;
                        try {
                            Pair pair = new Pair("chaloTime received", String.valueOf(chaloTimeResponseAppModel.f2674a));
                            Pair pair2 = new Pair("difference", String.valueOf(chaloTimeResponseAppModel.f2674a - systemHelper.j()));
                            Pair pair3 = new Pair("reponse time", String.valueOf(systemHelper.e(ElapsedRealTimeClock.DEEP_SLEEP_AWARE) - j2));
                            Pair[] pairArr3 = new Pair[3];
                            pairArr3[c] = pair;
                            pairArr3[1] = pair2;
                            pairArr3[2] = pair3;
                            h("chaloTime success response", MapsKt.k(pairArr3), source3);
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = source3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0 = i3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 3;
                            if (d(j2, chaloTimeResponseAppModel, source3, i3, chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2) != obj) {
                                return obj;
                            }
                            return obj2;
                        } catch (Exception e5) {
                            e = e5;
                            obj3 = null;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
                            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
                            boolean z3 = c;
                            this.i = z3;
                            Pair[] pairArr4 = new Pair[i6];
                            pairArr4[z3 ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
                            h("chaloTime server error response received", MapsKt.k(pairArr4), source3);
                            if (e instanceof ChaloLocalException) {
                                objI = obj2;
                            } else {
                                if (e instanceof NetworkSuccessResponseParseException) {
                                    h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
                                } else if (e instanceof ChaloTimeFetchFailedException) {
                                }
                                objI = obj2;
                            }
                            if (objI == obj) {
                                return obj;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        i6 = 1;
                    }
                } catch (Exception e7) {
                    e = e7;
                    i3 = i7;
                    source3 = source4;
                    c = 0;
                    chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
                    chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
                    chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
                    boolean z4 = c;
                    this.i = z4;
                    Pair[] pairArr5 = new Pair[i6];
                    pairArr5[z4 ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
                    h("chaloTime server error response received", MapsKt.k(pairArr5), source3);
                    if (e instanceof ChaloLocalException) {
                        objI = obj2;
                    } else {
                        if (e instanceof NetworkSuccessResponseParseException) {
                            h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
                        } else if (e instanceof ChaloTimeFetchFailedException) {
                        }
                        objI = obj2;
                    }
                    if (objI == obj) {
                        return obj;
                    }
                }
            } else {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(objB);
                    return obj2;
                }
                int i8 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0;
                Source source5 = (Source) chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0;
                try {
                    ResultKt.b(objB);
                    return obj2;
                } catch (Exception e8) {
                    e = e8;
                    i3 = i8;
                    source3 = source5;
                }
            }
            c = 0;
        } else {
            jE = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.J$0;
            int i9 = chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0;
            chaloTimeRepository = (ChaloTimeRepository) chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1;
            c = 0;
            Source source6 = (Source) chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0;
            try {
                ResultKt.b(objB);
                i2 = i9;
                source2 = source6;
            } catch (Exception e9) {
                e = e9;
                i3 = i9;
                source3 = source6;
                obj3 = null;
                i6 = 1;
                chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
                chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
                chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
                boolean z5 = c;
                this.i = z5;
                Pair[] pairArr6 = new Pair[i6];
                pairArr6[z5 ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
                h("chaloTime server error response received", MapsKt.k(pairArr6), source3);
                if (e instanceof ChaloLocalException) {
                    objI = obj2;
                } else {
                    if (e instanceof NetworkSuccessResponseParseException) {
                        h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
                    } else if (e instanceof ChaloTimeFetchFailedException) {
                    }
                    objI = obj2;
                }
                if (objI == obj) {
                    return obj;
                }
            }
        }
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = obj3;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = obj3;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 4;
        boolean z6 = c;
        this.i = z6;
        Pair[] pairArr7 = new Pair[i6];
        pairArr7[z6 ? 1 : 0] = new Pair("desc", String.valueOf(e.getMessage()));
        h("chaloTime server error response received", MapsKt.k(pairArr7), source3);
        if (e instanceof ChaloLocalException) {
            objI = obj2;
        } else {
            if (e instanceof NetworkSuccessResponseParseException) {
                h("chaloTime null response", MapsKt.k(new Pair("system time", new Long(systemHelper.j()))), source3);
            } else if ((e instanceof ChaloTimeFetchFailedException) ? (objI = i(source3, i3, chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2)) != CoroutineSingletons.COROUTINE_SUSPENDED : !((ChaloTimeFetchFailedException) e).getShouldRetry() || (objI = i(source3, i3, chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
            objI = obj2;
        }
        if (objI == obj) {
            return obj;
        }
        return obj2;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = source2;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$1 = null;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0 = i2;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.J$0 = jE;
        chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 2;
        objB = chaloTimeRepository.d((ChaloTimeRequestConfig) objB, chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2);
        if (objB != obj) {
            j = jE;
            i3 = i2;
            source3 = source2;
            chaloTimeResponseAppModel = (ChaloTimeResponseAppModel) objB;
            i6 = 1;
            j2 = j;
            Pair pair4 = new Pair("chaloTime received", String.valueOf(chaloTimeResponseAppModel.f2674a));
            Pair pair5 = new Pair("difference", String.valueOf(chaloTimeResponseAppModel.f2674a - systemHelper.j()));
            Pair pair6 = new Pair("reponse time", String.valueOf(systemHelper.e(ElapsedRealTimeClock.DEEP_SLEEP_AWARE) - j2));
            Pair[] pairArr8 = new Pair[3];
            pairArr8[c] = pair4;
            pairArr8[1] = pair5;
            pairArr8[2] = pair6;
            h("chaloTime success response", MapsKt.k(pairArr8), source3);
            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.L$0 = source3;
            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.I$0 = i3;
            chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2.label = 3;
            if (d(j2, chaloTimeResponseAppModel, source3, i3, chaloTimeRefreshManagerUseCase$makeChaloTimeRequest$2) != obj) {
                return obj2;
            }
        }
        return obj;
    }

    public final void h(String str, LinkedHashMap linkedHashMap, Source source) {
        Source source2 = Source.UNKNOWN;
        linkedHashMap.put("refreshRequestingSource", source.getSourceName());
        AnalyticsContractImplKt.a(this.d, str, source, source2, linkedHashMap, 48);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Source source, int i, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$refresh$1 chaloTimeRefreshManagerUseCase$refresh$1;
        Object obj;
        int i2;
        Source source2;
        int i3;
        long jLongValue;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$refresh$1) {
            chaloTimeRefreshManagerUseCase$refresh$1 = (ChaloTimeRefreshManagerUseCase$refresh$1) continuationImpl;
            int i4 = chaloTimeRefreshManagerUseCase$refresh$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$refresh$1.label = i4 - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$refresh$1 = new ChaloTimeRefreshManagerUseCase$refresh$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$refresh$1 = new ChaloTimeRefreshManagerUseCase$refresh$1(this, continuationImpl);
        }
        Object obj2 = chaloTimeRefreshManagerUseCase$refresh$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = chaloTimeRefreshManagerUseCase$refresh$1.label;
        Unit unit = Unit.f17538a;
        if (i5 == 0) {
            ResultKt.b(obj2);
            chaloTimeRefreshManagerUseCase$refresh$1.L$0 = source;
            chaloTimeRefreshManagerUseCase$refresh$1.I$0 = i;
            chaloTimeRefreshManagerUseCase$refresh$1.I$1 = i;
            chaloTimeRefreshManagerUseCase$refresh$1.label = 1;
            Object objA = a(chaloTimeRefreshManagerUseCase$refresh$1);
            if (objA != obj3) {
                obj = objA;
                i2 = i;
            }
            return obj3;
        }
        if (i5 == 1) {
            i = chaloTimeRefreshManagerUseCase$refresh$1.I$1;
            int i6 = chaloTimeRefreshManagerUseCase$refresh$1.I$0;
            Source source3 = (Source) chaloTimeRefreshManagerUseCase$refresh$1.L$0;
            ResultKt.b(obj2);
            i2 = i6;
            source = source3;
            obj = obj2;
        } else {
            if (i5 == 2) {
                i3 = chaloTimeRefreshManagerUseCase$refresh$1.I$0;
                source2 = (Source) chaloTimeRefreshManagerUseCase$refresh$1.L$0;
                ResultKt.b(obj2);
                jLongValue = ((Number) obj2).longValue();
                chaloTimeRefreshManagerUseCase$refresh$1.L$0 = source2;
                chaloTimeRefreshManagerUseCase$refresh$1.I$0 = i3;
                chaloTimeRefreshManagerUseCase$refresh$1.label = 3;
                if (DelayKt.b(jLongValue, chaloTimeRefreshManagerUseCase$refresh$1) != obj3) {
                }
                return obj3;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj2);
                return unit;
            }
            i3 = chaloTimeRefreshManagerUseCase$refresh$1.I$0;
            source2 = (Source) chaloTimeRefreshManagerUseCase$refresh$1.L$0;
            ResultKt.b(obj2);
        }
        chaloTimeRefreshManagerUseCase$refresh$1.L$0 = null;
        chaloTimeRefreshManagerUseCase$refresh$1.label = 4;
        if (g(source2, i3, chaloTimeRefreshManagerUseCase$refresh$1) != obj3) {
            return obj3;
        }
        return unit;
        if (i >= ((ChaloTimeConfig) obj).b) {
            h("chaloTime max retries exceeded", MapsKt.k(new Pair("event description", vo1.j(i2, "retry count"))), source);
            this.i = false;
            return unit;
        }
        chaloTimeRefreshManagerUseCase$refresh$1.L$0 = source;
        chaloTimeRefreshManagerUseCase$refresh$1.I$0 = i2;
        chaloTimeRefreshManagerUseCase$refresh$1.label = 2;
        Object objC = c(i2, chaloTimeRefreshManagerUseCase$refresh$1);
        if (objC != obj3) {
            source2 = source;
            i3 = i2;
            obj2 = objC;
            jLongValue = ((Number) obj2).longValue();
            chaloTimeRefreshManagerUseCase$refresh$1.L$0 = source2;
            chaloTimeRefreshManagerUseCase$refresh$1.I$0 = i3;
            chaloTimeRefreshManagerUseCase$refresh$1.label = 3;
            if (DelayKt.b(jLongValue, chaloTimeRefreshManagerUseCase$refresh$1) != obj3) {
                chaloTimeRefreshManagerUseCase$refresh$1.L$0 = null;
                chaloTimeRefreshManagerUseCase$refresh$1.label = 4;
                if (g(source2, i3, chaloTimeRefreshManagerUseCase$refresh$1) != obj3) {
                    return unit;
                }
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object j(long j, long j2, Source source, ContinuationImpl continuationImpl) {
        ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1 chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1;
        Source source2;
        long j3;
        if (continuationImpl instanceof ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1) {
            chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1 = (ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1) continuationImpl;
            int i = chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1 = new ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1(this, continuationImpl);
            }
        } else {
            chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1 = new ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1(this, continuationImpl);
        }
        ChaloTimeRefreshManagerUseCase$updateChaloTimeCache$1 chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2 = chaloTimeRefreshManagerUseCase$updateChaloTimeCache$1;
        Object obj = chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ElapsedRealTimeClock elapsedRealTimeClock = ElapsedRealTimeClock.DEEP_SLEEP_AWARE;
            SystemHelper systemHelper = this.c;
            long jE = systemHelper.e(elapsedRealTimeClock);
            long j4 = ((jE - j2) / ((long) 2)) + j;
            long j5 = systemHelper.j();
            chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.L$0 = source;
            chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.J$0 = j4;
            chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.label = 1;
            if (this.b.a(j4, jE, j5, elapsedRealTimeClock, chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            source2 = source;
            j3 = j4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.J$0;
            source2 = (Source) chaloTimeRefreshManagerUseCase$updateChaloTimeCache$2.L$0;
            ResultKt.b(obj);
        }
        this.h = true;
        h("chaloTime fetched valid", MapsKt.k(new Pair("event description", uf0.l(j3, "adjusted chalo time "))), source2);
        return Unit.f17538a;
    }
}
