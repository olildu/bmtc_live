package app.chalo.analytics;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.events.AnalyticsEvent;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.analytics.senders.AnalyticsSender;
import app.chalo.analytics.utils.AnalyticsSystemHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/analytics/AnalyticsManager;", "", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f870a;
    public final DataStore b;
    public final AnalyticsSystemHelper c;
    public final ContextScope d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/analytics/AnalyticsManager$Companion;", "", "", "ANALYTICS_DATA_STORE_NAME", "Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AnalyticsManager(List senders, DataStore dataStore, AnalyticsSystemHelper analyticsSystemHelper) {
        Intrinsics.i(senders, "senders");
        this.f870a = senders;
        this.b = dataStore;
        this.c = analyticsSystemHelper;
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        this.d = CoroutineScopeKt.a(DefaultIoScheduler.f17895a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(AnalyticsManager analyticsManager, AnalyticsEvent analyticsEvent, ContinuationImpl continuationImpl) {
        AnalyticsManager$isMetricToBeReported$1 analyticsManager$isMetricToBeReported$1;
        analyticsManager.getClass();
        if (continuationImpl instanceof AnalyticsManager$isMetricToBeReported$1) {
            analyticsManager$isMetricToBeReported$1 = (AnalyticsManager$isMetricToBeReported$1) continuationImpl;
            int i = analyticsManager$isMetricToBeReported$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                analyticsManager$isMetricToBeReported$1.label = i - Integer.MIN_VALUE;
            } else {
                analyticsManager$isMetricToBeReported$1 = new AnalyticsManager$isMetricToBeReported$1(analyticsManager, continuationImpl);
            }
        } else {
            analyticsManager$isMetricToBeReported$1 = new AnalyticsManager$isMetricToBeReported$1(analyticsManager, continuationImpl);
        }
        Object objV = analyticsManager$isMetricToBeReported$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = analyticsManager$isMetricToBeReported$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objV);
            AnalyticsFrequency analyticsFrequency = analyticsEvent.c;
            if (!Intrinsics.d(analyticsFrequency, AnalyticsFrequency.Always.b)) {
                if (!(analyticsFrequency instanceof AnalyticsFrequency.Custom) && !Intrinsics.d(analyticsFrequency, AnalyticsFrequency.Daily.b) && !Intrinsics.d(analyticsFrequency, AnalyticsFrequency.Hourly.b) && !Intrinsics.d(analyticsFrequency, AnalyticsFrequency.Once.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String str = analyticsEvent.f876a;
                analyticsManager$isMetricToBeReported$1.L$0 = analyticsEvent;
                analyticsManager$isMetricToBeReported$1.label = 1;
                final Flow data = analyticsManager.b.getData();
                objV = FlowKt.v(new Flow<Long>() { // from class: app.chalo.analytics.AnalyticsManager$getLastReportedTime$$inlined$map$1

                    /* JADX INFO: renamed from: app.chalo.analytics.AnalyticsManager$getLastReportedTime$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f872a;
                        public final /* synthetic */ String b;

                        /* JADX INFO: renamed from: app.chalo.analytics.AnalyticsManager$getLastReportedTime$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.analytics.AnalyticsManager$getLastReportedTime$$inlined$map$1$2", f = "AnalyticsManager.kt", l = {50}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector, String str) {
                            this.f872a = flowCollector;
                            this.b = str;
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
                                Object obj3 = ((Preferences) obj).get(PreferencesKeys.longKey(this.b));
                                anonymousClass1.label = 1;
                                if (this.f872a.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
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
                        Object objCollect = data.collect(new AnonymousClass2(flowCollector, str), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                }, analyticsManager$isMetricToBeReported$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        analyticsEvent = (AnalyticsEvent) analyticsManager$isMetricToBeReported$1.L$0;
        ResultKt.b(objV);
        Long l = (Long) objV;
        if (l == null) {
            return Boolean.TRUE;
        }
        if (analyticsManager.c.currentTime() - l.longValue() < analyticsEvent.c.getF877a()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        AnalyticsManager$initialiseSenders$1 analyticsManager$initialiseSenders$1;
        Iterator it;
        Unit unit;
        if (continuationImpl instanceof AnalyticsManager$initialiseSenders$1) {
            analyticsManager$initialiseSenders$1 = (AnalyticsManager$initialiseSenders$1) continuationImpl;
            int i = analyticsManager$initialiseSenders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                analyticsManager$initialiseSenders$1.label = i - Integer.MIN_VALUE;
            } else {
                analyticsManager$initialiseSenders$1 = new AnalyticsManager$initialiseSenders$1(this, continuationImpl);
            }
        } else {
            analyticsManager$initialiseSenders$1 = new AnalyticsManager$initialiseSenders$1(this, continuationImpl);
        }
        Object obj = analyticsManager$initialiseSenders$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = analyticsManager$initialiseSenders$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            it = this.f870a.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) analyticsManager$initialiseSenders$1.L$0;
            ResultKt.b(obj);
        }
        do {
            boolean zHasNext = it.hasNext();
            unit = Unit.f17538a;
            if (!zHasNext) {
                return unit;
            }
            AnalyticsSender analyticsSender = (AnalyticsSender) it.next();
            analyticsManager$initialiseSenders$1.L$0 = it;
            analyticsManager$initialiseSenders$1.label = 1;
            analyticsSender.a();
        } while (unit != coroutineSingletons);
        return coroutineSingletons;
    }

    public final void c(AnalyticsEvent analyticsEvent) {
        AnalyticsSystemHelper analyticsSystemHelper = this.c;
        analyticsEvent.a(analyticsSystemHelper.a(), "dayOfEvent");
        analyticsEvent.a(String.valueOf(analyticsSystemHelper.currentTime()), "time");
        Iterator it = this.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).g(analyticsEvent);
        }
    }
}
