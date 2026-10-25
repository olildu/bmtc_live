package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20209a;
    public final /* synthetic */ FloatProducer b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zl0(FloatProducer floatProducer, float f, boolean z, int i) {
        this.f20209a = i;
        this.b = floatProducer;
        this.c = f;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20209a) {
            case 0:
                return NavigationDrawerKt.horizontalScaleUp$lambda$54(this.b, this.c, this.d, (GraphicsLayerScope) obj);
            default:
                return NavigationDrawerKt.horizontalScaleDown$lambda$55(this.b, this.c, this.d, (GraphicsLayerScope) obj);
        }
    }
}
