package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.CancellationSignal;
import androidx.core.widget.NestedScrollView;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;
import app.chalo.ads.NativeInlineAdTelemetry;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.inmobi.media.C2490h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import so.plotline.insights.Database.d;
import so.plotline.insights.FlowViews.PlotlineScreenshotBitmapCallback;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.h;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Helpers.p;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Modal.g;
import so.plotline.insights.Modal.j;
import so.plotline.insights.Modal.k;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.g0;
import so.plotline.insights.Models.l0;
import so.plotline.insights.Models.y;
import so.plotline.insights.Network.e;
import so.plotline.insights.OptionModals.b;
import so.plotline.insights.Plotline;
import so.plotline.insights.PlotlinePush;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.R;
import so.plotline.insights.Track;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j4 implements NativeAd.OnNativeAdLoadedListener, Continuation, SynchronizationGuard.CriticalSection, CancellationSignal.OnCancelListener, a.m, d.a, OnSuccessListener, b.a, so.plotline.insights.Tasks.b.a, so.plotline.insights.Listeners.a, PlotlineScreenshotBitmapCallback, n.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17369a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j4(int i, Object obj, Object obj2, Object obj3) {
        this.f17369a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // so.plotline.insights.Helpers.n.m
    public void a(String str) {
        switch (this.f17369a) {
            case 15:
                DebugHelper.b();
                break;
            case 16:
                DebugHelper.b();
                break;
            case 17:
                DebugHelper.b();
                break;
            default:
                DebugHelper.b();
                break;
        }
    }

    @Override // so.plotline.insights.Database.d.a
    public void b(HashMap map) {
        PlotlineWidget.e eVar = (PlotlineWidget.e) this.b;
        FlowStep flowStep = (FlowStep) this.c;
        l0 l0Var = (l0) this.d;
        boolean z = false;
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            String str3 = flowStep.M.containsKey(str) ? (String) flowStep.M.get(str) : null;
            if (str3 == null || !str3.equals(str2)) {
                flowStep.M.put(str, (String) map.get(str));
                z = true;
            }
        }
        if (z) {
            new Handler(Looper.getMainLooper()).post(new vs0(eVar.c, flowStep, l0Var.u.doubleValue()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:103:0x019e  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8 A[Catch: Exception -> 0x01f5, TryCatch #4 {Exception -> 0x01f5, blocks: (B:119:0x01c4, B:121:0x01d8, B:122:0x01e1, B:124:0x01e7, B:127:0x01f7), top: B:225:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7 A[Catch: Exception -> 0x01f5, LOOP:2: B:122:0x01e1->B:124:0x01e7, LOOP_END, TryCatch #4 {Exception -> 0x01f5, blocks: (B:119:0x01c4, B:121:0x01d8, B:122:0x01e1, B:124:0x01e7, B:127:0x01f7), top: B:225:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0224 A[Catch: Exception -> 0x0229, TryCatch #2 {Exception -> 0x0229, blocks: (B:131:0x020e, B:133:0x0224, B:136:0x022b), top: B:221:0x020e }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0233 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0235  */
    /* JADX WARN: Code duplicated, block: B:141:0x023e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0242  */
    /* JADX WARN: Code duplicated, block: B:145:0x024d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0264  */
    /* JADX WARN: Code duplicated, block: B:149:0x026d  */
    /* JADX WARN: Code duplicated, block: B:155:0x027e A[PHI: r5
      0x027e: PHI (r5v4 so.plotline.insights.Modal.j) = 
      (r5v3 so.plotline.insights.Modal.j)
      (r5v12 so.plotline.insights.Modal.j)
      (r5v12 so.plotline.insights.Modal.j)
      (r5v12 so.plotline.insights.Modal.j)
      (r5v14 so.plotline.insights.Modal.j)
     binds: [B:117:0x01be, B:150:0x026f, B:154:0x027b, B:151:0x0271, B:142:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0286  */
    /* JADX WARN: Code duplicated, block: B:160:0x028e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0291  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a2 A[LOOP:3: B:163:0x02a0->B:164:0x02a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x031e A[Catch: Exception -> 0x0321, TryCatch #14 {Exception -> 0x0321, blocks: (B:172:0x030c, B:174:0x031e, B:178:0x0325), top: B:245:0x030c }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0323  */
    /* JADX WARN: Code duplicated, block: B:182:0x033c  */
    /* JADX WARN: Code duplicated, block: B:191:0x036a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0372  */
    /* JADX WARN: Code duplicated, block: B:194:0x0377  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:200:0x0428  */
    /* JADX WARN: Code duplicated, block: B:202:0x043b A[LOOP:4: B:195:0x03f2->B:202:0x043b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0472  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:215:0x0504  */
    /* JADX WARN: Code duplicated, block: B:221:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x030c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195  */
    @Override // so.plotline.insights.Listeners.a
    public void c(Integer num, Boolean bool, ArrayList arrayList) {
        LinearLayout linearLayout;
        NestedScrollView nestedScrollView;
        String str;
        int i;
        String str2;
        String str3;
        j jVar;
        int size;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        k kVar;
        Context context;
        Boolean bool2;
        String str4;
        int i2;
        int iA;
        ImageView imageView;
        int length;
        int iCharCount;
        TextView textView;
        int iCodePointAt;
        float f;
        boolean z;
        JSONArray jSONArray;
        int size2;
        int i3;
        String str5;
        g0 g0Var;
        JSONObject jSONObject;
        ArrayList arrayList2;
        int size3;
        int i4;
        y yVar;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        HashMap map;
        Iterator<String> itKeys;
        j jVar2 = (j) this.b;
        LinearLayout linearLayout4 = (LinearLayout) this.c;
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.d;
        int i5 = j.u;
        String str6 = "studyId";
        if (bool.booleanValue()) {
            jVar2.f();
            return;
        }
        JSONArray jSONArray2 = ((y) jVar2.l.get(num.intValue())).h;
        int iIntValue = num.intValue() + 1;
        boolean z2 = true;
        int i6 = 0;
        String str7 = null;
        String string = null;
        while (i6 < jSONArray2.length()) {
            try {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i6);
                JSONArray jSONArray3 = jSONArray2;
                String string2 = jSONObject5.getString("action");
                i = iIntValue;
                try {
                    String string3 = jSONObject5.getString("effect");
                    int i7 = i6;
                    String string4 = jSONObject5.getString("platform");
                    nestedScrollView = nestedScrollView2;
                    try {
                        linearLayout = linearLayout4;
                        if (string2.equals("SUBMIT")) {
                            try {
                                if (string3.equals("SKIP") || string3.equals("TRACK_EVENT") || string3.equals("IDENTIFY_USER")) {
                                    if (jSONObject5.has(TypedValues.AttributesType.S_TARGET)) {
                                        try {
                                            string = jSONObject5.getString(TypedValues.AttributesType.S_TARGET);
                                            jVar2 = jVar2;
                                            str = str6;
                                            str7 = string3;
                                        } catch (JSONException e) {
                                            e = e;
                                            jVar2 = jVar2;
                                            str = str6;
                                            str7 = string3;
                                            DebugHelper.a(e);
                                            str2 = str7;
                                            str3 = string;
                                            if (str2 != null) {
                                                switch (str2) {
                                                    case "IDENTIFY_USER":
                                                        jVar = jVar2;
                                                        if (str3 != null) {
                                                            try {
                                                                Plotline.f(new JSONObject(str3));
                                                            } catch (Exception e2) {
                                                                DebugHelper.a(e2);
                                                            }
                                                            break;
                                                        }
                                                        size = i;
                                                        break;
                                                    case "END":
                                                        jVar = jVar2;
                                                        size = jVar.l.size();
                                                        break;
                                                    case "SKIP":
                                                        jVar = jVar2;
                                                        if (str3 == null) {
                                                            arrayList2 = jVar.l;
                                                            size3 = arrayList2.size();
                                                            size = i;
                                                            i4 = 0;
                                                            while (i4 < size3) {
                                                                Object obj = arrayList2.get(i4);
                                                                i4++;
                                                                yVar = (y) obj;
                                                                if (yVar.f19522a.equals(str3)) {
                                                                    size = jVar.l.indexOf(yVar);
                                                                }
                                                            }
                                                            break;
                                                        } else {
                                                            size = i;
                                                            break;
                                                        }
                                                        break;
                                                    case "REDIRECT":
                                                        if (str3 == null) {
                                                            jVar = jVar2;
                                                            size = jVar.l.size();
                                                            break;
                                                        } else {
                                                            jVar = jVar2;
                                                            size = i;
                                                            break;
                                                        }
                                                        break;
                                                    case "TRACK_EVENT":
                                                        if (str3 != null) {
                                                            try {
                                                                jSONObject2 = new JSONObject(str3);
                                                                String string5 = jSONObject2.getString("eventName");
                                                                jSONObject3 = new JSONObject();
                                                                if (jSONObject2.has("properties")) {
                                                                    jSONObject3 = jSONObject2.getJSONObject("properties");
                                                                }
                                                                Plotline.l(string5, jSONObject3);
                                                            } catch (Exception e3) {
                                                                DebugHelper.a(e3);
                                                            }
                                                            break;
                                                        }
                                                        jVar = jVar2;
                                                        size = i;
                                                        break;
                                                    case "CALLBACK":
                                                        if (str3 != null) {
                                                            try {
                                                                jSONObject4 = new JSONObject(str3);
                                                                Plotline.b().getClass();
                                                                if (Plotline.b().c0 != null) {
                                                                    map = new HashMap();
                                                                    itKeys = jSONObject4.keys();
                                                                    while (itKeys.hasNext()) {
                                                                        String next = itKeys.next();
                                                                        map.put(next, jSONObject4.getString(next));
                                                                    }
                                                                    Plotline.b().getClass();
                                                                    Plotline.b().c0.c(map);
                                                                }
                                                            } catch (Exception e4) {
                                                                DebugHelper.a(e4);
                                                            }
                                                            break;
                                                        }
                                                        jVar = jVar2;
                                                        size = i;
                                                        break;
                                                    default:
                                                        jVar = jVar2;
                                                        size = i;
                                                        break;
                                                }
                                            } else {
                                                jVar = jVar2;
                                                size = i;
                                            }
                                            if (!bool.booleanValue()) {
                                                if (size == jVar.l.size()) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                Boolean boolValueOf = Boolean.valueOf(z);
                                                jSONArray = new JSONArray();
                                                size2 = arrayList.size();
                                                i3 = 0;
                                                while (i3 < size2) {
                                                    Object obj2 = arrayList.get(i3);
                                                    i3++;
                                                    jSONArray.put((String) obj2);
                                                }
                                                String str8 = jVar.t;
                                                String str9 = ((y) jVar.l.get(num.intValue())).f19522a;
                                                e eVar = (e) so.plotline.insights.Network.a.a().create(e.class);
                                                Plotline.b();
                                                JSONObject jSONObject6 = new JSONObject();
                                                str5 = str;
                                                try {
                                                    jSONObject6.put(str5, str8);
                                                    jSONObject6.put("questionId", str9);
                                                    jSONObject6.put("answer", jSONArray);
                                                    jSONObject6.put("isCompleted", boolValueOf);
                                                    jSONObject6.put("timestamp", System.currentTimeMillis());
                                                } catch (JSONException e5) {
                                                    DebugHelper.a(e5);
                                                }
                                                eVar.h(so.plotline.insights.Network.d.a(null), jSONObject6.toString()).enqueue(new so.plotline.insights.Network.d.n());
                                                if (z) {
                                                    try {
                                                        g0Var = (g0) Plotline.b().E.f19502a.get(jVar.t);
                                                        if (g0Var != null) {
                                                            jSONObject = g0Var.g;
                                                        } else {
                                                            jSONObject = null;
                                                        }
                                                        JSONObject jSONObject7 = new JSONObject();
                                                        jSONObject7.put(str5, jVar.t);
                                                        q.p("Plotline Study Completed", jSONObject7, jSONObject, null);
                                                    } catch (Exception e6) {
                                                        DebugHelper.a(e6);
                                                    }
                                                }
                                            }
                                            if (str2 != null) {
                                                try {
                                                    jVar.f();
                                                    Intent intent = new Intent("android.intent.action.VIEW");
                                                    intent.setData(Uri.parse(str3));
                                                    jVar.getContext().startActivity(intent);
                                                    return;
                                                } catch (Exception e7) {
                                                    DebugHelper.a(e7);
                                                }
                                            }
                                            if (size >= jVar.l.size()) {
                                                linearLayout2 = linearLayout;
                                                linearLayout2.removeView(jVar.r.f19480a);
                                                jVar.r = new g(jVar.getContext(), Integer.valueOf(size), jVar.l, jVar.s, jVar.q);
                                                jVar.setCanceledOnTouchOutside(!((y) jVar.l.get(size)).p.booleanValue());
                                                jVar.setCancelable(!((y) jVar.l.get(size)).p.booleanValue());
                                                TransitionManager.beginDelayedTransition(linearLayout2, new Fade(1));
                                                linearLayout3 = jVar.r.f19480a;
                                                if (linearLayout3 != null) {
                                                    jVar.f();
                                                    return;
                                                }
                                                linearLayout2.addView(linearLayout3);
                                                try {
                                                    nestedScrollView.scrollTo(0, 0);
                                                    return;
                                                } catch (Exception e8) {
                                                    DebugHelper.a(e8);
                                                    return;
                                                }
                                            }
                                            if (!jVar.m.booleanValue()) {
                                                jVar.f();
                                                return;
                                            }
                                            ViewGroup viewGroup = linearLayout;
                                            viewGroup.removeView(jVar.r.f19480a);
                                            context = jVar.getContext();
                                            Integer numValueOf = Integer.valueOf(jVar.l.size() - 1);
                                            String str10 = jVar.n;
                                            j4 j4Var = jVar.s;
                                            bool2 = jVar.q;
                                            str4 = jVar.o;
                                            i2 = jVar.p;
                                            kVar = new k(context);
                                            View.inflate(kVar.getContext(), R.layout.plotline_thank_you_layout, kVar);
                                            LinearLayout linearLayout5 = (LinearLayout) kVar.findViewById(R.id.thank_you_layout);
                                            linearLayout5.setBackground(q.c(h.r, h.a(kVar.getContext(), R.color.plotline_background, h.f19443a)));
                                            TextView textView2 = (TextView) kVar.findViewById(R.id.thank_you_screen_text);
                                            iA = h.a(kVar.getContext(), R.color.plotline_title, h.c);
                                            textView2.setTextColor(iA);
                                            p.f(textView2, str10, iA, "TEXT_TYPE_TITLE", false);
                                            textView2.setText(str10);
                                            imageView = (ImageView) kVar.findViewById(R.id.thank_you_imgv);
                                            length = str4.length();
                                            iCharCount = 0;
                                            while (true) {
                                                if (iCharCount < length) {
                                                    iCodePointAt = str4.codePointAt(iCharCount);
                                                    if (Character.isWhitespace(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                        z2 = true;
                                                    } else {
                                                        imageView.getLayoutParams().width = -1;
                                                        imageView.getLayoutParams().height = -2;
                                                        imageView.setForegroundGravity(17);
                                                        imageView.setPadding(0, 0, 0, 0);
                                                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                                        imageView.setAdjustViewBounds(z2);
                                                        f = i2;
                                                        if (so.plotline.insights.FlowViews.d.o(f) > 0.0f) {
                                                            imageView.getLayoutParams().width = (int) so.plotline.insights.FlowViews.d.o(f);
                                                        }
                                                        so.plotline.insights.FlowViews.d.k(str4, context, imageView);
                                                        imageView.setVisibility(0);
                                                    }
                                                } else {
                                                    imageView.setImageDrawable(h.b(kVar.getContext(), R.drawable.plotline_ic_check, iA));
                                                }
                                            }
                                            textView = (TextView) kVar.findViewById(R.id.plotline);
                                            textView.setTextColor(h.a(kVar.getContext(), R.color.plotline_description, h.b));
                                            textView.setTextSize(h.D);
                                            if (bool2.booleanValue()) {
                                                textView.setVisibility(8);
                                            }
                                            p.d(linearLayout5, null, null, null, null, null, imageView);
                                            new Handler().postDelayed(new k.a(j4Var, numValueOf), 1500L);
                                            TransitionManager.beginDelayedTransition(viewGroup, new Fade(1));
                                            viewGroup.addView(kVar);
                                        }
                                    } else {
                                        jVar2 = jVar2;
                                        str = str6;
                                    }
                                    i6 = i7 + 1;
                                    jSONArray2 = jSONArray3;
                                    iIntValue = i;
                                    nestedScrollView2 = nestedScrollView;
                                    str6 = str;
                                    linearLayout4 = linearLayout;
                                    jVar2 = jVar2;
                                } else {
                                    if (string3.equals("REDIRECT") || string3.equals("CALLBACK")) {
                                        if (string4.equals("ANDROID")) {
                                            if (jSONObject5.has(TypedValues.AttributesType.S_TARGET)) {
                                                string = jSONObject5.getString(TypedValues.AttributesType.S_TARGET);
                                                jVar2 = jVar2;
                                                str = str6;
                                                str7 = string3;
                                            } else {
                                                jVar2 = jVar2;
                                                str = str6;
                                            }
                                            i6 = i7 + 1;
                                            jSONArray2 = jSONArray3;
                                            iIntValue = i;
                                            nestedScrollView2 = nestedScrollView;
                                            str6 = str;
                                            linearLayout4 = linearLayout;
                                            jVar2 = jVar2;
                                        }
                                    }
                                    if (string3.equals("END")) {
                                        jVar2 = jVar2;
                                        str = str6;
                                        str7 = string3;
                                    } else {
                                        jVar2 = jVar2;
                                        str = str6;
                                    }
                                    i6 = i7 + 1;
                                    jSONArray2 = jSONArray3;
                                    iIntValue = i;
                                    nestedScrollView2 = nestedScrollView;
                                    str6 = str;
                                    linearLayout4 = linearLayout;
                                    jVar2 = jVar2;
                                }
                            } catch (JSONException e9) {
                                e = e9;
                                str = str6;
                                DebugHelper.a(e);
                                str2 = str7;
                                str3 = string;
                                if (str2 != null) {
                                    switch (str2) {
                                        case -126761698:
                                            if (str2.equals("IDENTIFY_USER")) {
                                            }
                                            break;
                                        case 68795:
                                            if (str2.equals("END")) {
                                            }
                                            break;
                                        case 2547071:
                                            if (str2.equals("SKIP")) {
                                            }
                                            break;
                                        case 6481884:
                                            if (str2.equals("REDIRECT")) {
                                            }
                                            break;
                                        case 358877798:
                                            if (str2.equals("TRACK_EVENT")) {
                                            }
                                            break;
                                        case 610406469:
                                            if (str2.equals("CALLBACK")) {
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException: Switch insn not found in header
                                        	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:383)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:331)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1330
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.j4.c(java.lang.Integer, java.lang.Boolean, java.util.ArrayList):void");
                                }

                                @Override // so.plotline.insights.Tasks.b.a
                                public void d(HashMap map, List list) {
                                    switch (this.f17369a) {
                                        case 11:
                                            FlowStep flowStep = (FlowStep) this.c;
                                            String str = (String) this.b;
                                            us0 us0Var = (us0) this.d;
                                            try {
                                                JSONObject jSONObject = new JSONObject();
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    so.plotline.insights.Database.a aVar = (so.plotline.insights.Database.a) it.next();
                                                    jSONObject.put(aVar.f19324a, aVar.b);
                                                }
                                                JSONObject jSONObject2 = new JSONObject(map);
                                                JSONObject jSONObject3 = new JSONObject();
                                                if (flowStep != null) {
                                                    jSONObject3.put("stepId", flowStep.b);
                                                }
                                                jSONObject3.put("flowId", str);
                                                jSONObject3.put("userAttributes", jSONObject);
                                                jSONObject3.put("eventAttributes", jSONObject2);
                                                jSONObject3.put("properties", new JSONObject());
                                                ((e) so.plotline.insights.Network.a.a().create(e.class)).d(so.plotline.insights.Network.d.a(null), jSONObject3.toString()).enqueue(new so.plotline.insights.Network.d.h(us0Var));
                                            } catch (JSONException e) {
                                                DebugHelper.a(e);
                                                us0Var.d(null, false);
                                                return;
                                            }
                                            break;
                                        default:
                                            FlowStep flowStep2 = (FlowStep) this.b;
                                            ArrayList arrayList = (ArrayList) this.c;
                                            n.m mVar = (n.m) this.d;
                                            HashMap map2 = new HashMap();
                                            Iterator it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                so.plotline.insights.Database.a aVar2 = (so.plotline.insights.Database.a) it2.next();
                                                map2.put(aVar2.f19324a, aVar2.b);
                                            }
                                            flowStep2.M = map2;
                                            flowStep2.L = arrayList;
                                            mVar.a();
                                            break;
                                    }
                                }

                                @Override // so.plotline.insights.FlowViews.PlotlineScreenshotBitmapCallback
                                public void e(final Bitmap bitmap) {
                                    final so.plotline.insights.Tasks.k kVar = (so.plotline.insights.Tasks.k) this.b;
                                    int[] iArr = (int[]) this.c;
                                    final ArrayList arrayList = (ArrayList) this.d;
                                    if (bitmap != null) {
                                        final int i = iArr[0];
                                        final int i2 = iArr[1];
                                        kVar.i.post(new Runnable() { // from class: ds1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                so.plotline.insights.Tasks.k.a(kVar, bitmap, arrayList, i, i2);
                                            }
                                        });
                                    }
                                }

                                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                                public Object execute() {
                                    DefaultScheduler defaultScheduler = (DefaultScheduler) this.b;
                                    TransportContext transportContext = (TransportContext) this.c;
                                    defaultScheduler.d.l1(transportContext, (EventInternal) this.d);
                                    defaultScheduler.f13140a.b(transportContext, 1);
                                    return null;
                                }

                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.b, (Transition) this.c, (Runnable) this.d);
                                }

                                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                                public void onNativeAdLoaded(NativeAd ad) {
                                    String str = (String) this.b;
                                    AtomicReference atomicReference = (AtomicReference) this.c;
                                    CompletableDeferred completableDeferred = (CompletableDeferred) this.d;
                                    Intrinsics.i(ad, "ad");
                                    NativeInlineAdTelemetry.a("prefetch_sdk_native_loaded", null, str, null, null, ad, null, 180);
                                    atomicReference.set(ad);
                                    completableDeferred.complete(ad);
                                }

                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public void onSuccess(Object obj) {
                                    ((RolloutsStateSubscriptionsHandler) this.b).lambda$registerRolloutsStateSubscriber$1((Task) this.c, (RolloutsStateSubscriber) this.d, (ConfigContainer) obj);
                                }

                                @Override // com.google.android.gms.tasks.Continuation
                                public Object then(Task task) {
                                    switch (this.f17369a) {
                                        case 1:
                                            return ((ConfigRealtimeHttpClient) this.b).lambda$createRealtimeConnection$0((Task) this.c, (Task) this.d, task);
                                        case 2:
                                            return CrashlyticsTasks.lambda$race$0((TaskCompletionSource) this.b, (AtomicBoolean) this.c, (CancellationTokenSource) this.d, task);
                                        default:
                                            return ((FirebaseRemoteConfig) this.b).lambda$activate$2((Task) this.c, (Task) this.d, task);
                                    }
                                }

                                public /* synthetic */ j4(FlowStep flowStep, String str, us0 us0Var) {
                                    this.f17369a = 11;
                                    this.c = flowStep;
                                    this.b = str;
                                    this.d = us0Var;
                                }

                                @Override // so.plotline.insights.Helpers.n.m
                                public void a() {
                                    switch (this.f17369a) {
                                        case 15:
                                            n.c((Activity) this.b, (ArrayList) this.c, (Track.b) this.d);
                                            break;
                                        case 16:
                                            n.c((Context) this.b, (ArrayList) this.c, (n.m) this.d);
                                            break;
                                        case 17:
                                            n.c((Context) this.b, (ArrayList) this.c, (so.plotline.insights.FlowViews.Stories.e.C0259e) this.d);
                                            break;
                                        default:
                                            n.c((Context) this.b, (ArrayList) this.c, (PlotlineWidget.g) this.d);
                                            break;
                                    }
                                }

                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code duplicated, block: B:144:0x0242  */
                                /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
                                @Override // so.plotline.insights.a.m
                                public void a(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
                                    boolean z;
                                    String str6;
                                    String str7;
                                    int i = this.f17369a;
                                    Object obj = this.d;
                                    Object obj2 = this.c;
                                    Object obj3 = this.b;
                                    switch (i) {
                                        case 6:
                                            Context context = (Context) obj3;
                                            l0 l0Var = (l0) obj2;
                                            FlowStep flowStep = (FlowStep) obj;
                                            HashSet hashSet = PlotlineWidget.p;
                                            if (str3 != null) {
                                                switch (str3) {
                                                    case "REWARD":
                                                        z = true;
                                                        if (str4 == null || !str5.equals("ANDROID")) {
                                                            str6 = null;
                                                            break;
                                                        } else {
                                                            str6 = str4;
                                                            break;
                                                        }
                                                        break;
                                                    case "IDENTIFY_USER":
                                                        z = true;
                                                        if (str4 != null) {
                                                            try {
                                                                Plotline.f(new JSONObject(str4));
                                                            } catch (Exception e) {
                                                                DebugHelper.a(e);
                                                            }
                                                            break;
                                                        }
                                                        str6 = null;
                                                        break;
                                                    case "REDIRECT":
                                                        z = true;
                                                        if (str4 != null && str5.equals("ANDROID")) {
                                                            try {
                                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                                intent.setData(Uri.parse(str4));
                                                                Track.a(context).startActivity(intent);
                                                            } catch (Exception e2) {
                                                                DebugHelper.a(e2);
                                                            }
                                                            break;
                                                        }
                                                        str6 = null;
                                                        break;
                                                    case "COPY_TEXT":
                                                        if (str4 != null) {
                                                            try {
                                                                JSONObject jSONObject = new JSONObject(str4);
                                                                Activity activityA = Track.a(context);
                                                                ((ClipboardManager) activityA.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Plotline", jSONObject.getString("copyText")));
                                                                z = true;
                                                                try {
                                                                    Toast.makeText(activityA, jSONObject.getString("copyToast"), 1).show();
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    DebugHelper.a(e);
                                                                }
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                z = true;
                                                            }
                                                            break;
                                                        } else {
                                                            z = true;
                                                        }
                                                        str6 = null;
                                                        break;
                                                    case "REQUEST_PUSH_PERMISSION":
                                                        if (str4 != null) {
                                                            try {
                                                                PlotlinePush.f(Track.a(context));
                                                            } catch (Exception e5) {
                                                                DebugHelper.a(e5);
                                                            }
                                                            break;
                                                        }
                                                        z = true;
                                                        str6 = null;
                                                        break;
                                                    case "TRACK_EVENT":
                                                        if (str4 != null) {
                                                            try {
                                                                JSONObject jSONObject2 = new JSONObject(str4);
                                                                String string = jSONObject2.getString("eventName");
                                                                JSONObject jSONObject3 = new JSONObject();
                                                                if (jSONObject2.has("properties")) {
                                                                    jSONObject3 = jSONObject2.getJSONObject("properties");
                                                                }
                                                                Plotline.l(string, jSONObject3);
                                                            } catch (Exception e6) {
                                                                DebugHelper.a(e6);
                                                            }
                                                            break;
                                                        }
                                                        z = true;
                                                        str6 = null;
                                                        break;
                                                    case "CALLBACK":
                                                        if (str4 != null && str5.equals("ANDROID")) {
                                                            try {
                                                                JSONObject jSONObject4 = new JSONObject(str4);
                                                                Plotline.b().getClass();
                                                                if (Plotline.b().c0 != null) {
                                                                    HashMap map = new HashMap();
                                                                    Iterator<String> itKeys = jSONObject4.keys();
                                                                    while (itKeys.hasNext()) {
                                                                        String next = itKeys.next();
                                                                        map.put(next, jSONObject4.getString(next));
                                                                    }
                                                                    Plotline.b().getClass();
                                                                    Plotline.b().c0.c(map);
                                                                }
                                                            } catch (Exception e7) {
                                                                DebugHelper.a(e7);
                                                            }
                                                            break;
                                                        }
                                                        z = true;
                                                        str6 = null;
                                                        break;
                                                    case "REDIRECT_TO_SETTINGS":
                                                        if (str4 != null) {
                                                            try {
                                                                PlotlinePush.e(Track.a(context));
                                                            } catch (Exception e8) {
                                                                DebugHelper.a(e8);
                                                            }
                                                            break;
                                                        }
                                                        z = true;
                                                        str6 = null;
                                                        break;
                                                    default:
                                                        z = true;
                                                        str6 = null;
                                                        break;
                                                }
                                            } else {
                                                z = true;
                                                str6 = null;
                                            }
                                            if (str3 != null) {
                                                so.plotline.insights.Network.d.h(l0Var.f19492a, flowStep.b, flowStep, l0Var.p, C2490h.CLICK_BEACON, str2, Boolean.valueOf((str3.equals("END") || str3.equals("REDIRECTANDEND")) ? z : false), str6, str3, str4, l0Var.g);
                                            }
                                            break;
                                        default:
                                            PlotlineWidget plotlineWidget = (PlotlineWidget) obj3;
                                            l0 l0Var2 = (l0) obj2;
                                            FlowStep flowStep2 = (FlowStep) obj;
                                            HashSet hashSet2 = PlotlineWidget.p;
                                            if (str3 != null) {
                                                switch (str3) {
                                                    case "REWARD":
                                                        if (str4 == null || !str5.equals("ANDROID")) {
                                                            str7 = null;
                                                            break;
                                                        } else {
                                                            str7 = str4;
                                                            break;
                                                        }
                                                        break;
                                                    case "IDENTIFY_USER":
                                                        if (str4 != null) {
                                                            try {
                                                                Plotline.f(new JSONObject(str4));
                                                            } catch (Exception e9) {
                                                                DebugHelper.a(e9);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "REDIRECT":
                                                        if (str4 != null && str5.equals("ANDROID")) {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                                                intent2.setData(Uri.parse(str4));
                                                                Track.a(plotlineWidget.getContext()).startActivity(intent2);
                                                            } catch (Exception e10) {
                                                                DebugHelper.a(e10);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "COPY_TEXT":
                                                        if (str4 != null) {
                                                            try {
                                                                JSONObject jSONObject5 = new JSONObject(str4);
                                                                Activity activityA2 = Track.a(plotlineWidget.getContext());
                                                                ((ClipboardManager) activityA2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Plotline", jSONObject5.getString("copyText")));
                                                                Toast.makeText(activityA2, jSONObject5.getString("copyToast"), 1).show();
                                                            } catch (Exception e11) {
                                                                DebugHelper.a(e11);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "REQUEST_PUSH_PERMISSION":
                                                        if (str4 != null) {
                                                            try {
                                                                PlotlinePush.f(Track.a(plotlineWidget.getContext()));
                                                            } catch (Exception e12) {
                                                                DebugHelper.a(e12);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "TRACK_EVENT":
                                                        if (str4 != null) {
                                                            try {
                                                                JSONObject jSONObject6 = new JSONObject(str4);
                                                                String string2 = jSONObject6.getString("eventName");
                                                                JSONObject jSONObject7 = new JSONObject();
                                                                if (jSONObject6.has("properties")) {
                                                                    jSONObject7 = jSONObject6.getJSONObject("properties");
                                                                }
                                                                Plotline.l(string2, jSONObject7);
                                                            } catch (Exception e13) {
                                                                DebugHelper.a(e13);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "CALLBACK":
                                                        if (str4 != null && str5.equals("ANDROID")) {
                                                            try {
                                                                JSONObject jSONObject8 = new JSONObject(str4);
                                                                Plotline.b().getClass();
                                                                if (Plotline.b().c0 != null) {
                                                                    HashMap map2 = new HashMap();
                                                                    Iterator<String> itKeys2 = jSONObject8.keys();
                                                                    while (itKeys2.hasNext()) {
                                                                        String next2 = itKeys2.next();
                                                                        map2.put(next2, jSONObject8.getString(next2));
                                                                    }
                                                                    Plotline.b().getClass();
                                                                    Plotline.b().c0.c(map2);
                                                                }
                                                            } catch (Exception e14) {
                                                                DebugHelper.a(e14);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    case "REDIRECT_TO_SETTINGS":
                                                        if (str4 != null) {
                                                            try {
                                                                PlotlinePush.e(Track.a(plotlineWidget.getContext()));
                                                            } catch (Exception e15) {
                                                                DebugHelper.a(e15);
                                                            }
                                                            break;
                                                        }
                                                        str7 = null;
                                                        break;
                                                    default:
                                                        str7 = null;
                                                        break;
                                                }
                                            } else {
                                                str7 = null;
                                            }
                                            if (str3 != null) {
                                                so.plotline.insights.Network.d.h(l0Var2.f19492a, flowStep2.b, flowStep2, l0Var2.p, C2490h.CLICK_BEACON, str2, Boolean.valueOf(str3.equals("END") || str3.equals("REDIRECTANDEND")), str7, str3, str4, plotlineWidget.m);
                                            }
                                            break;
                                    }
                                }
                            }
