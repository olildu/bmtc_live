package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19854a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ MutableInteractionSource h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ vo(SearchBarDefaults searchBarDefaults, String str, Function1 function1, Function1 function2, boolean z, Function1 function3, Modifier modifier, boolean z2, Function2 function4, Function2 function5, Function2 function6, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.l = searchBarDefaults;
        this.m = str;
        this.n = function1;
        this.o = function2;
        this.b = z;
        this.p = function3;
        this.c = modifier;
        this.d = z2;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.q = textFieldColors;
        this.h = mutableInteractionSource;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19854a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.InputChip$lambda$8(this.b, (Function0) this.l, this.e, this.c, this.d, this.f, this.g, (Function2) this.m, (Shape) this.n, (SelectableChipColors) this.o, (SelectableChipElevation) this.p, (BorderStroke) this.q, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SearchBarDefaults.InputField$lambda$44((SearchBarDefaults) this.l, (String) this.m, (Function1) this.n, (Function1) this.o, this.b, (Function1) this.p, this.c, this.d, this.e, this.f, this.g, (TextFieldColors) this.q, this.h, this.i, this.j, this.k, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ vo(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, Function2 function4, Function2 function5, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.b = z;
        this.l = function0;
        this.e = function2;
        this.c = modifier;
        this.d = z2;
        this.f = function3;
        this.g = function4;
        this.m = function5;
        this.n = shape;
        this.o = selectableChipColors;
        this.p = selectableChipElevation;
        this.q = borderStroke;
        this.h = mutableInteractionSource;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }
}
