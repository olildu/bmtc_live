package defpackage;

import android.R;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.TextRangeLayoutMeasureResult;
import androidx.compose.foundation.text.TextRangeLayoutMeasureScope;
import androidx.compose.foundation.text.TextRangeScopeMeasurePolicy;
import androidx.compose.ui.text.AnnotatedString;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.arkivanov.decompose.Cancellation;
import com.arkivanov.decompose.Relay;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.tabs.TabLayout;
import com.inmobi.media.C2490h;
import in.juspay.hyperupi.UPIBridge;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.properties.PropertyDelegateProvider;
import org.json.JSONArray;
import org.json.JSONObject;
import so.plotline.insights.Database.f;
import so.plotline.insights.Database.o;
import so.plotline.insights.FlowViews.ElementSearchObject;
import so.plotline.insights.FlowViews.PlotlineInternal;
import so.plotline.insights.FlowViews.PlotlineScreenshotBitmapCallback;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Helpers.n;
import so.plotline.insights.Helpers.p;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Helpers.r;
import so.plotline.insights.Listeners.PlotlineWidgetChangeListener;
import so.plotline.insights.Modal.b;
import so.plotline.insights.Models.FlowStep;
import so.plotline.insights.Models.c;
import so.plotline.insights.Models.c0;
import so.plotline.insights.Models.e0;
import so.plotline.insights.Models.f0;
import so.plotline.insights.Models.h;
import so.plotline.insights.Models.l0;
import so.plotline.insights.Models.m0;
import so.plotline.insights.Network.d;
import so.plotline.insights.Plotline;
import so.plotline.insights.PlotlinePush;
import so.plotline.insights.PlotlineWidget;
import so.plotline.insights.Tasks.g;
import so.plotline.insights.Tasks.j;
import so.plotline.insights.Track;
import so.plotline.insights.a;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class us0 implements o.a, a.m, Cancellation, PropertyDelegateProvider, TextRangeScopeMeasurePolicy, OnFailureListener, SynchronizationGuard.CriticalSection, PlotlineScreenshotBitmapCallback, b.a, f, d.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19774a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ us0(int i, Object obj, Object obj2) {
        this.f19774a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    @Override // so.plotline.insights.a.m
    public void a(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        String str6;
        PlotlineWidget plotlineWidget = (PlotlineWidget) this.b;
        FlowStep flowStep = (FlowStep) this.c;
        ArrayList arrayList = plotlineWidget.d;
        if (str3 != null) {
            switch (str3) {
                case "REWARD":
                    if (str4 == null || !str5.equals("ANDROID")) {
                        str6 = null;
                        break;
                    } else {
                        str6 = str4;
                        break;
                    }
                    break;
                case "IDENTIFY_USER":
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
                    if (str4 != null && str5.equals("ANDROID")) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str4));
                            Track.a(plotlineWidget.getContext()).startActivity(intent);
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
                            Activity activityA = Track.a(plotlineWidget.getContext());
                            ((ClipboardManager) activityA.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Plotline", jSONObject.getString("copyText")));
                            Toast.makeText(activityA, jSONObject.getString("copyToast"), 1).show();
                        } catch (Exception e3) {
                            DebugHelper.a(e3);
                        }
                        break;
                    }
                    str6 = null;
                    break;
                case "REQUEST_PUSH_PERMISSION":
                    if (str4 != null) {
                        try {
                            PlotlinePush.f(Track.a(plotlineWidget.getContext()));
                        } catch (Exception e4) {
                            DebugHelper.a(e4);
                        }
                        break;
                    }
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
                        } catch (Exception e5) {
                            DebugHelper.a(e5);
                        }
                        break;
                    }
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
                        } catch (Exception e6) {
                            DebugHelper.a(e6);
                        }
                        break;
                    }
                    str6 = null;
                    break;
                case "REDIRECT_TO_SETTINGS":
                    if (str4 != null) {
                        try {
                            PlotlinePush.e(Track.a(plotlineWidget.getContext()));
                        } catch (Exception e7) {
                            DebugHelper.a(e7);
                        }
                        break;
                    }
                    str6 = null;
                    break;
                default:
                    str6 = null;
                    break;
            }
        } else {
            str6 = null;
        }
        if (str3 != null) {
            d.h(!arrayList.isEmpty() ? (String) arrayList.get(0) : "", flowStep.b, flowStep, plotlineWidget.c, C2490h.CLICK_BEACON, str2, Boolean.valueOf(str3.equals("END") || str3.equals("REDIRECTANDEND")), str6, str3, str4, plotlineWidget.m);
        }
    }

    @Override // so.plotline.insights.Database.o.a
    public void b(List list) {
        View childAt;
        switch (this.f19774a) {
            case 0:
                PlotlineWidget plotlineWidget = (PlotlineWidget) this.b;
                PlotlineWidgetChangeListener plotlineWidgetChangeListener = (PlotlineWidgetChangeListener) this.c;
                HashSet hashSet = plotlineWidget.e;
                boolean z = true;
                if (list.isEmpty()) {
                    plotlineWidgetChangeListener.a(true);
                } else if (list.size() <= 1) {
                    l0 l0Var = (l0) list.get(0);
                    if (l0Var != null) {
                        m0 m0Var = l0Var.q;
                        FlowStep flowStep = l0Var.m;
                        if (flowStep != null || m0Var.c) {
                            String str = l0Var.r;
                            str.getClass();
                            if (str.equals("DEFAULT")) {
                                boolean zEquals = plotlineWidget.d.equals(Collections.singletonList(l0Var.f19492a));
                                boolean z2 = (flowStep == null || hashSet.equals(Collections.singleton(flowStep.b))) ? false : true;
                                if (zEquals && !z2) {
                                    z = false;
                                }
                                plotlineWidgetChangeListener.a(z);
                            } else if (str.equals("STORIES") && !Plotline.b().d().booleanValue()) {
                                ArrayList arrayList = m0Var.f19509a;
                                HashSet hashSet2 = new HashSet();
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (i < size) {
                                        Object obj = arrayList.get(i);
                                        i++;
                                        hashSet2.add(((e0) obj).f19497a);
                                    }
                                }
                                if (!plotlineWidget.f.equals(hashSet2)) {
                                    plotlineWidgetChangeListener.a(true);
                                } else {
                                    plotlineWidgetChangeListener.a(false);
                                }
                            }
                        }
                    }
                    plotlineWidgetChangeListener.a(true);
                } else {
                    HashSet hashSet3 = new HashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        FlowStep flowStep2 = ((l0) it.next()).m;
                        if (flowStep2 != null) {
                            hashSet3.add(flowStep2.b);
                        }
                    }
                    plotlineWidgetChangeListener.a(!hashSet.equals(hashSet3));
                }
                break;
            default:
                PlotlineWidget plotlineWidget2 = (PlotlineWidget) this.b;
                Boolean bool = (Boolean) this.c;
                HashSet hashSet4 = plotlineWidget2.e;
                ArrayList arrayList2 = plotlineWidget2.d;
                int i2 = 0;
                if (list.size() > 1) {
                    try {
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) plotlineWidget2.findViewWithTag("PL_SwipeStripScrollView_" + plotlineWidget2.b);
                        if (horizontalScrollView == null || (childAt = horizontalScrollView.getChildAt(0)) == null || childAt.getWidth() <= horizontalScrollView.getWidth()) {
                            plotlineWidget2.j = 0;
                        } else {
                            plotlineWidget2.j = horizontalScrollView.getScrollX();
                        }
                    } catch (Exception e) {
                        DebugHelper.a(e);
                        plotlineWidget2.j = 0;
                    }
                } else {
                    plotlineWidget2.j = 0;
                }
                if (!bool.booleanValue()) {
                    plotlineWidget2.removeAllViews();
                }
                plotlineWidget2.d();
                if (list.isEmpty()) {
                    plotlineWidget2.e();
                } else if (list.size() != 1) {
                    plotlineWidget2.k = ((l0) list.get(0)).v;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        l0 l0Var2 = (l0) it2.next();
                        String str2 = l0Var2.f19492a;
                        FlowStep flowStep3 = l0Var2.m;
                        arrayList2.add(str2);
                        hashSet4.add(flowStep3.b);
                        arrayList3.add(flowStep3);
                    }
                    n.j jVar = new n.j(arrayList3, plotlineWidget2.getContext(), new PlotlineWidget.g(plotlineWidget2, arrayList3, list));
                    if (arrayList3.isEmpty()) {
                        jVar.a();
                    } else {
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        int size2 = arrayList3.size();
                        while (i2 < size2) {
                            Object obj2 = arrayList3.get(i2);
                            i2++;
                            n.e((FlowStep) obj2, new n.k(atomicInteger, arrayList3, atomicBoolean, jVar));
                        }
                    }
                    if (Plotline.b().m0) {
                        if (plotlineWidget2.n == null) {
                            plotlineWidget2.n = new Handler(Looper.getMainLooper());
                        }
                        plotlineWidget2.k(Plotline.b().l0);
                    }
                } else {
                    l0 l0Var3 = (l0) list.get(0);
                    if (l0Var3 != null) {
                        FlowStep flowStep4 = l0Var3.m;
                        m0 m0Var2 = l0Var3.q;
                        if (flowStep4 != null || m0Var2.c) {
                            if (!bool.booleanValue()) {
                                plotlineWidget2.setPreloadedHeight(l0Var3.w);
                            }
                            DebugHelper.b();
                            plotlineWidget2.m = l0Var3.g;
                            plotlineWidget2.c = l0Var3.p;
                            plotlineWidget2.k = l0Var3.v;
                            String str3 = l0Var3.r;
                            str3.getClass();
                            if (str3.equals("DEFAULT")) {
                                arrayList2.add(l0Var3.f19492a);
                                if (flowStep4 != null) {
                                    hashSet4.add(flowStep4.b);
                                }
                                n.e(flowStep4, new n.h(flowStep4, plotlineWidget2.getContext(), new PlotlineWidget.e(flowStep4, l0Var3, plotlineWidget2)));
                                if (l0Var3.n) {
                                    if (plotlineWidget2.n == null) {
                                        plotlineWidget2.n = new Handler(Looper.getMainLooper());
                                    }
                                    plotlineWidget2.k(l0Var3.o);
                                }
                            } else if (str3.equals("STORIES") && !Plotline.b().d().booleanValue()) {
                                ArrayList arrayList4 = m0Var2.f19509a;
                                f0 f0Var = m0Var2.b;
                                HashSet hashSet5 = new HashSet();
                                if (arrayList4 != null) {
                                    int size3 = arrayList4.size();
                                    while (i2 < size3) {
                                        Object obj3 = arrayList4.get(i2);
                                        i2++;
                                        hashSet5.add(((e0) obj3).f19497a);
                                    }
                                }
                                plotlineWidget2.f = hashSet5;
                                if (f0Var.B == null) {
                                    plotlineWidget2.g();
                                    plotlineWidget2.b(l0Var3, null);
                                } else {
                                    FlowStep flowStep5 = new FlowStep();
                                    flowStep5.d = "WIDGET";
                                    flowStep5.B = f0Var.B;
                                    flowStep5.b = "PL_STORY_HEADER_" + plotlineWidget2.b;
                                    n.e(flowStep5, new n.h(flowStep5, plotlineWidget2.getContext(), new PlotlineWidget.f(flowStep5, l0Var3, plotlineWidget2)));
                                }
                            }
                        }
                    }
                    plotlineWidget2.e();
                }
                break;
        }
    }

    @Override // so.plotline.insights.Database.f
    public void c(List list, List list2) {
        so.plotline.insights.Models.n nVar;
        g.b bVar = (g.b) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        list.size();
        DebugHelper.b();
        if (list.size() == 0) {
            return;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f.equals("FLOW") && (nVar = (so.plotline.insights.Models.n) Plotline.b().F.f19511a.get(cVar.f19492a)) != null) {
                    arrayList2.add(nVar.f19492a);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ElementSearchObject elementSearchObject = (ElementSearchObject) obj;
                if (arrayList2.contains(elementSearchObject.f19369a) && !elementSearchObject.g) {
                    g.this.b.add(elementSearchObject.a());
                }
            }
            Track.d(list, null, null, null, null, false);
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    @Override // com.arkivanov.decompose.Cancellation
    public void cancel() {
        Relay relay = (Relay) this.b;
        Function1 function1 = (Function1) this.c;
        synchronized (relay.f12290a) {
            relay.d = SetsKt.b(relay.d, function1);
        }
    }

    public void d(JSONObject jSONObject, boolean z) {
        n.m mVar = (n.m) this.b;
        FlowStep flowStep = (FlowStep) this.c;
        if (z) {
            mVar.a("Content resolve aborted");
            return;
        }
        if (jSONObject == null) {
            mVar.a("Content resolve failed");
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("layout");
        if (jSONObjectOptJSONObject == null) {
            mVar.a("Content resolve failed");
        } else {
            flowStep.B = new c0(jSONObjectOptJSONObject);
            new Handler(Looper.getMainLooper()).post(new sp1(mVar, 16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x027b A[Catch: Exception -> 0x02bd, TryCatch #0 {Exception -> 0x02bd, blocks: (B:102:0x026d, B:104:0x027b, B:106:0x0284, B:108:0x02b7, B:111:0x02c2, B:114:0x02d9, B:105:0x0280, B:97:0x024b, B:98:0x024f, B:101:0x0261), top: B:154:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0280 A[Catch: Exception -> 0x02bd, TryCatch #0 {Exception -> 0x02bd, blocks: (B:102:0x026d, B:104:0x027b, B:106:0x0284, B:108:0x02b7, B:111:0x02c2, B:114:0x02d9, B:105:0x0280, B:97:0x024b, B:98:0x024f, B:101:0x0261), top: B:154:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b7 A[Catch: Exception -> 0x02bd, TryCatch #0 {Exception -> 0x02bd, blocks: (B:102:0x026d, B:104:0x027b, B:106:0x0284, B:108:0x02b7, B:111:0x02c2, B:114:0x02d9, B:105:0x0280, B:97:0x024b, B:98:0x024f, B:101:0x0261), top: B:154:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x0307  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bc A[Catch: Exception -> 0x01b7, TRY_LEAVE, TryCatch #7 {Exception -> 0x01b7, blocks: (B:63:0x01af, B:67:0x01bc), top: B:168:0x01af }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x024f A[Catch: Exception -> 0x02bd, TryCatch #0 {Exception -> 0x02bd, blocks: (B:102:0x026d, B:104:0x027b, B:106:0x0284, B:108:0x02b7, B:111:0x02c2, B:114:0x02d9, B:105:0x0280, B:97:0x024b, B:98:0x024f, B:101:0x0261), top: B:154:0x026d }] */
    @Override // so.plotline.insights.FlowViews.PlotlineScreenshotBitmapCallback
    public void e(Bitmap bitmap) {
        int i;
        int i2;
        String resourceEntryName;
        String str;
        JSONArray jSONArray;
        ArrayList arrayList;
        JSONArray jSONArray2;
        int[] iArr;
        JSONObject jSONObject;
        String simpleName;
        int[] iArr2;
        ArrayList arrayList2;
        String str2;
        boolean z;
        int dimensionPixelSize;
        Activity activity = (Activity) this.b;
        so.plotline.insights.Modal.a aVar = (so.plotline.insights.Modal.a) this.c;
        a aVar2 = a.f;
        PlotlineInternal.a aVar3 = PlotlineInternal.c().f19375a;
        a.d dVar = new a.d(activity, aVar, bitmap);
        aVar3.getClass();
        a7 a7Var = new a7(28, activity, dVar);
        int i3 = j.j;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        DialogFragment dialogFragmentA = PlotlineInternal.a();
        Objects.toString(viewGroup);
        Objects.toString(dialogFragmentA);
        DebugHelper.b();
        activity.toString();
        activity.getLocalClassName();
        DebugHelper.b();
        Objects.toString(dialogFragmentA);
        DebugHelper.b();
        if (dialogFragmentA != null) {
            if (q.t(dialogFragmentA)) {
                viewGroup = (ViewGroup) dialogFragmentA.getView();
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    dimensionPixelSize = (int) (resources.getDimensionPixelSize(identifier) / resources.getDisplayMetrics().density);
                } else {
                    dimensionPixelSize = 0;
                }
                Objects.toString(viewGroup);
                DebugHelper.b();
            } else {
                dialogFragmentA = null;
                dimensionPixelSize = 0;
            }
            Objects.toString(viewGroup);
            DebugHelper.b();
            DebugHelper.b();
            i = dimensionPixelSize;
        } else {
            i = 0;
        }
        DialogFragment dialogFragment = dialogFragmentA;
        ViewGroup viewGroup2 = viewGroup;
        JSONArray jSONArray3 = new JSONArray();
        ArrayList arrayList3 = new ArrayList();
        if (Plotline.b().g.booleanValue()) {
            DebugHelper.b();
            arrayList3.addAll(q.x());
        }
        arrayList3.toString();
        DebugHelper.b();
        viewGroup2.getChildCount();
        DebugHelper.b();
        int i4 = 0;
        JSONArray jSONArray4 = jSONArray3;
        while (true) {
            DialogFragment dialogFragment2 = dialogFragment;
            int i5 = i;
            if (i4 >= viewGroup2.getChildCount()) {
                break;
            }
            ViewGroup viewGroup3 = viewGroup2;
            ArrayList arrayListA = j.a(viewGroup2.getChildAt(i4));
            arrayListA.toString();
            DebugHelper.b();
            int i6 = i4;
            int i7 = 0;
            JSONArray jSONArray5 = jSONArray4;
            while (i7 < arrayListA.size()) {
                ArrayList arrayList4 = arrayListA;
                View view = (View) arrayListA.get(i7);
                if (view == null) {
                    i2 = i7;
                } else {
                    if (Plotline.b().W != null) {
                        i2 = i7;
                        if (Plotline.b().W.equals("REACT_NATIVE")) {
                            resourceEntryName = (view.getTag() == null || !(view.getTag() instanceof String)) ? q.w(view) : view.getTag().toString();
                        }
                        str = resourceEntryName;
                        DebugHelper.b();
                        a7 a7Var2 = a7Var;
                        if (str != null) {
                            jSONArray2 = jSONArray5;
                            iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            jSONObject = new JSONObject();
                            try {
                                if (str.contains("plotlinefloatingbutton")) {
                                    arrayList = arrayList3;
                                } else {
                                    simpleName = "";
                                    if (Plotline.b().W.equals("NATIVE") || dialogFragment2 != null) {
                                        iArr2 = iArr;
                                        arrayList2 = arrayList3;
                                        if (Plotline.b().W.equals("NATIVE") && dialogFragment2 != null) {
                                            simpleName = dialogFragment2.getClass().getSimpleName();
                                            DebugHelper.b();
                                        }
                                    } else {
                                        try {
                                            ArrayList arrayListJ = q.j();
                                            iArr2 = iArr;
                                            try {
                                                int size = arrayListJ.size();
                                                arrayList2 = arrayList3;
                                                int i8 = 0;
                                                while (i8 < size) {
                                                    try {
                                                        Object obj = arrayListJ.get(i8);
                                                        i8++;
                                                        ArrayList arrayList5 = arrayListJ;
                                                        Fragment primaryNavigationFragment = (Fragment) obj;
                                                        Objects.toString(primaryNavigationFragment);
                                                        DebugHelper.b();
                                                        int i9 = size;
                                                        if (primaryNavigationFragment instanceof NavHostFragment) {
                                                            NavHostFragment navHostFragment = (NavHostFragment) primaryNavigationFragment;
                                                            navHostFragment.toString();
                                                            DebugHelper.b();
                                                            primaryNavigationFragment = navHostFragment.getChildFragmentManager().getPrimaryNavigationFragment();
                                                            Objects.toString(primaryNavigationFragment);
                                                            DebugHelper.b();
                                                        }
                                                        if (primaryNavigationFragment != null && primaryNavigationFragment.isVisible() && primaryNavigationFragment.getView() != null && q.d(activity, primaryNavigationFragment.getView(), str) != null && q.d(activity, primaryNavigationFragment.getView(), str) == view) {
                                                            simpleName = primaryNavigationFragment.getClass().getSimpleName();
                                                        }
                                                        DebugHelper.b();
                                                        size = i9;
                                                        arrayListJ = arrayList5;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        DebugHelper.a(e);
                                                        str2 = simpleName;
                                                        DebugHelper.b();
                                                        jSONObject.put("clientElementId", str);
                                                        jSONObject.put("clientFragmentId", str2);
                                                        if (view instanceof PlotlineWidget) {
                                                            jSONObject.put("isWidget", true);
                                                            z = false;
                                                        } else {
                                                            z = false;
                                                            jSONObject.put("isWidget", false);
                                                        }
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put("x", iArr2[z ? 1 : 0]);
                                                        jSONObject2.put("y", iArr2[1] + i5);
                                                        jSONObject2.put(InMobiNetworkValues.WIDTH, view.getWidth());
                                                        jSONObject2.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                                                        jSONObject.put("position", jSONObject2);
                                                        view.getWidth();
                                                        view.getHeight();
                                                        DebugHelper.b();
                                                        if (view.getHeight() != 0) {
                                                            jSONArray = jSONArray2;
                                                            arrayList = arrayList2;
                                                        } else {
                                                            jSONArray = jSONArray2;
                                                            arrayList = arrayList2;
                                                        }
                                                        i7 = i2 + 1;
                                                        arrayList3 = arrayList;
                                                        a7Var = a7Var2;
                                                        jSONArray5 = jSONArray;
                                                        arrayListA = arrayList4;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                arrayList2 = arrayList3;
                                                DebugHelper.a(e);
                                                str2 = simpleName;
                                                DebugHelper.b();
                                                jSONObject.put("clientElementId", str);
                                                jSONObject.put("clientFragmentId", str2);
                                                if (view instanceof PlotlineWidget) {
                                                    jSONObject.put("isWidget", true);
                                                    z = false;
                                                } else {
                                                    z = false;
                                                    jSONObject.put("isWidget", false);
                                                }
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("x", iArr2[z ? 1 : 0]);
                                                jSONObject3.put("y", iArr2[1] + i5);
                                                jSONObject3.put(InMobiNetworkValues.WIDTH, view.getWidth());
                                                jSONObject3.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                                                jSONObject.put("position", jSONObject3);
                                                view.getWidth();
                                                view.getHeight();
                                                DebugHelper.b();
                                                if (view.getHeight() != 0) {
                                                    jSONArray = jSONArray2;
                                                    arrayList = arrayList2;
                                                } else {
                                                    jSONArray = jSONArray2;
                                                    arrayList = arrayList2;
                                                }
                                                i7 = i2 + 1;
                                                arrayList3 = arrayList;
                                                a7Var = a7Var2;
                                                jSONArray5 = jSONArray;
                                                arrayListA = arrayList4;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            iArr2 = iArr;
                                        }
                                    }
                                    str2 = simpleName;
                                    try {
                                        DebugHelper.b();
                                        jSONObject.put("clientElementId", str);
                                        jSONObject.put("clientFragmentId", str2);
                                        if (view instanceof PlotlineWidget) {
                                            jSONObject.put("isWidget", true);
                                            z = false;
                                        } else {
                                            z = false;
                                            jSONObject.put("isWidget", false);
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("x", iArr2[z ? 1 : 0]);
                                        jSONObject4.put("y", iArr2[1] + i5);
                                        jSONObject4.put(InMobiNetworkValues.WIDTH, view.getWidth());
                                        jSONObject4.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                                        jSONObject.put("position", jSONObject4);
                                        view.getWidth();
                                        view.getHeight();
                                        DebugHelper.b();
                                        if (view.getHeight() != 0 || view.getWidth() == 0) {
                                            jSONArray = jSONArray2;
                                            arrayList = arrayList2;
                                        } else {
                                            DebugHelper.b();
                                            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                                            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                                            Objects.toString(accessibilityNodeInfoObtain);
                                            DebugHelper.b();
                                            if (accessibilityNodeInfoObtain.isVisibleToUser()) {
                                                DebugHelper.b();
                                                accessibilityNodeInfoObtain.recycle();
                                                if (Plotline.b().g.booleanValue()) {
                                                    try {
                                                        DebugHelper.b();
                                                        arrayList = arrayList2;
                                                        try {
                                                            if (q.s(view, str2, arrayList)) {
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                    } catch (Exception unused2) {
                                                        arrayList = arrayList2;
                                                    }
                                                } else {
                                                    arrayList = arrayList2;
                                                }
                                                DebugHelper.b();
                                                jSONArray = jSONArray2;
                                                try {
                                                    jSONArray.put(jSONObject);
                                                } catch (Exception unused3) {
                                                }
                                            } else {
                                                jSONArray = jSONArray2;
                                                arrayList = arrayList2;
                                            }
                                        }
                                    } catch (Exception unused4) {
                                    }
                                }
                            } catch (Exception unused5) {
                            }
                            jSONArray = jSONArray2;
                        } else {
                            jSONArray = jSONArray5;
                            arrayList = arrayList3;
                        }
                        i7 = i2 + 1;
                        arrayList3 = arrayList;
                        a7Var = a7Var2;
                        jSONArray5 = jSONArray;
                        arrayListA = arrayList4;
                    } else {
                        i2 = i7;
                    }
                    if (view.getTag() != null && (view.getTag() instanceof String)) {
                        resourceEntryName = view.getTag().toString();
                    } else if (view.getId() != -1) {
                        try {
                            resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                        } catch (Exception e4) {
                            DebugHelper.a(e4);
                            if (Plotline.b().d().booleanValue()) {
                            }
                            str = null;
                            DebugHelper.b();
                            a7 a7Var3 = a7Var;
                            if (str != null) {
                                jSONArray2 = jSONArray5;
                                iArr = new int[2];
                                view.getLocationInWindow(iArr);
                                jSONObject = new JSONObject();
                                if (str.contains("plotlinefloatingbutton")) {
                                    arrayList = arrayList3;
                                } else {
                                    simpleName = "";
                                    if (Plotline.b().W.equals("NATIVE")) {
                                        iArr2 = iArr;
                                        arrayList2 = arrayList3;
                                        if (Plotline.b().W.equals("NATIVE")) {
                                            simpleName = dialogFragment2.getClass().getSimpleName();
                                            DebugHelper.b();
                                        }
                                    } else {
                                        iArr2 = iArr;
                                        arrayList2 = arrayList3;
                                        if (Plotline.b().W.equals("NATIVE")) {
                                            simpleName = dialogFragment2.getClass().getSimpleName();
                                            DebugHelper.b();
                                        }
                                    }
                                    str2 = simpleName;
                                    DebugHelper.b();
                                    jSONObject.put("clientElementId", str);
                                    jSONObject.put("clientFragmentId", str2);
                                    if (view instanceof PlotlineWidget) {
                                        jSONObject.put("isWidget", true);
                                        z = false;
                                    } else {
                                        z = false;
                                        jSONObject.put("isWidget", false);
                                    }
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("x", iArr2[z ? 1 : 0]);
                                    jSONObject5.put("y", iArr2[1] + i5);
                                    jSONObject5.put(InMobiNetworkValues.WIDTH, view.getWidth());
                                    jSONObject5.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                                    jSONObject.put("position", jSONObject5);
                                    view.getWidth();
                                    view.getHeight();
                                    DebugHelper.b();
                                    if (view.getHeight() != 0) {
                                        jSONArray = jSONArray2;
                                        arrayList = arrayList2;
                                    } else {
                                        jSONArray = jSONArray2;
                                        arrayList = arrayList2;
                                    }
                                }
                                jSONArray = jSONArray2;
                            } else {
                                jSONArray = jSONArray5;
                                arrayList = arrayList3;
                            }
                            i7 = i2 + 1;
                            arrayList3 = arrayList;
                            a7Var = a7Var3;
                            jSONArray5 = jSONArray;
                            arrayListA = arrayList4;
                        }
                    } else {
                        if (Plotline.b().d().booleanValue() && (((view instanceof BottomNavigationItemView) || (view instanceof TabLayout.TabView)) && view.getContentDescription() != null)) {
                            resourceEntryName = "CD_" + view.getContentDescription().toString();
                        }
                        DebugHelper.b();
                        a7 a7Var4 = a7Var;
                        if (str != null) {
                            jSONArray2 = jSONArray5;
                            iArr = new int[2];
                            view.getLocationInWindow(iArr);
                            jSONObject = new JSONObject();
                            if (str.contains("plotlinefloatingbutton")) {
                                arrayList = arrayList3;
                            } else {
                                simpleName = "";
                                if (Plotline.b().W.equals("NATIVE")) {
                                    iArr2 = iArr;
                                    arrayList2 = arrayList3;
                                    if (Plotline.b().W.equals("NATIVE")) {
                                        simpleName = dialogFragment2.getClass().getSimpleName();
                                        DebugHelper.b();
                                    }
                                } else {
                                    iArr2 = iArr;
                                    arrayList2 = arrayList3;
                                    if (Plotline.b().W.equals("NATIVE")) {
                                        simpleName = dialogFragment2.getClass().getSimpleName();
                                        DebugHelper.b();
                                    }
                                }
                                str2 = simpleName;
                                DebugHelper.b();
                                jSONObject.put("clientElementId", str);
                                jSONObject.put("clientFragmentId", str2);
                                if (view instanceof PlotlineWidget) {
                                    jSONObject.put("isWidget", true);
                                    z = false;
                                } else {
                                    z = false;
                                    jSONObject.put("isWidget", false);
                                }
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("x", iArr2[z ? 1 : 0]);
                                jSONObject6.put("y", iArr2[1] + i5);
                                jSONObject6.put(InMobiNetworkValues.WIDTH, view.getWidth());
                                jSONObject6.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                                jSONObject.put("position", jSONObject6);
                                view.getWidth();
                                view.getHeight();
                                DebugHelper.b();
                                if (view.getHeight() != 0) {
                                    jSONArray = jSONArray2;
                                    arrayList = arrayList2;
                                } else {
                                    jSONArray = jSONArray2;
                                    arrayList = arrayList2;
                                }
                            }
                            jSONArray = jSONArray2;
                        } else {
                            jSONArray = jSONArray5;
                            arrayList = arrayList3;
                        }
                        i7 = i2 + 1;
                        arrayList3 = arrayList;
                        a7Var = a7Var4;
                        jSONArray5 = jSONArray;
                        arrayListA = arrayList4;
                    }
                    str = resourceEntryName;
                    DebugHelper.b();
                    a7 a7Var5 = a7Var;
                    if (str != null) {
                        jSONArray2 = jSONArray5;
                        iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        jSONObject = new JSONObject();
                        if (str.contains("plotlinefloatingbutton")) {
                            arrayList = arrayList3;
                        } else {
                            simpleName = "";
                            if (Plotline.b().W.equals("NATIVE")) {
                                iArr2 = iArr;
                                arrayList2 = arrayList3;
                                if (Plotline.b().W.equals("NATIVE")) {
                                    simpleName = dialogFragment2.getClass().getSimpleName();
                                    DebugHelper.b();
                                }
                            } else {
                                iArr2 = iArr;
                                arrayList2 = arrayList3;
                                if (Plotline.b().W.equals("NATIVE")) {
                                    simpleName = dialogFragment2.getClass().getSimpleName();
                                    DebugHelper.b();
                                }
                            }
                            str2 = simpleName;
                            DebugHelper.b();
                            jSONObject.put("clientElementId", str);
                            jSONObject.put("clientFragmentId", str2);
                            if (view instanceof PlotlineWidget) {
                                jSONObject.put("isWidget", true);
                                z = false;
                            } else {
                                z = false;
                                jSONObject.put("isWidget", false);
                            }
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("x", iArr2[z ? 1 : 0]);
                            jSONObject7.put("y", iArr2[1] + i5);
                            jSONObject7.put(InMobiNetworkValues.WIDTH, view.getWidth());
                            jSONObject7.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                            jSONObject.put("position", jSONObject7);
                            view.getWidth();
                            view.getHeight();
                            DebugHelper.b();
                            if (view.getHeight() != 0) {
                                jSONArray = jSONArray2;
                                arrayList = arrayList2;
                            } else {
                                jSONArray = jSONArray2;
                                arrayList = arrayList2;
                            }
                        }
                        jSONArray = jSONArray2;
                    } else {
                        jSONArray = jSONArray5;
                        arrayList = arrayList3;
                    }
                    i7 = i2 + 1;
                    arrayList3 = arrayList;
                    a7Var = a7Var5;
                    jSONArray5 = jSONArray;
                    arrayListA = arrayList4;
                }
                str = null;
                DebugHelper.b();
                a7 a7Var6 = a7Var;
                if (str != null) {
                    jSONArray2 = jSONArray5;
                    iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    jSONObject = new JSONObject();
                    if (str.contains("plotlinefloatingbutton")) {
                        arrayList = arrayList3;
                    } else {
                        simpleName = "";
                        if (Plotline.b().W.equals("NATIVE")) {
                            iArr2 = iArr;
                            arrayList2 = arrayList3;
                            if (Plotline.b().W.equals("NATIVE")) {
                                simpleName = dialogFragment2.getClass().getSimpleName();
                                DebugHelper.b();
                            }
                        } else {
                            iArr2 = iArr;
                            arrayList2 = arrayList3;
                            if (Plotline.b().W.equals("NATIVE")) {
                                simpleName = dialogFragment2.getClass().getSimpleName();
                                DebugHelper.b();
                            }
                        }
                        str2 = simpleName;
                        DebugHelper.b();
                        jSONObject.put("clientElementId", str);
                        jSONObject.put("clientFragmentId", str2);
                        if (view instanceof PlotlineWidget) {
                            jSONObject.put("isWidget", true);
                            z = false;
                        } else {
                            z = false;
                            jSONObject.put("isWidget", false);
                        }
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("x", iArr2[z ? 1 : 0]);
                        jSONObject8.put("y", iArr2[1] + i5);
                        jSONObject8.put(InMobiNetworkValues.WIDTH, view.getWidth());
                        jSONObject8.put(InMobiNetworkValues.HEIGHT, view.getHeight());
                        jSONObject.put("position", jSONObject8);
                        view.getWidth();
                        view.getHeight();
                        DebugHelper.b();
                        if (view.getHeight() != 0) {
                            jSONArray = jSONArray2;
                            arrayList = arrayList2;
                        } else {
                            jSONArray = jSONArray2;
                            arrayList = arrayList2;
                        }
                    }
                    jSONArray = jSONArray2;
                } else {
                    jSONArray = jSONArray5;
                    arrayList = arrayList3;
                }
                i7 = i2 + 1;
                arrayList3 = arrayList;
                a7Var = a7Var6;
                jSONArray5 = jSONArray;
                arrayListA = arrayList4;
            }
            i4 = i6 + 1;
            dialogFragment = dialogFragment2;
            i = i5;
            jSONArray4 = jSONArray5;
            viewGroup2 = viewGroup3;
        }
        a7 a7Var7 = a7Var;
        JSONArray jSONArray6 = jSONArray4;
        r.a().getClass();
        Activity activity2 = (Activity) a7Var7.b;
        a.d dVar2 = (a.d) a7Var7.c;
        try {
            HashMap map = Plotline.b().Y;
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                h hVar = (h) map.get(pair);
                if (hVar != null) {
                    RectF rectF = hVar.b;
                    HashMap map2 = map;
                    Iterator it2 = it;
                    if (((String) pair.first).equals(Plotline.b().V) && so.plotline.insights.FlowViews.d.n(activity2, rectF, null)) {
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.put("clientElementId", pair.second);
                        jSONObject9.put("clientFragmentId", hVar.c);
                        jSONObject9.put("isWidget", Plotline.b().Z.contains(pair.second));
                        JSONObject jSONObject10 = new JSONObject();
                        jSONObject10.put("x", (int) rectF.left);
                        jSONObject10.put("y", (int) rectF.top);
                        jSONObject10.put(InMobiNetworkValues.WIDTH, (int) rectF.width());
                        jSONObject10.put(InMobiNetworkValues.HEIGHT, (int) rectF.height());
                        jSONObject9.put("position", jSONObject10);
                        jSONObject9.toString();
                        DebugHelper.b();
                        jSONArray6.put(jSONObject9);
                    }
                    map = map2;
                    it = it2;
                }
            }
        } catch (Exception e5) {
            DebugHelper.a(e5);
        }
        Activity activity3 = dVar2.f19576a;
        os0 os0Var = new os0(dVar2.b, 29);
        Bitmap bitmap2 = dVar2.c;
        j jVar = new j();
        jVar.i = "PORTRAIT";
        jVar.f19563a = activity3;
        jVar.c = os0Var;
        jVar.e = jSONArray6;
        jVar.b = activity3.getFilesDir() + "/lumcsbtjdersaxql.png";
        jVar.f = so.plotline.insights.FlowViews.d.q(activity3, 0);
        jVar.g = so.plotline.insights.FlowViews.d.t(activity3, 0);
        jVar.h = Plotline.b().V;
        if (activity3.getResources().getConfiguration().orientation == 2) {
            jVar.i = "LANDSCAPE";
        }
        jVar.d = bitmap2;
        jVar.execute(new Void[0]);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f19774a) {
            case 7:
                ((Uploader) this.b).c.k0((Iterable) this.c);
                break;
            default:
                Uploader uploader = (Uploader) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    uploader.i.c(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.TextRangeScopeMeasurePolicy
    public TextRangeLayoutMeasureResult measure(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        return TextLinkScope.textRange$lambda$0((TextLinkScope) this.b, (AnnotatedString.Range) this.c, textRangeLayoutMeasureScope);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        UPIBridge.getPhoneNumber$lambda$9((UPIBridge) this.b, (UPIBridge.PhoneNumberRetrievedCallback) this.c, exc);
    }

    @Override // so.plotline.insights.Modal.b.a
    public void a() {
        b bVar = (b) this.b;
        TextView textView = (TextView) this.c;
        int i = b.e;
        LinearLayout linearLayout = (LinearLayout) bVar.findViewById(so.plotline.insights.R.id.options_layout);
        boolean z = false;
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            View childAt = linearLayout.getChildAt(i2);
            if ((childAt instanceof so.plotline.insights.OptionModals.a) && ((so.plotline.insights.OptionModals.a) childAt).f19534a.booleanValue()) {
                z = true;
                break;
            }
        }
        p.e(textView, Boolean.valueOf(z));
    }
}
