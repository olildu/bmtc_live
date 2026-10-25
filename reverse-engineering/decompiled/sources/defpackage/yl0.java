package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20120a;
    public final /* synthetic */ DrawerPredictiveBackState b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yl0(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, int i) {
        this.f20120a = i;
        this.b = drawerPredictiveBackState;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20120a) {
            case 0:
                return NavigationDrawerKt.predictiveBackDrawerChild$lambda$57(this.b, this.c, (GraphicsLayerScope) obj);
            default:
                return NavigationDrawerKt.predictiveBackDrawerContainer$lambda$56(this.b, this.c, (GraphicsLayerScope) obj);
        }
    }
}
