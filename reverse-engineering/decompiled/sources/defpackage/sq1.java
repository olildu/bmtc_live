package defpackage;

import android.view.View;
import j$.util.Objects;
import so.plotline.insights.Helpers.c;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.b0;
import so.plotline.insights.Models.c0;
import so.plotline.insights.Models.d0;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class sq1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19595a = 0;
    public final /* synthetic */ a.m b;
    public final /* synthetic */ c0 c;
    public final /* synthetic */ FlowStep d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ so.plotline.insights.Helpers.a f;
    public final /* synthetic */ d0 g;
    public final /* synthetic */ so.plotline.insights.Models.a h;

    public /* synthetic */ sq1(a.m mVar, FlowStep flowStep, c0 c0Var, boolean z, c cVar, d0 d0Var, so.plotline.insights.Models.a aVar) {
        this.b = mVar;
        this.d = flowStep;
        this.c = c0Var;
        this.e = z;
        this.f = cVar;
        this.g = d0Var;
        this.h = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19595a) {
            case 0:
                final int i = 0;
                final a.m mVar = this.b;
                final FlowStep flowStep = this.d;
                final c0 c0Var = this.c;
                final boolean z = this.e;
                Runnable runnable = new Runnable() { // from class: ar1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                b0 b0Var = c0Var.r;
                                a.m mVar2 = mVar;
                                if (mVar2 != null) {
                                    String str = flowStep.b;
                                    String str2 = b0Var.f19491a;
                                    String str3 = b0Var.b;
                                    String str4 = b0Var.c;
                                    String str5 = b0Var.d;
                                    Boolean bool = b0Var.e;
                                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : z);
                                    Boolean bool2 = b0Var.f;
                                    mVar2.a(boolValueOf, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), str, str2, str3, str4, str5);
                                }
                                break;
                            default:
                                String str6 = flowStep.b;
                                b0 b0Var2 = c0Var.r;
                                String str7 = b0Var2.f19491a;
                                String str8 = b0Var2.b;
                                String str9 = b0Var2.c;
                                String str10 = b0Var2.d;
                                Boolean bool3 = b0Var2.e;
                                Boolean boolValueOf2 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : z);
                                Boolean bool4 = b0Var2.f;
                                mVar.a(boolValueOf2, Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false), str6, str7, str8, str9, str10);
                                break;
                        }
                    }
                };
                so.plotline.insights.Helpers.a aVar = this.f;
                if (aVar == null) {
                    runnable.run();
                } else {
                    aVar.a(view, this.g, this.h, runnable);
                }
                break;
            default:
                final a.m mVar2 = this.b;
                if (mVar2 != null) {
                    final c0 c0Var2 = this.c;
                    if (!Objects.equals(c0Var2.r.b, "NONE")) {
                        final int i2 = 1;
                        final FlowStep flowStep2 = this.d;
                        final boolean z2 = this.e;
                        Runnable runnable2 = new Runnable() { // from class: ar1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        b0 b0Var = c0Var2.r;
                                        a.m mVar3 = mVar2;
                                        if (mVar3 != null) {
                                            String str = flowStep2.b;
                                            String str2 = b0Var.f19491a;
                                            String str3 = b0Var.b;
                                            String str4 = b0Var.c;
                                            String str5 = b0Var.d;
                                            Boolean bool = b0Var.e;
                                            Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : z2);
                                            Boolean bool2 = b0Var.f;
                                            mVar3.a(boolValueOf, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), str, str2, str3, str4, str5);
                                        }
                                        break;
                                    default:
                                        String str6 = flowStep2.b;
                                        b0 b0Var2 = c0Var2.r;
                                        String str7 = b0Var2.f19491a;
                                        String str8 = b0Var2.b;
                                        String str9 = b0Var2.c;
                                        String str10 = b0Var2.d;
                                        Boolean bool3 = b0Var2.e;
                                        Boolean boolValueOf2 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : z2);
                                        Boolean bool4 = b0Var2.f;
                                        mVar2.a(boolValueOf2, Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false), str6, str7, str8, str9, str10);
                                        break;
                                }
                            }
                        };
                        so.plotline.insights.Helpers.a aVar2 = this.f;
                        if (aVar2 == null) {
                            runnable2.run();
                        } else {
                            aVar2.a(view, this.g, this.h, runnable2);
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ sq1(a.m mVar, c0 c0Var, FlowStep flowStep, boolean z, c cVar, d0 d0Var, so.plotline.insights.Models.a aVar) {
        this.b = mVar;
        this.c = c0Var;
        this.d = flowStep;
        this.e = z;
        this.f = cVar;
        this.g = d0Var;
        this.h = aVar;
    }
}
