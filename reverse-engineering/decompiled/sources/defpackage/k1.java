package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import com.adster.sdk.mediation.adster.AdFullScreenActivity;
import com.adster.sdk.mediation.adster.AdFullScreenActivity$activityCallbacks$1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.inmobi.media.AbstractRunnableC2645s1;
import com.inmobi.media.C2671u;
import com.inmobi.media.C2705w5;
import com.inmobi.media.D1;
import com.inmobi.media.D5;
import java.util.HashSet;
import so.plotline.insights.Database.o;
import so.plotline.insights.FlowViews.d;
import so.plotline.insights.FlowViews.l;
import so.plotline.insights.Models.c0;
import so.plotline.insights.Models.j0;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.Tasks.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17455a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i, AbstractRunnableC2645s1 abstractRunnableC2645s1) {
        this.f17455a = 7;
        this.b = i;
        this.c = abstractRunnableC2645s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17455a;
        int i2 = 0;
        int i3 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AdFullScreenActivity$activityCallbacks$1.a((AdFullScreenActivity) obj, i3);
                break;
            case 1:
                D1.a((D1) obj, i3);
                break;
            case 2:
                D5.a((D5) obj, i3);
                break;
            case 3:
                PlotlineWidget plotlineWidget = (PlotlineWidget) obj;
                HashSet hashSet = PlotlineWidget.p;
                a.a(new o(plotlineWidget.getContext(), plotlineWidget.b, new us0(i2, plotlineWidget, new ts0(plotlineWidget, i3, i2))));
                break;
            case 4:
                ((ResourcesCompat.FontCallback) obj).lambda$callbackFailAsync$1(i3);
                break;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.i(view, i3, false);
                }
                break;
            case 6:
                l lVar = (l) obj;
                c0 c0Var = lVar.b;
                int iO = (int) d.o(c0Var.s.o);
                ImageView imageView = lVar.e;
                j0 j0Var = c0Var.s;
                int i4 = i3 * 2;
                int iO2 = (int) d.o(j0Var.q + i4);
                int i5 = j0Var.q;
                d.i(imageView, iO, 0, iO2, (int) d.o(i5 + i4), 0);
                d.i(lVar.f, iO, 0, (int) d.o(i5 + i4), (int) d.o(i5 + i4), 0);
                break;
            case 7:
                C2671u.b(i3, (AbstractRunnableC2645s1) obj);
                break;
            default:
                C2705w5.a((C2705w5) obj, i3);
                break;
        }
    }

    public /* synthetic */ k1(Object obj, int i, int i2) {
        this.f17455a = i2;
        this.c = obj;
        this.b = i;
    }
}
