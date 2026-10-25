package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.Helpers.DebugCode;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.g;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Modal.j;
import so.plotline.insights.Models.c;
import so.plotline.insights.Models.g0;
import so.plotline.insights.Models.n;
import so.plotline.insights.Models.s;
import so.plotline.insights.Models.y;
import so.plotline.insights.Network.b;
import so.plotline.insights.Plotline;
import so.plotline.insights.Tasks.a;
import so.plotline.insights.Tasks.e;
import so.plotline.insights.Track;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gy implements DefaultTrackSelector.TrackInfo.Factory, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15775a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gy(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, boolean z, int[] iArr) {
        this.b = defaultTrackSelector;
        this.c = parameters;
        this.f15775a = z;
        this.d = iArr;
    }

    public void a(JSONObject jSONObject) {
        String strOptString;
        n nVar;
        String str;
        final int iOptInt;
        JSONObject jSONObjectOptJSONObject;
        g0 g0Var;
        List list = (List) this.b;
        final Context context = (Context) this.c;
        Set set = (Set) this.d;
        boolean z = this.f15775a;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("campaignType");
            DebugHelper.b();
            if (jSONObject2.has("newJourneysNotEntered")) {
                JSONArray jSONArray = jSONObject2.getJSONArray("newJourneysNotEntered");
                int i = 0;
                while (i < jSONArray.length()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("journeyId", jSONArray.getString(i));
                    q.p("Plotline Control Group Assigned", jSONObject3, null, null);
                    i++;
                    list = list;
                }
            }
            List<c> list2 = list;
            if (jSONObject2.has("newFlowsNotShown")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("newFlowsNotShown");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("flowId", jSONArray2.getString(i2));
                    q.p("Plotline Control Group Assigned", jSONObject4, null, null);
                }
            }
            int iHashCode = string.hashCode();
            if (iHashCode == -701482080) {
                if (string.equals("JOURNEY")) {
                    JSONObject jSONObject5 = jSONObject2.getJSONObject("journeyData").getJSONObject("nextFlow");
                    String string2 = jSONObject5.getString("journeyId");
                    DebugHelper.c(DebugCode.PL_I_RESPONSE_RECEIVED, g.a("journeyId", string2));
                    Plotline.b().G.a(string2);
                    s sVar = (s) Plotline.b().G.f19517a.get(string2);
                    q.p("Plotline Target Group Assigned", new JSONObject().put("journeyId", string2), sVar != null ? sVar.g : null, null);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject5);
                    Plotline.b().F.d(jSONArray3);
                    return;
                }
                return;
            }
            if (iHashCode == 2160942) {
                if (string.equals("FLOW")) {
                    JSONObject jSONObject6 = jSONObject2.getJSONObject("flowData");
                    String string3 = jSONObject6.getString("flowId");
                    q.D(string3);
                    String strOptString2 = jSONObject6.optString("triggerSource", "FE");
                    if (jSONObject6.has("journeyId") || strOptString2.equals("BE")) {
                        strOptString = jSONObject6.optString("journeyId");
                        Plotline.b().F.f(string3);
                    } else {
                        strOptString = null;
                    }
                    DebugHelper.c(DebugCode.PL_I_RESPONSE_RECEIVED, g.a("journeyId", strOptString, "flowId", string3));
                    Plotline.b().F.c(string3, strOptString, jSONObject6.getJSONArray("flowSteps"));
                    Plotline.b().F.b(context, set, z);
                    JSONObject jSONObject7 = new JSONObject();
                    if (jSONObject6.has("labels") && (nVar = (n) Plotline.b().F.f19511a.get(string3)) != null) {
                        jSONObject7 = jSONObject6.getJSONObject("labels");
                        nVar.g = jSONObject7;
                    }
                    JSONObject jSONObjectPut = new JSONObject().put("flowId", string3);
                    if (strOptString != null) {
                        jSONObjectPut.put("journeyId", strOptString);
                    }
                    q.p("Plotline Target Group Assigned", jSONObjectPut, jSONObject7, null);
                    return;
                }
                return;
            }
            if (iHashCode == 2402104) {
                if (string.equals("NONE")) {
                    try {
                        for (c cVar : list2) {
                            n nVar2 = (n) Plotline.b().F.f19511a.get(cVar.f19492a);
                            if (nVar2 != null && (str = nVar2.l) != null && !str.isEmpty()) {
                                Plotline.b().F.f(cVar.f19492a);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        DebugHelper.a(e);
                        return;
                    }
                }
                return;
            }
            if (iHashCode == 79238569 && string.equals("STUDY")) {
                JSONObject jSONObject8 = jSONObject2.getJSONObject("studyData");
                final String string4 = jSONObject8.getString("studyId");
                q.D(string4);
                DebugHelper.c(DebugCode.PL_I_RESPONSE_RECEIVED, g.a("studyId", string4));
                boolean z2 = jSONObject8.getBoolean("showThankYouScreen");
                final Boolean boolValueOf = Boolean.valueOf(z2);
                final String string5 = z2 ? jSONObject8.getString("thankYouScreenText") : "Thanks for your input!";
                final ArrayList arrayListA = y.a(jSONObject8.getJSONArray("questions"));
                if (arrayListA.size() == 0) {
                    return;
                }
                Boolean bool = Boolean.FALSE;
                if (jSONObject8.has("hidePlotline") && jSONObject8.getBoolean("hidePlotline")) {
                    bool = Boolean.TRUE;
                }
                Integer numValueOf = Integer.valueOf(jSONObject8.getInt("delay"));
                if (jSONObject8.has("labels") && (g0Var = (g0) Plotline.b().E.f19502a.get(string4)) != null) {
                    g0Var.g = jSONObject8.getJSONObject("labels");
                }
                final String strOptString3 = "";
                if (!jSONObject8.has("thankYouImageSettings") || jSONObject8.isNull("thankYouImageSettings") || (jSONObjectOptJSONObject = jSONObject8.optJSONObject("thankYouImageSettings")) == null) {
                    iOptInt = 0;
                } else {
                    strOptString3 = jSONObjectOptJSONObject.optString("url", "");
                    iOptInt = jSONObjectOptJSONObject.optInt(InMobiNetworkValues.WIDTH, 0);
                }
                final Boolean bool2 = bool;
                a.a(new e(new Runnable() { // from class: nk1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList = arrayListA;
                        Boolean bool3 = boolValueOf;
                        String str2 = string5;
                        Boolean bool4 = bool2;
                        String str3 = strOptString3;
                        int i3 = iOptInt;
                        Activity activityE = Track.e(context);
                        String str4 = string4;
                        if (activityE == null || Plotline.b().e().booleanValue()) {
                            DebugHelper.c(DebugCode.PL_E_ACTIVE_CAMPAIGN_SHOWING, g.a("studyId", str4));
                            return;
                        }
                        Plotline.b().g();
                        try {
                            so.plotline.insights.a aVarD = so.plotline.insights.a.d();
                            aVarD.getClass();
                            try {
                                so.plotline.insights.Modal.e eVar = aVarD.e;
                                if (eVar != null) {
                                    eVar.dismiss();
                                }
                                aVarD.e = null;
                            } catch (Exception e2) {
                                DebugHelper.a(e2);
                            }
                            j jVarE = j.e(activityE, str4, arrayList, bool3, str2, bool4, str3, i3);
                            Plotline.b().e = Boolean.TRUE;
                            so.plotline.insights.Helpers.n.a(activityE, arrayList, str3, new Track.b(jVarE, str4));
                        } catch (Exception e3) {
                            DebugHelper.a(e3);
                        }
                    }
                }, numValueOf));
            }
        } catch (JSONException e2) {
            DebugHelper.a(e2);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return ((DefaultTrackSelector) this.b).lambda$selectAudioTrack$2((DefaultTrackSelector.Parameters) this.c, this.f15775a, (int[]) this.d, i, trackGroup, iArr);
    }

    public /* synthetic */ gy(List list, Context context, Set set, boolean z) {
        this.b = list;
        this.c = context;
        this.d = set;
        this.f15775a = z;
    }
}
