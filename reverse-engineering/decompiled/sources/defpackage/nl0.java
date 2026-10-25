package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18522a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ nl0(int i, Function0 function0, boolean z) {
        this.f18522a = i;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18522a) {
            case 0:
                return NavigationBarKt.NavigationBarItemLayout$lambda$22$lambda$20$lambda$19(this.b, this.c, (GraphicsLayerScope) obj);
            default:
                return NavigationRailKt.NavigationRailItemLayout$lambda$17$lambda$15$lambda$14(this.b, this.c, (GraphicsLayerScope) obj);
        }
    }
}
