package defpackage;

import android.view.View;
import j$.util.Objects;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.b0;
import so.plotline.insights.Models.c0;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class zq1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20224a = 0;
    public final /* synthetic */ a.m b;
    public final /* synthetic */ c0 c;
    public final /* synthetic */ FlowStep d;

    public /* synthetic */ zq1(a.m mVar, FlowStep flowStep, c0 c0Var) {
        this.b = mVar;
        this.d = flowStep;
        this.c = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20224a) {
            case 0:
                a.m mVar = this.b;
                if (mVar != null) {
                    String str = this.d.b;
                    c0 c0Var = this.c;
                    b0 b0Var = c0Var.r;
                    String str2 = b0Var.f19491a;
                    String str3 = b0Var.b;
                    String str4 = b0Var.c;
                    String str5 = b0Var.d;
                    Boolean bool = b0Var.e;
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    Boolean bool2 = c0Var.r.f;
                    mVar.a(boolValueOf, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false), str, str2, str3, str4, str5);
                }
                break;
            default:
                a.m mVar2 = this.b;
                if (mVar2 != null) {
                    b0 b0Var2 = this.c.r;
                    if (!Objects.equals(b0Var2.b, "NONE")) {
                        String str6 = this.d.b;
                        String str7 = b0Var2.f19491a;
                        String str8 = b0Var2.b;
                        String str9 = b0Var2.c;
                        String str10 = b0Var2.d;
                        Boolean bool3 = b0Var2.e;
                        Boolean boolValueOf2 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : true);
                        Boolean bool4 = b0Var2.f;
                        mVar2.a(boolValueOf2, Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false), str6, str7, str8, str9, str10);
                    }
                }
                break;
        }
    }

    public /* synthetic */ zq1(a.m mVar, c0 c0Var, FlowStep flowStep) {
        this.b = mVar;
        this.c = c0Var;
        this.d = flowStep;
    }
}
