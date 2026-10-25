package defpackage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.Database.a;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Models.c;
import so.plotline.insights.Models.n;
import so.plotline.insights.Network.d;
import so.plotline.insights.Network.e;
import so.plotline.insights.Tasks.b;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ks implements Continuation, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18254a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ks(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f18254a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    @Override // so.plotline.insights.Tasks.b.a
    public void d(HashMap map, List list) {
        byte b;
        List list2 = (List) this.f18254a;
        Object obj = (String) this.b;
        Object obj2 = (JSONObject) this.c;
        e eVar = (e) this.d;
        gy gyVar = (gy) this.e;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                String str = cVar.f;
                int iHashCode = str.hashCode();
                Iterator it2 = it;
                if (iHashCode != -701482080) {
                    if (iHashCode != 2160942) {
                        if (iHashCode == 79238569 && str.equals("STUDY")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("FLOW")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("JOURNEY")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    jSONArray4.put(cVar.f19492a);
                } else if (b == 1) {
                    n nVar = (n) cVar;
                    String str2 = nVar.l;
                    if (str2 != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("journeyId", str2);
                        jSONObject3.put("flowId", nVar.f19492a);
                        jSONArray2.put(jSONObject3);
                    } else {
                        jSONArray.put(nVar.f19492a);
                    }
                } else if (b == 2) {
                    jSONArray3.put(cVar.f19492a);
                }
                it = it2;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                a aVar = (a) it3.next();
                jSONObject2.put(aVar.f19324a, aVar.b);
            }
            Object jSONObject4 = new JSONObject(map);
            jSONObject.put("flowIds", jSONArray);
            jSONObject.put("studyIds", jSONArray3);
            jSONObject.put("journeyIds", jSONArray4);
            jSONObject.put("journeyFlowIds", jSONArray2);
            jSONObject.put("triggerEvent", obj);
            if (obj2 != null) {
                jSONObject.put("properties", obj2);
            } else {
                jSONObject.put("properties", new JSONObject());
            }
            jSONObject.put("userAttributes", jSONObject2);
            jSONObject.put("eventAttributes", jSONObject4);
        } catch (JSONException e) {
            DebugHelper.a(e);
        }
        eVar.e(d.a(null), jSONObject.toString()).enqueue(new d.q(gyVar));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ConfigFetchHandler) this.f18254a).lambda$fetchIfCacheExpiredAndNotThrottled$2((Task) this.b, (Task) this.c, (Date) this.d, (Map) this.e, task);
    }
}
