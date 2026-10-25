package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashSet;
import so.plotline.insights.FlowViews.PlotlineWidgetListener;
import so.plotline.insights.FlowViews.b;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.PlotlineWidget.j;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class vs0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlotlineWidget f19864a;
    public final /* synthetic */ FlowStep b;
    public final /* synthetic */ double c;

    public /* synthetic */ vs0(PlotlineWidget plotlineWidget, FlowStep flowStep, double d) {
        this.f19864a = plotlineWidget;
        this.b = flowStep;
        this.c = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashSet hashSet = PlotlineWidget.p;
        PlotlineWidget plotlineWidget = this.f19864a;
        Context context = plotlineWidget.getContext();
        FlowStep flowStep = this.b;
        View viewB = b.b(context, flowStep, new us0(2, plotlineWidget, flowStep));
        plotlineWidget.f19538a = viewB;
        if (viewB == null) {
            PlotlineWidgetListener plotlineWidgetListener = plotlineWidget.l;
            if (plotlineWidgetListener != null) {
                plotlineWidgetListener.a();
                return;
            }
            return;
        }
        plotlineWidget.removeAllViews();
        String str2 = flowStep.f;
        if (str2 != null && (str = plotlineWidget.b) != null && str2.equals(str)) {
            if (plotlineWidget.c(plotlineWidget.f19538a, this.c)) {
                return;
            }
            plotlineWidget.f19538a.getViewTreeObserver().addOnGlobalLayoutListener(plotlineWidget.new j());
        } else {
            plotlineWidget.d();
            PlotlineWidgetListener plotlineWidgetListener2 = plotlineWidget.l;
            if (plotlineWidgetListener2 != null) {
                plotlineWidgetListener2.a();
            }
        }
    }
}
