package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import com.amazon.aps.shared.util.APSNetworkManager;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C2469f6;
import com.inmobi.media.C2490h;
import com.inmobi.media.C2567m6;
import com.inmobi.media.C7;
import com.inmobi.media.Mc;
import com.inmobi.media.N4;
import com.inmobi.media.Nc;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import in.juspay.hyperqr.CameraStreamScanner;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import in.juspay.hyperupi.UPIBridge;
import in.juspay.hyperupi.commonLibrary.v18.CL18;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class se implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19295a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ se(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f19295a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        CameraStreamScanner.startCamera$lambda$4$lambda$3((CameraStreamScanner) this.b, (CameraSelector) this.c, (Preview) this.d, (ImageAnalysis) this.e);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f19295a) {
            case 0:
                a();
                break;
            case 1:
                ((APSNetworkManager) this.b).lambda$sendData$0((String) this.c, (String) this.d, (String) this.e);
                break;
            case 2:
                C7.a((String) this.b, (C7) this.c, (JSONObject) this.d, (String) this.e);
                break;
            case 3:
                CL18.getChallenge$lambda$4((CL18) this.b, (String) this.c, (String) this.d, (String) this.e);
                break;
            case 4:
                DefaultScheduler defaultScheduler = (DefaultScheduler) this.b;
                TransportContext transportContext = (TransportContext) this.c;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) this.d;
                EventInternal eventInternal = (EventInternal) this.e;
                Logger logger = DefaultScheduler.f;
                try {
                    TransportBackend transportBackend = defaultScheduler.c.get(transportContext.b());
                    if (transportBackend == null) {
                        String str = "Transport backend '" + transportContext.b() + "' is not registered";
                        logger.warning(str);
                        transportScheduleCallback.b(new IllegalArgumentException(str));
                    } else {
                        defaultScheduler.e.d(new j4(3, defaultScheduler, transportContext, transportBackend.a(eventInternal)));
                        transportScheduleCallback.b(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    transportScheduleCallback.b(e);
                    return;
                }
                break;
            case 5:
                ((DuiInterface) this.b).lambda$runInJuspayBrowser$4((String) this.c, (String) this.d, (SdkTracker) this.e);
                break;
            case 6:
                InMobiSdk.a((Context) this.b, (SdkInitializationListener) this.c, (String) this.d, (JSONObject) this.e);
                break;
            case 7:
                Mc.b((C2490h) this.b, (AdConfig) this.c, (Nc) this.d, (N4) this.e);
                break;
            case 8:
                ((MediaSourceEventListener.EventDispatcher) this.b).lambda$upstreamDiscarded$4((MediaSourceEventListener) this.c, (MediaSource.MediaPeriodId) this.d, (MediaLoadData) this.e);
                break;
            case 9:
                QrBridge.generateCustomQRCode$lambda$11$lambda$10((ImageView) this.b, (Bitmap) this.c, (QrBridge) this.d, (String) this.e);
                break;
            case 10:
                ((TrackerFallback) this.b).lambda$log$0((JuspayServices) this.c, (JSONObject) this.d, (LogType) this.e);
                break;
            case 11:
                UPIBridge.process$lambda$5$lambda$4((UPIBridge) this.b, (JSONObject) this.c, (JSONObject) this.d, (Function1) this.e);
                break;
            case 12:
                ((UserMetadata) this.b).lambda$setNewSession$0((String) this.c, (Map) this.d, (List) this.e);
                break;
            default:
                C2567m6.a((C2567m6) this.b, (Context) this.c, (String) this.d, (C2469f6) this.e);
                break;
        }
    }
}
