package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.room.QueryInterceptorDatabase;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerUpdater;
import com.adjust.sdk.Constants;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.messaging.ServiceStarter;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.AbstractC2642rc;
import com.inmobi.media.AbstractC2684uc;
import com.inmobi.media.C2409b2;
import com.inmobi.media.C2459ea;
import com.inmobi.media.C2705w5;
import com.inmobi.media.E0;
import com.inmobi.media.EnumC2497h6;
import com.inmobi.media.GestureDetectorOnGestureListenerC2738ya;
import com.inmobi.media.V1;
import com.inmobi.media.hd;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.json.JSONObject;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.o;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xz0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20062a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xz0(int i, Object obj, Object obj2, Object obj3) {
        this.f20062a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f20062a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                QueryInterceptorDatabase.execSQL$lambda$12((QueryInterceptorDatabase) obj3, (String) obj2, (List) obj);
                return;
            case 1:
                ((ServerSideAdInsertionMediaSource) obj3).lambda$setAdPlaybackStates$0((ImmutableMap) obj2, (Timeline) obj);
                return;
            case 2:
                Util.lambda$transformFutureAsync$2((ListenableFuture) obj3, (SettableFuture) obj2, (AsyncFunction) obj);
                return;
            case 3:
                Util.lambda$postOrRunWithCompletion$0((SettableFuture) obj3, (Runnable) obj2, obj);
                return;
            case 4:
                ((VideoRendererEventListener.EventDispatcher) obj3).lambda$inputFormatChanged$2((Format) obj2, (DecoderReuseEvaluation) obj);
                return;
            case 5:
                WorkerUpdater.updateWorkImpl$lambda$2((androidx.work.impl.utils.futures.SettableFuture) obj3, (WorkManagerImpl) obj2, (WorkRequest) obj);
                return;
            case 6:
                Activity activity = (Activity) obj3;
                FlowStep flowStep = (FlowStep) obj2;
                a aVar = a.f;
                n.e(flowStep, new n.h(flowStep, activity, new a.c(activity, flowStep, (o.b) obj)));
                return;
            case 7:
                C2409b2.a((V1) obj3, (C2409b2) obj2, (Handler) obj);
                return;
            case 8:
                C2459ea.a((C2459ea) obj3, (EnumC2497h6) obj2, (JSONObject) obj);
                return;
            case 9:
                hd.a((AdConfig.WebAssetCacheConfig) obj3, (hd) obj2, (Context) obj);
                return;
            case 10:
                byte[] bArr = (byte[]) obj3;
                fs1 fs1Var = (fs1) obj;
                HttpURLConnection httpURLConnection = null;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL((String) obj2).openConnection();
                        try {
                            try {
                                httpURLConnection2.setRequestMethod("PUT");
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, MimeTypes.IMAGE_WEBP);
                                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(bArr.length));
                                httpURLConnection2.setConnectTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
                                httpURLConnection2.setReadTimeout(Constants.CONNECTION_TIMEOUT_VERIFY);
                                OutputStream outputStream = httpURLConnection2.getOutputStream();
                                outputStream.write(bArr);
                                outputStream.flush();
                                outputStream.close();
                                int responseCode = httpURLConnection2.getResponseCode();
                                boolean z = responseCode >= 200 && responseCode < 300;
                                if (!z) {
                                    try {
                                        InputStream errorStream = httpURLConnection2.getErrorStream();
                                        if (errorStream != null) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                String line = bufferedReader.readLine();
                                                if (line != null) {
                                                    sb.append(line);
                                                } else {
                                                    bufferedReader.close();
                                                    sb.toString().substring(0, Math.min(ServiceStarter.ERROR_UNKNOWN, sb.length()));
                                                    DebugHelper.b();
                                                }
                                            }
                                        } else {
                                            DebugHelper.b();
                                        }
                                    } catch (Exception unused) {
                                        DebugHelper.b();
                                    }
                                }
                                fs1Var.a(z);
                                httpURLConnection2.disconnect();
                                return;
                            } catch (Exception e) {
                                e = e;
                                httpURLConnection = httpURLConnection2;
                                e.getMessage();
                                DebugHelper.b();
                                DebugHelper.a(e);
                                fs1Var.a(false);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 11:
                AbstractC2642rc.a((E0) obj3, (AbstractC2642rc) obj2, (InMobiAdRequestStatus) obj);
                return;
            case 12:
                AbstractC2684uc.b((InMobiUnifiedIdInterface) obj3, (JSONObject) obj2, (Error) obj);
                return;
            default:
                C2705w5.a((C2705w5) obj3, (GestureDetectorOnGestureListenerC2738ya) obj2, (Context) obj);
                return;
        }
    }

    public /* synthetic */ xz0(String str, byte[] bArr, fs1 fs1Var) {
        this.f20062a = 10;
        this.c = str;
        this.b = bArr;
        this.d = fs1Var;
    }
}
