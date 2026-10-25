package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.location.Location;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.PermissionRequest;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1;
import com.adster.sdk.mediation.imavideo.IMABannerVideoAd$createCustomPlayerView$1$2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C2569m8;
import com.inmobi.media.E0;
import com.inmobi.media.H5;
import com.inmobi.media.Xb;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.services.HyperPaymentsServices;
import java.util.ArrayList;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.android.HandlerContext;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19167a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r00(int i, Object obj, Object obj2) {
        this.f19167a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19167a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                E0.a((E0) obj2, (JSONObject) obj);
                break;
            case 1:
                E0.a((E0) obj2, (Xb) obj);
                break;
            case 2:
                ExtensionEmbeddingBackend.SplitListenerWrapper.accept$lambda$1((ExtensionEmbeddingBackend.SplitListenerWrapper) obj2, (ArrayList) obj);
                break;
            case 3:
                FragmentStrictMode.handlePolicyViolation$lambda$0((FragmentStrictMode.Policy) obj2, (Violation) obj);
                break;
            case 4:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) obj2, (Violation) obj);
                break;
            case 5:
                H5.a((H5) obj2, (C2569m8) obj);
                break;
            case 6:
                int i2 = HandlerContext.e;
                ((CancellableContinuationImpl) obj2).D((HandlerContext) obj, Unit.f17538a);
                break;
            case 7:
                ((HyperPaymentsServices) obj2).lambda$uncaughtException$13((Throwable) obj);
                break;
            case 8:
                ((HyperPaymentsServices) obj2).lambda$process$10((FragmentActivity) obj);
                break;
            case 9:
                ((HyperPaymentsServices) obj2).lambda$setupJuspayServices$2((JSONObject) obj);
                break;
            case 10:
                IMABannerVideoAd$createCustomPlayerView$1$2.a((View) obj2, (View) obj);
                break;
            case 11:
                ((ImageDownload) obj2).lambda$start$0((TaskCompletionSource) obj);
                break;
            case 12:
                InMobiBanner.a((InMobiBanner) obj2, (Function0) obj);
                break;
            case 13:
                InMobiSdk.c((SdkInitializationListener) obj2, (String) obj);
                break;
            case 14:
                InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1 inlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1 = (InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1) obj;
                ViewTreeObserver viewTreeObserver = ((AdManagerAdView) obj2).getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(inlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1);
                }
                break;
            case 15:
                ((PermissionRequest) obj2).grant((String[]) obj);
                break;
            case 16:
                int i3 = JobInfoSchedulerService.f13148a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            case 17:
                ((JsInterface) obj2).lambda$addLogProperties$0((String) obj);
                break;
            case 18:
                ((JuspayServices) obj2).lambda$addFragment$11((FragmentActivity) obj);
                break;
            case 19:
                ((JuspayServices) obj2).lambda$initiate$4((String) obj);
                break;
            case 20:
                ((JuspayServices) obj2).lambda$initiate$5((Runnable) obj);
                break;
            case 21:
                ((JuspayWebView) obj2).lambda$addJsToWebView$0((String) obj);
                break;
            case 22:
                ((Consumer) obj2).accept((Location) obj);
                break;
            case 23:
                LogManager.Companion.registerWorkspace$lambda$2((Context) obj2, (String) obj);
                break;
            case 24:
                ((LogPusher) obj2).lambda$addLogsToPersistedQueue$0((JSONObject) obj);
                break;
            case 25:
                ((LogPusher) obj2).lambda$addLogsFromSessioniser$1((Queue) obj);
                break;
            case 26:
                ((LogPusher) obj2).lambda$addLogLines$2((Iterable) obj);
                break;
            case 27:
                ((LogPusherExp) obj2).lambda$addLogsToPersistedQueue$2((JSONObject) obj);
                break;
            case 28:
                ((LogSessioniser) obj2).lambda$sessioniseLogs$5((JSONObject) obj);
                break;
            default:
                ((LogSessioniserExp) obj2).lambda$addLogLine$1((JSONObject) obj);
                break;
        }
    }
}
