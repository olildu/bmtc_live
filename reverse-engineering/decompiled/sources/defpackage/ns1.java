package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import so.plotline.insights.FlowViews.Stories.e;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ns1 implements n.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18542a = 0;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ n.m h;

    public /* synthetic */ ns1(Context context, String str, FlowStep flowStep, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, n.m mVar) {
        this.b = context;
        this.g = str;
        this.e = flowStep;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
        this.h = mVar;
    }

    @Override // so.plotline.insights.Helpers.n.m
    public final void a(String str) {
        switch (this.f18542a) {
            case 0:
                DebugHelper.b();
                break;
            case 1:
                DebugHelper.b();
                break;
            default:
                DebugHelper.b();
                break;
        }
    }

    public /* synthetic */ ns1(Context context, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, PlotlineWidget.g gVar) {
        this.b = context;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
        this.e = arrayList5;
        this.h = gVar;
    }

    @Override // so.plotline.insights.Helpers.n.m
    public final void a() {
        switch (this.f18542a) {
            case 0:
                String str = (String) this.g;
                final FlowStep flowStep = (FlowStep) this.e;
                final int i = 0;
                final Context context = this.b;
                final ArrayList arrayList = this.c;
                final ArrayList arrayList2 = this.d;
                final ArrayList arrayList3 = this.f;
                final n.m mVar = this.h;
                n.b(context, str, flowStep, new n.m() { // from class: os1
                    @Override // so.plotline.insights.Helpers.n.m
                    public final void a(String str2) {
                        switch (i) {
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
                        switch (i) {
                            case 0:
                                n.f(arrayList, flowStep, new v6(context, arrayList2, arrayList3, mVar, 4));
                                break;
                            default:
                                n.f(arrayList, flowStep, new v6(context, arrayList2, arrayList3, (e.C0259e) mVar, 5));
                                break;
                        }
                    }
                });
                break;
            case 1:
                final FlowStep flowStep2 = (FlowStep) this.e;
                final ArrayList arrayList4 = (ArrayList) this.g;
                final e.C0259e c0259e = (e.C0259e) this.h;
                final int i2 = 1;
                final Context context2 = this.b;
                final ArrayList arrayList5 = this.d;
                final ArrayList arrayList6 = this.f;
                n.i(context2, this.c, new n.m() { // from class: os1
                    @Override // so.plotline.insights.Helpers.n.m
                    public final void a(String str2) {
                        switch (i2) {
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
                        switch (i2) {
                            case 0:
                                n.f(arrayList5, flowStep2, new v6(context2, arrayList6, arrayList4, c0259e, 4));
                                break;
                            default:
                                n.f(arrayList5, flowStep2, new v6(context2, arrayList6, arrayList4, (e.C0259e) c0259e, 5));
                                break;
                        }
                    }
                });
                break;
            default:
                ArrayList arrayList7 = (ArrayList) this.g;
                ArrayList arrayList8 = (ArrayList) this.e;
                PlotlineWidget.g gVar = (PlotlineWidget.g) this.h;
                Context context3 = this.b;
                n.i(context3, this.c, new ps1(context3, this.d, this.f, arrayList7, arrayList8, gVar, 0));
                break;
        }
    }

    public /* synthetic */ ns1(Context context, ArrayList arrayList, ArrayList arrayList2, FlowStep flowStep, ArrayList arrayList3, ArrayList arrayList4, e.C0259e c0259e) {
        this.b = context;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = flowStep;
        this.f = arrayList3;
        this.g = arrayList4;
        this.h = c0259e;
    }
}
