package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import app.chalo.ads.UnifiedAdCreativeType;
import app.chalo.ads.UnifiedAdLifecycleContext;
import app.chalo.ads.UnifiedAdLifecycleEvent;
import app.chalo.ads.UnifiedAdLifecycleReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18446a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnifiedAdLifecycleReporter c;
    public final /* synthetic */ UnifiedAdLifecycleContext d;
    public final /* synthetic */ UnifiedAdCreativeType e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ MutableIntState g;
    public final /* synthetic */ Activity h;
    public final /* synthetic */ LifecycleOwner i;
    public final /* synthetic */ FrameLayout j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ State m;

    public /* synthetic */ n2(int i, UnifiedAdLifecycleReporter unifiedAdLifecycleReporter, UnifiedAdLifecycleContext unifiedAdLifecycleContext, UnifiedAdCreativeType unifiedAdCreativeType, AtomicBoolean atomicBoolean, MutableIntState mutableIntState, Activity activity, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, MutableState mutableState, MutableState mutableState2, State state, int i2) {
        this.f18446a = i2;
        this.b = i;
        this.c = unifiedAdLifecycleReporter;
        this.d = unifiedAdLifecycleContext;
        this.e = unifiedAdCreativeType;
        this.f = atomicBoolean;
        this.g = mutableIntState;
        this.h = activity;
        this.i = lifecycleOwner;
        this.j = frameLayout;
        this.k = mutableState;
        this.l = mutableState2;
        this.m = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18446a) {
            case 0:
                if (AdsterUnifiedAd_androidKt.d(this.f, this.g, this.h, this.i, this.j, this.b, true) && !AdsterUnifiedAd_androidKt.e(this.k)) {
                    MutableState mutableState = this.l;
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        mutableState.setValue(Boolean.TRUE);
                        this.c.a(this.d, new UnifiedAdLifecycleEvent.Rendered(this.e), new xj1(26));
                        Function0 function0 = (Function0) this.m.getValue();
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }
                break;
            case 1:
                if (AdsterUnifiedAd_androidKt.d(this.f, this.g, this.h, this.i, this.j, this.b, true) && !AdsterUnifiedAd_androidKt.e(this.k)) {
                    MutableState mutableState2 = this.l;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                        this.c.a(this.d, new UnifiedAdLifecycleEvent.Rendered(this.e), new xj1(26));
                        Function0 function1 = (Function0) this.m.getValue();
                        if (function1 != null) {
                            function1.invoke();
                        }
                    }
                }
                break;
            case 2:
                if (AdsterUnifiedAd_androidKt.d(this.f, this.g, this.h, this.i, this.j, this.b, true) && !AdsterUnifiedAd_androidKt.e(this.k)) {
                    MutableState mutableState3 = this.l;
                    if (!((Boolean) mutableState3.getValue()).booleanValue()) {
                        mutableState3.setValue(Boolean.TRUE);
                        this.c.a(this.d, new UnifiedAdLifecycleEvent.Rendered(this.e), new xj1(26));
                        Function0 function2 = (Function0) this.m.getValue();
                        if (function2 != null) {
                            function2.invoke();
                        }
                    }
                }
                break;
            default:
                if (AdsterUnifiedAd_androidKt.d(this.f, this.g, this.h, this.i, this.j, this.b, true) && !AdsterUnifiedAd_androidKt.e(this.k)) {
                    MutableState mutableState4 = this.l;
                    if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                        mutableState4.setValue(Boolean.TRUE);
                        this.c.a(this.d, new UnifiedAdLifecycleEvent.Rendered(this.e), new xj1(26));
                        Function0 function3 = (Function0) this.m.getValue();
                        if (function3 != null) {
                            function3.invoke();
                        }
                    }
                }
                break;
        }
        return Unit.f17538a;
    }
}
