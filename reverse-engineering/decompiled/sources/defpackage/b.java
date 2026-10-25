package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.DispatchQueue;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.chalo.ads.AdsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1;
import app.chalo.ads.AdsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.ads.util.adview.ApsAdViewWebBridge;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBMetricsProcessor;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.inmobi.media.A7;
import com.inmobi.media.E0;
import in.juspay.hyperqr.CameraStreamScanner;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hyperupi.commonLibrary.v18.CL18;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;
import so.plotline.insights.Helpers.DebugCode;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.j;
import so.plotline.insights.Network.d;
import so.plotline.insights.Plotline;
import so.plotline.insights.Tasks.h;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11155a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f11155a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException {
        switch (this.f11155a) {
            case 0:
                A7.a(this.b, (A7) this.c);
                break;
            case 1:
                ((ActivityHandler) this.b).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.c);
                break;
            case 2:
                ((ActivityHandler) this.b).lambda$new$2((AdjustConfig) this.c);
                break;
            case 3:
                View view = (View) this.b;
                AdsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1 adsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1 = (AdsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1) this.c;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(adsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1);
                }
                break;
            case 4:
                View view2 = (View) this.b;
                AdsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1 adsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1 = (AdsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1) this.c;
                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnDrawListener(adsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1);
                }
                break;
            case 5:
                ApsAdViewImpl.m7722loadUrl$lambda9$lambda8((ApsAdViewImpl) this.b, (String) this.c);
                break;
            case 6:
                ApsAdViewWebBridge.m7723echo$lambda8((ApsAdViewWebBridge) this.b, (String) this.c);
                break;
            case 7:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$decoderReleased$5((String) this.c);
                break;
            case 8:
                ((BasePreloadManager) this.b).lambda$onPreloadCompleted$0((MediaSource) this.c);
                break;
            case 9:
                CL18.isUpiLiteSupported$lambda$6((CL18) this.b, (String) this.c);
                break;
            case 10:
                CameraStreamScanner.startCamera$lambda$4((CameraStreamScanner) this.b, (ListenableFuture) this.c);
                break;
            case 11:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.b, (ConstraintTracker) this.c);
                break;
            case 12:
                ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2((ConstraintTrackingWorker) this.b, (ListenableFuture) this.c);
                break;
            case 13:
                ((CrashlyticsCore) this.b).lambda$setCustomKeys$6((Map) this.c);
                break;
            case 14:
                ((CrashlyticsCore) this.b).lambda$logFatalException$8((Throwable) this.c);
                break;
            case 15:
                ((CrashlyticsCore) this.b).lambda$setUserId$4((String) this.c);
                break;
            case 16:
                ((DTBAdMRAIDBannerController) this.b).lambda$expand$7((Map) this.c);
                break;
            case 17:
                ((DTBAdMRAIDBannerController) this.b).lambda$onAdClicked$14((View) this.c);
                break;
            case 18:
                ((DTBAdMRAIDController) this.b).lambda$evaluateJavascript$0((String) this.c);
                break;
            case 19:
                ((DTBMetricsProcessor) this.b).lambda$submitExpiredReport$0((List) this.c);
                break;
            case 20:
                DebugCode debugCode = (DebugCode) this.b;
                Map map = (Map) this.c;
                try {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObjectPut = new JSONObject().put("eventName", "Plotline Debug Event");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("category", debugCode.name());
                    if (map != null && !map.isEmpty()) {
                        for (String str : map.keySet()) {
                            jSONObject.put(str, map.get(str));
                        }
                    }
                    jSONObjectPut.put("properties", jSONObject);
                    if (Plotline.b().y.contains("Plotline Debug Event")) {
                        jSONArray.put(jSONObjectPut);
                        d.i(jSONArray, null);
                    } else if (Plotline.b().x.equals("ALL")) {
                        h.b(new j(jSONObjectPut));
                    }
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 21:
                ((AudioSink.Listener) this.b).onAudioTrackReleased((AudioSink.AudioTrackConfig) this.c);
                break;
            case 22:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.b, (SpecialEffectsController.Operation) this.c);
                break;
            case 23:
                ((DispatchQueue) this.b).enqueue((Runnable) this.c);
                break;
            case 24:
                ((DownloadHelper) this.b).lambda$onMediaPreparationFailed$5((IOException) this.c);
                break;
            case 25:
                ((DownloadHelper) this.b).lambda$prepare$3((DownloadHelper.Callback) this.c);
                break;
            case 26:
                ((DtbOmSdkSessionManager) this.b).lambda$registerAdView$3((WebView) this.c);
                break;
            case 27:
                ((DuiInterface) this.b).lambda$clearMerchantViews$0((Activity) this.c);
                break;
            case 28:
                ((DuiInterface) this.b).lambda$requestKeyboardShow$7((String) this.c);
                break;
            default:
                E0.a((Context) this.b, (E0) this.c);
                break;
        }
    }
}
