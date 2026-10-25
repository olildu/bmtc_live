package defpackage;

import android.content.DialogInterface;
import in.juspay.hypersdk.core.JBridge;
import so.plotline.insights.FlowViews.i;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class kc0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17486a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kc0(int i, Object obj, Object obj2) {
        this.f17486a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f17486a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((JBridge) obj2).lambda$newDialogWithoutDateField$4((String) obj, dialogInterface);
                break;
            default:
                int i2 = i.G;
                ((a.f) obj2).a(Boolean.FALSE, Boolean.TRUE, ((FlowStep) obj).b, null, null, null, null);
                break;
        }
    }
}
