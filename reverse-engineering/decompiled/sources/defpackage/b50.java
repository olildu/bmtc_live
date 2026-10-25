package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import so.plotline.insights.Listeners.PlotlineEventsListener;
import so.plotline.plotline_kmp.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b50 implements FragmentResultListener, PlotlineEventsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f11168a;

    public /* synthetic */ b50(Function2 function2) {
        this.f11168a = function2;
    }

    public void a(String str, JSONObject jSONObject) {
        Intrinsics.f(jSONObject);
        this.f11168a.invoke(str, Plotline.a(jSONObject));
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        this.f11168a.invoke(str, bundle);
    }
}
