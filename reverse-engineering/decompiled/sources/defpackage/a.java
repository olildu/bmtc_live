package defpackage;

import android.view.ViewGroup;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import com.google.common.util.concurrent.SettableFuture;
import com.inmobi.media.A7;
import com.inmobi.media.C2637r7;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Modal.h;
import so.plotline.insights.Network.d;
import so.plotline.insights.Network.e;
import so.plotline.insights.Tasks.k;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f146a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f146a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                A7.a((A7) obj4, i2, (ViewGroup) obj3, (ViewGroup) obj2, (C2637r7) obj);
                break;
            case 1:
                ((OfflineLicenseHelper) obj4).lambda$acquireFirstSessionOnHandlerThread$2(i2, (byte[]) obj3, (SettableFuture) obj2, (Format) obj);
                break;
            case 2:
                int i3 = h.c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(((ArrayList) obj3).get(i2)));
                String str = ((h) obj4).b.b;
                ((so.plotline.insights.Listeners.a) obj2).c((Integer) obj, Boolean.FALSE, arrayList);
                break;
            default:
                String str2 = (String) obj3;
                JSONArray jSONArray = (JSONArray) obj2;
                String str3 = ((k) obj4).e;
                gr1 gr1Var = new gr1(i2, (ArrayList) obj);
                e eVar = (e) so.plotline.insights.Network.a.a().create(e.class);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sessionId", str2);
                    jSONObject.put("chunkIndex", i2);
                    jSONObject.put("events", jSONArray);
                    jSONObject.put("currentUrl", str3);
                } catch (JSONException e) {
                    DebugHelper.a(e);
                }
                eVar.f(d.a(null), jSONObject.toString()).enqueue(new d.i(gr1Var));
                break;
        }
    }

    public /* synthetic */ a(Object obj, Serializable serializable, int i, Object obj2, Serializable serializable2, int i2) {
        this.f146a = i2;
        this.c = obj;
        this.d = serializable;
        this.b = i;
        this.e = obj2;
        this.f = serializable2;
    }
}
