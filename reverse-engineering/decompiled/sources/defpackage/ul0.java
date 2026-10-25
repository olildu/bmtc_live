package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ul0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19757a;
    public final /* synthetic */ DrawerState b;
    public final /* synthetic */ CoroutineScope c;

    public /* synthetic */ ul0(DrawerState drawerState, CoroutineScope coroutineScope, int i) {
        this.f19757a = i;
        this.b = drawerState;
        this.c = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20;
        switch (this.f19757a) {
            case 0:
                zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20(this.b, this.c);
                break;
            default:
                zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32$lambda$31(this.b, this.c);
                break;
        }
        return Boolean.valueOf(zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20);
    }
}
