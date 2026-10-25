package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15490a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Function j;

    public /* synthetic */ dt(ContextMenuState contextMenuState, Function0 function0, Function1 function1, Modifier modifier, boolean z, Function0 function2, Function2 function3, int i, int i2) {
        this.g = contextMenuState;
        this.c = function0;
        this.i = function1;
        this.d = modifier;
        this.b = z;
        this.h = function2;
        this.j = function3;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15490a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ContextMenuAreaKt.ContextMenuArea$lambda$3((ContextMenuState) this.g, (Function0) this.c, (Function1) this.i, this.d, this.b, (Function0) this.h, (Function2) this.j, this.e, this.f, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PullToRefreshKt.PullToRefreshBox$lambda$1(this.b, (Function0) this.c, this.d, (PullToRefreshState) this.g, (Alignment) this.h, (Function3) this.i, (Function3) this.j, this.e, this.f, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderKt.Slider$lambda$7((SliderState) this.g, this.d, this.b, (SliderColors) this.c, (MutableInteractionSource) this.h, (Function3) this.i, (Function3) this.j, this.e, this.f, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ dt(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function4, int i, int i2) {
        this.g = sliderState;
        this.d = modifier;
        this.b = z;
        this.c = sliderColors;
        this.h = mutableInteractionSource;
        this.i = function3;
        this.j = function4;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ dt(boolean z, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, Function3 function4, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = modifier;
        this.g = pullToRefreshState;
        this.h = alignment;
        this.i = function3;
        this.j = function4;
        this.e = i;
        this.f = i2;
    }
}
