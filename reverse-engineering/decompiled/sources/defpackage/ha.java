package defpackage;

import android.app.Activity;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.webkit.WebView;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerUpdater;
import com.inmobi.media.C2395a2;
import com.inmobi.media.C2409b2;
import com.inmobi.media.V1;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hyperupi.UPIBridge;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.ActivityCallback;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Plotline;
import so.plotline.insights.Track;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15805a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ha(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f15805a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f15805a) {
            case 0:
                BasicText_androidKt.BackgroundTextMeasurement$lambda$0$0((TextStyle) this.b, (LayoutDirection) this.c, (String) this.d, (Density) this.e, (FontFamily.Resolver) this.f);
                break;
            case 1:
                DefaultAudioSink.lambda$releaseAudioTrackAsync$1((AudioTrack) this.b, (AudioSink.Listener) this.c, (Handler) this.d, (AudioSink.AudioTrackConfig) this.e, (ConditionVariable) this.f);
                break;
            case 2:
                ((Godel) this.b).lambda$onBrowserReady$0((Activity) this.c, (String) this.d, (String) this.e, (String) this.f);
                break;
            case 3:
                SdkTracker.lambda$trackBootException$4((String) this.d, (String) this.b, (String) this.c, (String) this.e, (Throwable) this.f);
                break;
            case 4:
                ((SdkTracker) this.b).lambda$trackLifecycle$7((String) this.d, (String) this.c, (String) this.e, (JSONObject) this.f);
                break;
            case 5:
                ((SdkTracker) this.b).lambda$trackContext$12((String) this.d, (String) this.c, (String) this.e, this.f);
                break;
            case 6:
                ArrayList arrayList = (ArrayList) this.b;
                String str = (String) this.d;
                HashSet hashSet = (HashSet) this.c;
                JSONObject jSONObject = (JSONObject) this.e;
                Context context = (Context) this.f;
                try {
                    if (Plotline.b().e().booleanValue()) {
                        ActivityCallback.a();
                    }
                    Track.c(arrayList, str, hashSet, jSONObject, context);
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 7:
                UPIBridge.process$lambda$5((UPIBridge) this.b, (String) this.d, (String) this.c, (JSONObject) this.e, (Function1) this.f);
                break;
            case 8:
                WorkerUpdater.enqueueUniquelyNamedPeriodic$lambda$3((WorkManagerImpl) this.b, (String) this.d, (OperationImpl) this.c, (Function0) this.e, (WorkRequest) this.f);
                break;
            default:
                C2395a2.a((C2395a2) this.b, (V1) this.c, (Handler) this.d, (C2409b2) this.e, (WebView) this.f);
                break;
        }
    }

    public /* synthetic */ ha(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.f15805a = i;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ha(String str, String str2, String str3, String str4, Throwable th) {
        this.f15805a = 3;
        this.d = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = th;
    }
}
