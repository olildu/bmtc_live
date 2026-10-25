package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import so.plotline.insights.Database.f;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.o;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Models.c;
import so.plotline.insights.Models.n;
import so.plotline.insights.Network.b;
import so.plotline.insights.Plotline;
import so.plotline.insights.Tasks.d;
import so.plotline.insights.Tasks.i;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class gr1 implements f, b, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15761a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr1(int i, ArrayList arrayList) {
        this.f15761a = 2;
        this.b = arrayList;
    }

    public void a(JSONObject jSONObject) {
        int i = this.f15761a;
        Object obj = this.b;
        switch (i) {
            case 1:
                i iVar = (i) obj;
                int i2 = i.i;
                iVar.getClass();
                if (!q.E()) {
                    Plotline.b().h(iVar.h);
                }
                iVar.a(jSONObject);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (jSONObject == null) {
                    DebugHelper.b();
                } else {
                    arrayList.size();
                    DebugHelper.b();
                }
                break;
        }
    }

    @Override // so.plotline.insights.Database.f
    public void c(List list, List list2) {
        d dVar = (d) this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            dVar.a(cVar);
            n nVar = (n) Plotline.b().F.f19511a.get(cVar.f19492a);
            if (nVar != null) {
                so.plotline.insights.Network.d.g(cVar.f19492a, null, null, nVar.l, "decision", "yes", Boolean.FALSE, null, null, null, null, null, null);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c cVar2 = (c) it2.next();
            n nVar2 = (n) Plotline.b().F.f19511a.get(cVar2.f19492a);
            if (nVar2 != null && !nVar2.q.booleanValue()) {
                dVar.a(cVar2);
                so.plotline.insights.Network.d.g(cVar2.f19492a, null, null, nVar2.l, "decision", "no", Boolean.FALSE, null, null, null, null, null, null);
            }
        }
    }

    public /* synthetic */ gr1(Object obj, int i) {
        this.f15761a = i;
        this.b = obj;
    }
}
