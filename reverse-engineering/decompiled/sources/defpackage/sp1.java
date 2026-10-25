package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import androidx.window.area.WindowAreaControllerImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.inmobi.media.AbstractRunnableC2645s1;
import com.inmobi.media.C2395a2;
import com.inmobi.media.C2406b;
import com.inmobi.media.C2439d4;
import com.inmobi.media.C2464f1;
import com.inmobi.media.C2520j1;
import com.inmobi.media.C2532k;
import com.inmobi.media.C2575n0;
import com.inmobi.media.C2589o0;
import com.inmobi.media.C2618q1;
import com.inmobi.media.C2674u2;
import com.inmobi.media.cd;
import com.inmobi.media.dd;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import so.plotline.insights.Database.g;
import so.plotline.insights.FlowViews.Carousel.a;
import so.plotline.insights.FlowViews.m;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Modal.e;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.u;
import so.plotline.insights.Models.z;
import so.plotline.insights.Plotline;
import so.plotline.insights.Tasks.d;
import so.plotline.insights.Tasks.i;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sp1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19592a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp1(Object obj, int i) {
        this.f19592a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19592a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionFinished$lambda$2((WindowAreaControllerImpl.RearDisplaySessionConsumer) obj);
                return;
            case 1:
                WorkInitializer workInitializer = (WorkInitializer) obj;
                workInitializer.d.d(new os0(workInitializer, 26));
                return;
            case 2:
                a aVar = (a) obj;
                ViewPager2 viewPager2 = aVar.e;
                int currentItem = viewPager2.getCurrentItem() + 1;
                if (!aVar.c.n.booleanValue()) {
                    currentItem %= aVar.b;
                }
                viewPager2.setCurrentItem(currentItem, true);
                return;
            case 3:
                so.plotline.insights.FlowViews.ModalView.a aVar2 = (so.plotline.insights.FlowViews.ModalView.a) obj;
                int i2 = so.plotline.insights.FlowViews.ModalView.a.e;
                aVar2.getClass();
                try {
                    int[] iArr = new int[2];
                    aVar2.c.getLocationOnScreen(iArr);
                    int i3 = iArr[0];
                    aVar2.d = new RectF(i3, iArr[1], i3 + aVar2.c.getWidth(), iArr[1] + aVar2.c.getHeight());
                    return;
                } catch (Exception e) {
                    DebugHelper.a(e);
                    return;
                }
            case 4:
                ((so.plotline.insights.FlowViews.Overlay.a) obj).d();
                return;
            case 5:
                FlowStep flowStep = (FlowStep) obj;
                if (so.plotline.insights.a.d().f19570a == null) {
                    return;
                }
                so.plotline.insights.a.p pVar = so.plotline.insights.a.d().f19570a;
                String str = flowStep.b;
                Boolean bool = Boolean.TRUE;
                pVar.a(bool, bool, str, null, null, null, null);
                return;
            case 6:
                C2395a2.a((WebView) obj);
                return;
            case 7:
                C2406b.b((C2406b) obj);
                return;
            case 8:
                cd.a((dd) obj);
                return;
            case 9:
                d dVar = (d) obj;
                ArrayList arrayList = dVar.b;
                try {
                    arrayList.size();
                    DebugHelper.b();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    ReentrantLock reentrantLock = dVar.f19554a;
                    reentrantLock.lock();
                    try {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        reentrantLock.unlock();
                        gr1 gr1Var = new gr1(dVar, 0);
                        g gVar = new g();
                        gVar.f19334a = arrayList2;
                        gVar.b = gr1Var;
                        so.plotline.insights.Tasks.a.a(gVar);
                        return;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (Exception e2) {
                    DebugHelper.a(e2);
                    return;
                }
            case 10:
                C2439d4.a((C2439d4) obj);
                return;
            case 11:
                C2464f1.b((C2532k) obj);
                return;
            case 12:
                ((so.plotline.insights.Tasks.g) obj).a();
                return;
            case 13:
                String str2 = ((i) obj).g;
                so.plotline.insights.a aVar3 = so.plotline.insights.a.f;
                try {
                    JSONObject jSONObject = Plotline.b().d0;
                    if (jSONObject != null && jSONObject.has(str2) && ((Boolean) jSONObject.get(str2)).booleanValue()) {
                        Plotline.b().T = Boolean.TRUE;
                        so.plotline.insights.a.c(Plotline.b().c());
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    DebugHelper.a(e3);
                    return;
                }
            case 14:
                C2520j1.a((C2520j1) obj);
                return;
            case 15:
                m mVar = (m) obj;
                double d = mVar.d;
                double d2 = mVar.e;
                z zVar = mVar.f19429a;
                if (zVar != null) {
                    mVar.removeAllViews();
                    if (d2 > 0.0d) {
                        mVar.getLayoutParams().width = q.a(d2);
                    }
                    if (d > 0.0d) {
                        mVar.getLayoutParams().height = q.a(d);
                    }
                    if (zVar.b) {
                        View view = mVar.c;
                        if (view != null) {
                            mVar.addView(view, new FrameLayout.LayoutParams(q.a(d2), q.a(d)));
                            return;
                        }
                        return;
                    }
                    View view2 = mVar.b;
                    if (view2 != null) {
                        mVar.addView(view2, new FrameLayout.LayoutParams(q.a(d2), q.a(d)));
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((n.m) obj).a();
                return;
            case 17:
                C2575n0.a((C2589o0) obj);
                return;
            case 18:
                ((LottieAnimationView) obj).setVisibility(8);
                return;
            case 19:
                e eVar = new e((u) obj);
                try {
                    Activity activity = eVar.d;
                    if (activity != null) {
                        eVar.showAtLocation(activity.getWindow().getDecorView().getRootView(), 17, 0, 0);
                        try {
                            int i4 = eVar.f19478a.c;
                            if (i4 > 0) {
                                eVar.c.postDelayed(new jr1(eVar, 1), i4);
                            }
                        } catch (Exception e4) {
                            DebugHelper.a(e4);
                        }
                        break;
                    }
                    break;
                } catch (Exception e5) {
                    DebugHelper.a(e5);
                }
                so.plotline.insights.a.d().e = eVar;
                return;
            case 20:
                C2618q1.a((C2618q1) obj);
                return;
            case 21:
                AbstractRunnableC2645s1.a((AbstractRunnableC2645s1) obj);
                return;
            default:
                C2674u2.a((ArrayList) obj);
                return;
        }
    }
}
