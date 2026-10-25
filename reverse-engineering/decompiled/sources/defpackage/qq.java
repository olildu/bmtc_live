package defpackage;

import android.content.IntentSender;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import com.inmobi.media.C2729y1;
import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.core.DuiInterface;
import java.util.concurrent.CopyOnWriteArraySet;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19144a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qq(Object obj, int i, Object obj2, int i2) {
        this.f19144a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19144a) {
            case 0:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) this.b, this.c, (ActivityResultContract.SynchronousResult) this.d);
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1((ComponentActivity$activityResultRegistry$1) this.b, this.c, (IntentSender.SendIntentException) this.d);
                break;
            case 2:
                ((DeviceProfileWriter) this.b).lambda$result$0(this.c, this.d);
                break;
            case 3:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmSessionAcquired$0((DrmSessionEventListener) this.d, this.c);
                break;
            case 4:
                ((DuiInterface) this.b).lambda$attachMerchantView$1(this.c, (String) this.d);
                break;
            case 5:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) this.b, this.c, (ListenerSet.Event) this.d);
                break;
            case 6:
                PlotlineWidget.i iVar = (PlotlineWidget.i) this.b;
                View view = (View) this.d;
                PlotlineWidget plotlineWidget = PlotlineWidget.this;
                if (plotlineWidget.k.b.equals("EXPAND_AND_FADE")) {
                    view.setAlpha(0.0f);
                }
                plotlineWidget.addView(view);
                if (plotlineWidget.k.b.equals("EXPAND_AND_FADE")) {
                    view.animate().alpha(1.0f).setDuration(200L).start();
                }
                ViewGroup.LayoutParams layoutParams = plotlineWidget.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = this.c;
                    plotlineWidget.setLayoutParams(layoutParams);
                }
                break;
            case 7:
                QrBridge.openQRScanner$lambda$5((QrBridge) this.b, this.c, (String) this.d);
                break;
            default:
                C2729y1.a((C2729y1) this.b, (GestureDetectorOnGestureListenerC2738ya) this.d, this.c);
                break;
        }
    }

    public /* synthetic */ qq(Object obj, Object obj2, int i, int i2) {
        this.f19144a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
