package defpackage;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import so.plotline.insights.FlowViews.PlotlineInternal;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Plotline;
import so.plotline.insights.Tasks.k;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class cs1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15402a;
    public final /* synthetic */ k b;

    public /* synthetic */ cs1(k kVar, int i) {
        this.f15402a = i;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        HashSet hashSet;
        switch (this.f15402a) {
            case 0:
                try {
                    Activity activityC = Plotline.b().c();
                    if (activityC != null && !activityC.isFinishing() && !activityC.isDestroyed()) {
                        View decorView = activityC.getWindow().getDecorView();
                        ArrayList arrayList = new ArrayList();
                        k kVar = this.b;
                        if (decorView != null && ((hashSet = kVar.f19565a.f) == null || !hashSet.isEmpty())) {
                            kVar.d(decorView, arrayList);
                        }
                        int width = decorView.getWidth();
                        int height = decorView.getHeight();
                        if (width > 720 || height > 720) {
                            float f = width;
                            float f2 = height;
                            float fMin = Math.min(720.0f / f, 720.0f / f2);
                            iArr = new int[]{(int) (f * fMin), (int) (f2 * fMin)};
                        } else {
                            iArr = new int[]{width, height};
                        }
                        PlotlineInternal.c().b.a(activityC, new j4(13, kVar, iArr, arrayList));
                    }
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
                break;
            case 1:
                this.b.h("MAX_DURATION");
                break;
            case 2:
                k kVar2 = this.b;
                kVar2.getClass();
                Activity activityC2 = Plotline.b().c();
                if (activityC2 != null) {
                    DisplayMetrics displayMetrics = activityC2.getResources().getDisplayMetrics();
                    kVar2.q = displayMetrics.widthPixels;
                    kVar2.r = displayMetrics.heightPixels;
                    if (kVar2.b) {
                        String simpleName = activityC2.getClass().getSimpleName();
                        if (!simpleName.equals(kVar2.e)) {
                            kVar2.g(simpleName);
                        }
                    }
                    break;
                }
                break;
            default:
                k kVar3 = this.b;
                if (kVar3.b) {
                    kVar3.h("APP_BACKGROUND");
                }
                break;
        }
    }
}
