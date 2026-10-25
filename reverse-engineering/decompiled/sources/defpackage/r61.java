package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19182a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Shape c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ SegmentedButtonColors f;
    public final /* synthetic */ BorderStroke g;
    public final /* synthetic */ PaddingValues h;
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ RowScope o;
    public final /* synthetic */ Function p;

    public /* synthetic */ r61(RowScope rowScope, boolean z, Function function, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function2 function2, Function2 function3, int i, int i2, int i3, int i4) {
        this.f19182a = i4;
        this.o = rowScope;
        this.b = z;
        this.p = function;
        this.c = shape;
        this.d = modifier;
        this.e = z2;
        this.f = segmentedButtonColors;
        this.g = borderStroke;
        this.h = paddingValues;
        this.i = mutableInteractionSource;
        this.j = function2;
        this.k = function3;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19182a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$1((MultiChoiceSegmentedButtonRowScope) this.o, this.b, (Function1) this.p, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SegmentedButtonKt.SegmentedButton$lambda$5((SingleChoiceSegmentedButtonRowScope) this.o, this.b, (Function0) this.p, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iIntValue2);
        }
    }
}
