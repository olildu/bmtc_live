package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.viewpager2.widget.ViewPager2;
import androidx.window.area.RearDisplaySessionImpl;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.AbstractC2587nc;
import com.inmobi.media.AbstractC2642rc;
import com.inmobi.media.AbstractC2689v3;
import com.inmobi.media.C2464f1;
import com.inmobi.media.C2493h2;
import com.inmobi.media.C2532k;
import com.inmobi.media.C2535k2;
import com.inmobi.media.C2554l7;
import com.inmobi.media.C2567m6;
import com.inmobi.media.C2618q1;
import com.inmobi.media.EnumC2604p1;
import com.inmobi.media.N4;
import com.inmobi.media.Rc;
import com.inmobi.media.U9;
import com.inmobi.media.V0;
import com.inmobi.media.V1;
import com.inmobi.media.V9;
import com.inmobi.media.Xb;
import com.phonepe.intent.sdk.widgets.PhWebView;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import so.plotline.insights.Database.v;
import so.plotline.insights.FlowViews.Carousel.a;
import so.plotline.insights.FlowViews.PlotlineInternal;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Modal.c;
import so.plotline.insights.Models.g;
import so.plotline.insights.Models.j;
import so.plotline.insights.OptionModals.b;
import so.plotline.insights.Tasks.h;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ao1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f693a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ao1(int i, Object obj, Object obj2) {
        this.f693a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.f693a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                V0.a((Context) obj, (V0) obj2);
                return;
            case 1:
                V9.a((Function1) obj, (U9) obj2);
                return;
            case 2:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$videoSizeChanged$5((VideoSize) obj2);
                return;
            case 3:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$videoCodecError$9((Exception) obj2);
                return;
            case 4:
                ((VideoRendererEventListener.EventDispatcher) obj).lambda$decoderReleased$7((String) obj2);
                return;
            case 5:
                ((ViewTransition) obj).lambda$applyTransition$0((View[]) obj2);
                return;
            case 6:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionStarted$lambda$1$lambda$0((WindowAreaControllerImpl.RearDisplaySessionConsumer) obj, (RearDisplaySessionImpl) obj2);
                return;
            case 7:
                ((WorkForegroundRunnable) obj).lambda$run$0((SettableFuture) obj2);
                return;
            case 8:
                ((WorkerWrapper) obj).lambda$runWorker$0((ListenableFuture) obj2);
                return;
            case 9:
                a aVar = (a) obj;
                ArrayList arrayList = (ArrayList) obj2;
                g gVar = aVar.c;
                ViewPager2 viewPager2 = aVar.e;
                int size = arrayList.size();
                int iMax = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    View view = (View) obj3;
                    view.measure(View.MeasureSpec.makeMeasureSpec(viewPager2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    iMax = Math.max(iMax, view.getMeasuredHeight());
                }
                if (iMax > 0) {
                    ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                    layoutParams.height = iMax;
                    if (gVar.o.booleanValue()) {
                        layoutParams.height = (int) (gVar.p.doubleValue() * ((double) iMax));
                    }
                    viewPager2.setLayoutParams(layoutParams);
                    viewPager2.requestLayout();
                    return;
                }
                return;
            case 10:
                aba.a this$0 = (aba.a) obj;
                String javaScript = (String) obj2;
                Intrinsics.i(this$0, "this$0");
                Intrinsics.i(javaScript, "$javaScript");
                PhWebView phWebView = this$0.S;
                if (phWebView != null) {
                    phWebView.evaluateJavascript(javaScript, new iq1());
                    return;
                } else {
                    Intrinsics.q("webView");
                    throw null;
                }
            case 11:
                Activity activity = (Activity) obj;
                so.plotline.insights.a aVar2 = so.plotline.insights.a.f;
                PlotlineInternal.c().b.a(activity, new us0(9, activity, (so.plotline.insights.Modal.a) obj2));
                return;
            case 12:
                j4 j4Var = (j4) obj;
                int i3 = b.d;
                c cVar = (c) j4Var.b;
                so.plotline.insights.Listeners.a aVar3 = (so.plotline.insights.Listeners.a) j4Var.c;
                Integer num = (Integer) j4Var.d;
                int i4 = c.d;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add((String) obj2);
                String str = cVar.b.b;
                aVar3.c(num, Boolean.FALSE, arrayList2);
                return;
            case 13:
                boolean z = aag.b.b;
                ((Ref.BooleanRef) obj).element = false;
                ((ScheduledExecutorService) obj2).shutdown();
                return;
            case 14:
                C2464f1.b((C2532k) obj, (String) obj2);
                return;
            case 15:
                h hVar = (h) obj;
                j jVar = (j) obj2;
                ReentrantLock reentrantLock = hVar.b;
                reentrantLock.lock();
                DebugHelper.b();
                try {
                    try {
                        v vVar = new v();
                        vVar.b = jVar.f19505a;
                        vVar.c = jVar.b.toString();
                        vVar.d = Long.valueOf(System.currentTimeMillis());
                        hVar.e.b(vVar);
                        break;
                    } catch (Exception e) {
                        DebugHelper.a(e);
                        break;
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 16:
                C2493h2.a((V1) obj, (N4) obj2);
                return;
            case 17:
                C2535k2.a((C2535k2) obj, (ViewGroup) obj2);
                return;
            case 18:
                C2554l7.a((C2554l7) obj, (Rc) obj2);
                return;
            case 19:
                C2567m6.a((C2567m6) obj2, (Context) obj);
                return;
            case 20:
                AbstractC2587nc.a((AbstractC2587nc) obj, obj2);
                return;
            case 21:
                ((LinearLayout) obj).addView((View) obj2);
                return;
            case 22:
                C2618q1.a((C2618q1) obj, (RelativeLayout) obj2);
                return;
            case 23:
                AbstractC2642rc.a((AbstractC2642rc) obj, (AdMetaInfo) obj2);
                return;
            case 24:
                AbstractC2642rc.a((AbstractC2642rc) obj, (EnumC2604p1) obj2);
                return;
            case 25:
                AbstractC2642rc.a((AbstractC2642rc) obj, (byte[]) obj2);
                return;
            case 26:
                AbstractC2642rc.a((AbstractC2642rc) obj, (String) obj2);
                return;
            case 27:
                AbstractC2642rc.a((AbstractC2642rc) obj, (Xb) obj2);
                return;
            case 28:
                AbstractC2689v3.b((WindowInsets) obj2, (Context) obj);
                return;
            default:
                AbstractC2689v3.a((Map) obj2, (Context) obj);
                return;
        }
    }

    public /* synthetic */ ao1(Object obj, Context context, int i) {
        this.f693a = i;
        this.c = obj;
        this.b = context;
    }
}
