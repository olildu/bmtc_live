package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.home.manager.AppRatingProcessManagerAndroid;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import so.plotline.insights.Database.f;
import so.plotline.insights.FlowViews.Stories.e;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.b;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Models.w;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.Track;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v6 implements OnCompleteListener, f, b.c, n.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19806a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f19806a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // so.plotline.insights.Helpers.n.m
    public void a(String str) {
        switch (this.f19806a) {
            case 3:
                DebugHelper.b();
                break;
            case 4:
                DebugHelper.b();
                break;
            case 5:
                DebugHelper.b();
                break;
            default:
                DebugHelper.b();
                break;
        }
    }

    @Override // so.plotline.insights.Database.f
    public void c(List list, List list2) {
        String str = (String) this.b;
        HashSet hashSet = (HashSet) this.c;
        JSONObject jSONObject = (JSONObject) this.d;
        Context context = (Context) this.e;
        if (list.size() == 0) {
            return;
        }
        try {
            list.size();
            DebugHelper.b();
            Track.d(list, str, hashSet, jSONObject, context, false);
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        AppRatingProcessManagerAndroid appRatingProcessManagerAndroid = (AppRatingProcessManagerAndroid) this.b;
        AnalyticsContract analyticsContract = appRatingProcessManagerAndroid.c;
        Source source = (Source) this.c;
        Map map = (Map) this.d;
        zzd zzdVar = (zzd) this.e;
        Intrinsics.i(it, "it");
        if (it.isSuccessful()) {
            AnalyticsContractImplKt.b(analyticsContract, "in app ratings opened successfully", source, map, false, 24);
            zzdVar.a(appRatingProcessManagerAndroid.b, (ReviewInfo) it.getResult());
        } else {
            AnalyticsContractImplKt.b(analyticsContract, "in app ratings failed", source, map, false, 24);
            AnalyticsContractImplKt.b(analyticsContract, appRatingProcessManagerAndroid.b(source, map) ? "redirected to play store" : "redirection to play store failed", source, map, false, 24);
        }
    }

    @Override // so.plotline.insights.Helpers.n.m
    public void a() {
        switch (this.f19806a) {
            case 3:
                Activity activity = (Activity) this.b;
                n.j(activity, (ArrayList) this.c, new j4(15, activity, (ArrayList) this.d, (Track.b) this.e));
                break;
            case 4:
                Context context = (Context) this.b;
                n.j(context, (ArrayList) this.c, new j4(16, context, (ArrayList) this.d, (n.m) this.e));
                break;
            case 5:
                Context context2 = (Context) this.b;
                n.j(context2, (ArrayList) this.c, new j4(17, context2, (ArrayList) this.d, (e.C0259e) this.e));
                break;
            default:
                Context context3 = (Context) this.b;
                n.j(context3, (ArrayList) this.c, new j4(18, context3, (ArrayList) this.d, (PlotlineWidget.g) this.e));
                break;
        }
    }

    @Override // so.plotline.insights.Helpers.b.c
    public void a(Typeface typeface) {
        ArrayList arrayList = (ArrayList) this.b;
        w wVar = (w) this.c;
        Context context = (Context) this.d;
        n.m mVar = (n.m) this.e;
        if (arrayList.contains(wVar)) {
            arrayList.remove(wVar);
            n.g(context, arrayList, mVar);
        } else {
            mVar.a();
        }
    }
}
