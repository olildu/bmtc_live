package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import app.chalo.utils.chalologger.ChaloLog;
import com.adster.sdk.mediation.MediationNativeAdView;
import com.adster.sdk.mediation.MediationNativeCustomFormatAd;
import com.adster.sdk.mediation.adster.AdsterInterstitialAdView;
import com.adster.sdk.mediation.adster.EndCardConfig;
import com.inmobi.media.C2568m7;
import com.inmobi.media.N7;
import in.juspay.hypersdk.core.InflateView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import so.plotline.insights.FlowViews.i;
import so.plotline.insights.Modal.a;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Tasks.e;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11161a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i, Object obj, Object obj2) {
        this.f11161a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objA;
        int i = this.f11161a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AdsterInterstitialAdView.a((AdsterInterstitialAdView) obj2, (EndCardConfig) obj, view);
                break;
            case 1:
                Context context = (Context) obj2;
                String str = (String) obj;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    objA = Unit.f17538a;
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    ChaloLog.c("AdsterUnifiedAd", "Failed to open url=" + str, thA);
                }
                break;
            case 2:
                ((MediationNativeCustomFormatAd) obj2).performClick((String) obj);
                break;
            case 3:
                ((InflateView) obj2).lambda$parseKeys$5((String) obj, view);
                break;
            case 4:
                MediationNativeAdView.attachAdChoices$lambda$2$lambda$1((TextView) obj2, (MediationNativeAdView) obj, view);
                break;
            case 5:
                N7.a((N7) obj2, (C2568m7) obj, view);
                break;
            case 6:
                a aVar = (a) obj2;
                Activity activity = (Activity) obj;
                so.plotline.insights.a aVar2 = so.plotline.insights.a.f;
                if (aVar.isShowing()) {
                    aVar.dismiss();
                }
                so.plotline.insights.Tasks.a.a(new e(new ao1(11, activity, aVar), 1));
                break;
            case 7:
                so.plotline.insights.a.m mVar = (so.plotline.insights.a.m) obj2;
                FlowStep flowStep = (FlowStep) obj;
                if (mVar != null) {
                    String str2 = flowStep.b;
                    Boolean bool = Boolean.TRUE;
                    mVar.a(bool, bool, str2, null, null, null, null);
                }
                break;
            default:
                int i2 = i.G;
                String str3 = ((FlowStep) obj).b;
                Boolean bool2 = Boolean.TRUE;
                ((so.plotline.insights.a.f) obj2).a(bool2, bool2, str3, null, null, null, null);
                break;
        }
    }
}
