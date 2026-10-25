package defpackage;

import android.app.ApplicationExitInfo;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerView;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import app.chalo.ads.NativeAdViewKt;
import com.adster.sdk.mediation.meta.MetaNativeAdLoader;
import com.facebook.ads.AdOptionsView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.inmobi.media.C2415b8;
import com.inmobi.media.C2457e8;
import com.inmobi.media.M5;
import com.inmobi.media.N5;
import com.inmobi.media.N8;
import com.inmobi.media.O0;
import com.inmobi.media.P1;
import com.inmobi.media.Pa;
import com.inmobi.media.Q6;
import com.inmobi.media.R1;
import com.inmobi.media.R5;
import com.inmobi.media.Sa;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.core.Renderer;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsReceiver;
import in.juspay.hyperupi.UPIBridge;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.json.JSONException;
import so.plotline.insights.FlowViews.PlotlineViewPositionCompleteListener;
import so.plotline.insights.FlowViews.d;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.ViewPosition;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19120a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg0(int i, Object obj, Object obj2) {
        this.f19120a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.f19120a;
        boolean zIsVisibleToUser = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                M5.a((M5) obj2, (R1) obj);
                break;
            case 1:
                MetaNativeAdLoader.MetaMapper.a((View) obj2, (AdOptionsView) obj);
                break;
            case 2:
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0((MultiInstanceInvalidationClient) obj2, (String[]) obj);
                break;
            case 3:
                N8.a((C2415b8) obj2, (C2457e8) obj);
                break;
            case 4:
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                ((NativeAdView) obj2).setNativeAd((NativeAd) obj);
                break;
            case 5:
                ((NetworkTypeObserver) obj2).lambda$register$0((NetworkTypeObserver.Listener) obj);
                break;
            case 6:
                O0.a((O0) obj2, (ApplicationExitInfo) obj);
                break;
            case 7:
                ((OfflineLicenseHelper) obj2).lambda$releaseManagerOnHandlerThread$4((SettableFuture) obj);
                break;
            case 8:
                Pa.a((Pa) obj2, (Sa) obj);
                break;
            case 9:
                ((PlayerView) obj2).lambda$onImageAvailable$1((Bitmap) obj);
                break;
            case 10:
                View view = (View) obj2;
                PlotlineViewPositionCompleteListener plotlineViewPositionCompleteListener = (PlotlineViewPositionCompleteListener) obj;
                try {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                    zIsVisibleToUser = accessibilityNodeInfoObtain.isVisibleToUser();
                    accessibilityNodeInfoObtain.recycle();
                } catch (Exception e) {
                    DebugHelper.a(e);
                }
                if (!zIsVisibleToUser) {
                    plotlineViewPositionCompleteListener.a(null);
                } else {
                    d.r(view);
                    plotlineViewPositionCompleteListener.a(new ViewPosition(d.b(view)));
                }
                break;
            case 11:
                PlotlineWidget plotlineWidget = (PlotlineWidget) obj2;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj;
                HashSet hashSet = PlotlineWidget.p;
                plotlineWidget.getClass();
                try {
                    View childAt = horizontalScrollView.getChildAt(0);
                    if (childAt != null) {
                        int iMin = Math.min(Math.max(plotlineWidget.j, 0), Math.max(0, childAt.getWidth() - horizontalScrollView.getWidth()));
                        horizontalScrollView.scrollTo(iMin, 0);
                        plotlineWidget.j = iMin;
                    }
                } catch (Exception e2) {
                    DebugHelper.a(e2);
                    return;
                }
                break;
            case 12:
                ((PreloadMediaSource) obj2).lambda$onChildSourceInfoRefreshed$2((Timeline) obj);
                break;
            case 13:
                Q6.a((P1) obj2, (Q6) obj);
                break;
            case 14:
                QrBridge.toggleFlash$lambda$12((QrBridge) obj2, (String) obj);
                break;
            case 15:
                R5.a((LinkedHashMap) obj2, (N5) obj);
                break;
            case 16:
                ChannelsKt.c((ProducerScope) obj2, (ConfigUpdate) obj);
                break;
            case 17:
                ((Renderer) obj2).lambda$initCache$0((String[]) obj);
                break;
            case 18:
                ((Renderer) obj2).lambda$replenishCache$1((String) obj);
                break;
            case 19:
                ((ResourcesCompat.FontCallback) obj2).lambda$callbackSuccessAsync$0((Typeface) obj);
                break;
            case 20:
                ((SdkTracker) obj2).lambda$setEndPointSandbox$18((Boolean) obj);
                break;
            case 21:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.accept$lambda$0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj2, (WindowLayoutInfo) obj);
                break;
            case 22:
                ((SimpleBasePlayer) obj2).lambda$updateStateForPendingOperation$62((ListenableFuture) obj);
                break;
            case 23:
                SmsReceiver.a((SmsReceiver) obj2, (SmsConsentHandler) obj);
                break;
            case 24:
                ((SphericalGLSurfaceView) obj2).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) obj);
                break;
            case 25:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) obj2, (TransactionExecutor) obj);
                break;
            case 26:
                ((TrustedWebActivityServiceConnectionPool) obj2).lambda$connect$0((Uri) obj);
                break;
            case 27:
                UPIBridge.getLocationDetails$lambda$13((UPIBridge) obj2, (String) obj);
                break;
            case 28:
                ((UserMetadata) obj2).lambda$updateRolloutsState$1((List) obj);
                break;
            default:
                Util.lambda$transformFutureAsync$1((SettableFuture) obj2, (ListenableFuture) obj);
                break;
        }
    }
}
