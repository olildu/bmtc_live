package app.chalo.analytics;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsEvent;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.analytics.senders.AnalyticsSender;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.language.LanguageFeature;
import app.chalo.location.LastKnownLocationProvider;
import app.chalo.plotline.PlotlineContract;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usecase.IsDebugAnalyticsEventsEnabledUseCase;
import com.adjust.sdk.Constants;
import defpackage.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/analytics/AnalyticsContractImpl;", "Lapp/chalo/analytics/contract/AnalyticsContract;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsContractImpl implements AnalyticsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f869a;
    public final ChaloTimeProvider b;
    public final CityProvider c;
    public final LanguageFeature d;
    public final ChaloBuildConfig e;
    public final IsDebugAnalyticsEventsEnabledUseCase f;
    public final PlotlineContract g;
    public final LastKnownLocationProvider h;
    public final ContextScope i;
    public final BufferedChannel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/analytics/AnalyticsContractImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AnalyticsContractImpl(AnalyticsManager analyticsManager, ChaloTimeProvider chaloTimeProvider, CityProvider cityProvider, LanguageFeature languageFeature, ChaloBuildConfig chaloBuildConfig, IsDebugAnalyticsEventsEnabledUseCase isDebugAnalyticsEventsEnabledUseCase, PlotlineContract plotlineContract, LastKnownLocationProvider lastKnownLocationProvider, CoroutineContextProvider coroutineContextProvider) {
        this.f869a = analyticsManager;
        this.b = chaloTimeProvider;
        this.c = cityProvider;
        this.d = languageFeature;
        this.e = chaloBuildConfig;
        this.f = isDebugAnalyticsEventsEnabledUseCase;
        this.g = plotlineContract;
        this.h = lastKnownLocationProvider;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.i = contextScopeA;
        this.j = ChannelKt.a(-2, 6, null);
        ((JobSupport) BuildersKt.d(contextScopeA, null, null, new AnalyticsContractImpl$startEventProcessor$1(this, null), 3)).w(new g(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:13:0x0034, B:33:0x008f, B:35:0x00a3, B:36:0x00a7, B:18:0x004c, B:25:0x0069, B:27:0x006d, B:29:0x0074, B:21:0x0057), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:13:0x0034, B:33:0x008f, B:35:0x00a3, B:36:0x00a7, B:18:0x004c, B:25:0x0069, B:27:0x006d, B:29:0x0074, B:21:0x0057), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object J(AnalyticsContractImpl analyticsContractImpl, AnalyticsEvent analyticsEvent, ContinuationImpl continuationImpl) throws Exception {
        AnalyticsContractImpl$processEvent$1 analyticsContractImpl$processEvent$1;
        String str;
        Object objB;
        AnalyticsEvent analyticsEvent2;
        String str2;
        AnalyticsEvent analyticsEvent3;
        AnalyticsEvent event;
        AnalyticsManager analyticsManager;
        ChaloTimeProvider chaloTimeProvider = analyticsContractImpl.b;
        if (continuationImpl instanceof AnalyticsContractImpl$processEvent$1) {
            analyticsContractImpl$processEvent$1 = (AnalyticsContractImpl$processEvent$1) continuationImpl;
            int i = analyticsContractImpl$processEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                analyticsContractImpl$processEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                analyticsContractImpl$processEvent$1 = new AnalyticsContractImpl$processEvent$1(analyticsContractImpl, continuationImpl);
            }
        } else {
            analyticsContractImpl$processEvent$1 = new AnalyticsContractImpl$processEvent$1(analyticsContractImpl, continuationImpl);
        }
        Object objC = analyticsContractImpl$processEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = analyticsContractImpl$processEvent$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                str = "chaloTimestamp";
                analyticsContractImpl$processEvent$1.L$0 = analyticsEvent;
                analyticsContractImpl$processEvent$1.L$1 = analyticsEvent;
                analyticsContractImpl$processEvent$1.L$2 = "chaloTimestamp";
                analyticsContractImpl$processEvent$1.label = 1;
                objB = chaloTimeProvider.b(analyticsContractImpl$processEvent$1);
                if (objB != coroutineSingletons) {
                    analyticsEvent2 = analyticsEvent;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                String str3 = (String) analyticsContractImpl$processEvent$1.L$2;
                AnalyticsEvent analyticsEvent4 = (AnalyticsEvent) analyticsContractImpl$processEvent$1.L$1;
                analyticsEvent2 = (AnalyticsEvent) analyticsContractImpl$processEvent$1.L$0;
                ResultKt.b(objC);
                str = str3;
                analyticsEvent = analyticsEvent4;
                objB = objC;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) analyticsContractImpl$processEvent$1.L$2;
                analyticsEvent3 = (AnalyticsEvent) analyticsContractImpl$processEvent$1.L$1;
                event = (AnalyticsEvent) analyticsContractImpl$processEvent$1.L$0;
                ResultKt.b(objC);
            }
            analyticsEvent3.a(objC, str2);
            analyticsManager = analyticsContractImpl.f869a;
            Intrinsics.i(event, "event");
            if (Intrinsics.d(event.c, AnalyticsFrequency.Always.b)) {
                analyticsManager.c(event);
            } else {
                BuildersKt.d(analyticsManager.d, null, null, new AnalyticsManager$checkAndReportEventIfNeeded$1(analyticsManager, event, null), 3);
            }
            return Unit.f17538a;
            Long l = (Long) objB;
            analyticsEvent.a(new Long(l != null ? l.longValue() : -1L), str);
            str2 = "isChaloTimeAvailable";
            analyticsContractImpl$processEvent$1.L$0 = analyticsEvent2;
            analyticsContractImpl$processEvent$1.L$1 = analyticsEvent2;
            analyticsContractImpl$processEvent$1.L$2 = "isChaloTimeAvailable";
            analyticsContractImpl$processEvent$1.label = 2;
            objC = chaloTimeProvider.c(analyticsContractImpl$processEvent$1);
            if (objC != coroutineSingletons) {
                analyticsEvent3 = analyticsEvent2;
                event = analyticsEvent3;
                analyticsEvent3.a(objC, str2);
                analyticsManager = analyticsContractImpl.f869a;
                Intrinsics.i(event, "event");
                if (Intrinsics.d(event.c, AnalyticsFrequency.Always.b)) {
                    analyticsManager.c(event);
                } else {
                    BuildersKt.d(analyticsManager.d, null, null, new AnalyticsManager$checkAndReportEventIfNeeded$1(analyticsManager, event, null), 3);
                }
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void F(String name, String source, Map map) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        BuildersKt.d(this.i, null, null, new AnalyticsContractImpl$raiseDebugEvent$1(this, name, source, map, null), 3);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void a(Map properties) {
        Intrinsics.i(properties, "properties");
        this.g.d(properties);
        Iterator it = this.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).h(properties);
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void b() {
        Iterator it = this.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).b();
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void d(Map properties) {
        Intrinsics.i(properties, "properties");
        Iterator it = this.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).c(properties);
        }
        this.g.c(properties);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void e(String name, String source, Map map, AnalyticsFrequency frequency, boolean z) {
        Intrinsics.i(name, "name");
        Intrinsics.i(source, "source");
        Intrinsics.i(frequency, "frequency");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", source);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        AnalyticsEvent analyticsEvent = new AnalyticsEvent(name, linkedHashMap, frequency);
        if (this.j.mo7576trySendJP2dKIU(analyticsEvent) instanceof ChannelResult.Failed) {
            BuildersKt.d(this.i, null, CoroutineStart.UNDISPATCHED, new AnalyticsContractImpl$postEvent$1(this, analyticsEvent, null), 1);
        }
        if (z) {
            this.g.a(name, source, map);
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void g(double d, double d2) {
        BuildersKt.d(this.i, null, null, new AnalyticsContractImpl$sendLatLongToAnalytics$1(this, d, d2, null), 3);
        Map mapI = MapsKt.i(new Pair("lat", String.valueOf(d)), new Pair(Constants.LONG, String.valueOf(d2)), new Pair("latlong", new Pair(String.valueOf(d), String.valueOf(d2)).toString()));
        a(mapI);
        d(mapI);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void o(String str) {
        Iterator it = this.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).e(str);
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void v(String username) {
        Intrinsics.i(username, "username");
        Iterator it = this.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).d(username);
        }
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void y() {
        BuildersKt.d(this.i, null, null, new AnalyticsContractImpl$setupAnalytics$1(this, null), 3);
    }

    @Override // app.chalo.analytics.contract.AnalyticsContract
    public final void q() {
    }
}
