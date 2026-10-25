package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18657a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ SelectableChipColors j;
    public final /* synthetic */ SelectableChipElevation k;
    public final /* synthetic */ BorderStroke l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ oo(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, Function2 function4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.f18657a = i4;
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = modifier;
        this.f = z2;
        this.g = function3;
        this.h = function4;
        this.i = shape;
        this.j = selectableChipColors;
        this.k = selectableChipElevation;
        this.l = borderStroke;
        this.m = mutableInteractionSource;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f18657a) {
            case 0:
                return ChipKt.FilterChip$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, composer, ((Integer) obj2).intValue());
            default:
                return ChipKt.ElevatedFilterChip$lambda$7(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, composer, ((Integer) obj2).intValue());
        }
    }
}
