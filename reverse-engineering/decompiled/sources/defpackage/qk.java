package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.routeselection.ui.compose.RouteSelectionBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19127a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ qk(String str, boolean z, Function0 function0, int i, int i2, int i3) {
        this.f19127a = i3;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19127a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloLoadingDialogKt.b(this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                RouteSelectionBottomSheetKt.b(this.b, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                break;
        }
        return Unit.f17538a;
    }
}
