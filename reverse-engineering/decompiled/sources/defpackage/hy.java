package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy implements FloatProducer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15869a;

    public /* synthetic */ hy(int i) {
        this.f15869a = i;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        switch (this.f15869a) {
            case 0:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22();
            default:
                return NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$51$lambda$50();
        }
    }
}
