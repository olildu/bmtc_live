package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.room.QueryInterceptorDatabase;
import com.adster.sdk.mediation.meta.MetaNativeAdLoader;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.facebook.ads.AdOptionsView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.E0;
import com.inmobi.media.Lb;
import com.inmobi.media.N7;
import com.inmobi.media.Qb;
import com.inmobi.media.T7;
import in.juspay.hypersdk.analytics.LogChannelExp;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.services.SdkConfigService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import so.plotline.insights.ActivityCallback;
import so.plotline.insights.Database.u;
import so.plotline.insights.FlowViews.PlotlineWidgetListener;
import so.plotline.insights.FlowViews.b;
import so.plotline.insights.FlowViews.d;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.f0;
import so.plotline.insights.Models.l0;
import so.plotline.insights.Models.m0;
import so.plotline.insights.Models.p;
import so.plotline.insights.Plotline;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.PlotlineWidget.a;
import so.plotline.insights.PlotlineWidget.h;
import so.plotline.insights.Tasks.a;
import so.plotline.insights.Tasks.i;
import so.plotline.insights.Track;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17365a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j2(int i, Object obj, Object obj2, Object obj3) {
        this.f17365a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.f17365a;
        int i2 = 1;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj3;
                MediaView mediaView = (MediaView) obj;
                String message = ((String) obj2) + " customNative mediaSize containerPx=" + frameLayout.getWidth() + "x" + frameLayout.getHeight() + " mediaViewPx=" + mediaView.getWidth() + "x" + mediaView.getHeight();
                Intrinsics.i(message, "message");
                break;
            case 1:
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view = (View) obj;
                String message2 = ((String) obj2) + " native mediaSize containerPx=" + frameLayout2.getWidth() + "x" + frameLayout2.getHeight() + " mediaViewPx=" + view.getWidth() + "x" + view.getHeight();
                Intrinsics.i(message2, "message");
                break;
            case 2:
                ApsAdViewImpl.m7720evaluateApsJavascript$lambda11$lambda10((ApsAdViewImpl) obj3, (String) obj2, (ValueCallback) obj);
                break;
            case 3:
                ApsAsyncUtil.lambda$runAsyncAndCallbackOnUiThread$2((ApsAsyncUtil.ApsExecutionListener) obj2, (ApsResult) obj3, obj);
                break;
            case 4:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$inputFormatChanged$2((Format) obj3, (DecoderReuseEvaluation) obj);
                break;
            case 5:
                ((BiConsumer) obj3).accept((String) obj2, (ConfigContainer) obj);
                break;
            case 6:
                ((CrashlyticsCore) obj2).lambda$logException$1((Throwable) obj3, (Map) obj);
                break;
            case 7:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionManagerError$2((DrmSessionEventListener) obj3, (Exception) obj);
                break;
            case 8:
                ((DtbOmSdkSessionManager) obj2).lambda$addFriendlyObstruction$8((View) obj3, (FriendlyObstructionPurpose) obj);
                break;
            case 9:
                DuiInterface.lambda$loadUrl$6((String) obj2, (JuspayWebView) obj3, (String) obj);
                break;
            case 10:
                ((DuiInterface) obj3).lambda$runInJuspayWebView$5((String) obj2, (JuspayWebView) obj);
                break;
            case 11:
                ((DuiInterface) obj3).lambda$runInJuspayBrowser$3((String) obj2, (SdkTracker) obj);
                break;
            case 12:
                E0.a((E0) obj2, (Function0) obj3, (Function1) obj);
                break;
            case 13:
                ((EnhancedIntentService) obj2).lambda$processIntent$0((Intent) obj3, (TaskCompletionSource) obj);
                break;
            case 14:
                ((JsInterface) obj3).lambda$requestPendingLogs$2((String) obj2, (String) obj);
                break;
            case 15:
                ((JsInterface) obj3).lambda$setAnalyticsHeader$1((JSONObject) obj, (String) obj2);
                break;
            case 16:
                ((JuspayServices) obj2).lambda$process$8((ViewGroup) obj3, (FragmentActivity) obj);
                break;
            case 17:
                ((JuspayServices) obj2).lambda$logMemoryInfo$1((Context) obj3, (SdkTracker) obj);
                break;
            case 18:
                Lb.c((String) obj2, (Map) obj3, (Qb) obj);
                break;
            case 19:
                LogManager.Companion.registerSavedWorkspaces$lambda$0((Context) obj2, (SdkConfigService) obj3, (JSONObject) obj);
                break;
            case 20:
                ((LogPusherExp) obj3).lambda$clearBacklog$0((String) obj2, (LogChannelExp) obj);
                break;
            case 21:
                ((LogPusherExp) obj3).lambda$addLogLines$3((String) obj2, (String) obj);
                break;
            case 22:
                ((LogSessioniser) obj3).lambda$addLogLine$4((JSONObject) obj, (String) obj2);
                break;
            case 23:
                ((MediaSourceEventListener.EventDispatcher) obj2).lambda$downstreamFormatChanged$5((MediaSourceEventListener) obj3, (MediaLoadData) obj);
                break;
            case 24:
                MetaNativeAdLoader.MetaMapper.a((FrameLayout.LayoutParams) obj2, (View) obj3, (AdOptionsView) obj);
                break;
            case 25:
                N7.a((N7) obj2, (T7) obj3, (ViewGroup) obj);
                break;
            case 26:
                Context context = (Context) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (context != null) {
                    try {
                        u.a(context.getApplicationContext());
                        break;
                    } catch (Exception unused) {
                    }
                    Plotline plotlineB = Plotline.b();
                    plotlineB.getClass();
                    q.c cVarN = q.n(context);
                    if (cVarN != null) {
                        plotlineB.p = cVarN.b;
                    }
                }
                if (Plotline.s0 != null && Plotline.b().K == null) {
                    Plotline.b().K = Plotline.s0;
                    Plotline.s0 = null;
                } else if (context != null && context.getApplicationContext() != null && Plotline.b().K == null) {
                    Plotline.b().K = new ActivityCallback();
                    Application application = (Application) context.getApplicationContext();
                    Activity activityA = Track.a(context);
                    if (activityA != null && Plotline.b().K != null) {
                        try {
                            new Handler(Looper.getMainLooper()).post(new j0(activityA, i2));
                        } catch (NullPointerException e) {
                            DebugHelper.a(e);
                        }
                    }
                    if (Plotline.b().K != null) {
                        application.registerActivityLifecycleCallbacks(Plotline.b().K);
                        application.registerComponentCallbacks(Plotline.b().K);
                    }
                }
                Plotline.b().r.a(context, str2);
                Plotline.b().getClass();
                try {
                    u.d(context, "didLogout", String.valueOf(false));
                } catch (Exception e2) {
                    DebugHelper.a(e2);
                }
                if (context != null) {
                    String str4 = Plotline.b().r.f19516a;
                    i iVar = new i();
                    iVar.f19562a = "";
                    iVar.b = "";
                    iVar.c = "";
                    iVar.d = "";
                    iVar.e = "";
                    Context applicationContext = context.getApplicationContext();
                    iVar.h = applicationContext;
                    try {
                        if (q.E()) {
                            Plotline.b().h(context);
                        }
                        String str5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                        iVar.f19562a = str5;
                        iVar.b = String.valueOf(Build.VERSION.SDK_INT);
                        u.d(context, DTBMetricsConfiguration.APSMETRICS_APIKEY, str3);
                        u.d(context, "endpoint", Plotline.b().b);
                        u.d(context, RemoteConfigConstants.RequestFieldKey.APP_VERSION, str5);
                        iVar.d = Build.MODEL;
                        iVar.e = Build.MANUFACTURER;
                        String strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                        iVar.c = strValueOf;
                        String strB = u.b(context, "appVersionCode", "");
                        if (!strB.isEmpty()) {
                            int iIntValue = Integer.valueOf(strB).intValue();
                            int iIntValue2 = Integer.valueOf(strValueOf).intValue();
                            if (iIntValue != 0 && iIntValue2 > iIntValue) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("oldVersion", strB);
                                jSONObject.put("currentVersion", iIntValue2);
                                Track.b(null, jSONObject, "Default: App Updated");
                            }
                        }
                        u.d(context, "appVersionCode", strValueOf);
                        Plotline plotlineB2 = Plotline.b();
                        applicationContext.getApplicationContext();
                        plotlineB2.getClass();
                    } catch (Exception e3) {
                        DebugHelper.a(e3);
                    }
                    iVar.f = str3;
                    iVar.g = str4;
                    a.a(iVar);
                }
                break;
            case 27:
                PlotlineWidget plotlineWidget = (PlotlineWidget) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj;
                HashSet hashSet = PlotlineWidget.p;
                try {
                    p pVar = new p();
                    pVar.b = 1;
                    pVar.f19514a = arrayList.size();
                    pVar.c = 10;
                    pVar.d = 10;
                    HorizontalScrollView horizontalScrollViewA = plotlineWidget.a(plotlineWidget.getContext(), ((FlowStep) arrayList.get(0)).B.o, arrayList, pVar, list);
                    plotlineWidget.f19538a = horizontalScrollViewA;
                    if (horizontalScrollViewA == null) {
                        PlotlineWidgetListener plotlineWidgetListener = plotlineWidget.l;
                        if (plotlineWidgetListener != null) {
                            plotlineWidgetListener.a();
                        }
                    } else {
                        plotlineWidget.removeAllViews();
                        if (!plotlineWidget.c(plotlineWidget.f19538a, plotlineWidget.h)) {
                            plotlineWidget.f19538a.getViewTreeObserver().addOnGlobalLayoutListener(plotlineWidget.new a());
                        }
                    }
                } catch (Exception e4) {
                    DebugHelper.a(e4);
                    PlotlineWidgetListener plotlineWidgetListener2 = plotlineWidget.l;
                    if (plotlineWidgetListener2 != null) {
                        plotlineWidgetListener2.a();
                    }
                    plotlineWidget.f();
                    plotlineWidget.d();
                    plotlineWidget.j();
                    return;
                }
                break;
            case 28:
                PlotlineWidget plotlineWidget2 = (PlotlineWidget) obj2;
                FlowStep flowStep = (FlowStep) obj3;
                l0 l0Var = (l0) obj;
                HashSet hashSet2 = PlotlineWidget.p;
                plotlineWidget2.j();
                if (flowStep != null) {
                    LinearLayout linearLayout = new LinearLayout(plotlineWidget2.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    View viewB = b.b(plotlineWidget2.getContext(), flowStep, new j4(7, plotlineWidget2, l0Var, flowStep));
                    if (viewB != null) {
                        linearLayout.addView(viewB);
                    }
                    linearLayout.addView(new so.plotline.insights.FlowViews.Stories.a(plotlineWidget2.getContext(), l0Var));
                    plotlineWidget2.f19538a = linearLayout;
                } else {
                    plotlineWidget2.f19538a = new so.plotline.insights.FlowViews.Stories.a(plotlineWidget2.getContext(), l0Var);
                }
                if (plotlineWidget2.f19538a != null) {
                    plotlineWidget2.removeAllViews();
                    String str6 = l0Var.l;
                    m0 m0Var = l0Var.q;
                    if (str6 == null || (str = plotlineWidget2.b) == null || !str6.equals(str)) {
                        plotlineWidget2.d();
                        PlotlineWidgetListener plotlineWidgetListener3 = plotlineWidget2.l;
                        if (plotlineWidgetListener3 != null) {
                            plotlineWidgetListener3.a();
                        }
                    } else {
                        boolean zC = plotlineWidget2.c(plotlineWidget2.f19538a, l0Var.u.doubleValue());
                        f0 f0Var = m0Var.b;
                        int iO = (int) d.o(f0Var.k[0]);
                        float[] fArr = f0Var.k;
                        plotlineWidget2.f19538a.setPadding((int) d.o(fArr[3]), iO, (int) d.o(fArr[1]), (int) d.o(fArr[2]));
                        if (!zC) {
                            plotlineWidget2.f19538a.getViewTreeObserver().addOnGlobalLayoutListener(plotlineWidget2.new h());
                        }
                    }
                } else {
                    PlotlineWidgetListener plotlineWidgetListener4 = plotlineWidget2.l;
                    if (plotlineWidgetListener4 != null) {
                        plotlineWidgetListener4.a();
                    }
                }
                break;
            default:
                QueryInterceptorDatabase.query$lambda$7((QueryInterceptorDatabase) obj3, (String) obj2, (Object[]) obj);
                break;
        }
    }

    public /* synthetic */ j2(int i, String str, Object obj, Object obj2) {
        this.f17365a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    public /* synthetic */ j2(Object obj, JSONObject jSONObject, String str, int i) {
        this.f17365a = i;
        this.c = obj;
        this.d = jSONObject;
        this.b = str;
    }
}
