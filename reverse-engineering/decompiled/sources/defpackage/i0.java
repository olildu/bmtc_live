package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.FullyDrawnReporter;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.ui.DefaultTimeBar;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.chalo.ads.AdsterSdkInitState;
import app.chalo.ads.AdsterSdkInitializer;
import app.chalo.utils.chalologger.ChaloLog;
import com.adster.sdk.mediation.AdSter;
import com.adster.sdk.mediation.InitializationListener;
import com.adster.sdk.mediation.adster.AdsterInterstitialAdView;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DTBMetricsProcessor;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.firebase.installations.FirebaseInstallations;
import com.inmobi.media.Ca;
import defpackage.t;
import defpackage.vo1;
import in.juspay.hyperqr.CameraStreamScanner;
import in.juspay.hypersdk.safe.Godel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import so.plotline.insights.ActivityCallback;
import so.plotline.insights.Helpers.DebugHelper;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15871a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i) {
        this.f15871a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        switch (this.f15871a) {
            case 0:
                ActivityCallback activityCallback = (ActivityCallback) this.b;
                try {
                    activityCallback.g = true;
                    activityCallback.c();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ActivityCallback.a aVar = (ActivityCallback.a) this.b;
                aVar.getClass();
                try {
                    aVar.setEnabled(true);
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 2:
                AdsterInterstitialAdView.a((AdsterInterstitialAdView) this.b);
                break;
            case 3:
                final AdsterSdkInitializer adsterSdkInitializer = (AdsterSdkInitializer) this.b;
                try {
                    AdSter adSter = AdSter.INSTANCE;
                    Context appContext = adsterSdkInitializer.b;
                    Intrinsics.h(appContext, "appContext");
                    adSter.initializeSdk(appContext, new InitializationListener() { // from class: app.chalo.ads.AdsterSdkInitializer$initializeIfNeeded$1$1$1
                        @Override // com.adster.sdk.mediation.InitializationListener
                        public final void onInitializationComplete(List adapterStatus) {
                            Intrinsics.i(adapterStatus, "adapterStatus");
                            adsterSdkInitializer.e.setValue(new AdsterSdkInitState.Initialized(adapterStatus));
                            vo1.x("adster init complete adapters=", CollectionsKt.O(adapterStatus, null, null, null, new t(4), 31), "message");
                        }
                    });
                    objA = Unit.f17538a;
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    adsterSdkInitializer.e.setValue(new AdsterSdkInitState.Failed(thA));
                    adsterSdkInitializer.c.set(false);
                    ChaloLog.c("AdSterInit", "adster init failed", thA);
                }
                break;
            case 4:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) this.b);
                break;
            case 5:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) this.b);
                break;
            case 6:
                ApsInterstitialActivity.m7714useCustomButtonUpdated$lambda15((ApsInterstitialActivity) this.b);
                break;
            case 7:
                Ca.a((Ca) this.b);
                break;
            case 8:
                CameraStreamScanner.releaseCameraResources$lambda$5((CameraStreamScanner) this.b);
                break;
            case 9:
                ((Carousel) this.b).lambda$updateItems$0();
                break;
            case 10:
                ((CarouselLayoutManager) this.b).t();
                break;
            case 11:
                ((ComponentActivity) this.b).invalidateMenu();
                break;
            case 12:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            case 13:
                ((CompositingVideoSinkProvider) this.b).flushInternal();
                break;
            case 14:
                ConstraintTrackingWorker.startWork$lambda$0((ConstraintTrackingWorker) this.b);
                break;
            case 15:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) this.b);
                break;
            case 16:
                ((DTBInterstitialActivity) this.b).lambda$useCustomButtonUpdated$0();
                break;
            case 17:
                ((DTBMetricsConfiguration) this.b).lambda$loadMobileClientConfig$0();
                break;
            case 18:
                ((DTBMetricsProcessor) this.b).lambda$dispenseReport$1();
                break;
            case 19:
                ((DefaultAnalyticsCollector) this.b).releaseInternal();
                break;
            case 20:
                ((DefaultAudioSink) this.b).maybeReportSkippedSilence();
                break;
            case 21:
                ((DefaultTimeBar) this.b).lambda$new$0();
                break;
            case 22:
                ((DownloadHelper) this.b).lambda$onMediaPrepared$4();
                break;
            case 23:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) this.b);
                break;
            case 24:
                ((FirebaseInstallations) this.b).lambda$getId$1();
                break;
            case 25:
                ((Fragment) this.b).lambda$performCreateView$0();
                break;
            case 26:
                ((FragmentManager) this.b).lambda$cancelBackStackTransition$4();
                break;
            case 27:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.b);
                break;
            case 28:
                ((Godel) this.b).resetWebView();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.b).onPrepared();
                break;
        }
    }
}
