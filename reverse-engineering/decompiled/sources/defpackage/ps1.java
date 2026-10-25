package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ps1 implements n.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19066a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ PlotlineWidget.g g;

    public /* synthetic */ ps1(Context context, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, PlotlineWidget.g gVar, int i) {
        this.f19066a = i;
        this.b = context;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
        this.g = gVar;
    }

    @Override // so.plotline.insights.Helpers.n.m
    public final void a(String str) {
        switch (this.f19066a) {
            case 0:
                DebugHelper.b();
                break;
            default:
                DebugHelper.b();
                break;
        }
    }

    @Override // so.plotline.insights.Helpers.n.m
    public final void a() {
        switch (this.f19066a) {
            case 0:
                Context context = this.b;
                ArrayList arrayList = this.d;
                ArrayList arrayList2 = this.c;
                ps1 ps1Var = new ps1(context, arrayList, arrayList2, this.e, this.f, this.g, 1);
                if (!arrayList2.isEmpty()) {
                    int i = 0;
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        FlowStep flowStep = (FlowStep) obj;
                        n.b(context, flowStep.H, flowStep, new n.b(atomicInteger, arrayList2, atomicBoolean, ps1Var));
                    }
                } else {
                    ps1Var.a();
                }
                break;
            default:
                v6 v6Var = new v6(this.b, this.e, this.f, this.g, 6);
                ArrayList arrayList3 = this.d;
                if (!arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.c;
                    if (!arrayList4.isEmpty()) {
                        int i2 = 0;
                        AtomicInteger atomicInteger2 = new AtomicInteger(0);
                        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                        int size2 = arrayList3.size();
                        while (i2 < size2) {
                            Object obj2 = arrayList3.get(i2);
                            i2++;
                            n.f(arrayList4, (FlowStep) obj2, new n.a(atomicInteger2, arrayList3, atomicBoolean2, v6Var));
                        }
                    }
                }
                v6Var.a();
                break;
        }
    }
}
