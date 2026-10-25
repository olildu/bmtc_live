package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19848a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DrawerState c;
    public final /* synthetic */ CoroutineScope d;

    public /* synthetic */ vl0(String str, DrawerState drawerState, CoroutineScope coroutineScope, int i) {
        this.f19848a = i;
        this.b = str;
        this.c = drawerState;
        this.d = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19848a) {
            case 0:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
            default:
                return NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32(this.b, this.c, this.d, (SemanticsPropertyReceiver) obj);
        }
    }
}
