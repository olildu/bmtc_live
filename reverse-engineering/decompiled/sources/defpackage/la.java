package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.NavigationRailItemColors;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18294a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ la(PopupPositionProvider popupPositionProvider, Function2 function2, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function3, int i, int i2) {
        this.k = popupPositionProvider;
        this.d = function2;
        this.l = tooltipState;
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.f = z2;
        this.h = z3;
        this.g = function3;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18294a) {
            case 0:
                return BasicTooltipKt.BasicTooltipBox$lambda$5((PopupPositionProvider) this.k, this.d, (TooltipState) this.l, this.e, this.c, this.b, this.f, this.h, (Function2) this.g, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return NavigationRailKt.NavigationRailItem$lambda$11(this.b, this.c, this.d, this.e, this.f, (Function2) this.g, this.h, (NavigationRailItemColors) this.k, (MutableInteractionSource) this.l, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return TooltipKt.TooltipBox$lambda$5((PopupPositionProvider) this.k, (Function3) this.g, (TooltipState) this.l, this.e, this.c, this.b, this.f, this.h, this.d, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ la(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, boolean z3, Function2 function2, int i, int i2) {
        this.k = popupPositionProvider;
        this.g = function3;
        this.l = tooltipState;
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.f = z2;
        this.h = z3;
        this.d = function2;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ la(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, boolean z3, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = modifier;
        this.f = z2;
        this.g = function3;
        this.h = z3;
        this.k = navigationRailItemColors;
        this.l = mutableInteractionSource;
        this.i = i;
        this.j = i2;
    }
}
