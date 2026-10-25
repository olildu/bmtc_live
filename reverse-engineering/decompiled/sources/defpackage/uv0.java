package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19780a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function4 g;
    public final /* synthetic */ int h;

    public /* synthetic */ uv0(Modifier modifier, int i, int i2, Function1 function1, boolean z, Function4 function4, int i3, int i4) {
        this.f19780a = i4;
        this.b = modifier;
        this.c = i;
        this.d = i2;
        this.e = function1;
        this.f = z;
        this.g = function4;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19780a) {
            case 0:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.a(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.e(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
        }
        return Unit.f17538a;
    }
}
