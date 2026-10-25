package app.chalo.ads;

import android.content.Context;
import app.chalo.R;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.chalologger.ChaloLog;
import com.amazon.device.ads.DTBAdSize;
import defpackage.dd;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.vz;
import defpackage.wn;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdManager;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExitInterstitialAdManager {
    public static final Source w = Source.HOME_SCREEN_TAB;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f774a;
    public final AdsterSdkInitializer b;
    public final AdTargetingProvider c;
    public final AnalyticsContract d;
    public final ExitInterstitialAdLoaderFactory e;
    public final Function0 f;
    public final Context g;
    public final String h;
    public final ContextScope i;
    public final Object j;
    public final BufferedChannel k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public ExitInterstitialLoadedAd r;
    public Long s;
    public ExitInterstitialLoadedAd t;
    public Job u;
    public final Flow v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdManager$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "PRELOAD_EXPIRY_MILLIS", "J", "Lapp/chalo/constants/Source;", "EXIT_INTERSTITIAL_SOURCE", "Lapp/chalo/constants/Source;", "EXIT_INTERSTITIAL_SCREEN", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ExitInterstitialAdManager(Context context, CoroutineContextProvider coroutineContextProvider, AdsterSdkInitializer adsterSdkInitializer, AdTargetingProvider adTargetingProvider, AnalyticsContract analyticsContract, ExitInterstitialAdLoaderFactory exitInterstitialAdLoaderFactory) {
        vz vzVar = new vz(24);
        this.f774a = coroutineContextProvider;
        this.b = adsterSdkInitializer;
        this.c = adTargetingProvider;
        this.d = analyticsContract;
        this.e = exitInterstitialAdLoaderFactory;
        this.f = vzVar;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        String string = applicationContext.getString(R.string.exit_interstitial_adster_placement_name);
        Intrinsics.h(string, "getString(...)");
        this.h = string;
        this.i = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.a()));
        this.j = new Object();
        BufferedChannel bufferedChannelA = ChannelKt.a(1, 4, BufferOverflow.DROP_OLDEST);
        this.k = bufferedChannelA;
        this.v = FlowKt.D(bufferedChannelA);
    }

    public static final void a(ExitInterstitialAdManager exitInterstitialAdManager, int i, String str, Throwable th, long j) {
        Object accepted;
        synchronized (exitInterstitialAdManager.j) {
            try {
                if (j != exitInterstitialAdManager.q) {
                    accepted = StaleLoadResolution.Stale.f827a;
                } else {
                    exitInterstitialAdManager.l = false;
                    exitInterstitialAdManager.m = false;
                    exitInterstitialAdManager.n = false;
                    ExitInterstitialLoadedAd exitInterstitialLoadedAd = exitInterstitialAdManager.r;
                    exitInterstitialAdManager.r = null;
                    exitInterstitialAdManager.s = null;
                    accepted = new StaleLoadResolution.Accepted(exitInterstitialLoadedAd);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (accepted instanceof StaleLoadResolution.Stale) {
            String message = "load failure ignored reason=stale_generation generation=" + j;
            Intrinsics.i(message, "message");
            return;
        }
        ExitInterstitialLoadedAd exitInterstitialLoadedAd2 = ((StaleLoadResolution.Accepted) accepted).f826a;
        if (exitInterstitialLoadedAd2 != null) {
            c(exitInterstitialLoadedAd2, "load_failure_reset");
        }
        h(exitInterstitialAdManager, "ad load failed", MapsKt.i(new Pair("errorCode", Integer.valueOf(i)), new Pair("errorMessage", str)), 2);
        StringBuilder sb = new StringBuilder("load failed code=");
        pk0.t(i, " message=", str, " generation=", sb);
        sb.append(j);
        ChaloLog.c("AdsterExitInterstitialAd", sb.toString(), th);
    }

    public static final boolean b(ExitInterstitialAdManager exitInterstitialAdManager, long j) {
        boolean z;
        synchronized (exitInterstitialAdManager.j) {
            z = j == exitInterstitialAdManager.q && exitInterstitialAdManager.l && exitInterstitialAdManager.m && exitInterstitialAdManager.n;
        }
        return z;
    }

    public static void c(ExitInterstitialLoadedAd exitInterstitialLoadedAd, String str) {
        Object objA;
        try {
            exitInterstitialLoadedAd.destroy();
            objA = Unit.f17538a;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (!(objA instanceof Result.Failure)) {
            vo1.x("ad destroyed reason=", str, "message");
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            ChaloLog.c("AdsterExitInterstitialAd", "ad destroy failed reason=" + str, thA);
        }
    }

    public static /* synthetic */ void h(ExitInterstitialAdManager exitInterstitialAdManager, String str, Map map, int i) {
        String str2 = exitInterstitialAdManager.h;
        if ((i & 4) != 0) {
            map = MapsKt.d();
        }
        exitInterstitialAdManager.g(str, str2, map);
    }

    public final boolean d(long j) {
        boolean z;
        synchronized (this.j) {
            z = j == this.q;
        }
        return z;
    }

    public final void e(long j) {
        boolean z;
        synchronized (this.j) {
            z = j == this.q && this.l && !this.m && this.u == null;
        }
        if (z) {
            Job jobD = BuildersKt.d(this.i, null, null, new ExitInterstitialAdManager$observeInitUntilTerminal$job$1(this, j, null), 3);
            synchronized (this.j) {
                this.u = jobD;
            }
            ((JobSupport) jobD).w(new wn(25, this, jobD));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0015, B:13:0x001e, B:16:0x0029, B:18:0x002d, B:19:0x0035), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0015, B:13:0x001e, B:16:0x0029, B:18:0x002d, B:19:0x0035), top: B:48:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0015, B:13:0x001e, B:16:0x0029, B:18:0x002d, B:19:0x0035), top: B:48:0x0003 }] */
    public final void f() {
        Object accepted;
        synchronized (this.j) {
            try {
                if (this.l) {
                    if ((this.b.f.getValue() instanceof AdsterSdkInitState.Failed) && !this.m) {
                        accepted = new PreloadResolution.Accepted(this.q, true);
                    } else if (this.l) {
                        accepted = new PreloadResolution.Ignored(this.q);
                    } else {
                        this.l = true;
                        accepted = new PreloadResolution.Accepted(this.q, false);
                    }
                } else if (this.l) {
                    accepted = new PreloadResolution.Ignored(this.q);
                } else {
                    this.l = true;
                    accepted = new PreloadResolution.Accepted(this.q, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (accepted instanceof PreloadResolution.Ignored) {
            String message = "preload ignored reason=already_requested generation=" + ((PreloadResolution.Ignored) accepted).f821a;
            Intrinsics.i(message, "message");
            return;
        }
        PreloadResolution.Accepted accepted2 = (PreloadResolution.Accepted) accepted;
        String str = accepted2.b ? "retry_after_init_failed" : "fresh_request";
        String str2 = this.h;
        String strF = Reflection.a(this.b.f.getValue().getClass()).f();
        long j = accepted2.f820a;
        StringBuilder sbE = dd.e("preload accepted reason=", str, " placement=", str2, " initState=");
        sbE.append(strF);
        sbE.append(" generation=");
        sbE.append(j);
        String message2 = sbE.toString();
        Intrinsics.i(message2, "message");
        this.b.a();
        long j2 = accepted2.f820a;
        AdsterSdkInitState adsterSdkInitState = (AdsterSdkInitState) this.b.f.getValue();
        if (adsterSdkInitState instanceof AdsterSdkInitState.Initialized) {
            j(j2, "initialized");
            return;
        }
        if ((adsterSdkInitState instanceof AdsterSdkInitState.NotInitialized) || Intrinsics.d(adsterSdkInitState, AdsterSdkInitState.Initializing.f725a)) {
            e(j2);
            return;
        }
        if (!(adsterSdkInitState instanceof AdsterSdkInitState.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        String message3 = "preload parked reason=init_failed generation=" + j2;
        Intrinsics.i(message3, "message");
        e(j2);
    }

    public final void g(String str, String str2, Map map) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("adUnitId", str2), new Pair("placement", LogConstants.DEFAULT_CHANNEL), new Pair(PaymentConstants.Event.SCREEN, "homeScreenTab"), new Pair("adSdk", "adster"), new Pair("adType", DTBAdSize.AAX_INTERSTITIAL_AD_SIZE));
        linkedHashMapK.putAll(map);
        AnalyticsContractImplKt.b(this.d, str, w, linkedHashMapK, false, 8);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, app.chalo.ads.ExitInterstitialLoadedAd] */
    public final void i(String str, String str2, String str3) {
        long j;
        ExitInterstitialLoadedAd exitInterstitialLoadedAd;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.j) {
            j = this.q + 1;
            this.q = j;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            Job job = this.u;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.u = null;
            exitInterstitialLoadedAd = this.r;
            objectRef.element = this.t;
            this.r = null;
            this.s = null;
            this.t = null;
        }
        String message = "reset reason=" + str + " generation=" + j;
        Intrinsics.i(message, "message");
        if (exitInterstitialLoadedAd != null) {
            BuildersKt.d(this.i, null, null, new ExitInterstitialAdManager$reset$2$1(this, exitInterstitialLoadedAd, str2, null), 3);
        }
        T t = objectRef.element;
        if (t == 0 || t == exitInterstitialLoadedAd) {
            return;
        }
        BuildersKt.d(this.i, null, null, new ExitInterstitialAdManager$reset$3(this, objectRef, str3, null), 3);
    }

    public final void j(long j, String str) {
        boolean z;
        synchronized (this.j) {
            if (j == this.q && this.l && !this.m) {
                z = true;
                this.m = true;
                this.n = true;
            } else {
                z = false;
            }
        }
        if (z) {
            BuildersKt.d(this.i, null, null, new ExitInterstitialAdManager$startLoadIfNeeded$1(this, j, str, null), 3);
            return;
        }
        String message = "load ignored reason=already_attempted trigger=" + str + " generation=" + j;
        Intrinsics.i(message, "message");
    }
}
