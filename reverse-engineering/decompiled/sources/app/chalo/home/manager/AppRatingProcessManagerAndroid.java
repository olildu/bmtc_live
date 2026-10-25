package app.chalo.home.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import com.google.android.play.core.review.zzd;
import com.google.android.play.core.review.zzi;
import defpackage.v6;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/manager/AppRatingProcessManagerAndroid;", "Lapp/chalo/home/manager/AppRatingProcessManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppRatingProcessManagerAndroid implements AppRatingProcessManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3108a;
    public final Activity b;
    public final AnalyticsContract c;
    public final CrashlyticsLogger d;

    public AppRatingProcessManagerAndroid(Context context, Activity activity, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger) {
        this.f3108a = context;
        this.b = activity;
        this.c = analyticsContract;
        this.d = crashlyticsLogger;
    }

    @Override // app.chalo.home.manager.AppRatingProcessManager
    public final void a(Source source, Map map) {
        Intrinsics.i(source, "source");
        Context context = this.f3108a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzd zzdVar = new zzd(new zzi(context));
        zzdVar.b().addOnCompleteListener(new v6(this, source, map, zzdVar, 0));
    }

    @Override // app.chalo.home.manager.AppRatingProcessManager
    public final boolean b(Source source, Map map) {
        Context context = this.f3108a;
        Intrinsics.i(source, "source");
        try {
            String str = "https://play.google.com/store/apps/details?id=" + context.getPackageName();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            this.d.i(e);
            return false;
        }
    }
}
