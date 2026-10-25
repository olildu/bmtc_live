package defpackage;

import androidx.work.impl.Processor;
import androidx.work.impl.model.WorkGenerationalId;
import com.inmobi.media.C2493h2;
import com.inmobi.media.L6;
import com.inmobi.media.N4;
import com.inmobi.media.N6;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hyperupi.commonLibrary.v18.CL18;
import in.juspay.hyperupi.commonLibraryUtils.CLInterface;
import j$.util.concurrent.ConcurrentHashMap;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ie implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15906a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ie(Object obj, Object obj2, boolean z, int i) {
        this.f15906a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15906a) {
            case 0:
                CL18.handleInit$lambda$1((CL18) this.c, (CLInterface.CLTask) this.d, this.b);
                break;
            case 1:
                L6.a((L6) this.c, (N6) this.d, this.b);
                break;
            case 2:
                ((LogSessioniserExp) this.c).lambda$pushToPusher$3((ConcurrentHashMap) this.d, this.b);
                break;
            case 3:
                ((Processor) this.c).lambda$runOnExecuted$1((WorkGenerationalId) this.d, this.b);
                break;
            case 4:
                a.m mVar = (a.m) this.c;
                FlowStep flowStep = (FlowStep) this.d;
                if (mVar != null) {
                    mVar.a(Boolean.valueOf(this.b), Boolean.FALSE, flowStep.b, null, null, null, null);
                }
                break;
            default:
                C2493h2.c((String) this.c, this.b, (N4) this.d);
                break;
        }
    }

    public /* synthetic */ ie(String str, boolean z, N4 n4) {
        this.f15906a = 5;
        this.c = str;
        this.b = z;
        this.d = n4;
    }
}
