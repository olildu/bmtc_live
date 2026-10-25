package defpackage;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19954a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ wr(Activity activity, int i) {
        this.f19954a = i;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        Window window2;
        switch (this.f19954a) {
            case 0:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final Activity activity = this.b;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setFlags(8192, 8192);
                }
                return new DisposableEffectResult() { // from class: app.chalo.compose.components.ComposeUtils_androidKt$PreventScreenShots$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        Window window3;
                        Activity activity2 = activity;
                        if (activity2 == null || (window3 = activity2.getWindow()) == null) {
                            return;
                        }
                        window3.clearFlags(8192);
                    }
                };
            default:
                float fFloatValue = ((Float) obj).floatValue();
                Activity activity2 = this.b;
                WindowManager.LayoutParams attributes = (activity2 == null || (window2 = activity2.getWindow()) == null) ? null : window2.getAttributes();
                if (attributes != null && attributes.screenBrightness != fFloatValue) {
                    attributes.screenBrightness = fFloatValue;
                    Window window3 = activity2.getWindow();
                    if (window3 != null) {
                        window3.setAttributes(attributes);
                    }
                }
                return Unit.f17538a;
        }
    }
}
