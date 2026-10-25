package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18524a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nm(int i, int i2, String str, int i3, Function3 function3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.g = function3;
        this.f = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18524a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloToolBarKt.c(this.d, this.b, this.c, (TextStyle) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                PremiumBusSlotSelectionUiStateKt.u(this.b, this.c, this.d, this.e, (Function3) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ nm(String str, int i, int i2, TextStyle textStyle, int i3, int i4) {
        this.d = str;
        this.b = i;
        this.c = i2;
        this.g = textStyle;
        this.e = i3;
        this.f = i4;
    }
}
