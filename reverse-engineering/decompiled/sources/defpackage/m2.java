package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18363a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ AtomicBoolean g;
    public final /* synthetic */ MutableIntState h;
    public final /* synthetic */ Activity i;
    public final /* synthetic */ LifecycleOwner j;
    public final /* synthetic */ FrameLayout k;
    public final /* synthetic */ MutableIntState l;
    public final /* synthetic */ State m;

    public /* synthetic */ m2(int i, View view, Context context, int i2, String str, AtomicBoolean atomicBoolean, MutableIntState mutableIntState, Activity activity, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, MutableIntState mutableIntState2, State state, int i3) {
        this.f18363a = i3;
        this.b = i;
        this.c = view;
        this.d = context;
        this.e = i2;
        this.f = str;
        this.g = atomicBoolean;
        this.h = mutableIntState;
        this.i = activity;
        this.j = lifecycleOwner;
        this.k = frameLayout;
        this.l = mutableIntState2;
        this.m = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18363a) {
            case 0:
                if (AdsterUnifiedAd_androidKt.d(this.g, this.h, this.i, this.j, this.k, this.b, true)) {
                    Integer numL = AdsterUnifiedAd_androidKt.l(this.c, this.d);
                    int iIntValue = numL != null ? numL.intValue() : this.e;
                    if (iIntValue > 0) {
                        MutableIntState mutableIntState = this.l;
                        if (iIntValue != mutableIntState.getIntValue()) {
                            mutableIntState.setIntValue(iIntValue);
                            Function2 function2 = (Function2) this.m.getValue();
                            if (function2 != null) {
                                function2.invoke(0, Integer.valueOf(iIntValue));
                            }
                            String message = this.f + " banner height adjusted dynamicHeightDp=" + iIntValue;
                            Intrinsics.i(message, "message");
                        }
                    }
                }
                break;
            default:
                if (AdsterUnifiedAd_androidKt.d(this.g, this.h, this.i, this.j, this.k, this.b, true)) {
                    Integer numL2 = AdsterUnifiedAd_androidKt.l(this.c, this.d);
                    int iIntValue2 = numL2 != null ? numL2.intValue() : this.e;
                    if (iIntValue2 > 0) {
                        MutableIntState mutableIntState2 = this.l;
                        if (iIntValue2 != mutableIntState2.getIntValue()) {
                            mutableIntState2.setIntValue(iIntValue2);
                            Function2 function3 = (Function2) this.m.getValue();
                            if (function3 != null) {
                                function3.invoke(0, Integer.valueOf(iIntValue2));
                            }
                            String message2 = this.f + " bannerVideo height adjusted dynamicHeightDp=" + iIntValue2;
                            Intrinsics.i(message2, "message");
                        }
                    }
                }
                break;
        }
        return Unit.f17538a;
    }
}
