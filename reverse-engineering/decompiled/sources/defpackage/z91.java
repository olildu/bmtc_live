package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z91 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20178a;
    public final /* synthetic */ SliderState b;

    public /* synthetic */ z91(SliderState sliderState, int i) {
        this.f20178a = i;
        this.b = sliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20178a) {
            case 0:
                return SliderKt.SliderImpl$lambda$29$lambda$26$lambda$25(this.b, (IntSize) obj);
            default:
                return Boolean.valueOf(SliderKt.sliderSemantics$lambda$52$lambda$51(this.b, ((Float) obj).floatValue()));
        }
    }
}
