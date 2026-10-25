package app.chalo.android;

import android.app.Activity;
import androidx.lifecycle.LifecycleCoroutineScope;
import app.chalo.ads.ExitInterstitialAdConfig;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.ads.ExitInterstitialCapState;
import app.chalo.ads.ExitInterstitialCapStore;
import app.chalo.ads.ExitInterstitialConfigProvider;
import app.chalo.ads.ExitInterstitialDecisionEngine;
import app.chalo.ads.ExitInterstitialDecisionReason;
import app.chalo.ads.ExitInterstitialLoadedAd;
import app.chalo.ads.ShowResolution;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.utils.chalologger.ChaloLog;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import defpackage.vo1;
import defpackage.vz;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/android/ExitInterstitialExitGate;", "", "Companion", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExitInterstitialExitGate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExitInterstitialConfigProvider f903a;
    public final ExitInterstitialCapStore b;
    public final ExitInterstitialDecisionEngine c;
    public final ExitInterstitialAdManager d;
    public final AnalyticsContract e;
    public final CoroutineScope f;
    public final Function0 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public Job k;
    public Job l;
    public boolean m;
    public ExitInterstitialCapState n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/android/ExitInterstitialExitGate$Companion;", "", "", "TAG", "Ljava/lang/String;", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    public ExitInterstitialExitGate(ExitInterstitialConfigProvider configProvider, ExitInterstitialCapStore capStore, ExitInterstitialDecisionEngine decisionEngine, ExitInterstitialAdManager adManager, AnalyticsContract analytics, LifecycleCoroutineScope coroutineScope) {
        vz vzVar = new vz(25);
        Intrinsics.i(configProvider, "configProvider");
        Intrinsics.i(capStore, "capStore");
        Intrinsics.i(decisionEngine, "decisionEngine");
        Intrinsics.i(adManager, "adManager");
        Intrinsics.i(analytics, "analytics");
        Intrinsics.i(coroutineScope, "coroutineScope");
        this.f903a = configProvider;
        this.b = capStore;
        this.c = decisionEngine;
        this.d = adManager;
        this.e = analytics;
        this.f = coroutineScope;
        this.g = vzVar;
        this.n = new ExitInterstitialCapState();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148 A[Catch: all -> 0x0182, CancellationException -> 0x018d, TRY_ENTER, TryCatch #9 {CancellationException -> 0x018d, all -> 0x0182, blocks: (B:22:0x005a, B:74:0x0160, B:71:0x0148), top: B:113:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3  */
    public static final Object a(ExitInterstitialExitGate exitInterstitialExitGate, Activity activity, Function0 function0, long j, ContinuationImpl continuationImpl) {
        ExitInterstitialExitGate$handleEligibleShowBack$1 exitInterstitialExitGate$handleEligibleShowBack$1;
        ExitInterstitialLoadedAd exitInterstitialLoadedAd;
        ShowResolution ready;
        Object objA;
        boolean zBooleanValue;
        Function0 function1;
        Function0 function2;
        ExitInterstitialDecisionReason exitInterstitialDecisionReason;
        exitInterstitialExitGate.getClass();
        if (continuationImpl instanceof ExitInterstitialExitGate$handleEligibleShowBack$1) {
            exitInterstitialExitGate$handleEligibleShowBack$1 = (ExitInterstitialExitGate$handleEligibleShowBack$1) continuationImpl;
            int i = exitInterstitialExitGate$handleEligibleShowBack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exitInterstitialExitGate$handleEligibleShowBack$1.label = i - Integer.MIN_VALUE;
            } else {
                exitInterstitialExitGate$handleEligibleShowBack$1 = new ExitInterstitialExitGate$handleEligibleShowBack$1(exitInterstitialExitGate, continuationImpl);
            }
        } else {
            exitInterstitialExitGate$handleEligibleShowBack$1 = new ExitInterstitialExitGate$handleEligibleShowBack$1(exitInterstitialExitGate, continuationImpl);
        }
        Object objB = exitInterstitialExitGate$handleEligibleShowBack$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = exitInterstitialExitGate$handleEligibleShowBack$1.label;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.b(objB);
                        ExitInterstitialCapState exitInterstitialCapState = (ExitInterstitialCapState) objB;
                        exitInterstitialExitGate.n = exitInterstitialCapState;
                        String message = "cap action=record_show exitCount=" + exitInterstitialCapState.f778a + " lastShownAt=" + exitInterstitialCapState.b;
                        Intrinsics.i(message, "message");
                        return Unit.f17538a;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function0) exitInterstitialExitGate$handleEligibleShowBack$1.L$1;
                    try {
                        ResultKt.b(objB);
                        exitInterstitialExitGate.i = false;
                        exitInterstitialExitGate.j = false;
                        exitInterstitialExitGate.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                        function2.invoke();
                        exitInterstitialExitGate.e("show_rejected", true);
                    } catch (Throwable th) {
                        th = th;
                        exitInterstitialExitGate.i = false;
                        exitInterstitialExitGate.j = false;
                        ChaloLog.c("AdsterExitInterstitialExitGate", "exit action=allow reason=unexpected_failure", th);
                        exitInterstitialExitGate.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                        function2.invoke();
                        exitInterstitialExitGate.e("unexpected_failure", true);
                    }
                    return Unit.f17538a;
                }
                ResultKt.b(objB);
                exitInterstitialExitGate.j = true;
                ExitInterstitialAdManager exitInterstitialAdManager = exitInterstitialExitGate.d;
                exitInterstitialAdManager.getClass();
                Intrinsics.i(activity, "activity");
                synchronized (exitInterstitialAdManager.j) {
                    try {
                        if (exitInterstitialAdManager.o || (exitInterstitialLoadedAd = exitInterstitialAdManager.r) == null) {
                            ready = ShowResolution.Blocked.f823a;
                        } else {
                            Long l = exitInterstitialAdManager.s;
                            long jLongValue = ((Number) exitInterstitialAdManager.f.invoke()).longValue() - (l != null ? l.longValue() : 0L);
                            if (jLongValue > DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL) {
                                exitInterstitialAdManager.r = null;
                                exitInterstitialAdManager.s = null;
                                String message2 = "show ignored reason=expired ageMs=" + jLongValue;
                                Intrinsics.i(message2, "message");
                                ready = new ShowResolution.Expired(exitInterstitialLoadedAd);
                            } else {
                                exitInterstitialAdManager.r = null;
                                exitInterstitialAdManager.s = null;
                                exitInterstitialAdManager.t = exitInterstitialLoadedAd;
                                exitInterstitialAdManager.o = true;
                                exitInterstitialAdManager.p = false;
                                ready = new ShowResolution.Ready(exitInterstitialLoadedAd);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ready instanceof ShowResolution.Expired) {
                    ExitInterstitialAdManager.c(((ShowResolution.Expired) ready).f824a, "expired_show_attempt");
                } else {
                    if (ready instanceof ShowResolution.Ready) {
                        ExitInterstitialLoadedAd exitInterstitialLoadedAd2 = ((ShowResolution.Ready) ready).f825a;
                        try {
                            exitInterstitialLoadedAd2.a(activity);
                            String message3 = "show accepted activity=" + Reflection.a(activity.getClass()).f();
                            Intrinsics.i(message3, "message");
                            objA = Boolean.TRUE;
                        } catch (Throwable th3) {
                            objA = ResultKt.a(th3);
                        }
                        Throwable thA = Result.a(objA);
                        if (thA != null) {
                            synchronized (exitInterstitialAdManager.j) {
                                try {
                                    if (exitInterstitialAdManager.t == exitInterstitialLoadedAd2) {
                                        exitInterstitialAdManager.t = null;
                                    }
                                    exitInterstitialAdManager.o = false;
                                    exitInterstitialAdManager.p = false;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            ChaloLog.c("AdsterExitInterstitialAd", "show failed", thA);
                            ExitInterstitialAdManager.c(exitInterstitialLoadedAd2, "show_failure");
                            objA = Boolean.FALSE;
                        }
                        zBooleanValue = ((Boolean) objA).booleanValue();
                    }
                    if (!zBooleanValue) {
                        ExitInterstitialCapStore exitInterstitialCapStore = exitInterstitialExitGate.b;
                        Long l2 = new Long(j);
                        exitInterstitialExitGate$handleEligibleShowBack$1.L$0 = null;
                        exitInterstitialExitGate$handleEligibleShowBack$1.L$1 = null;
                        exitInterstitialExitGate$handleEligibleShowBack$1.J$0 = j;
                        exitInterstitialExitGate$handleEligibleShowBack$1.label = 1;
                        objB = exitInterstitialCapStore.b(l2, exitInterstitialExitGate$handleEligibleShowBack$1);
                        if (objB == obj) {
                            return obj;
                        }
                        ExitInterstitialCapState exitInterstitialCapState2 = (ExitInterstitialCapState) objB;
                        exitInterstitialExitGate.n = exitInterstitialCapState2;
                        String message4 = "cap action=record_show exitCount=" + exitInterstitialCapState2.f778a + " lastShownAt=" + exitInterstitialCapState2.b;
                        Intrinsics.i(message4, "message");
                        return Unit.f17538a;
                    }
                    try {
                        exitInterstitialDecisionReason = ExitInterstitialDecisionReason.SUPPRESSED_NOT_READY;
                        exitInterstitialExitGate$handleEligibleShowBack$1.L$0 = null;
                        function1 = function0;
                        try {
                            exitInterstitialExitGate$handleEligibleShowBack$1.L$1 = function1;
                            exitInterstitialExitGate$handleEligibleShowBack$1.J$0 = j;
                            exitInterstitialExitGate$handleEligibleShowBack$1.label = 2;
                            if (exitInterstitialExitGate.c(exitInterstitialDecisionReason, exitInterstitialExitGate$handleEligibleShowBack$1) == obj) {
                                return obj;
                            }
                            function2 = function1;
                            exitInterstitialExitGate.i = false;
                            exitInterstitialExitGate.j = false;
                            exitInterstitialExitGate.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                            function2.invoke();
                            exitInterstitialExitGate.e("show_rejected", true);
                            return Unit.f17538a;
                        } catch (Throwable th5) {
                            th = th5;
                            function2 = function1;
                            exitInterstitialExitGate.i = false;
                            exitInterstitialExitGate.j = false;
                            ChaloLog.c("AdsterExitInterstitialExitGate", "exit action=allow reason=unexpected_failure", th);
                            exitInterstitialExitGate.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                            function2.invoke();
                            exitInterstitialExitGate.e("unexpected_failure", true);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        function1 = function0;
                    }
                }
                zBooleanValue = false;
                if (!zBooleanValue) {
                    exitInterstitialDecisionReason = ExitInterstitialDecisionReason.SUPPRESSED_NOT_READY;
                    exitInterstitialExitGate$handleEligibleShowBack$1.L$0 = null;
                    function1 = function0;
                    exitInterstitialExitGate$handleEligibleShowBack$1.L$1 = function1;
                    exitInterstitialExitGate$handleEligibleShowBack$1.J$0 = j;
                    exitInterstitialExitGate$handleEligibleShowBack$1.label = 2;
                    if (exitInterstitialExitGate.c(exitInterstitialDecisionReason, exitInterstitialExitGate$handleEligibleShowBack$1) == obj) {
                        return obj;
                    }
                    function2 = function1;
                    exitInterstitialExitGate.i = false;
                    exitInterstitialExitGate.j = false;
                    exitInterstitialExitGate.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                    function2.invoke();
                    exitInterstitialExitGate.e("show_rejected", true);
                    return Unit.f17538a;
                }
                ExitInterstitialCapStore exitInterstitialCapStore2 = exitInterstitialExitGate.b;
                Long l3 = new Long(j);
                exitInterstitialExitGate$handleEligibleShowBack$1.L$0 = null;
                exitInterstitialExitGate$handleEligibleShowBack$1.L$1 = null;
                exitInterstitialExitGate$handleEligibleShowBack$1.J$0 = j;
                exitInterstitialExitGate$handleEligibleShowBack$1.label = 1;
                objB = exitInterstitialCapStore2.b(l3, exitInterstitialExitGate$handleEligibleShowBack$1);
                if (objB == obj) {
                    return obj;
                }
                ExitInterstitialCapState exitInterstitialCapState3 = (ExitInterstitialCapState) objB;
                exitInterstitialExitGate.n = exitInterstitialCapState3;
                String message5 = "cap action=record_show exitCount=" + exitInterstitialCapState3.f778a + " lastShownAt=" + exitInterstitialCapState3.b;
                Intrinsics.i(message5, "message");
                return Unit.f17538a;
            } catch (CancellationException e) {
                exitInterstitialExitGate.i = false;
                exitInterstitialExitGate.j = false;
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th7) {
            ChaloLog.c("AdsterExitInterstitialExitGate", "cap action=record_show_failed", th7);
        }
    }

    public final boolean b(String str) {
        if (!this.j) {
            return false;
        }
        this.j = false;
        this.h = true;
        this.i = false;
        AnalyticsContractImplKt.b(this.e, "exit interstitial dismissed return home", Source.HOME_SCREEN_TAB, MapsKt.d(), false, 8);
        String message = "ad dismissal action=return_home_and_arm_skip trigger=".concat(str);
        Intrinsics.i(message, "message");
        this.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
        d(this.f903a.b(), str);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(ExitInterstitialDecisionReason exitInterstitialDecisionReason, ContinuationImpl continuationImpl) {
        ExitInterstitialExitGate$persistSuppressedExitAttempt$1 exitInterstitialExitGate$persistSuppressedExitAttempt$1;
        if (continuationImpl instanceof ExitInterstitialExitGate$persistSuppressedExitAttempt$1) {
            exitInterstitialExitGate$persistSuppressedExitAttempt$1 = (ExitInterstitialExitGate$persistSuppressedExitAttempt$1) continuationImpl;
            int i = exitInterstitialExitGate$persistSuppressedExitAttempt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exitInterstitialExitGate$persistSuppressedExitAttempt$1.label = i - Integer.MIN_VALUE;
            } else {
                exitInterstitialExitGate$persistSuppressedExitAttempt$1 = new ExitInterstitialExitGate$persistSuppressedExitAttempt$1(this, continuationImpl);
            }
        } else {
            exitInterstitialExitGate$persistSuppressedExitAttempt$1 = new ExitInterstitialExitGate$persistSuppressedExitAttempt$1(this, continuationImpl);
        }
        Object objB = exitInterstitialExitGate$persistSuppressedExitAttempt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = exitInterstitialExitGate$persistSuppressedExitAttempt$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                ExitInterstitialCapStore exitInterstitialCapStore = this.b;
                exitInterstitialExitGate$persistSuppressedExitAttempt$1.L$0 = exitInterstitialDecisionReason;
                exitInterstitialExitGate$persistSuppressedExitAttempt$1.label = 1;
                objB = exitInterstitialCapStore.b(null, exitInterstitialExitGate$persistSuppressedExitAttempt$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exitInterstitialDecisionReason = (ExitInterstitialDecisionReason) exitInterstitialExitGate$persistSuppressedExitAttempt$1.L$0;
                ResultKt.b(objB);
            }
            ExitInterstitialCapState exitInterstitialCapState = (ExitInterstitialCapState) objB;
            this.n = exitInterstitialCapState;
            String message = "cap action=record_suppress exitCount=" + exitInterstitialCapState.f778a + " lastShownAt=" + exitInterstitialCapState.b + " reason=" + exitInterstitialDecisionReason.getAnalyticsValue();
            Intrinsics.i(message, "message");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            ChaloLog.c("AdsterExitInterstitialExitGate", "cap action=record_suppress_failed reason=" + exitInterstitialDecisionReason.getAnalyticsValue(), th);
        }
        return Unit.f17538a;
    }

    public final void d(ExitInterstitialAdConfig exitInterstitialAdConfig, String str) {
        if (exitInterstitialAdConfig == null) {
            String message = "preload rearm skipped trigger=" + str + " reason=config_not_ready";
            Intrinsics.i(message, "message");
            return;
        }
        if (exitInterstitialAdConfig.d) {
            vo1.x("preload rearm trigger=", str, "message");
            this.d.f();
            return;
        }
        String message2 = "preload rearm skipped trigger=" + str + " reason=config_disabled";
        Intrinsics.i(message2, "message");
    }

    public final void e(String str, boolean z) {
        Job job = this.l;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.l = BuildersKt.d(this.f, null, null, new ExitInterstitialExitGate$warmCapState$1(this, str, z, null), 3);
        }
    }
}
