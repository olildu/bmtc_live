package defpackage;

import android.net.Network;
import android.webkit.PermissionRequest;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.room.InvalidationTracker;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.utils.Utils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.media.I6;
import com.inmobi.media.Ic;
import com.inmobi.media.J2;
import com.inmobi.media.K1;
import com.inmobi.media.K9;
import com.inmobi.media.N;
import com.inmobi.media.O0;
import com.inmobi.media.S2;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import com.truecaller.android.sdk.clients.callbacks.MissedCallInstallationCallback;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.core.InflateView;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17384a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j90(Object obj, int i) {
        this.f17384a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17384a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((OnBackPressedCallback) obj).remove();
                break;
            case 1:
                I6.a((I6) obj);
                break;
            case 2:
                Ic.a((Ic) obj);
                break;
            case 3:
                InMobiAudio.a((InMobiAudio) obj);
                break;
            case 4:
                InMobiUnifiedIdService.a((InMobiUserDataModel) obj);
                break;
            case 5:
                InMobiUnifiedIdService.b((InMobiUnifiedIdInterface) obj);
                break;
            case 6:
                ((InflateView) obj).lambda$dismissPopUp$14();
                break;
            case 7:
                ((InvalidationTracker) obj).onAutoCloseCallback();
                break;
            case 8:
                J2.a((J2) obj);
                break;
            case 9:
                ((PermissionRequest) obj).deny();
                break;
            case 10:
                K1.a((K1) obj);
                break;
            case 11:
                K9.b((JSONObject) obj);
                break;
            case 12:
                ((LogPusherExp.LogPushTimerTask) obj).lambda$run$0();
                break;
            case 13:
                HashMap map = LottieCompositionFactory.f12125a;
                Utils.b((ByteArrayInputStream) obj);
                break;
            case 14:
                Executor executor = LottieTask.e;
                ((LottieTask) obj).d();
                break;
            case 15:
                ((MissedCallInstallationCallback) obj).d(true);
                break;
            case 16:
                N.a((N) obj);
                break;
            case 17:
                O0.a((O0) obj);
                break;
            case 18:
                ((PlayerControlView) obj).updateProgress();
                break;
            case 19:
                ((PlayerView) obj).invalidate();
                break;
            case 20:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) obj);
                break;
            case 21:
                QrBridge.stopScanning$lambda$8((QrBridge) obj);
                break;
            case 22:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            case 23:
                S2.b((Network) obj);
                break;
            case 24:
                ((SphericalGLSurfaceView) obj).lambda$onDetachedFromWindow$0();
                break;
            case 25:
                ((TextInputLayout) obj).d.requestLayout();
                break;
            case 26:
                TextInputServiceAndroid.sendInputCommand$lambda$0((TextInputServiceAndroid) obj);
                break;
            case 27:
                ((UserMetadata) obj).serializeUserDataIfNeeded();
                break;
            case 28:
                WindowAreaControllerImpl.presentContentOnWindowArea$lambda$2((WindowAreaPresentationSessionCallback) obj);
                break;
            default:
                WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1((WindowAreaSessionCallback) obj);
                break;
        }
    }
}
